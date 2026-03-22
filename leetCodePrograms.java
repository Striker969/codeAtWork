/********************************************Array programs and hashing***********************************************/
//Two sum problem for the unsorted array
//SC and TC = O(n)
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> x =new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(x.containsKey(comp)){
                //It returns the indices of the two numbers whose sum equals the target, where the indices are stored in the form of array and later return it.
                int [] ret ={x.get(comp), i};
                return ret;
            }
            x.put(nums[i], i);
        }
        //Default return if no pair found (compiler requirement), which returns an empty array
        //Java requires that a method must return something for every possible execution path. So this line is a fallback return if no pair is found.
        return new int []{};
    }
}




//Contains Duplicates -> return true if contains else return false if doesn't contains
// SC and TC = O(n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> x=new HashSet<>();
        for(int n: nums){
            if(x.contains(n)){
                return true;
            }
            x.add(n);
        }
        return false;
    }
}

//Contains Duplicates
//TC = O(n log n) and SC = O(1)
//Sorting the array takes O(n log n) and Checking adjacent elements takes O(n) so O(n log n) + O(n) = O(n log n)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }
}




//Product of array except self 
//get the prefix product first and traverse from right to left maintaining the suffix product and multiply with the prefix product
//TC --> One pass for prefix and One pass for suffix so -> O(n + n) = O(n)
//SC --> O(1) Only using one result array Output array does not count as extra space (LeetCode rule)
// TC=O(n) and SC =O(1)
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n[]=new int[nums.length];
        n[0]=1;
        for(int i=1;i<nums.length;i++){
            n[i]=n[i-1]*nums[i-1];
        }
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            n[i]=n[i]*suffix;
            suffix=suffix*nums[i];
        }
        return n;
    }
}




//maximum subarray
//input -> nums = [-2,1,-3,4,-1,2,1,-5,4]
//output -> 6 -> this is the largest subarray - [4,-1,2,1]
//TC = O(n) and SC = O(1)
class Solution {
    public int maxSubArray(int[] nums) {
        int maxnum=Integer.MIN_VALUE;
        int maxsum=0;
        for(int i=0;i<nums.length;i++){
            maxsum+=nums[i];
            if(maxsum<0){
                maxsum=0;
            }
            if(maxsum>maxnum){
                maxnum=maxsum;
            }
        }
        return maxnum;
    }
}




//Best time to buy and sell the stock
//TC = O(n) SC = O(1)
//input - [7,1,5,3,6,4]
//output - 5 (Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5)
class Solution {
    public int maxProfit(int[] prices) {
        int minprice=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int profit=prices[i]-minprice;
                maxprofit=Math.max(profit, maxprofit);
            }
        }
        return maxprofit;
    }
}




//Majority element
//input -> [3,2,3]
//output -> 3
//Matching elements increase the count and different elements decrease it. The final candidate will be the majority element. This runs in O(n) time and O(1) space.
class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int candidate=0;
        for(int i=0;i<nums.length;i++){
            candidate =nums[i];
            if(nums[i]==candidate){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}




//Find the missing Element
/**
 * First find the minimum and maximum values in the array. Then store all elements in a HashSet for O(1) lookup. After that iterate from min to max and check which numbers are missing. Those numbers are added to the result list.
 */
//input -> [5,1]
//output -> [2,3,4]
//TC - O(n) and SC - O(n)
//list will follow the order of insertion, which will help return the sorted way
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> lst =new ArrayList<>();
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int num: nums){
            min=Math.min(num,min);
            max=Math.max(num,max);
        }
        HashSet<Integer> x=new HashSet<>();
        for(int num:nums){
            x.add(num);
        }
        for(int i=min;i<=max;i++){
            if(!x.contains(i)){
                lst.add(i);
            }
        }
        return lst;
    }
}





/**
 * What is a Pointer in a Linked List?
 * 1. Data (value)
 * 2. Pointer (reference to the next node)
 * 
 * eg: - 5 points to 9, 9 points to 3, 3 points to null
 * current index → nums[current index]
 * slow = start
 * fast = meeting point
 * 
 * *) Phase 1 is called detect cycle why?
 *    --> in this cycle fast will eventually catch slow, just like two runners on the cycle track which means a cycle exits and both pointers are somewhere inside the cycle.
 * 
 * *) Phase 2 is to find the cycle entrance why?
 *    --> purpose is to Find the start of the cycle, which corresponds to the duplicate number. when we find both the value that are same tha means ✔ We reached the cycle entrance ✔ That value is the duplicate
 * 
 * TC - O(n) and SC - O(1)
 */
//using Floyd Cycle Detection Algorithm we can solve this problem
class Solution {
    public int findDuplicate(int[] nums) {
        int a=nums[0];
        int b=nums[nums[0]];
        //phase 1
        //The slow and fast pointers will meet somewhere inside the cycle ,
        while(a!=b){
            a=nums[a];
            b=nums[nums[b]];
        }
        a=0;
        //phase 2
        while(a!=b){
            a=nums[a];
            b=nums[b];
        }
        return a;
    }
}




//Intersection of two arrays
//TC - O(n+m) and SC - O(n)
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> x=new HashSet<>();
        HashSet <Integer> result=new HashSet<>();
        for(int n: nums1){
            x.add(n);
        }
        for(int k:nums2){
            if(x.contains(k)){
                result.add(k);
            }
        }
        int finals[]=new int[result.size()];
        int i=0;
        for(int p:result){
            finals[i]=p;
            i++;
        }
        return finals;
    }
}




//Sub array sum equals to K
/**
 * for the array [1,2,3]
 * currentsum-previoussum=k -> eg:- currentsum is 3(for 2nd iteration) - previoussum is 0 which is equal to 3 which is target. but in program we are doing this previoussum=currentSum - k which is 0=3-3
 * But internally we also assume a prefix before the array starts: so prefixSum = 0 which makes [0, 1, 3, 6]
 * O(n)
 */ 
class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> x=new HashMap<>();
        x.put(0,1);
        int sum=0;
        int count=0;
        for(int n:nums){
            sum+=n;
            if(x.containsKey(sum-k)){
                count+=x.get(sum-k);
            }
            x.put(sum,x.getOrDefault(sum,0)+1);
        }
        return count;
    }
}


/************************************************String programs***************************************************/


//Valid palindrome
//s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase(); -> this will remove everyelemnt except Big char, small char and numbers and replace them or removes space and everything eg:- input -> "A man, a plan, a canal: Panama", output ->      amanaplanacanalpanama
//.toString() converts stringbuilder to string, return type has to be string
/**
 * StringBuilder result = new StringBuilder();
✔ Modifies the same object
✔ No new object creation
✔ Much faster
result.append("a");
result.append("b");
TC and SC are O(n)
 */
class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        StringBuilder t= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            t.append(s.charAt(i));
        }
        return s.equals(t.toString());
    }
}



//Valid anagram(optimized)
/**
 * TC = O(n)
SC = O(1)  (fixed 26 size)
Input: s = "anagram", t = "nagaram"

Output: true
increases count for s 
decreases count for t
eg:-
count[a] = 1
count[n] = -1
*/

    class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}



//Longest common prefix 
//TC=O(n*m) 
//n = number of strings
//m = length of shortest string
//SC=O(1)
//No extra space used.
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix =strs[0];
        for(int i=1;i<strs.length;i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}


//Reverse words in a string
//trim() removes leading + trailing spaces
// \\s+ -> one or more spaces in between the strings
//split the string using regex \\s+ to handle multiple spaces, then reverse the words using a StringBuilder and join them with a single space.
//TC and SC = O(n)
class Solution {
    public String reverseWords(String s) {
        String b[]=s.trim().split("\\s+");
        StringBuilder x=new StringBuilder();
        for(int i=b.length-1;i>=0;i--){
            x.append(b[i]);
            if(i!=0){
                x.append(" ");
            }
        }
        return x.toString();
    }
}


//First unique characters in a string
//TC-O(n) and SC-O(1)
//map each character to an index by subtracting 'a'. This converts characters into a 0–25 range, allowing me to use an array instead of a HashMap for constant-time access.
class Solution {
    public int firstUniqChar(String s) {
        int x[]=new int[26];
        for(int i=0;i<s.length();i++){
            x[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(x[s.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
}


//String compression (leetcode)
//input -> ["a","a","b","b","c","c","c"]
//output -> 6 -  meaning a2b2c3
//TC-O(n) and SC - O(1)
//used two pointers: one to read characters and count consecutive occurrences, and another to write the compressed result in-place. If the count is more than one, I convert it into characters and store them individually. This ensures O(n) time and constant space.
class Solution {
    public int compress(char[] chars) {
        int i = 0; // read pointer
        int k = 0; // write pointer

        while (i < chars.length) {
            char current = chars[i];
            int count = 0;

            // count consecutive characters
            while (i < chars.length && chars[i] == current) {
                i++;
                count++;
            }

            // write character
            chars[k++] = current;

            // write count if > 1
            if (count > 1) {
                //String.valueOf() -> will convert int to string
                //tocharArray() is used separate the string to an array. assume "ab"->["a", "b"]
                String c = String.valueOf(count);
                for (char ch : c.toCharArray()) {
                    //write the count next to the chracter
                    chars[k++] = ch;
                }
            }
        }
        //k is just a number that was incremented till 6, but leetcode takes only those first k(6) elements so the output will be ["a","2","b","2","c","3"]
        return k;
    }
}



//Rotate string
//TC and SC - O(n)
//return true or false
class Solution {
    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()){
            return false;
        }

        String combined = s + s;

        return combined.contains(goal);
    }
}


//Group Anagrams
//TC-O(n) and SC-O(n)
//Outer → List (groups)
//Inner → List<String> (each anagram group)

class Solution {
    //return type is List of Lists of Strings because we need ouput in the form List of Lists of Strings
    
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> x = new HashMap<>();
        for(String str: strs){
            char[]t=str.toCharArray();
            //👉 Convert sorted array back to string
            Arrays.sort(t);
            String vv=new String(t);
            if(!x.containsKey(vv)){
                //new ArrayList<>() -> It creates an empty list
                x.put(vv,new ArrayList<>());
            }
            x.get(vv).add(str);
        }
        //why x.values()?
        //because it returns Collection<List<String>> -> 
        /**
         * [
  ["eat","tea","ate"],
  ["tan","nat"],
  ["bat"]
]
        so we use new ArrayList<>(...); which will convert collection to list
         */
        
        return new ArrayList<>(x.values());
    }
}



//Longest substring without repeating characters
//TC-O(n) abd SC-O(min(n, charset))
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map =new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            char t=s.charAt(right);
            if(map.containsKey(t)){
                //map.get(t)+1 is used to get the length of the chracter if i dont use +1 then i will just ge the index
                left=Math.max(left,map.get(t)+1);
            }
            map.put(t,right);
            //(right-left)+1 is used to calculate the length of the current substring (window)
            maxlength=Math.max(maxlength,(right-left)+1);
        }
        return maxlength;
    }
}


/***********************************************Binary search programs************************************************/


//Binary search
//TC - O(log n) and SC - O(1)
class Solution {
    public int search(int[] nums, int target) {
        int low =0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}

//**************************************************Two pointers******************************************************
//Two Sum 2(using two pointer technique as the array is sorted, to optimize the space that is why we are not using the hasmap here), 
//if the number is lesser than target then move to the right
//if the number is higher thant target than move to the left
//input - [2,7,11,13] and target is 9
//output - [1,2] (at first place and second place)
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right=numbers.length-1;
        while(left < right){
            int sum=numbers[left]+numbers[right];
            if(sum==target){
                return new int[]{left+1, right+1};
            }else if (sum<target){
                left=left+1;
            }else{
                right=right-1;
            }
        }
        return new int[]{-1,-1};
    }
}


//Remove duplicates from the sorted array
//Input: nums = [0,0,1,1,1,2,2,3,3,4]
//Output: 5, nums = [0,1,2,3,4,_,_,_,_,_], you will be returning only the numbers of duplicates present
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        for(int j=1;j<nums.length;j++){
            if(nums[j]!=nums[i]){
                i++;
                nums[i]=nums[j];
            }
        }
        return i+1;
    }
}


//Move zeros to the end of the array
//Input: nums = [0,1,0,3,12]
//Output: [1,3,12,0,0]
class Solution {
    public void moveZeroes(int[] nums) {
        int ind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[ind]=nums[i];
                ind++;
            }
        }
        while(ind<nums.length){
            nums[ind]=0;
            ind++;
        }
        System.out.print(nums.toString());
    }
}


//Container with most water
// TC=O(n) and SC=O(1)
//area should be calculated which is length * height
class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int left =0;
        int right =height.length-1;
        while(left<right){
            int h=Math.min(height[left],height[right]);
            int length=right-left;
            int area=h*length;
            max=Math.max(max,area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max;
    }
}
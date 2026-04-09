/********************************************Array programs and hashing**********************************************/
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

// for every index i
//answer[i] = product of elements before i  *  product of elements after i

/**For each index we need the product of elements before and after it.
I first compute prefix products and store them in the result array.
Then I traverse from right to left maintaining a suffix product and multiply it with the prefix value.
This allows solving the problem in O(n) time and O(1) extra space without using division.
*/

//Input: nums = [1,2,3,4]
//Output: [24,12,8,6]

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n[]=new int[nums.length];
        //n[0]=1 because there are no elements before the first element
        n[0]=1;
        //build prefix product
        //answer[i] = product of elements before i
        for(int i=1;i<nums.length;i++){
            n[i]=n[i-1]*nums[i-1];
        }
        //build suffix product
        //int suffix=1 because there are no elements after the last element
        //suffix starts as 1 because:
        //→ initially there are NO elements on the right
        //→ product of nothing = 1
        int suffix=1;
        for(int i=nums.length-1;i>=0;i--){
            //suffix is multiplied with n[i] to get the product of elements after the current index
            n[i]=n[i]*suffix;
            suffix=suffix*nums[i];
            //reason why suffix is multiplied with nums[i] is because we need to get the product of elements after the current index
            //suffix should be multiplied with nums[i] to get the product of elements after the current index
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
/**OR */
class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
            }
            if (sum > 0) {

                max = Math.max(sum, max);
            }
        }
        return max;
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
//input -> [3,2,3] and input -> [2,2,1,1,1,2,2] -> 2
//output -> 3
//Matching elements increase the count and different elements decrease it. The final candidate will be the majority element. This runs in O(n) time and O(1) space.
//I use Boyer-Moore Voting Algorithm. I maintain a candidate and a count. Whenever I see the same element, I increment the count, otherwise I decrement it. If count becomes zero, I pick a new candidate. The majority element survives all cancellations

class Solution {
    public int majorityElement(int[] nums) {

        int count = 0;
        int candidate = 0;

        for(int num : nums){

            if(count == 0){
                candidate = num;
            }

            if(num == candidate){
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}



//Missing number
/**
 * That binary number is:1111 (base 2)
 * And its decimal value is: 8 + 4 + 2 + 1 = 15
 * 1111₂ = 15₁₀
 * 
 * why is -> 1 ^ 2 = 3 ?
 * First convert to binary:
 * 1 = 01
*  2 = 10

Now XOR bit by bit:
  01
^ 10
----
  11
  We XOR all indices and all array values together; since every number appears twice except the missing one, all pairs cancel out and the remaining value is the missing number.
  whatever value xor has at the end of the loop is the missing number —
because all other numbers cancel out using XOR.
 */

//we are doing this because the array is from 0-n so we can use 0-n indices to cancel the duplicates with the array, we are using XOR to cancel the duplicates by xoring all indices with the array elements(0 ^ 1 ^ 2 ^ 3) ^ (3 ^ 0 ^ 1)
class Main {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.println(missingNumber(nums)); // 2
    }

    public static int missingNumber(int[] nums) {
		/**
		 * Loop runs from 0 → n-1
		 * But expected range is 0 → n
		 * so we manually include n
		 */
        //"Since the array contains numbers from 0 to n, but the loop only covers indices 0 to n-1, we initialize xor with n to include it. This ensures we XOR all numbers from 0 to n."
        int xor = nums.length;

        for (int i = 0; i < nums.length; i++) {
			//combine (0 ^ 1 ^ 2 ^ 3) ^ (0 ^ 1 ^ 3)
            xor ^= i;
            xor ^= nums[i];
        }

        return xor;
    }
}



//Find the missing Elements
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




//To find the duplicate number
/**
 * //this is Array → Linked List Conversion Trick
 * rule is this index → value → next index
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
//We treat the array as a linked list where each value points to the next index. Because there is a duplicate number, two indices will point to the same value, creating a cycle. When slow and fast pointers meet, it confirms the presence of that cycle.

//input [1,3,4,2,2]
//output = 2
class Solution {
    public int findDuplicate(int[] nums) {
        int a=nums[0];
        int b=nums[nums[0]];
        //phase 1
        //The slow and fast pointers will meet somewhere inside the cycle ,
        while(a!=b){
            //slow → moves 1 step
            a=nums[a];
            //fast → moves 2 steps
            //fast will eventually catch slow
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


//To count the frequency of the elements(Integer)
//input = [1,2,2,3,1,2]
//output = {1=2, 2=3, 3=1}
//O(n)
class Main {
    public static void main(String[] args) {
        int a[]={1,2,2,3,1,2};
        HashMap<Integer, Integer> x=new HashMap<>();
        for(int i=0;i<a.length;i++){
            x.put(a[i],x.getOrDefault(a[i],0)+1);
        }
        System.out.print(x);
    }
}


//To count the frequency of the elements(String)
//input - aabbc
//input = {a=2, b=2, c=1}
//O(n)
class Main {
    public static void main(String[] args) {
        String a="aabbc";
        HashMap<Character, Integer> x=new HashMap<>();
        for(char tt:a.toCharArray()){
            x.put(tt,x.getOrDefault(tt,0)+1);
        }
        System.out.print(x);
    }
}


//more optimized(String)
//TC=O(n) and SC-O(1)
class Main {
    public static void main(String[] args) {
        String a="aabbc";
        int b[]=new int[26];
        for(int i=0;i<a.length();i++){
            b[a.charAt(i)-'a']++;
        }
        for(int i=0;i<b.length;i++){
            if(b[i]>0){
                char ch=(char)(i+'a');
                System.out.print(ch+" "+b[i]+" ");
            }
        }
    }
}


//to find all the duplicates in the array
//TC=O(n) and SC=O(1)

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> x=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            //Math.abs is used because the digits will become negative
            int val=Math.abs(nums[i]);
            //converts value into valid index because if the higest value in the array is 8 then i need a index of 7 so val-1 is done
            int index=val-1;
            if(nums[index]<0){
                x.add(val);
            }else{
                nums[index]=-nums[index];
            }
        }
        return x;
    }
}


//Rotate array(right rotate)
//TC=O(n) and SC=O(1)
//input = [1,2,3,4,5,6,7]
//output = [5,6,7,1,2,3,4]
//k=3
class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int left=n-k;
        int right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=n-k-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        left=0;
        right=n-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        System.out.print(nums.toString());
    }
}



//merge the sorted array
//TC-O(m+n) and SC=O(n)
//TC is O(m+n) because Each element is processed once, 👉 Each iteration: Either i-- OR j--
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i]>=nums2[j]){
                nums1[k--]=nums1[i--];
            }else{
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}



//To find the missing number
//TC=O(n) and SC=O(1)
/**
 * Expected: 0 ^ 1 ^ 2 ^ 3
Actual:   3 ^ 0 ^ 1

Combine:
0 ^ 1 ^ 2 ^ 3 ^ 3 ^ 0 ^ 1

Cancel:
(0^0)(1^1)(3^3) → 2 remains

input - [3,0,1]
output - 2
 */
class Solution {
    public int missingNumber(int[] nums) {

        int n = nums.length;

        int xor = 0;

        // XOR all indices and values
        for (int i = 0; i < n; i++) {
            xor = xor ^ i ^ nums[i];
        }

        // XOR with n
        //this is important because the length is 3 and it is not included in XORing
        return xor ^ n;
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
//input - abcabcbb
//output - 3
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map =new HashMap<>();
        int left=0;
        int maxlength=0;
        for(int right=0;right<s.length();right++){
            char t=s.charAt(right);
            if(map.containsKey(t)){
                //map.get(t)+1 is used to get the length of the chracter if i dont use +1 then i will just get the index
                left=Math.max(left,map.get(t)+1);
            }
            map.put(t,right);
            //(right-left)+1 is used to calculate the length of the current substring (window)
            maxlength=Math.max(maxlength,(right-left)+1);
        }
        return maxlength;
    }
}


/*********************************************Binary search programs************************************************/


//Binary search
//TC - O(log n) and SC - O(1)
//input - [1,2,3,4,5,6,7,8,9,10] and target is 5
//output - 4 (at fourth place)
//input - [1,2,3,4,5,6,7,8,9,10] and target is 11
//output - -1 (not found)
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

//search in a rotated sorted array
/**
 * At every step:
- We eliminate HALF of the array
- 👉 That’s why:
- Time Complexity = O(log n)
 space complexity = O(1)
 "At each step, I determine which half is sorted. Since one half is always sorted in a rotated array, I check if the target lies within that sorted range. If it does, I discard the other half; otherwise, I discard the sorted half. This way, I eliminate half of the search space in every iteration."
 */
//TC - O(log n) and SC - O(1)
//input - [4,5,6,7,0,1,2] and target is 0
//output - 4 (at fourth place)
//input - [4,5,6,7,0,1,2] and target is 3
//output - -1 (not found)
class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if (nums[mid]==target) return mid;
            //check if the left half is sorted
            if(nums[low]<=nums[mid]){
                if(nums[low]<=target&&target<=nums[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
                //if the target is not in the left half, then it must be in the right half
                // else condition will be -> else if(nums[mid]<=nums[high])
            }else{
                if(nums[mid]<=target&&target<=nums[high]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}


//search insert position
//TC - O(log n) and SC - O(1)
//input - [1,3,5,6] and target is 5
//output - 2 (at second place)
//input - [1,3,5,6] and target is 2
//output - 1 (at first place)
//When the loop ends, low points to the first index where the target can be inserted without breaking the sorted order, because all elements before low are smaller and all elements after are greater.
//there is a point where the while loop breaks, if low>high then low will be the index where the target can be inserted. 
//because all elements before low are smaller and all after are greate so we return low.
class Solution {
    public int searchInsert(int[] nums, int target) {
        int low =0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target) {
                return mid;
            }else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}


//To find the peak element in the array
//"I compare nums[mid] with nums[mid+1] and nums[mid] with nums[mid-1] to determine the slope. If it's increasing, I move right; otherwise, I move left. This guarantees finding a peak in O(log n)."
//We don’t search peak directly, We follow slope → peak automatically reached
//because all elements before low are smaller and all after are greater so we return low.
//TC - O(log n) and SC - O(1)
class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //check if the current element is a peak
            if(nums[mid]>nums[mid+1] && nums[mid]>nums[mid-1]){
                return mid;
            }
            //if the current element is less than the next element, then the peak is in the right half
            else if(nums[mid]<nums[mid+1]){
                low=mid+1;
            }else{
                //if the current element is greater than the next element, then the peak is in the left half
                high=mid-1;
            }
        }
        return -1;
    }
}



//find minimum in rotated sorted array
//TC - O(log n) and SC - O(1)
class Solution {
    public int findMin(int[] nums) {
        int ans=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            //check if the left half is sorted
            if(nums[low]<=nums[mid]){
                //if the left half is sorted, then the minimum element is in the left half and ignore the left half
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }else{
                //check if the right half is sorted
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
        }
        return ans;
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
//I can use either while or for loop here. Since I'm filling a known range, a for loop is cleaner and more readable.
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


/*******************************************************OTHERS********************************************************/



//FizzBuzz
/**
 * 
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 *  answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.


 * Example 1:

Input: n = 3
Output: ["1","2","Fizz"]
Example 2:

Input: n = 5
Output: ["1","2","Fizz","4","Buzz"]
Example 3:

Input: n = 15
Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */
class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> x=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                x.add("FizzBuzz");
            }else if(i%3==0){
                x.add("Fizz");
            }else if(i%5==0){
                x.add("Buzz");
            }else{
                x.add(String.valueOf(i));
            }
        }
        return x;
    }
}


/************************************************Dynamic programming*************************************************/
//Unque path
//TC and SC=O(mxn)
class Solution {
    public int uniquePaths(int m, int n) {
        int grid[][]=new int[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 || j==0)
                grid[i][j]=1;
                else
                grid[i][j]=grid[i][j-1]+grid[i-1][j];
            }
        }
        //due to 0 based indexing
        return grid[m-1][n-1];
    }
}



//Climbing stairs(fibonacci [pattern])
//TC=O(n) and SC=O(1)
//n=8
//optimized
class Solution {
    public int climbStairs(int n) {

        if (n <= 2) return n;

        int prev1 = 2, prev2 = 1;

        for (int i = 3; i <= n; i++) {
            int curr = prev1 + prev2;
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}
//or
//TC=O(n) and SC=O(n)
class Solution {
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}



//House robber
//TC=O(n) and SC=O(n)
class Solution {
    public int rob(int[] nums) {
        int r[]=new int[nums.length];
        if (nums.length<2) 
        return nums[0];

        r[0]=nums[0];
        r[1]=Math.max(nums[0], nums[1]);
        for(int i=2;i<nums.length;i++){
            r[i]=Math.max(r[i-2]+nums[i],r[i-1]);
        }
        return r[nums.length-1];
    }
}
//or
//optimized SC=O(1)
class Solution {
    public int rob(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int prev2 = nums[0];
        int prev1 = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int curr = Math.max(prev2 + nums[i], prev1);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}



//Minimum cost climbing stairs
//TC and SC=O(n)
class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int mincost[]=new int[n+1];

        for(int i=2;i<=n;i++){
            mincost[i]=Math.min((cost[i-1]+mincost[i-1]),(cost[i-2]+mincost[i-2]));
        }

        return mincost[n];
    }
}
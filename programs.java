package assure;

import java.io.IOException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeSet;

import org.checkerframework.checker.units.qual.Length;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.graphbuilder.struc.Stack;
import com.mysql.cj.x.protobuf.MysqlxDatatypes.Array;

// import groovyjarjarantlr4.v4.parse.ANTLRParser.exceptionGroup_return;
     
public class Javaprog {
	//to check whether given string is palindrome or not
	@Test
	public void palindrome(){
		String pal="moom";
		String cop="";
		for(int i=pal.length()-1;i>=0;i--) {
			cop=cop+pal.charAt(i);
		}
		if(pal.equals(cop)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}



//Palindrome(O(n))
    class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        StringBuilder t = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            t.append(s.charAt(i));
        }

        return s.equals(t.toString());
    }
}
	
	
	
	//swap without third varibale(integer)
	@Test
	public void swapint() {
		int one = 20;
		int two = 30;
		one =one +two;
		two= one-two;
		one = one -two;
		System.out.println(one);;
		System.out.println(two);
	}
	
	//swap without third variable(string)
	@Test
	public void swapping() {
		String a="friends";
		String b="vikings";
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		System.out.println(a);
		System.out.println(b);
	}

	@Test
	public void substrings(){
        String text = "Automation";

        // Extract from index 4 to end
        String part1 = text.substring(4);  
        System.out.println(part1);   // Output: mation

        // Extract from index 0 to 5 (exclusive of 5)
        String part2 = text.substring(0, 5);  
        System.out.println(part2);   // Output: Autom
    }
	
	
	//to print only vowels in the string
	@Test 
	public void vowels() {
		String a = "umbrella";
		String b = "";
		for(int i=0;i<=a.length()-1;i++) {
			char c=a.charAt(i);
			if(c=='a'|| c=='e'||c=='i'||c=='o'||c=='u') {
				b=b+c;
			}
		}
		System.out.println(b);
	}
	
	//to segregate and add
	@Test
	public void seg() {
		String a="a1%23$65";
		int b=0;
		for(int i=0;i<=a.length()-1;i++) {
			char c= a.charAt(i);
			// check if 'b' is a digit (ASCII between 48 and 57)
			if(c>=48 && c<=57) {
				int in=c-48; // // convert character digit to int
				b=b+in;
			}
		}
		System.out.println(b);
	}
	
	
	//patterns

*
**
***
****
*****
	@Test
	public void pat() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}


1
12
123
1234
12345
	@Test
	public void patt() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}





	@Test
	public void pats() {
		int f=1;
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(f);
				f++;
			}
			System.out.println();
		}
	}


    * 
   * * 
  * * * 
 * * * * 
* * * * * 
	@Test
	public void patty() {
		for(int i=1;i<=5;i++) {
			for(int j=5-1;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();//(triangle)
		}
	}




	
	
	
	//to print max 
	@Test
	public void pant() {
		int[] a= {3,4,1,2,6,5};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	//to print 2nd max
	@Test
	public void pants() {
		int[] a= {3,1,5,6,4,2,3,3,2};
		int max=0;
		int secondmax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				secondmax =max;
				max=a[i];
			}
			else if(a[i]>secondmax) {
				secondmax=a[i];
			}
		}
		System.out.println(secondmax);
	}
	
	
	
	//to print 1st min
class Main {
    public static void main(String[] args) {
        boii(new int[]{4,5,6,3,9});
    }
    public static void boii(int[] a){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.print(min);
    }
}
	
	//to print 2nd min
		@Test
		public void tomsg() {
			int a[]= {3,4,1,2,6,5};
			int min=a[0];
			int secondmin=0;
			for(int i=0;i<a.length;i++) {
				if(a[i]<min) {
					secondmin=min;
					min=a[i];
				}
				else if(a[i]<secondmin ) {
					secondmin=a[i];
				}
			}
			System.out.println(secondmin);
		}
	
	//to print first max and 2nd max
	class Main {
    public static void main(String[] args) {
        boii(new int[]{4,5,6,3,9});
    }
    public static void boii(int[] a){
        // int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secondmax=max;
                max=a[i];
            }
            else if(a[i]>secondmax){
                secondmax=a[i];
            }
        }
                System.out.print(max);
                System.out.print(secondmax);
    }
}
	
	
	
	
	
	//order of occurrence of given String
	@Test
	public void myoccur() {
		String str="aaabbcdd";

		//Creates an integer array of size 122(ASCII value of 'z' is 122 - so this array can handle all lowercase letters (a-z).) (ASCII size) 
		int a[]=new int[122];
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			//So a[c]++ increases the count at that character’s ASCII index.
			a[c]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				//(char)i converts the ASCII number back into a character.
				System.out.println((char)i+" "+a[i]);
			}
		}
	}
	
	
	//to print order of occurance using hashmap
	@Test
	public  void run() {
		int a[]= {1,5,6,3,7,5,6,3};
		HashMap<Integer, Integer> ha= new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			if(ha.containsKey(a[i])) {
				ha.put(a[i], ha.get(a[i])+1);
			}
			else {
				ha.put(a[i],1);
			}
		}
		System.out.println(ha);
	}
	
	
//	to print order of occurance of given string
	@Test
	public void occurs() {
		String lang= "Kannada";
		int []a=new int[122];
		for(int i=0;i<lang.length();i++) {	
			char c=lang.charAt(i);
			a[c]++;
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				System.out.println((char)i+" "+a[i]);
			}
		}
	}

	//to print order of occurance of given string without inbuilt functions ->> **********imp**********

	    public static void hell(String k) {
        char[] d = k.toCharArray();      // Convert string into char array
        int[] freq = new int[256];       // Array to store frequency of characters (ASCII size)

        // Count frequency of each character
        for (int i = 0; i < d.length; i++) {
            freq[d[i]]++;
        }

        // Print characters in order of occurrence
        for (int i = 0; i < d.length; i++) {
            if (freq[d[i]] != 0) {
                System.out.println(d[i] + " -> " + freq[d[i]]);
                freq[d[i]] = 0; // reset so it won’t print the same character again
            }
        }
    }
	
	
	
	//to print order of occurance of given string(other way)
	@Test
	public void occur() {
		String lang="KAnnada";
		String cases=lang.toLowerCase();
		char []c=cases.toCharArray();
		HashMap<Character, Integer> ha=new HashMap<Character, Integer>();
		for(int i=0;i<c.length;i++){
			if(!ha.containsKey(c[i])) {
				ha.put(c[i], 1);
			}
			else {
				ha.put(c[i], ha.get(c[i])+1);
			}
		}
		System.out.println(ha);
	}
	
	
	//occurance of each words
	@Test
	public void tom() {
		
	String a="dog had had dog food";
	String b[]=a.split(" ");
	HashMap<String, Integer> ha=new HashMap<String, Integer>();
	for(int i=0;i<b.length;i++) {
		if(!ha.containsKey(b[i])) {
			ha.put(b[i], 1);
		}
		else {
			ha.put(b[i], ha.get(b[i])+1);
		}
	}
	System.out.println(ha);
	}


	//To remove duplicate/to print without duplicates
	class Main {
    public static void main(String[] args) {
        String a="india";
        jav(a);
    }
    public static void jav(String a){
        String ab="";
        for(int i=0;i<a.length();i++){
            if(ab.indexOf(a.charAt(i))==-1){
                ab+=a.charAt(i);
            }
        }
        System.out.print(ab);
    }
}
	
	
	//remove duplicates with count
	@Test
	public void man() {
		int a[]= {5,3,1,4,3,5};
		int count=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					a[i]=23;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]!=23) {
				System.out.print(a[i]+"    ");
				count++;
			}
				
		}
		System.out.println();
		System.out.println(count);
	}
	
	//print reverse a string
	@Test
	public void call() {
		
		//op- em oclew ollehih;
		//*********imp		
		
	    String a="hi hello welcome";
	    String b=a.replace(" ", "");
	    int j=b.length()-1;
	    for(int i=0;i<a.length();i++) {
	    	if(a.charAt(i)!=' ') {
	    		System.out.print(b.charAt(j--));
	    	}
	    	else {
	    		System.out.print(a.charAt(i));
	    	}
	    }



        //reverse a word in a string(O(n)) optimized
        class Solution {
    public String reverseWords(String s) {
        //trim() removes leading + trailing spaces
        // \\s+ -> one or more spaces
        String[] b = s.trim().split("\\s+");  // fix split
        //StringBuilder is NOT a String, it is a mutable abject
        StringBuilder c = new StringBuilder();

        for (int i = b.length - 1; i >= 0; i--) {
            c.append(b[i]);
            if (i != 0) c.append(" ");  // add space
        }
        
        //.toString() converts stringbuilder to string, return type has to be string
        return c.toString();
    }
}
				
				
		
		//different ways to reverse the string
		//way 1
		String s="Bangalore";
		String d="";
		for(int i=s.length()-1;i>=0;i--) {
			d=d+s.charAt(i);
		}
		System.out.println(d);
		
		
		
		//way 2
		String a="Bangalore";
		char b[]=a.toCharArray();
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]);
		}
		
		
		//way 3
		String a="Australia";
		for(int i=a.length()-1;i>=0;i--) {
			System.out.println(a.charAt(i));
		}
		
		
		//way 4
		StringBuffer s=new StringBuffer("bangalore");
		System.out.println(s.reverse());
		
		
		
		//reverse a string
		String a="hi hello welcome";//welcome hello hi
		String c[]=a.split(" ");
		for(int i=c.length-1;i>=0;i--) {
			System.out.print(c[i]+" ");
		}
		
//		//reverse
		String a="hi hello welcome to";//to hello welcome hi
		String b="";
		String c[]=a.split(" ");
		for(int i=c.length-1;i>=0;i--) {
			if(i==3 || i==0) {
				System.out.print(c[i]+" ");
			}	
			else {
				b=b+c[i];
				System.out.print(b+" ");
				b="";
			}		
		}
				


	//to swap 1st and last word
	class Main {
    public static void main(String[] args) {
        boii("virgin are not you");
    }
    public static void boii(String a){
        String b[]=a.split(" ");
        String c=b[0];  
        b[0]=b[b.length-1];   // put last word at first
        b[b.length-1]=c;      // put first word at last

        for(String word : b){
            System.out.print(word + " ");
        }
    }
}
	
	
	//order of occurance for a character
	@Test
	public void one() {
		char t[]= {'v','g','g','v','t','u'};
		HashMap<Character, Integer> m=new HashMap<Character, Integer>();
		for(int i=0;i<t.length;i++) {
			if(!m.containsKey(t[i])) {
				m.put(t[i],1);
			}
			else {
				m.put(t[i], m.get(t[i])+1);
			}
		}
		for(Entry<Character, Integer> bass:m.entrySet()) {
			if(bass.getValue()==1 || bass.getValue()>1) {
				System.out.println(bass.getKey()+"-->"+bass.getValue());
			}
		}
	}
	
	//to print without duplicates
	//op -> ia
	class Main {
    public static void main(String[] args) {
        String input = "iia";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
			//indexOf(c) checks whether c already exists in result.
			//If the character is not found, indexOf() returns -1 or else indexof(c) returns 0 which means the character will skipped adding again.
            if (result.indexOf(c) == -1) {  // only add if not already present
                result += c;
            }
        }
        System.out.println(result);
    }
}

//to pring only repeated characters
public class Main {
    public static void main(String[] args) {
        String input = "programming";
        int[] freq = new int[256]; // ASCII size

        for (int i = 0; i < input.length(); i++) {
            freq[input.charAt(i)]++;
        }

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
/**
 * to print only unique characters
 * just change this -> (bc[a.charAt(i)] == 1)
 */
            if (freq[c] > 1) {
                System.out.print(c + " ");
                freq[c] = 0; // reset so it's not printed again
            }
        }
    }
}

//order of occurance of each character(other way)
class Main {
    public static void main(String[] args) {
        hell("kannada");
    }

    public static void hell(String k) {
        char[] d = k.toCharArray();      // Convert string into char array
        int[] freq = new int[256];       // Array to store frequency of characters (ASCII size)

        // Count frequency of each character
        for (int i = 0; i < d.length; i++) {
            freq[d[i]]++;
        }

        // Print characters in order of occurrence
        for (int i = 0; i < d.length; i++) {
            if (freq[d[i]] != 0) {
                System.out.println(d[i] + " -> " + freq[d[i]]);
                freq[d[i]] = 0; // reset so it won’t print the same character again
            }
        }
    }
}




	//to print vowels and to print without duplicates in that 
	@Test
	public void vow() {
		String s="india";
		String b="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
				b=b+c;
			}
		}
		System.out.println(b);
		char u[]=b.toCharArray();
		LinkedHashSet<Character> link=new LinkedHashSet<Character>();
		for(Character ku:u) {
			link.add(ku);
		}
		System.out.println(link);
		
	}
	@Test
	public void tommy() {
		String s="India";
		String d=s.toLowerCase();
		String g="";
		for(int i=0;i<d.length();i++) {
			char t= d.charAt(i);
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
				g=g+t;
			}
		}
		System.out.println(g);
	}



	//To remove the duplicates from the sorted array

	public class Main {

    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        removeDuplicates(arr);
    }

    public static void removeDuplicates(int[] arr) {
        // if (arr.length == 0) return;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        // print result inside function
        for (int x = 0; x <= i; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}



	
	//to remove duplicate using linkedhashset and print the count of the vowels after segregating
	@Test
	public void hul() {
		String s="india";
		LinkedHashSet<Character> a= new LinkedHashSet<Character>();
		for(int i=0;i<s.length();i++) {
			a.add(s.charAt(i));
		}
		int count=0;
		for(Character t:a) {
			if(t=='a'||t=='e'||t=='i'||t=='o'||t=='u') {
				count++;
				System.out.println("vowel "+t);
			}
		}
		System.out.println("the count of vowels present in a string is "+count);
	}
	
	@Test
	public void ty() {
		String a="a2b4c1";
	    int b=0;
		for(int i=0;i<a.length();i++) {
			char g=a.charAt(i);
			if(g>='0' && g<='9') {
				int h=(int)g-48;
				b=b+h;
			}
		}
		System.out.println(b);
	}
	
	
	//to segregate and print accordingly
	@Test
	public void ui() {
		String a="a2b&3d$5";
		String chr="";
		String num="";
		String specchar="";
		for(int i=0;i<a.length();i++) {
			char b=a.charAt(i);
			if(b>='0' && b<='9') {
				chr=chr+b;
			}
			else if(b>='a' && b<='z') {
				num=num+b;
			}
			else {
				specchar=specchar+b;
			}
		}
		System.out.println(num);
		System.out.println(chr);
		System.out.println(specchar);

	}
	
	//1st min length and print min length which are having same value
	@Test
	public void cum() {
		String[] s= {"ui","abcd","edfg","cd","cdefg","ty"};
		String minlength =s[0];
		for(int i=0;i<s.length;i++) {
			if(s[i].length()<minlength.length()) {
				minlength=s[i];			
			}
		}
		System.out.println(minlength);
		for(int i=0;i<s.length;i++) {
			if(s[i].length()==minlength.length()) {
				System.out.println(s[i]);
			}
		}
	}
	
	@Test
	public void inte() {
		
	}
	
	
	//2nd min
	@Test
	public void came() {
		String[] sx= {"abcd","edfgrrrz","cd","cdefgt","tyy"};
		String firstmin=sx[0];
		String secondmin =sx[0];
		for(int i=0;i<sx.length;i++) {
			if(sx[i].length()<firstmin.length()) {
				secondmin=firstmin;
				firstmin=sx[i];
			}
			else if(sx[i].length()<secondmin.length()){
				secondmin=sx[i];
			}
		}
		System.out.println(firstmin);
		System.out.println(secondmin);
	}

	

	//pattern

	/**
	 *    *****
	 *    ***
	 *    ****
	 */
	class Main {
    public static void main(String[] args) {
        int a[]={5,3,4};
        for(int i=0;i<a.length;i++){
            for(int j=a[i];j>0;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
	
	
	//op-->a3b3c1
	@Test
	public void abc() {
		String s="aabbabc";
		char d[]=s.toCharArray();
//		int count =0;
		LinkedHashMap<Character, Integer> ma=new LinkedHashMap<Character, Integer>();
		for(int i=0;i<d.length;i++) {
			
			if(ma.containsKey(d[i])) {
				
				ma.put(d[i], ma.get(d[i])+1);
			}
			else {
				
				ma.put(d[i], 1);
			}
		}
		//ma.entrySet() → gives all key-value pairs in the map.
		for(Entry<Character, Integer> en:ma.entrySet()) {
			System.out.print(en.getKey()+""+en.getValue());
		}
	}
	
	//output - 001122
	class Main {
    public static void main(String[] args) {
        hell(new int []{1,2,0,2,0,1});
    }
    public static void hell(int [] a){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[i]){
                    int temp=a[j];
                    a[j]=a[i];
                    a[i]=temp;
                }
            }
        }

		// or instead of the below for loop you can use -> System.out.print(Arrays.toString(a)); to print in the form of array

        for(Integer x:a){
            System.out.print(x);  
        }
    }
}
	/**
	   the two digits that make to 25 are 12 and 13
       the two digits that make to 25 are 10 and 15
	 */
class Main {
    public static void main(String[] args) {
        hell(new int []{12, 13, 10, 15, 14, 16});
    }

    public static void hell(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == 25) {
                    System.out.println("the two digits that make to 25 are " + a[i] + " and " + a[j]);
                }
            }
        }
    }
}





//indexOf() operator

public class Main {
    public static void main(String[] args) {
        String text = "Hello World";

        // Find index of character
        System.out.println(text.indexOf('H'));   // 0
        System.out.println(text.indexOf('o'));   // 4 (first 'o')

        // Find index of substring
        System.out.println(text.indexOf("World")); // 6

		/**
		 * 3. Looking from index 5 onward
        Index 5 = ' ' (space) → not 'o'.	
        Index 6 = 'W' → not 'o'.
        Index 7 = 'o' → ✅ found it here.
		 */
        // Search starting from a position
        System.out.println(text.indexOf('o', 5));  // 7 (second 'o')

        // If not found
        System.out.println(text.indexOf("Java"));  // -1
    }
}






//Write a program with taking input as an integer array lets int are[]={0,-1,2,-3,4} and target value is -2 , if sum of pair is equal to -2 than we should print output as true.

class Main {
    public static void main(String[] args) {
        hell(new int []{0, -1, 2, -3, 4}, -2);
    }
    
    public static void hell(int [] a, int target){
        boolean found = false;
        
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i] + a[j] == target){
                    System.out.println(a[i] + " " + a[j]);
                    found = true;
                }
            }
        }
        
        if(found){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}

//The longest substring without repeating characters is "ABC", which has a length of 3.
//ABCBC - 3
//AAAA = 1
import java.util.*;
	class Main {
    public static void main(String[] args) {
        String a="ABCBC";
        String d="";
        char c[]=a.toCharArray();
            int count=0;
        for(int i=0;i<c.length-1;i++){
            if(d.indexOf(c[i])==-1){
                d=d+c[i];
                count++;
            }
        }
        System.out.print(count);
    }
}


	
	//op--->a2b2a1b1c1
	@Test
	public void jam() {
//		String a="aabbabcc";
//		int count=1;
//		for(int i=0;i<a.length()-1;i++) {
//			if(a.charAt(i)==a.charAt(i+1)) {
//				count++;
//			}
//			else {
//				System.out.print(a.charAt(i)+""+count);
//				count=1;
//			}
//		}
//		System.out.println(a.charAt(a.length()-1)+""+count);
		
		
		
		String a="aaabbbctyyy";
		int count=1;
		char d[]=a.toCharArray();
		for(int i=0;i<d.length-1;i++) {
			if(d[i]==d[i+1]) {
				count++;
			}
			else {
				System.out.println(d[i]+""+count);
				count=1;
			}
		}
		System.out.println(a.charAt(a.length()-1)+""+count);
	}
	
	
	//o/p--->5
	@Test
	public void classes() {
		String a="In d ia";
		String b=a.replace(" ", "");
		int count=0;
		for(int i=0;i<b.length();i++) {
			count++;
		}
		System.out.println(count);
		
//		String a="bangalore";
//		char t[]=a.toCharArray();
//		for(int i=0;i<t.length-1;i++) {
//			System.out.print(t[i]);
//		}
	}
	
	
	//o/p-->6789 5 45 1234
	@Test
	public void ham() {
		String a="abc1234bd45ef5gh6789";
		String [] b=a.split("[^0-9]");//[^0-9] is a regular expression pattern that matches any character that is not a digit (0-9).
		for(int i=b.length-1;i>=0;i--) {
			System.out.print(b[i]+' ');
		}
	}
	
	
	
	//o/p-->
	//welcome to bangalore hi
//	 to bangalore hi welcome
//	 bangalore hi welcome to
//	 hi welcome to bangalore
	
	
	
	//assignment
	@Test
	public void hash() {
		String a="welcome to bangalore hi";
		String b[]=a.split(" ");
	}
	
	//**************imp
	//op-->9&ol$l%eh
	@Test
	public void han() {
		String a="h&el$l%o9";
        //remove everything that is NOT letter or number
        //^ -> NOT
		String c=a.replaceAll("[^A-Za-z0-9]",""); //includes
		System.out.println(c);
		int h=c.length()-1;
		for(int i=0;i<a.length();i++) {
			char j=a.charAt(i);
			if(j>='a' && j<='z' || j>='0' && j<='9') {
				System.out.print(c.charAt(h--));
			}
			else {
				System.out.print(j);
			}
		}
	}
	
	
	
	//op-->h e  l   l    o
	@Test
	public void game() {
		String s="hello";
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
		}
	}
	
	
	//bubble sort
	@Test
	public void hans() {
		int[] a= {5,4,0,4,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	
	
	//sum of 1st three min number in an array
	@Test
	public void sort() {
	int a[]= {6,7,2,3,9,4};
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[j]<a[i]) {
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
		}
	}
	
	int sum=0;
	for(int i=0;i<3;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
	}
	
	
	//sum of 1st three max number in an array
	@Test
	public void max() {
		int a[]= {6,7,2,3,9,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		int sum=0;
		for(int i=0;i<3;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	
	
	//product of 1st three min number in an array
	@Test
	public void arr() {
		int a[]= {6,7,2,3,9,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		int mul=1;
		for(int i=0;i<3;i++) {
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	
	
	//product of 1st three max number in an array
	@Test
	public void ayy() {
		int a[]= {6,7,2,3,9,4};
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					int temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
		}
		
		int mul=1;
		for(int i=0;i<3;i++) {
			mul=mul*a[i];
		}
		System.out.println(mul);
	}
	
	
	//to find the frequency of the number(to print the count of the maximum repeated number in a given array)
	@Test
	public void freq() {
		int []a= {3,1,2,1,5,2,1};
		HashMap<Integer, Integer> ma=new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++) {
			// If the number is not already present in the map
			if(!ma.containsKey(a[i])) {
				ma.put(a[i], 1);
			}
			else {
				//put() is "adding" again, but actually it replaces the old value if the key already exists.
				ma.put(a[i], ma.get(a[i])+1);
			}
		}
		for(Entry<Integer, Integer> jj:ma.entrySet()) {
			if(jj.getKey()==1) {
				System.out.println(jj.getKey()+"="+jj.getValue());
			}
		}
		
		
}
	//to print the maximum repeated number in an array
	//to find frequency of the number
	@Test
	public void free() {
		int []a= {2,2,4,5,6,4,4,3};
		int max=0;
		int val=0;
		for(int i=0;i<a.length;i++) {
			int count=1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>max) {
				max=count;
				val=a[i];
			}
		}
		System.out.println("the value is "+val+" and count of the value is "+max);
	}
	
	
	
	//op-->5 9 4 6 3(adding two array with different length)
	// @Test
	// public void add() {
	// 	int a[]= {2,3,4,5,6};
	// 	int b[]= {4,5,5,6};
	// 	int length=b.length;
	// 	if(a.length>b.length) {
	// 		length=a.length;
	// 	}
	// 	for(int i=0;i<length;i++) {
	// 		try {
	// 			System.out.print(a[i]+b[i]+" ");
	// 		}
	// 		catch(Exception t) {
	// 			if(a.length<b.length) {
	// 				System.out.println(b[i]);
	// 			}
	// 			else {
	// 				System.out.println(a[i]);
	// 			}
	// 		}
	// 	}
	// }
	
	
	//prime no from 1 to 30
	@Test
	public void no() {
		for(int i=1;i<=30;i++) {
			int count=0;
			int no=i;
			for(int j=1;j<=no;j++) {
				if(no%j==0) {
					count++;
				}
			}
			if(count==2) {
				System.out.print(no+" ");
			}
		}
	}
	
	
	//to check whether given no is prime or not
	@Test
	public void hu() {
		int no=7;
		int count=0;
		for(int i=1;i<=no;i++) {
			if(no%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("given number is prime");
		}
	}
	
	
	//factorial of number 5
	@Test
	public void am() {
		int n=5;
		int mul=1;
		for(int i=1;i<=n;i++) {
			mul=mul*i;
		}
		System.out.println(mul);
	}
	
	
	//fibnoccii
	@Test
	public void fib() {
		int fib1=0;
		int fib2=1;
		int fib3 = 0;
		System.out.print(fib1+" "+fib2+" ");
		for(int i=1;i<=10;i++) {
			fib3=fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
	}
	
	
	//anagram
	@Test
	public void mans() {
		String a="momf";
		String b="omm";
		if(a.length()==b.length()) {
			char[]c=a.toCharArray();
			char[]d=b.toCharArray();
			Arrays.sort(c);
			Arrays.sort(d);
			String str=new String(c);
			String str1=new String(d);
			if(str1.equalsIgnoreCase(str)) {
				System.out.println("given word is an anagram");
			}
		}
		else
		{
			System.out.println("length not matching");
		}
	}


//anagram(optimized)
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



	
	
	//int palindrome
	@Test
	public void palind() {
		int rev=0;
		int no=3431;
		int c=no;
		while(no!=0) {
			int rem=no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev==c) {
			System.out.println("given no is a palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}
	
	
	//to print how many times bus is repeated in a given string
	@Test
	public void many() {
		String a="carbustraincarbustrainbus";
		String b=a.replace("car", "");
		String c=b.replace("train", " ");
		String d[]=c.split(" ");
		HashMap<String, Integer> ma= new HashMap<String, Integer>();
		for(int i=0;i<d.length;i++) {
			if(!ma.containsKey(d[i])) {
				ma.put(d[i], 1);
			}
			else {
				ma.put(d[i], ma.get(d[i])+1);
			}
		}
		System.out.println(ma);
	}
	
	
	//op-->1 3 7 15 31
	@Test
	public void jams() {
		int n=0;
		for(int i=1;i<=5;i++) {
			n=(n*2)+1;
			System.out.print(n+" ");
		}
	}
	

	
	@Test
	public void tammy() {
		String a="hi hello welcome";//ih olleh emoclew
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++) {
			String c=b[i];
			String d="";
			for(int j=c.length()-1;j>=0;j--) {
				char f=c.charAt(j);
				d=d+f;
			}
			System.out.print(d);
		}
	}
	
	
	@Test
	public void jyyI() {
		String s="145";
		char []p= s.toCharArray();
		int sum=0;
		for(int i=0;i<p.length;i++) {
//			System.out.print(p[i]-48+" ");
			int x=p[i]-48;
			System.out.println(x);
			sum=sum+x;
		}
		System.out.println(sum);
	}
	

		
	//op-->azgar is name my your name is rocky
	@Test
	public void kama() {
//		String a="my name is roopak.your name is rocky";
//		String b[]=a.split("\\.");
//		for(int i=0;i<b.length;i++) {
//			if(i==0) {
//				String f=b[i];
//				String g[]=f.split(" ");
//				for(int j=g.length-1;j>=0;j--) {
//					System.out.print(g[j]+" ");
//				}
//			}
//			else {
//				System.out.print(b[i]);
//			}
//		}
		

		//to move all zeros to the end of the array
		class Main {
    public static void main(String[] args) {
        int a[]={1, 2, 0, 4, 3, 0, 5, 0};
        int index =0;
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                a[index]=a[i];
                index++;
            }
        }
        while(index<a.length){
            a[index]=0;
            index++;
        }
        System.out.print(Arrays.toString(a)); //output-->[1, 2, 4, 3, 5, 0, 0, 0]
        for(Integer x:a){
            System.out.print(x); //output-->12435000
        }
    }
}



//to move all zeros to the beginning of the array
class Main {
    public static void main(String[] args) {
        javas(new int[]{0, 4, 5, 0, 7, 0, 0, 1, 0, 9});
    }

    public static void javas(int[] a) {
        int index = a.length - 1;

        // Move non-zero elements to the end
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] != 0) {
                a[index] = a[i];
                index--;
            }
        }

        // Fill remaining positions at beginning with zeros
        while (index >= 0) {
            a[index] = 0;
            index--;
        }

        System.out.print(Arrays.toString(a));
    }
}




//*********************************************
//alternative way to move all zeros to the end of the array
int j = 0;

for (int i = 0; i < a.length; i++) {
    if (a[i] != 0) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
        j++;
    }
}
System.out.println(Arrays.toString(a));




//to reverse the array

    public static void main(String[] args) {
        int a[]={1,7,1,3,9,2};
        int b[]=new int[a.length];
        int j=0;
        for(int i=a.length-1;i>=0;i--){
            b[j]=a[i];
            j++;
            // System.out.print(a[i]);
        }
        System.out.print(Arrays.toString(b)); //output-->[2, 9, 3, 1, 7, 1]
    }
		
		
		String a="my name is roopak&%$*your name is rocky";
		String b[]=a.split("\\&\\%\\$\\*");
		for(int i=0;i<b.length;i++) {
			if(i==0) {
				String f=b[i];
				String g[]=f.split(" ");
				for(int j=g.length-1;j>=0;j--) {
					System.out.print(g[j]+" ");
				}
			}
			else {
				System.out.print(b[i]);
			}
		}
	}
	
	@Test
	public void hammy() {
		{
			String a="my name is shata . your name is prasad";
			String b[]=a.split("[.]");
			String jj="";
			String kk="";
//			System.out.println(Arrays.toString(b));
//			for(int i=0;i<b.length;i++) {
//				System.out.print(b[i]);
//			}
			for(int i=0;i<b.length;i++) {
				if(i==0) {
					String f=b[i];
					String g[]=f.split(" ");
					String ty="";
					for(int j=g.length-1;j>=0;j--) {
						ty=ty+g[j]+" ";
						if(j==g.length-1) {
							jj=jj+g[j];
						}
					}
					System.out.print(ty);
				}
				else  {
					String f=b[i];
					String g[]=f.split(" ");
					String ty="";
					for(int j=0;j<g.length;j++) {
						ty=ty+g[j]+" ";
						if(j==g.length-1) {
							kk=kk+g[j];
						}
					}
					System.out.println(ty);
				}
			}
			System.out.println(jj+" "+kk);
		}
	}
	
	
	@Test
	public void kim() {
		
		//op-->aabbgggghhh
//		String a="a2b2g4h3";
//		String b="";
//		for(int i=0;i<a.length();i++) {
//			char t=a.charAt(i);
//			if(t>=48 && t<=57) {
//				int u=(int)t-48;
//				for(int j=1;j<=u;j++) {
//					b=b+a.charAt(i-1);
//				}
//				
//			}
//		}
//		System.out.println(b);
		
		
		//op-->bbbvvvvee
		String a="3b4v2e";
		String b="";
		for(int i=0;i<a.length();i++) {
			char t=a.charAt(i);
			if(t>=48 && t<=57) {
				int h=(int)t-48;
				for(int j=1;j<=h;j++) {
					b=b+a.charAt(i+1);
				}
			}
		}
		System.out.println(b);
	}
	
	//12. Another that prints characters from a string based on the indices in the Fibonacci sequence [2, 3, 5, 8].

	class Main {
    public static void main(String[] args) {
        hell("automation", new int []{2,3,5,8});
    }

    public static void hell(String b, int []a){
        String d = "";
        for(int i=0; i<a.length; i++){
            if(a[i] < b.length()) {   // safety check
                char c = b.charAt(a[i]); // use a[i] as index
                d += c;
            }
        }
        System.out.print(d);
    }
}



//String Compression
/**
 * Why not use normal String?
 * String result = "";
result = result + "a";
result = result + "b";

Every time you do +, a new object is created

Old string is discarded

Very slow for large inputs

✅ StringBuilder solves this
StringBuilder result = new StringBuilder();
✔ Modifies the same object
✔ No new object creation
✔ Much faster
result.append("a");
result.append("b");
 */
//output -> a3b2c1d1
class Main {
    public static void main(String[] args) {
        String a="aaabbcd";
        jav(a);
    }
    public static void jav(String a){
        StringBuilder b=new StringBuilder();
        int count =1;
        for(int i=1;i<a.length();i++){
            if(a.charAt(i)==a.charAt(i-1)){
                count++;
            }else{
                b.append(a.charAt(i-1)).append(count);
                count=1;
            }
        }
        System.out.print(b.append(a.charAt(a.length()-1)).append(count));
    }
}


//String compression (leetcode)
//input -> ["a","a","b","b","c","c","c"]
//output -> 6 -  meaning a2b2c3
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


	@Test
	public void haty() {
		String a="aaabbcat";
		int count=1;
		for(int i=0;i<a.length()-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
				count++;
			}
			else {
				System.out.print(a.charAt(i)+""+count);
				count=1;
			}
		}
		System.out.println(a.charAt(a.length()-1)+""+count);
	}
	
	
	@Test
	public void tyt() {
		String a="hi hello welcome to";//to hello welcome hi
		String temp="";
		String c[]=a.split(" ");
		for(int i=0;i<c.length;i++) {
			if(i==0) {
				temp=c[i];
			}
			else if(i==c.length-1) {
				c[0]=c[i];
				c[i]=temp;
			}
		}
		for(String b:c) {
			System.out.print(b+" ");
		}
	}
	
	
	@Test
	public void hju() {
		String a="bega magane baro boli";
		String b[]=a.split(" ");
		String temp="";
		for(int i=0;i<b.length;i++) {
			if(i==0) {
				temp=b[i];
			}
			else if(i==b.length-1) {
				
				b[0]=b[i];
				b[i]=temp;
			}
		}
		for(String y:b) {
			System.out.print(y+" ");
		}
	}
	//to convert lower case to upper case
	@Test
	public void str() {
		String a="how are you";
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++) {
			String c=b[i];
			for(int j=0;j<c.length();j++) {
				char k=c.charAt(j);
			if(j==0) {	
				int p=(int)k-32;
				System.out.print((char)p);
			}
			else {
				System.out.print(k);
			}
			}
			System.out.print(" ");//output-->How Are You
		}
	}
	
	//to fetch number and add
	@Test
	public void hami() {
		String a="a4%5hd&8";
		char[]b=a.toCharArray();
		int sum=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>=48 && b[i]<=57) {
				sum=sum+(b[i]-48);
			}
		}
		System.out.println(sum);//output-->17
	}
	
	
	@Test
	public void reverse_the_word_in_a_sentence() {
		String a="hello boys lets go";
		String b[]=a.split(" ");
		for(int i=0;i<b.length;i++){
			String temp=b[i];
			for(int j=i+1;j<b.length;j++) {
				System.out.print(b[j]+" ");
			}
			System.out.print(temp);
			System.out.println();
		}
		
	}
	
	
	@Test
	public void tobalance() {
		String a="{}[{(}])";
		
	}
	
	
	
	//to reverse a vowels in a String by keeping a consonant in its place
	@Test
	public void reverse() {
		String a="abcezopu";
		int j=a.length()-1;
		char b=' ';
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)=='a' || a.charAt(i)=='e'|| a.charAt(i)=='i'|| a.charAt(i)=='o'|| a.charAt(i)=='u' ) {
				System.out.print(a.charAt(j--));
//				b=a.charAt(j--);
			}
			else {
				System.out.print(a.charAt(i));
			}
		}
	}








//Increment the large integer by one and return the resulting array of digits.
//output-->[1, 0, 0, 0]
//Plus One Problem (999 → 1000)
public class Main {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        plusOne(digits);
    }

    public static void plusOne(int[] digits) {
		//this will run for 3 loops
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                System.out.println(Arrays.toString(digits));
                return;
            }
            digits[i] = 0;
        }
		/**
		 * This creates a NEW EMPTY ARRAY of size 4:
		 * b = [0, 0, 0, 0]
		 */
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        System.out.println(Arrays.toString(result));
    }
}


//BINARY SEARCH program

public class BinarySearch {
    public static void main(String[] args) {

        // Sorted array
        int[] arr = {2, 3, 4, 10, 40, 50, 60, 100};

        // Element to search for
        int target = 10;

        // Initialize left and right pointers
        int left = 0;
        int right = arr.length - 1;

        int result = -1;  // To store the index of the target

        // Binary Search Logic
		// this is used -> (left <= right) to make sure that left pointer is not crossed the right pointer
        while (left <= right) {

            // Calculate middle index safely
            int mid = left + (right - left) / 2;

            // If the target is found
            if (arr[mid] == target) {
                result = mid;
                break;
            }

            // If the target is greater, search right half
            else if (arr[mid] < target) {
				left++;
				//or
                //left = mid + 1;
            }

            // If the target is smaller, search left half
            else {
				right--;
				//or
                //right = mid - 1;
            }
        }

        // Print the result
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}



//To count the digits in the number
// output -> 5
class Main {
    public static void main(String[] args) {
        int n = 12345;
        countDigits(n);
    }

    public static void countDigits(int n) {
        int count = 0;

        if (n == 0) {
            System.out.println(1);
            return;
        }

        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println(count);
    }
}


//to add(sum) the digits in the number
//output -> 6
class Main {
    public static void main(String[] args) {
        int n = 123;
        sumDigits(n);
    }

    public static void sumDigits(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;  // get last digit
            n = n / 10;     // remove last digit
        }

        System.out.println(sum);
    }
}


//number palindrome
class Main {
    public static void main(String[] args) {
        int n = 121;
        checkPalindrome(n);
    }

    public static void checkPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println(original == reverse);
    }
}





//Square root using binary search
//output -> 4
class Main {
    public static void main(String[] args) {
        cars(16);
    }

    public static void cars(int a) {

        int left = 0;
        int right = a;
        int res = 0;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            long sqr = (long) mid * mid;

            if (sqr == a) {
                res = mid;
                break;
            }
            else if (sqr < a) {
                res = mid;        // possible answer
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        System.out.print(res);
    }
}






//Find First and Last Position of Element in Sorted Array 
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 8;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    // Find first occurrence
    private static int findFirst(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;        // possible answer
                high = mid - 1;   // move left
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    // Find last occurrence
    private static int findLast(int[] nums, int target) {
        int low = 0, high = nums.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;        // possible answer
                low = mid + 1;    // move right
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }
}





//Kadane’s Algorithm – Maximum Subarray Sum
//to find the max sum in the array

public class KadaneAlgorithm {

    public static int maxSubArray(int[] nums) {

        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // Add current element
            currentSum += nums[i];

            // Update max sum if needed
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }

            // If current sum drops below 0, reset it
			// because -ve value will not help in getting the max value
            if (currentSum < 0) {
                currentSum = 0;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        System.out.println("Maximum subarray sum = " + maxSubArray(arr));
    }
}


//Trapping rain water
//


public class TrappingRainwater {

    public static int trap(int[] height) {

        int n = height.length;

		//It prevents errors when the input array is empty.
        if (n == 0) return 0;

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // 1️⃣ Fill leftMax array

		/**
		 * example for theleftmax array
i = 0
leftMax[0] = 4

i = 1
leftMax[1] = max(4, 2) = 4

i = 2
leftMax[2] = max(4, 0) = 4

i = 3
leftMax[3] = max(4, 3) = 4

i = 4
leftMax[4] = max(4, 2) = 4

i = 5
leftMax[5] = max(4, 5) = 5

		 */
        leftMax[0] = height[0];
		// where the array fills from left side, where i keeps incresing here
		// the reason why i am doing[i-1] is because i am comparing the heights and storing in the leftMax array
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        // 2️⃣ Fill rightMax array
/**
 * i = 5
rightMax[5] = 5

i = 4
rightMax[4] = max(5, 2) = 5

i = 3
rightMax[3] = max(5, 3) = 5

i = 2
rightMax[2] = max(5, 0) = 5

i = 1
rightMax[1] = max(5, 2) = 5

i = 0
rightMax[0] = max(5, 4) = 5

		 */
        rightMax[n - 1] = height[n - 1];
		// where the array fills from right side, where i keeps reducing here
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        // 3️⃣ Calculate trapped water
		/**
		 * 🟢 Iteration 2 → i = 1

Values:

arr[1] = 2
a[1]   = 3
b[1]   = 3


Calculation:

min(a[1], b[1]) - arr[1]
= min(3, 3) - 2
= 3 - 2
= 1


Update:

trapped = 0 + 1 = 1
		 */
        int trapped = 0;
        for (int i = 0; i < n; i++) {
            trapped += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trapped;
    }

    public static void main(String[] args) {

        int[] height = {4, 2, 0, 3, 2, 5};

        System.out.println("Trapped Water = " + trap(height));
    }
}




//To print first unique - OPTIMIZED
class Main {
    public static void main(String[] args) {
        javas(new int[]{3,6,2,8,6,6,3,8});
    }

    public static void javas(int[] a) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        // Count frequency
        for (int num : a) {
			//0 is the default value to use when the key (num) is not yet present in the map.
			//If the number has never appeared before, its count should start from 0
			//get returns null if the key is not present but the getordefault returns default value which can be anything.
			//basically you will be doing this -> map.put(num, 1); <- example (key and value)
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // First unique
		//Map.Entry represents ONE key–value pair inside a Map.
		//entrySet() returns a Set of all key–value pairs (Entry objects) in the Map.
		//To iterate over both key and value together, we use entrySet()
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            if (e.getValue() == 1) {
                System.out.print(e.getKey());
                return;
            }
        }
    }
}




//To print first unique
class Main {
    public static void main(String[] args) {
        hell(new int []{4,4,3,5,6,6,6,8,9});
    }

    public static void hell(int[] a){
        for (int i = 0; i < a.length; i++) {
            boolean isUnique = true;

            for (int j = i+1; j < a.length; j++) {
				
                if (a[i] == a[j]) {
					//for next iterations the 'isUnique will be true and it will not continue with false'
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                System.out.println(a[i]);  // print first unique
                return;                    // stop after printing
            }
        }
    }
}





	

//Longest SubstringWithoutRepeatingCharacters:

public class Main {
    public static void main(String[] args) {
        String a = "ABCBC";
        int count = 0;

        for (int i = 0; i < a.length(); i++) {
            char ty = a.charAt(i);

			/**
			 * 👉 a.indexOf(ty)

→ gives the first index where that character appears.

👉 a.lastIndexOf(ty)

→ gives the last index where that character appears.

OR if the first occurrence index equals the current index i,
that means this is the first time we’re seeing that repeated character.
			 */

            if (a.indexOf(ty) == a.lastIndexOf(ty) || a.indexOf(ty) == i) {
                count++;
            }
        }
        System.out.print(count);
    }
}

//longest substring without repeating characters(optimized)

class Main {
    public static void main(String[] args) {
        String a="abcabcbb";
        jav(a);
    }
    public static void jav(String c){
        HashMap<Character, Integer> x=new HashMap<>();
        int left =0;
        int maxlength=0;
        for(int right=0;right<c.length();right++){
            char ty=c.charAt(right);
            if(x.containsKey(ty)){
				//at index 3 left moves to 2 right = 3 and window is "CB"  similarly for index 4


                left=Math.max(left, x.get(ty)+1);
            }
            x.put(ty, right);
            maxlength=Math.max(maxlength, right-left+1);
        }
        System.out.print(maxlength);
    }
}



	
	//paranthesis balancing
	@Test
	public void bal() {
		String a="{([])}";
		ArrayList<Character> list=new ArrayList<Character>();
		
		for(int i=0;i<a.length();i++) {
			if(list.size()!=0 && ((a.charAt(i)=='}' && list.get(list.size()-1)=='{') ||
					(a.charAt(i)==']') && list.get(list.size()-1)=='[') || (a.charAt(i)==')' && list.get(list.size()-1)=='(')) {
				list.remove(list.size()-1);
			}
			else {
				list.add(a.charAt(i));
			}
		}
		if(list.size()==0) {
			System.out.println("balanced");
		}
		else {
			System.out.println("not balanced");
		}
	}
	
	
	                                                                              //OR
	
	
	@Test
	public void bal2() {
		String a="[]()";
		java.util.Stack<Character> stack=new java.util.Stack<Character>();
		for(int i=0;i<a.length();i++) {
			char ch=a.charAt(i);
			if(ch=='(' || ch=='{'||ch=='[') {
				stack.push(ch);
			}
			
			if(a.isEmpty()) {
				System.out.println("not balanced");
				return;
			}
			
			char ch1;
			switch(ch) {
			case ')':
				ch1=stack.pop();
				if(ch1=='{'||ch1=='[') {
					
				}
			}
		}
	}


	//OR
	
// LONGEST Valid Parenthesis(to find the max length)	

	//✅ A stack is used to store indexes of characters, not the characters themselves.
	//✅ Pushing -1 helps handle the base case (to calculate lengths easily when valid substrings start from index 0).
	//✅ maxlength keeps track of the longest valid parenthesis substring found so far.

import java.util.Stack;
//Length of the longest continuous balanced substring
/**
 * What it does NOT return
 * It does not tell whether the entire string is valid or not.
 */
public class Main {
    public static void main(String[] args) {
        String a = "())()()()())";
        System.out.println("Longest valid parentheses length: " + longestValidParentheses(a));
    }

    public static int longestValidParentheses(String b) {
        Stack<Integer> x = new Stack<>();
        x.push(-1);  // base index to handle length calculations
        int maxlength = 0;

        for (int i = 0; i < b.length(); i++) {
            if (b.charAt(i) == '(') {
                x.push(i);  // push index of '('
            } else {
                x.pop();  // pop last '(' index
                if (x.isEmpty()) {
                    x.push(i);  // push index of unmatched ')'
                } else {
					//peek will give last element in the stack
					//Math.max() always keeps the longest valid substring.
					//Math.max(a, b) simply returns the bigger (maximum) of the two values a and b.
                    maxlength = Math.max(maxlength, i - x.peek());
                }
            }
        }

        return maxlength;
    }
}


//valid parenthesis(Check correctness, the output is true or false)
//To check whether the parenthesis is balanced/valid
import java.util.*;

class Main {
    public static void main(String[] args) {
        cars("())");
    }

    public static void cars(String a) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);

            if (ch == '(') {
                stack.push(ch);
            } else { // ch == ')'
			//for the index 3, That means: There is a closing bracket with no matching opening bracket so sop(false) will be printed and return will be executed
                if (stack.isEmpty()) {
                    System.out.println(false);
                    return;
                }
                stack.pop();
            }
        }

        // Print result instead of returning
		// this will print true if the stack is empty(which means balanced)
        System.out.println(stack.isEmpty());
    }
}



//Buy and Sell the stock
/**
 * Analogy-
 * You check stock price daily
You can only buy using past info
You cannot go back and buy in the past

“Buy at lowest price before the current day”

You cannot do this -> Buy at 3 (future)
Sell at 6 (past)
 */
class Main {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {

            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                int profit = prices[i] - minPrice;
                maxProfit = Math.max(maxProfit, profit);
            }
        }

        return maxProfit;
    }
}




//Find Pair with Given Difference → ✅(brute force)
//Math.abs() will return the absoulte value, as we are finding the difference, 2-80 will be -78 so we dont need -ve value, we just need difference
class Main {
    public static void main(String[] args) {
        int []arr = {5, 20, 3, 2, 50, 80};
        int k=78;
        jav(arr, k);
    }
    public static void jav(int a[], int val){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(Math.abs(a[i]-a[j])==val){
                    System.out.print("target found at index"+ i+ "and" +j);
                    return;
                }
            }
        }
    }
}


//Find Pair with Given Difference(optimized)
class Main {
    public static void main(String[] args) {
        int []arr = {5, 20, 3, 2, 50, 80};
        int k=78;
        jav(arr, k);
    }
    public static void jav(int a[], int val){
        HashSet<Integer> x=new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(x.contains(a[i]-val)||x.contains(a[i]+val)){
                System.out.print("pairs found");
                return;
            }
            x.add(a[i]);
        }
    }
}


//To find the first non-repeating character in a string
import java.util.*;

class Main {
    public static void main(String[] args) {
        findFirstNonRepeating("swiss");
    }

    public static void findFirstNonRepeating(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first non-repeating character
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                System.out.println(c);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}


//To print the first non-repeating character in a string(another method)

class Main {
    public static void main(String[] args) {
        String a="india";
        jav(a);
    }
    public static void jav(String a){
        for(int i=0;i<a.length();i++){
            char t=a.charAt(i);
            if(a.indexOf(t)==a.lastIndexOf(t) && a.indexOf(t)==i){
                System.out.print(t);
                return;
            }
        }
    }
}






//to sort an array suring Duch national flag algorithm rather than bubble sorting
//You cannot use a normal for (int i = 0; i < arr.length; i++) loop for the Dutch National Flag algorithm because the pointer movement is NOT linear.
/**
 * why the condition -> mid <= high
 * --> 
 * In the Dutch National Flag algorithm:
low marks the boundary for 0s
mid is the current element being processed
high marks the boundary for 2s

mid is the pointer that actually processes the array, not low. therefore we should not use low<=high
+}"
 */
public class Main {
    public static void main(String[] args) {
        sort(new int []{1,2,0,2,1,0,0,1,0,2,0});
    }
    public static void sort(int[] arr) {
        int low = 0, mid = 0, high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                int temp=a[mid];
                a[mid]=a[low];
                a[low]=temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }
		System.out.print(Arrays.toString(arr));
    }	
}










//to rotate an array(LEFT rotate)
/**input is -> [1, 2, 3, 4, 5]
 * 
Left rotation by 2 means:
👉 Take first 2 elements and push them to the end
STEP 1 — Reverse first k elements
Original:       [1, 2, | 3, 4, 5]
Reverse(0–1):   [2, 1, | 3, 4, 5]

STEP 2 — Reverse remaining n−k elements
Before:   [2, 1, | 3, 4, 5]
After:    [2, 1, | 5, 4, 3]

STEP 3 — Reverse the entire array
Before:   [2, 1, 5, 4, 3]
After:    [3, 4, 5, 1, 2]
*/



//use your brain for the right rotation



public class LeftRotateOneFunction {

    public static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Reverse first k elements
        int start = 0, end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse remaining elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Reverse entire array
        start = 0;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        leftRotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}


//Rotating the string
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        return (s + s).contains(goal);
    }
}


//for rightrotaion first go with reversing the entire array and then do the rotation
public class RightRotateOneFunction {

    public static void rightRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        // Step 1: Reverse entire array
        int start = 0, end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Step 2: Reverse first k elements
        start = 0;
        end = k - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        // Step 3: Reverse remaining elements
        start = k;
        end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        rightRotate(arr, k);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}






//to merge two sorted arrays
/**
 * int i = 0; // pointer for a[]
   int j = 0; // pointer for b[]
   int k = 0; // pointer for result[]

   i moves inside array a
   j moves inside array b
   k fills the result array
 */



public class MergeSortedArrays {

    public static int[] merge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;

        int[] result = new int[n + m];

        int i = 0; // pointer for array a
        int j = 0; // pointer for array b
        int k = 0; // pointer for result array

        // Compare elements and merge
        while (i < n && j < m) {
            if (a[i] <= b[j]) {
                result[k++] = a[i++];
            } else {
                result[k++] = b[j++];
            }
        }

		//If any elements remain in a[] (example if b has extra element after 8 )
        // Copy remaining elements from a[]
        while (i < n) {
            result[k++] = a[i++];
        }

		/**
		 * If any elements remain in b[] (example if b has extra element after 8 )
		 */
        // Copy remaining elements from b[]
        while (j < m) {
            result[k++] = b[j++];
        }

        return result;
    }


	//merge sorted array
	//for the better understanding when incrementing
	import java.util.*;
class Main {
    public static void main(String[] args) {
        int [] a={1,3,5,7};
        int []b={2,4,6};
        hell(a, b);
    }
    public static void hell(int a[], int b[]){
        int i=0;
        int j=0;
        int k=0;
        int res[]=new int[a.length+b.length];
        while(i<a.length &&j<b.length){
            if(a[i]<b[j]){
                res[k]=a[i];
                k++;
                i++;
            }else{
                res[k]=b[j];
                k++;
                j++;
            }
        }
        while(i<a.length){
            res[k]=a[i];
            k++;
            i++;
        }
        while(j<b.length){
            res[k]=b[j];
            k++;
            i++;
        }
		//convert an array into a readable string format
        System.out.print(Arrays.toString(res));
    }
}

    public static void main(String[] args) {

        int[] a = {1, 3, 5, 7};
        int[] b = {2, 4, 6, 8};

        int[] merged = merge(a, b);

        for (int x : merged) {
            System.out.print(x + " ");
        }
    }
}






//output -> eeb
public class RollingString {
    public static void main(String[] args) {
        String s = "bca";
        int[] roll = {1, 2, 3};

        // Convert string to character array for easy manipulation
        char[] chars = s.toCharArray();

        // Perform each roll sequentially
        for (int r = 0; r < roll.length; r++) {

            int rollIndex = roll[r];

            // Roll the first `rollIndex` characters
			/**
			 * chars[i] = 'b'  
            'b' - 'a' = 1  
            1 + 1 = 2  
            2 % 26 = 2  
            'a' + 2 = 'c'
			ASCII value of 'a' is 97 and 'z' is 122 so it is a to z range
			 */
            for (int i = 0; i < rollIndex; i++) {
                chars[i] = (char) ('a' + ((chars[i] - 'a' + 1) % 26)); // Increment character
            }

            // Print intermediate result for each roll
            System.out.println("After roll " + (r + 1) + ": " + new String(chars));
        }

        // Final result
        String result = new String(chars);
        System.out.println("Final result: " + result);
    }
}




//Product of array except self
//output -> [24,12,8,6]
/**
 * result[0] = 2×3×4 = 24

result[1] = 1×3×4 = 12

result[2] = 1×2×4 = 8

result[3] = 1×2×3 = 6
 */
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        productExceptSelf(nums);
    }

    public static void productExceptSelf(int[] nums) {

        int n = nums.length;
        int[] result = new int[n];

        // Step 1: Left products
		// this is equal to 1 becasue to ease the multiplication
        result[0] = 1;
        for (int i = 1; i < n; i++) {
			//prefix (result[i])= product of all elements before i
            result[i] = result[i - 1] * nums[i - 1];
        }

        // Step 2: Right products
		// int right=1; instead of result[n-1]=1 because that breaks O(1) extra space
        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
			//suffix(result[i]) = product of all elements after i
            result[i] = result[i] * right;
            right = right * nums[i];
        }

        System.out.println(Arrays.toString(result));
    }
}




//Product of array except self(brute force approach)
class Main {
    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        jav(arr);
    }
    public static void jav(int a[]){
        int result[]=new int[a.length];
        int product=1;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(i!=j){
                    product*=a[j];
                }
            }
            result[i]=product;
            product=1;
        }
        System.out.print(Arrays.toString(result));
    }
}






1, 2, 6, 24 
4
24, 12, 8, 



//Intersection of two arrays.
//output - [4,9]
/**
 * Common

Matched at the same pointer position

Matched only once because pointers move forward

Thus intersection = 4, 9
//Analogy.
A = students in class A
B = students in class B

Intersection = students present in BOTH classes
means, if the same elements are present in both the array then it is an intersection

 */
/**
 * I use a HashSet to store elements of the first array for O(1) lookup.
Then I iterate through the second array and check if the element exists in the set.
If it does, I add it to a result set to ensure uniqueness.
Finally, I convert the result set into an array.
 */

public class IntersectionTwoArrays {

    public static List<Integer> intersect(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        int i = 0, j = 0;
		//👉 List is used because result size is unknown and dynamic
		/**
		 * ✔ Dynamic size
✔ Automatically grows
✔ No need to calculate size
		 */
        List<Integer> result = new ArrayList<>();

        while (i < a.length && j < b.length) {

            if (a[i] == b[j]) {      // Element is common
                result.add(a[i]);
                i++;
                j++;
            }
            else if (a[i] < b[j]) {  // Move pointer i (smaller value)
                i++;
            }
            else {                   // Move pointer j
                j++;
            }
        }

        return result;
    }


    public static void main(String[] args) {
        int[] a = {4, 9, 5};
        int[] b = {9, 4, 9, 8, 4};

        List<Integer> ans = intersect(a, b);
        System.out.println(ans);
    }
}



//Next greater element in an array
/**
 * Input:  [4, 5, 2, 25]
Output: [5, 25, 25, -1]

Explanation:

Next greater of 4 → 5

Next greater of 5 → 25

Next greater of 2 → 25

Next greater of 25 → -1
 */
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25};
        nextGreaterElement(arr);
    }

    public static void nextGreaterElement(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {

            // While current element is greater than stack top
			// this while loop runs until the stack is empty
            while (!stack.isEmpty() && arr[i] > stack.peek()) {
				//stack.pop() will remove last element(last pushed) and return an element
                System.out.println(stack.pop() + " --> " + arr[i]);
            }

            // Push current element
            stack.push(arr[i]);
        }

        // Remaining elements have no greater element
        while (!stack.isEmpty()) {
            System.out.println(stack.pop() + " --> -1");
        }
    }
}






//Subarray sum equals to k
/**
 * [1]       → sum = 1
[1, 2]    → sum = 3 ✅
[1, 2, 3] → sum = 6
[2]       → sum = 2
[2, 3]    → sum = 5
[3]       → sum = 3 ✅
 */
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(subarraySum(nums, k)); // Output: 2
    }

    public static int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
		//0	is Prefix sum before starting the array and 1 means It has occurred once / 0 = 1 means: -> “Prefix sum 0 has occurred once (before array starts)
        map.put(0, 1);   // To handle subarrays starting from index 0

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }

            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}



//Subarray sum equals to k(brute force)
class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(bruteSubarraySum(nums, k));
    }

    public static int bruteSubarraySum(int[] nums, int k) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }
}





//Longest common prefix
/**
 * String s = "flower";
System.out.println(s.substring(0, 4));
flow will be printed
start → inclusive
end   → exclusive
 */

class Main {
    public static void main(String[] args) {
        String a[]={"flower", "flow", "ad"};
        jav(a);
    }
    public static void jav(String a[]){
        String prefix=a[0];
        for(int i=1;i<a.length;i++){
            while(a[i].indexOf(prefix)!=0){
                prefix=prefix.substring(0, prefix.length()-1);
            }
        }
		//a[i].indexOf("")==0 , if the prefix is empty it will be equal to 0
        if(prefix.isEmpty()){
            return;
        }
        System.out.print(prefix);
    }
}



//To check whether array contains duplicate
import java.util.*;

class Main {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        containsDuplicate(nums);
    }

    public static void containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();
        boolean hasDuplicate = false;

        for (int num : nums) {
            if (set.contains(num)) {
                hasDuplicate = true;
                break;   // no need to continue
            }
            set.add(num);
        }

        System.out.println(hasDuplicate);
    }
}

//To print the first duplicate in the array
//NOTE:- code can be altered to print all duplicates, first unique, all unique, etc.
class Main {
    public static void main(String[] args) {
        int []a={6,4,4,5,2,8,2};
        jav(a);
    }
    public static void jav(int[] c){
        LinkedHashMap<Integer, Integer> x=new LinkedHashMap<>();
        for(int i=0;i<c.length;i++){
            if(!x.containsKey(c[i])){
                x.put(c[i], 1);
            }else{
                x.put(c[i], x.get(c[i])+1);
            }
        }
        for(Entry<Integer, Integer> k:x.entrySet()){
            if(k.getValue()>1){
                System.out.println(k.getKey());
                return;
            }
        }
    }
}




//maximum product subarray
/**
 * [2]           → 2
[2, 3]        → 6   ✅
[2, 3, -2]    → -12
[2, 3, -2, 4] → -48

[3]           → 3
[3, -2]       → -6
[3, -2, 4]    → -24

[-2]          → -2
[-2, 4]       → -8

[4]           → 4

 */
public class MaxProductSubarray {

    public static int maxProduct(int[] nums) {

        int maxProd = nums[0];
        int minProd = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {

            // If current number is negative, swap max and min
            if (nums[i] < 0) {
                int temp = maxProd;
                maxProd = minProd;
				/**
				 * why we take min?
				 * Negative × Negative = Positive
				 * So a very small (negative) product can suddenly turn into a very large positive product later.
				 * the reason why we are swapping is, when you multiply negative with min value it will be a max value, but if you multiply negative with max value it will give the minimum value
				 */
                minProd = temp;
            }

            // Update max and min product ending at current index
            maxProd = Math.max(nums[i], maxProd * nums[i]);
            minProd = Math.min(nums[i], minProd * nums[i]);

            // Track the global maximum
            result = Math.max(result, maxProd);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(maxProduct(arr)); // Output: 6
    }
}


//max product subarray(brute force)
class Main {
    public static void main(String[] args) {
        int[] arr = {2, 3, -2, 4};
        System.out.println(bruteMaxProduct(arr));
    }

    public static int bruteMaxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;

            for (int j = i; j < nums.length; j++) {
                product *= nums[j];
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }
}


//To find all duplicates
class Main {
    public static void main(String[] args) {
        int []arr = {4,5,3,2,3,3,5,8};
        jav(arr);
    }
    public static void jav(int a[]){
        HashMap<Integer, Integer> x=new HashMap<>();
        for(int num: a){
            x.put(num, x.getOrDefault(num, 0)+1);
        }
        for(Entry<Integer, Integer> tt: x.entrySet()){
            if(tt.getValue()>1){
                System.out.print(tt.getKey());
            }
        }
    }
}


//To find all duplicates in an array(optimized)
//TC-O(n) SC-O(1)
//nums = [4,3,2,7,8,2,3,1]
//This approach relies on index mapping so that you get SC-O(1) without much memory utilized
//if the input is in not in the range [1,n] then you must use hashset or hashset
//in this approach you will make the digits negative and if the same index is seen with the number negative then it is a duplicate so add to the list

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int num = Math.abs(nums[i]);  // get original value
			//if i dont do this i will get array out of bounds index
            int index = num - 1;

            if (nums[index] < 0) {
                result.add(num);  // duplicate found
            } else {
                nums[index] = -nums[index];  // mark visited
            }
        }

        return result;
    }
}




//longest consecutive sequence
import java.util.HashSet;

public class LongestConsecutiveSeq {

    public static int longestConsecutive(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        // Insert all numbers into a HashSet
        for (int n : nums) {
            set.add(n);
        }

        int longest = 0;

        // Check each number
        for (int num : set) {

            // Start counting only if num-1 does NOT exist
			// still works without the if condition below
            if (!set.contains(num - 1))  {   //<- this condtition is required because we should start counting a sequence ONLY from the beginning of that sequence, not from the middle.

                int currentNum = num;
                int length = 1;

                // Count continuous sequence
				//while loop terminates when the condition is false
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    length++;
                }

                longest = Math.max(longest, length);
            }
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println(longestConsecutive(nums));  // Output: 4
    }
}




//To find the frequency
class Main {
    public static void main(String[] args) {
        int[]b={1,2,2,3,1,4,2,3,3};
        jav(b);
    }
    public static void jav(int b[]){
        HashMap<Integer, Integer> x=new HashMap<>();
        for(int ram: b){
            x.put(ram, x.getOrDefault(ram, 0)+1);
        }
        for(Entry<Integer, Integer> hell: x.entrySet()){
            System.out.println(hell.getKey()+" "+hell.getValue());
        }
    }
}



//To find the Majority elements in the array
/**
 * how it works?
 * [2,2,1,1,1,2,2]

Pair cancel:
(2,1), (2,1), (1,2) → all cancel out

Remaining → 2
 */
class Main {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] arr) {
        int candidate = 0, count = 0;

        for (int num : arr) {
            if (count == 0) {
                candidate = num;
            }

            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}





//Sliding window 
/**
 * 1st 2+1+5 =8
 * 2nd 1+5+1 =7
 * 3rd 5+1+3 =9
 * 4th 1+3+2 =6
 * so 3rd is the highest so the output is 9
 */
public class MaxSumKWindow {

    public static int maxSum(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        // Step 1: Form first window of size k
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }


        maxSum = windowSum;

        // Step 2: Slide the window
		//k never changes
        for (int i = k; i < arr.length; i++) { 
            windowSum += arr[i] - arr[i - k];  // Add next element, remove previous window's first element
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3; //elements

        System.out.println(maxSum(arr, k)); // Output: 9 (5+1+3)
    }
}


//Two sum problem(optimized))
//adding two numbers to get the target value

public class TwoSumOptimized {

    // Method with parameters, no return type
    public static void twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
				//map.get(compliment) -> this will return the index of the complement
                System.out.println("Indexes found: " + map.get(complement) + ", " + i);
                System.out.println("Numbers: " + complement + ", " + nums[i]);
                return; // stop after finding the pair
            }
			/**
			 * Why do we store i (the index)?
			 * Because later, when we find the matching number (comp), we must know at which index the earlier number appeared.
			 */
            map.put(nums[i], i);
        }

        System.out.println("No pair found for target " + target);
    }

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        // Calling the method (passing parameters)
        twoSum(nums, target);
    }
}

//Two sum using brute force(time complexity: O(n^2))

class Main {
    public static void main(String[] args) {
        int a[]={5,2,3,4,6,3};
        int target=10;
        jav(a, target);
    }
    public static void jav(int b[], int tar){
        for(int i=0;i<b.length;i++){
            for(int j=i+1;j<b.length;j++){
                if(b[i]+b[j]==tar){
                    System.out.print("target found at index"+ i+j+ " which are "+ b[i] + " and"+ b[j]);
                    return;
                }
            }
        }
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
//this is for verification



	
	

}

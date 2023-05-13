package day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Numericals {

	public static void main(String[] args) {
		// factorial(8);
		// reverseString("Mourya");
		// palendromeString("Lool");
//		String str = "racecar";
//		if (ispalendrome(str)) {
//			System.out.println(str + "  is palindrome");
//		} else {
//			System.out.println(str + "  is palindrome");
//		}
		
//		  int[]  arr= {3,1,7,4,2,9,8};
//	       LargestAdSmallest(arr);
//		fibonoSeries(10);
//		primeNumber(20);
//		int number =133;
//		if(armStrong(number)) {
//			System.out.println(number + " is a armStrng number");
//		} else {
//			System.out.println(number +" is not a armStrong number");
//		}  
//		randomNumber(100,6);
		
	}

	public static void factorial(int num) {
		// 3*2*1
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i; // 6
		}
		System.out.println(fact);
	}

	public static void reverseString(String word) {

		char[] ch = word.toCharArray();

		for (int i = ch.length - 1; i >= 0; i--) {
			System.out.println(ch[i]);

		}
	}

	public static void palendromeString(String str) {

		String reverse = "";
		String temp = str;

		for (int i = temp.length() - 1; i >= 0; i--) {
			reverse = reverse + temp.charAt(i);
		}
		System.out.println(reverse);
		if (reverse.equalsIgnoreCase(str)) {
			System.out.println(str + "  is a palindrome");
		} else {
			System.out.println(str + " is not a palindrome");
		}

	}

	public static boolean ispalendrome(String str) {

		int left = 0;
		int right = str.length() - 1;
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;

			} else {
				left++;
				right--;
			}

		}
		return true;

	}
	
	public static void LargestAdSmallest(int[] array) {
		int largest =array[0];
		int smallest =array[0];
		
		for(int i=0;i<array.length;i++) {
			if(array[i]<smallest) {
			smallest=array[i];
			
			}else 
				if(array[i]>largest) {
				largest =array[i];
			}
			
		}

System.out.println(largest);
System.out.println(smallest);
	}
	
	public static void fibonoSeries(int number) {

		int frstNum = 0;
		int secndNum = 1;
		int nextNum;
		System.out.println("The Fibonocies series are ");
		for (int i = 0; i <= number; i++)
		{

		if(i<=1) {
			nextNum=i;
		}else {
			nextNum = frstNum + secndNum;
			frstNum = secndNum;
			secndNum = nextNum;
		}
		System.out.println(nextNum);
		}
		
	}
	
	public static void primeNumber(int number) {
		System.out.println("The Prime numbers from 1 to 20 are :");
		int count =0;
		for(int i=1;i<=number;i++) {
			if(i%2==0) {
				System.out.println(i);
				count++;
			}
				
		}
		
		System.out.println("count of the primes from given number is : "+count);
		
	}
	
	public static  boolean armStrong(int number) {
		  int originalNumber =number;
		  int sum=0;
		  int length=String.valueOf(number).length();
		  
		  while(number>0) {
			  int digit =number%10;
			  sum+=Math.pow(digit, length);
			  number/=10;
		  }
		 return sum==originalNumber; 
	}
	
	public static void randomNumber(int num,int count) {
		
		Random random= new Random();
		List<Integer> randomNumber =new ArrayList<>();
	for(int i=0;i<count;i++) {
		int numbr=	random.nextInt(num);
		randomNumber.add(numbr);
	}
	System.out.println(randomNumber);	
	}
	
	
}



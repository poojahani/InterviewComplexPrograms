package day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayPrograms {

	public static void main(String[] args) {
    	int[] a= {3,4,0,3,2,8,9,7};
    	copyArray(a);
    	leftRotate(a);
    //	duplicates(a);
	//	elements(a);
    //	arrayCount(a);
    //	sumOfArray(a);
    	rightRotate(a);
    //	assending(a);
    //	descending(a);
    //	thirdLargest(a);
     //   secSmallese(a);
    //	evenOdd(a);
    //	frequency(a);
	}
	
	public static void copyArray(int[]source) {
	// int[] targetArray =new int[source.length];
		int[] targetArray =Arrays.copyOf(source, source.length);//copy of method it will create a new array 
		 
		 
		 for(int i=0;i<source.length;i++) {
			 targetArray[i] =source[i];
		 }
		 System.out.println(Arrays.toString(targetArray));
		
	}
	
	public static void leftRotate(int[] a) {
		int temp=a[0];
	    int n=a.length;
		for(int i=1;i<a.length;i++) {
			a[i-1]=a[i];
		}
		a[n-1]=temp;
	System.out.println(Arrays.toString(a));	
	}
	
	public static void duplicates(int[] a) {

//		System.out.println("duplicates: ");
//		for (int i = 0; i < a.length; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] == a[j]) {
//					System.out.println(a[j]);
//
//				}
//
//			}
//
//		}
		//using hashset
		Set<Integer> number =new HashSet<>();
		Set<Integer> duplicates =new HashSet<>();
		System.out.println("Dupliacates are:");
		for(int i=0;i<=a.length-1;i++) {
			if(!number.add(a[i])) {
				duplicates.add(a[i]);
			}
		}
		System.out.println(number);
		System.out.println(duplicates);
		
	}
	
	public static void elements (int[]a) {
		
//		for(int i=0;i<a.length;i++) {
//			System.out.println(a[i]);
//		}
		//print in reverse order
//		for(int j=a.length-1;j>=0;j--) {
//			System.out.println(a[j]);
//		}
		//print only even position
//		for(int i=0;i<=a.length-1;i+=2) {
//		System.out.println(a[i]);
		//print only odd position
		for(int i=1;i<=a.length-1;i+=2) {
			System.out.println(a[i]);
	}
	}
	
	public static void arrayCount(int[] a) {
		int count=0;
//		for(int i=0;i<=a.length-1;i++) {
//			count++;
//		}
//		System.out.println(count);
		//using length property we can count the elemnts
		System.out.println(a.length);
	}
	
	public static void sumOfArray(int[] a) {
		
		int sum=0;
		System.out.println("The sum of elements in the array is : ");
		for(int i=0;i<=a.length-1;i++) {
			sum+=a[i];
		}
		System.out.println(sum);
	}
	
	public static void rightRotate(int[] a) {
		
		int n=a.length;
		int temp=a[n-1];
		
		for(int i=n-1;i>0;i--) {
			a[i]=a[i-1];
		}
		a[0]=temp;
		System.out.println(Arrays.toString(a));
	}

	public static void assending(int[] a) {
		int temp;
		System.out.println("Sorting in asscending order:");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			System.out.println(a[i]);
		}
	}
	
	public static void descending(int[] a) {
		int temp=0;
		System.out.println("Sorting in descending order: ");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
			System.out.println(a[i]);
		}
		
	}
	
	public static void thirdLargest(int[] arr) {
		Set<Integer> al = new HashSet<>();
		
		for(int i=0;i<=arr.length-1;i++) {
			al.add(arr[i]); 
		}
		System.out.println(al);
		Integer[] a = al.toArray(new Integer[0]);
		int max = a[0];
		int secMax = a[0];
		int thrdMax = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				thrdMax = secMax;
				secMax = max;
				max = a[i];
			}

			else if (a[i] > secMax && a[i] <= max) {
				thrdMax = secMax;
				secMax = a[i];
			} else if (a[i] > thrdMax && a[i] <= secMax) {
				thrdMax = a[i];
			}
		}
		System.out.println(thrdMax);
	}
	
    public static void secSmallese(int[] array) {
		int smalst = array[0];
		int secSmat = array[0];
		System.out.println("second Largest is : ");
		for (int i = 0; i < array.length; i++) {

			if (array[i] < smalst) {
				secSmat = smalst;
				smalst = array[i];
			} else if (array[i] < secSmat) {
				secSmat = array[i];
			}
			
		}
		System.out.println(secSmat);
    }
    
    public static void evenOdd(int[] a) {
    	List <Integer> list =new ArrayList<>();
    	List <Integer> size =new ArrayList<>();
    	
    	System.out.println("even numbers are : ");
    	for(int i=0;i<a.length;i++) {
    		if(a[i]%2==0) {
    			list.add(a[i]);
    		}else {
    			size.add(a[i]);
    		}
    	}
    	System.out.println("even numbers are : "+list);
    	System.out.println("odd numbers are : "+size);
    }
    
    public static void frequency(int[] array) {
    	
    Map<Integer,Integer>  frequency =new HashMap<>();
    
    for(int i=0;i<array.length;i++) {
    	if(frequency.containsKey(array[i])) {
    		frequency.put(array[i], frequency.get(array[i])+1);
    		}else {
    			frequency.put(array[i], 1);
    	}
    	
    }
    for(Integer number:frequency.keySet()) {
 		System.out.println(number+":"+frequency.get(number));
 	}
 		
    }
}

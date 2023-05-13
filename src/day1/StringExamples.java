package day1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StringExamples {
	
	

	public static void main(String[] args) {

	//	characterCount("brown fox ");
	//	removeDigit("java1Program21");
	//	punctuationCounr("Hell!bangloe?Namste.");
	//	vowelConsonents("poOja");
		//rotation of 2 strings
//		if(rotation("abcd", "cdab")) {
//			System.out.println("Rotation is valid");
//		}else {
//			System.out.println("Rotation is not valid");
//		}
		//anagram
//		String str1 ="Dog";
//		String str2 ="God";
//		if(areAnagram(str1,str2))
//		{
//			System.out.println(str1+" and "+str2+" are Anagrams");
//		}
//		else {
//			System.out.println(str1+" and "+str2+" are  not Anagrams");
//		}
//		removeWhiteSpace("quick lazy fox jumped over the dog");
//	replaceLowerCase("HeLLO honey Bunny");
//		duplicatesCharacter("PoojaMallesh");
//		singleCharacter("Pooja");
	    swapStrings("Pooja ", "Jhansi");
		
	}
  public static String characterCount(String str) {
	  int count = 0 ;
	  char[] ch =str.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		  System.out.println(ch[i]);
	  }  count++;
	  
	  System.out.println("Count of a String: "+count);
	return str;
  }
  
  public static void  removeDigit(String str) {
//	System.out.println(str.replaceAll("[^"
//			+ "a-zA-Z]", " ")); 
	  String res = " ";
	  for(int i=0;i<str.length();i++) {
		  if(!Character.isDigit(str.charAt(i))) {
			  res+=str.charAt(i);
		  }
	  }
	  System.out.println(res);
	 }

  public static void punctuationCounr(String str) {
			int count = 0;
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if ((ch == '?') || (ch == '!') || (ch == '%') || (ch == '.')) {
					count++;
				}

			}
			System.out.println(count);
		}
  
  public static void vowelConsonents(String str1) {
	    String  str =str1.toLowerCase();
	  String vowel="";
	  String consonents="";
	  int vcnt=0;
	  int ccnt=0;
	  for(int i=0;i<str.length();i++) {
		  char ch =str.charAt(i);
		  if((ch=='a')||(ch=='e')||(ch=='i')||(ch=='u')||(ch=='o')) {
			  vcnt++;
			  vowel+=ch;
		  }else {
			  ccnt++;
			  consonents+=ch;
		  }
	  }
	  System.out.println("The vowels are :"+vowel+" --and the count is : "+vcnt);
	  System.out.println("The Consonents:"+consonents+ "-- and the count is :"+ccnt);
	  }
  
  public static boolean rotation(String a,String b) {
	  return (a.length()==b.length()&&(a+a).contains(b));
  }
  
  public static boolean areAnagram(String str1,String str2) {
	  
	  str1 =str1.replaceAll("[^a-zA-Z]","").toLowerCase();
	  str2 =str2.replaceAll("[^a-zA-Z]","").toLowerCase();
	  
	  if(str1.length()!=str2.length()) {
		  return false;
	  } 
	  char[] charArray1 =str1.toCharArray();
	  char[] charArray2 =str2.toCharArray();
	  
	  Arrays.sort(charArray1);
	  Arrays.sort(charArray2);
	  //compare the 2 char Arrays
	  return Arrays.equals(charArray1, charArray2);
  }
  
  public static void removeWhiteSpace(String str) {
		// in-built method
		// String r =str.replaceAll("\\s","");
		StringBuilder output = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (!Character.isWhitespace(ch)) {
				output.append(ch);
			}
		}
		System.out.println(output.toString());

	}
  
  public static void replaceLowerCase(String str) {
	 // System.out.println(str);
	 // System.out.println(str.toLowerCase());
	  char[] ch =str.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		  if(ch[i]>='a' && ch[i]<='z') {
			  ch[i]=(char) (ch[i]+('A'-'a'));
		  }
	  }
	 System.out.println(ch);
  }

  public static void duplicatesCharacter(String str) {
	  
	Map<Character, Integer> charCountMap = new HashMap<>();

	for (char c : str.toCharArray()) {

		if (charCountMap.containsKey(c)) {
			charCountMap.put(c, charCountMap.get(c) + 1);
		} else {
			charCountMap.put(c, 1);
		}
	}

	System.out.println("Duplicate chracteristics in given " + str + " :");
	// by sing entery set only perticular can be get it
	for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
		if (entry.getValue() > 1) {
			System.out.println(entry.getKey() + "-" + entry.getValue() + " times");
		}

	}
}
  
  public static void singleCharacter(String str) {
	  //using charAt method
	  for(int i=0;i<str.length();i++) {
		  char ch =str.charAt(i);
		  System.out.println(ch);
	  }
	  //using charArray
	  char[] ch=str.toCharArray();
	  for(int i=0;i<ch.length;i++) {
		  System.out.println(ch[i]);
	  }
	  //using split method
	  String[] parts =str.split("");
	  for(String s :parts) {
		  System.out.println(s);
	  } 
  }
  
  public static void swapStrings(String str1,String str2) {

	  
	  str1 =str1+str2;
	  str2=str1.substring(0, str1.length()-str2.length());
	  str1=str1.substring(str2.length());
	 // for integers
//	  str1=str1^str2;
//	  str2=str1^str2;
//	  str1=str1^str2;
//			  
	  
	  System.out.println("String 1 is: "+str1);
	  System.out.println("String 2 is: "+ str2);
	  
	  
  }
}

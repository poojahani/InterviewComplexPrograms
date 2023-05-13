package day1;

public class Test {

	public static void main(String[] args) {
   
		String str1="pooja";
		String str2="hani";
		//concatinate it 
		str1=str1+str2;
		str2=str1.substring(0,str1.length()-str2.length());
		str1=str1.substring(str2.length());
		System.out.println("str1:"+str1);
		System.out.println("str2:"+str2);
		
		int a=10;
		int b=20;
		
		 a=a+b; //30
		 b=a-b;//10
		 a=a-b; // 20
		 
		 System.out.println("value of a "+ a+  "value of b:"+b );
		
		
	

		
		
		
		
		
		
		
		

	}

}

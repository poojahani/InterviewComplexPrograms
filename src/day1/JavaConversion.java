package day1;

import java.security.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaConversion {

	public static void main(String[] args) throws ParseException {

//		StringToInt("123");
//		IntegerToString(123);
//		StringToDate();
//		DateToString();
//		charToString('a');
//
		StringToObject("123");

	}

	public static void StringToInt(String str) {
		// int outPut =Integer.parseInt(str);
		int outPut = Integer.valueOf(str);// value Of method convert String to an Integer
		System.out.println("conversion from String to Integer :" + outPut);
	}

	public static void IntegerToString(int num) {
		// String str =Integer.toString(num);
		String str = String.valueOf(num);

		System.out.println("conversion from Integer to String  :" + str);
	}

	public static void charToString(char ch) {
		// String str = String.valueOf(ch);
		String str = Character.toString(ch);

		System.out.println("conversion from Integer to String  :" + str);
	}

	public static void StringToDate() throws ParseException {
		String strDate = "2023-04-27";
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd");
		try {

			Date date = formater.parse(strDate);
			System.out.println("COnversion from String to Date: " + date);
		} catch (ParseException e) {
			System.out.println("Error parsing date:" + e.getMessage());
		}
	}

	public static void DateToString() {
		Date date = new Date();
		SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
		String strDate = formater.format(date);
		System.out.println("today date is " + strDate);

	}

	public static void StringToObject(String str) {
		Integer obj = Integer.valueOf(str);
		System.out.println(obj);
	}
}

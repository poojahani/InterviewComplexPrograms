package day2;

import java.util.Stack;

import day1.Numericals;
import day1.StringExamples;

public class SyntaxChecker {

	public static void main(String[] args) {

  String program ="{int a=((2+3))*4;}";
//  ThrirdSet obj =new ThrirdSet();
// String program= obj.characterCount("madam");
  
  if(syntaxChecker(program)) {
	  System.out.println("braces are balanced");
  }else {
	  System.out.println("braces are not balanced");
  }
	}
	
	public static boolean syntaxChecker(String program) {
		
		Stack<Character> stack = new Stack<Character>();
		for(int i=0;i<program.length();i++) {
			
			char c =program.charAt(i);
			
			if((c=='(')  || (c=='[')  || (c=='{'))
			{
				stack.push(c);
			}
			
			else if((c==')') || (c==']')  || (c=='}')){
				if(stack.isEmpty()) {
					return false;
				}
				char top =stack.pop();
				if((c==')') && (top!='(') || (c=='[') && (top!=']')  && (c=='{') &&(top!='}') ) {
					return false;
				}
			}
		}
	return	stack.empty();
	}

}

package accenture;
import java.util.*;

// SAMPLE INPUT : 
// SaveCodeInCompiler

// SAMPLE OUTPUT : 
// sAVE
// cODE
// iN
// cOMPILER

public class CamelCaseClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String str = "SaveCodeInCompiler";
		
		String[] strArr = str.split("(?=\\p{Lu})");
		
		for(String ss : strArr) {
			System.out.println(Character.toLowerCase(ss.charAt(0)) + ss.substring(1).toUpperCase());
		}		
	}
}

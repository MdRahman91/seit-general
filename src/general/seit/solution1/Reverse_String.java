package general.seit.solution1;

import java.util.Scanner;

public class Reverse_String {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Please a String to Reverse: ");
		String Str = scan.nextLine().toLowerCase();
		
		 reverseEverything(Str);	

		 scan.close();
	}
	
	
	public static void reverseEverything(String s){
		
		char[] charArr = s.toCharArray();
		System.out.print("Reverse String is: ");
        for (int i = charArr.length-1; i>=0; i--)
            System.out.print(charArr[i]);
	}

}

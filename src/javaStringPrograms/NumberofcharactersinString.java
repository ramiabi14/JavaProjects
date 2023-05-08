package javaStringPrograms;

import java.util.Scanner;

public class NumberofcharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=scan.nextLine();
		char[] count1 = s1.toCharArray();
	int count2=count1.length;
	System.out.println("number of characters in the string :"+ count2);
		
	
		

	}

}

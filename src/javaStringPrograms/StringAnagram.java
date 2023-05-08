package javaStringPrograms;

import java.io.*;
import java.util.*;
public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the first string to be checked");
		String s1=scan.nextLine();
		System.out.println("Enter the second string to be checked");
		String s2=scan.nextLine();
		s1.toLowerCase();
		s2.toLowerCase();
		char[] c1=s1.toCharArray();
		char[] c2=s2.toCharArray();
		if(c1.length!=c2.length) {
			System.out.println("Given strings are not anagram-length doesnt match");

		}
		else
		{
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
			{
				System.out.println("Given strings are anagram - contains same characters irrespective of position/order");
			}
			else
				System.out.println("Given strings are not anagram");


		}
	}

}

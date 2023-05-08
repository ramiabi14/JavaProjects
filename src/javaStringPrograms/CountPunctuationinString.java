package javaStringPrograms;

public class CountPunctuationinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=" \"ABirami.Pari,Kaviin?\"  ";
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='.'|| s1.charAt(i)==',' || s1.charAt(i)==';' || s1.charAt(i)=='"' || s1.charAt(i)=='?')
			{
				count++;
			}
		}
		System.out.println("Punctuation marks present in string is :"+count);
	}

}



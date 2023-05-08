package javaStringPrograms;
import java.util.*;

public class DividestringNEQUALPARTS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=scan.nextLine();
		int n=s1.length();
		int parts=3,temp=0; //split to 3 parts
		int quo=n/parts;
		String[] newarray=new String[parts];
		if(n%parts!=0)
		{
			System.out.println("String cannot be divided equally");
		}

		else
		{
			for (int i=0;i<n;i=i+quo)
			{
				
				String newword=s1.substring(i, i+quo);
				newarray[temp]=newword;
				temp++;
				
			}
			

			for(int j=0;j<newarray.length;j++)
			{
				System.out.println(newarray[j] );
			}
		}
	}

}

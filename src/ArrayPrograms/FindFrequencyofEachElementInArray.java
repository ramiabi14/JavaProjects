package ArrayPrograms;

import java.util.Scanner;

public class FindFrequencyofEachElementInArray 
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int a[]=new int[] {1,2,4,4,5,5,2,3};

		int fr[]=new int[a.length];
		int visited=-1;
//		Scanner scan=new Scanner(System.in);
//		for(int i=0;i<=a.length-1;i++)
//		{
//			System.out.println("Enter the array numbers");
//			a[i]=scan.nextInt();
//		}



		for(int i=0;i<a.length;i++)
		{

			int count=1;

			for(int j=i+1;j<=a.length-1;j++) 
			{
				if(a[i]==a[j])
				{
					fr[j]=visited;
					count++;

				}

			}
			if(fr[i]!=visited)
				fr[i]=count;

		}
		
		for (int i=0;i<fr.length;i++)
		{
			
if(fr[i]!=visited)
{
	System.out.println("Element  "+a[i]+"presented"+fr[i] );
}

	}






}

}

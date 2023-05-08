
package ArrayPrograms;

import java.util.Arrays;

public class PrintDuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]=new int[] {1,2,3,4 ,55,66,66,55};
		int forref[]=new int[arr.length];
		int visited=-1;
		
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++)
//		{
//		System.out.print(arr[i]+" ");
//		}
		
		for (int i=0;i<arr.length;i++)
		{
			int count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					forref[j]=visited;
					
					
				}
			}
			
			if(forref[i]!=visited)
			{
				forref[i]=count;
		}
		}
		System.out.print("Duplicate elements are ");
		for(int i=0;i<forref.length;i++)
		{
			
			if(forref[i]>1)
			{
				System.out.print(arr[i]+" ");
			}
		}

	}

}

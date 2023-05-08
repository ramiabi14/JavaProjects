package ArrayPrograms;

public class CopyElementsFromOneArrayToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a=new int[]{1,2,3,4,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i] +" ");
		}
		

	}

}

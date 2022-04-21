package week1.day2;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		int arrone[]= {1,2,8,4,7,9};
		for ( int i=0; i<arr.length;i++)
		{
			for ( int j=0; j<arrone.length;j++)
			{
				if(arr[i]==arrone[j])
				{
					System.out.println(arr[i]);
				}
			}
		}
	}
		

}

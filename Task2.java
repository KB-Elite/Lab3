import java.util.*;

public class Task2{
	public static void main(String[] args){
		int [][] arr;
		arr = new int[ 5 ][]; 
		arr[ 0 ] = new int[ 3 ]; 
		arr[ 1 ] = new int[ 7 ];
                arr[ 2 ] = new int[ 10 ];
                arr[ 3 ] = new int[ 17 ];
                arr[ 4 ] = new int[ 27 ];
		Random r= new Random();
		for (int i = 0; i<arr.length;i++)
			for (int j = 0; j<arr[i].length; j++)
				arr[i][j]=r.nextInt( (9 -(-5))+1)+(-5);
		System.out.println("Init array:");
		for (int[] parr : arr)
			System.out.println(Arrays.toString(parr));
		
		for (int i = 0; i<arr.length;i++)
			Arrays.sort(arr[i]);
		
		System.out.println("Sorting array:");
                for (int[] parr : arr)
                        System.out.println(Arrays.toString(parr));

		System.out.println("Only <0 array:");
                for (int i=0; i<arr.length; i++)
		{
			for (int el:arr[i])
			{	if (el>=0) break;
				System.out.print(el+" ");
			}
			System.out.println();
		}


	}


}

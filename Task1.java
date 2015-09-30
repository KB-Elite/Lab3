import java.util.*;

public class Task1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter length of array");
		int n = scan.nextInt();
		System.out.println("Enter elements of array");

		int[] arr = new int[n];
		for (int i = 0; i<n; i++)
			arr[i]=scan.nextInt();

		sort(arr,n);

		System.out.println(Arrays.toString(arr));


	}
	public static void sort(int[] mas, int len){

		boolean flag=false;
		int iter=len;
		do{
			iter--;
			for (int i=0;i<iter;i++){
				if (mas[i]>mas[i+1]){
					int tmp = mas[i];
					mas[i]=mas[i+1];
					mas[i+1]=tmp;
				}
			}
		}
		while (flag || iter>0); 
		System.out.println(Arrays.toString(mas));
		
	}


}

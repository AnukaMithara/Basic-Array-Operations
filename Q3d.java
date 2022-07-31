import java.util.*;

public class Q3d{    

	public static int selectionSort(int[] arr)
	{
		for (int i = 0; i < arr.length-1; i++)
		{
			int min = i;
			for (int j = i+1; j < arr.length; j++)
			{
				if (arr[j] < arr[min])
				{
				min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	dispArray(arr);
	return 0;
	}
	
	public static void dispArray(int[] arr)
	{    	
    System.out.print("\nAfter sorted : ");
    for (int i = 0; i < arr.length; i++) 
	{
      System.out.print( arr[i] + " ");	
    }
	}
              
    public static void main(String a[])
	{   
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the length of the array :\t");
		int leng = sc.nextInt();
        int[] arr= new int[leng];
		
		for(int n = 0;n<leng;n++)
		{
        System.out.print("Enter element " + (n+1) +" :\t");									
        arr[n] = sc.nextInt();		
		}		
		
		selectionSort(arr);		
        
    }    
}    

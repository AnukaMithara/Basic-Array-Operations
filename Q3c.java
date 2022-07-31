import java.util.*;

public class Q3c{    

	public static int insertionSort(int[] arr)
	{
    for (int i = 1; i < arr.length; i++) 
	{
        int temp = arr[i];
        int n = i-1;
        while ((n >= 0) && (arr[n] > temp)) 
		{
            arr[n+1] = arr[n];
            n--;
        }
        arr[n+1] = temp;
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
		
		insertionSort(arr);		
        
    }    
}    

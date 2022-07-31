import java.util.*;

public class Q3b{    

	public static int bubbleSort(int[] arr)
	{    	
    int a = 0;
    for (int i = 0; i < arr.length; i++) 
	{
      for (int j = 1; j < (arr.length - i); j++) 
	  {
        if (arr[j - 1] > arr[j]) 
		{
          a = arr[j - 1];
          arr[j - 1] = arr[j];
          arr[j] = a;
        }
      }
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
		
		bubbleSort(arr);		
        
    }    
}    

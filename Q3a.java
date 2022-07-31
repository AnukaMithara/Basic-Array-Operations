import java.util.*;

public class Q3a{    

public static int linearSearch(int[] arr, int key)
{    
        for(int i=0;i<arr.length;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
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
		System.out.print("\nEnter the element you want to check :\t");
        int check = sc.nextInt();  
		
		int result = linearSearch(arr, check);
		
		if(result <0)
		{
        System.out.println("\nCannot found index ");    
		}
		else
		{
			System.out.println("\n" + check +" can found at index: "+result); 
		}	
    }    
}    

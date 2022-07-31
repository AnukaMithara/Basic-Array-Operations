import java.util.*;

public class Q1 {
    public static void main(String[] args) 
	{
		int[] arr = new int[20];															//(a)
		
        Scanner sc = new Scanner(System.in);
		
		
		for(int n = 0;n<20;n++)
		{
        System.out.print("Enter " + (n+1) + " Number :\t");									//(b)
        arr[n] = sc.nextInt();		
		}
		System.out.print("\nEnter the first element that you want to interchange : ");		//(c)
		int i = sc.nextInt();
		
		System.out.print("Enter the second element that you want to interchange : ");
		int j = sc.nextInt();
        
		int temp = arr[j-1];
		arr[j-1] = arr[i-1];
		arr[i-1] = temp;
		
		System.out.print("\nEnter the element that you want to print : ");					//(d)
		int k = sc.nextInt();
		System.out.println("The element " + k +" value is " + arr[k-1]);
		
		
		
		int[] copy = new int[arr.length - 1];												//(e)

		for (int l = 0, m = 0; l < arr.length; l++) 
		{
		if (l != k-1) 
		{
        copy[m] = arr[l];
		m++;
		}
		}	
		

		
		System.out.print("\nEnter the element that you want to insert as last : ");			//(f)
		int p = sc.nextInt();
		int[] newarr = new int[copy.length+1];
		
		for (int x = 0;x < copy.length; x++) 
		{		
		newarr[x] = copy[x];
		}
		newarr[newarr.length-1] = p;
 		
		
		System.out.print("\nEnter the element that you want to check : ");					//(g)
		int input = sc.nextInt();
		int count = 0;
		for (int ii = 0;ii < newarr.length; ii++) 
		{		
		if(input == newarr[ii])
		{
			System.out.println("element index : "+ (ii+1));
			count++;
		}
		}
		
		if(count == 0)
		{
			System.out.println("element is not in the array");
		}
		
		
		System.out.println("\n\t   Last Array "); 
		for(int r = 0;r<20;r++)
		{
        System.out.println("\t" + newarr[r]); 	
		}
		
    }
}
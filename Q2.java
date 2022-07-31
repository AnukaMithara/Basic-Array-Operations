import java.util.*;

class qclass
{	
	private int[] arr;
	private int[] copy;
	private int[] newarr;
	
	
	
	
	public void getArray()
	{
		Scanner sc = new Scanner(System.in);
		
		for(int n = 0;n<arr.length; n++)
		{
        System.out.print("Enter " + (n+1) + " Number :\t");									
        arr[n] = sc.nextInt();		
		}
		
	}
		
	public void swap(int i,int j)
	{
        
		int temp = arr[j-1];
		arr[j-1] = arr[i-1];
		arr[i-1] = temp;
	}	
	
	public void printElement(int k)
	{
		System.out.println("The element " + k +" value is " + arr[k-1]);
	}	
	
	public void delElement(int kk)
	{
		copy = new int[arr.length - 1];												

		for (int l = 0, m = 0; l < arr.length; l++) 
		{
		if (l != kk-1) 
		{
        copy[m] = arr[l];
		m++;
		}
		}	
	}	
		
	public void insert(int p)
	{
		int[] newarr = new int[copy.length+1];
		
		for (int x = 0;x < copy.length; x++) 
		{		
		newarr[x] = copy[x];
		}
		newarr[newarr.length-1] = p;
	}
	
	public void check(int input )
	{
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
	}

			
}	
	
class Q2
{
    public static void main(String[] args) 
	{
		qclass arr = new qclass(20);
		Scanner sc = new Scanner(System.in);
		int i,j,k,p,input;		
		arr.getArray();
		
		System.out.print("\nEnter the first element that you want to interchange : ");		
		i = sc.nextInt();
		
		System.out.print("Enter the second element that you want to interchange : ");
		j = sc.nextInt();
		arr.swap(i,j);
		
		System.out.print("\nEnter the element that you want to print : ");					
		k = sc.nextInt();
		arr.printElement(k);
		
		arr.delElement(k);
		
		System.out.print("\nEnter the element that you want to insert as last : ");			
		p = sc.nextInt();
		
		arr.insert(p);
		
		System.out.print("\nEnter the element that you want to check : ");				
		input = sc.nextInt();
		arr.check(input);
		
		
		
	}
	
}
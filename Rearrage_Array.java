/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    void reArrange(int a[])
    {
       int n = a.length;
       for(int i=0; i<n; i++)
       {
           if(a[i]>=0)
           {
               int ind =a[i] ,val =i;
               while(ind!=i)
               {
                   int temp = a[ind];
                   a[ind] = -(val+1);
                   val = ind;
                   ind = temp;
               }
               a[ind]=-(val+1);
               
           }
       }
           for(int i =0 ; i<n;i++)
           {
               a[i]=-1*a[i]-1;
               System.out.print(a[i]+" ");
           }
    }
    
	public static void main(String[] args) {
        Main  mn = new Main();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nums[] = new int[n];
	    //List <Integer> nums = new ArrayList<>(n);
	    for(int i=0;i<n;i++)
	    nums[i]=sc.nextInt();
	    mn.reArrange(nums);
	   
	
	}
}
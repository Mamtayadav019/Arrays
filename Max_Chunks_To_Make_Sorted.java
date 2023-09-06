/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Max_Chunks_To_Make_Sorted
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        
    Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
    
     int a[] = new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     int ans =0,cmax=0;
     for(int i=0;i<n;i++)
     {
         cmax = Math.max(cmax,a[i]);
         if(cmax==i)
         ans++;
     }
     System.out.println(ans);
    }
}
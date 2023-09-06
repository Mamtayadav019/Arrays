/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Rotate_Array
{
    public static void main (String[] args) throws java.lang.Exception
    {
     Scanner sc = new Scanner(System.in);
     int n= sc.nextInt();
     int k= sc.nextInt();
     int a[] = new int[n];
     for(int i=0;i<n;i++)
     {
         a[i]=sc.nextInt();
     }
     int tmp[]=new int[n];
     for(int i=0;i<=n-1;i++)
     {
         tmp[(i+k)%n]=a[i];
         //System.out.println(tmp[i]);
     }
     for(int i=0;i<=n-1;i++)
     {
        
         System.out.print(tmp[i]+" ");
     }
    }
    
}

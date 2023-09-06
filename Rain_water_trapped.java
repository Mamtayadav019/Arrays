
/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Rain_water_trapped
{
    public static void main (String[] args) throws java.lang.Exception
    {
    Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
   int Arr[]= new int[n];
    int Smax[] = new int[n];
  int Pmax[] = new int[n];
  long ans=0;
    for(int i=0;i<n;i++)
    {
        Arr[i]=sc.nextInt();
    }
    Pmax[0]=Arr[0];
   for(int i=1;i<n;i++)
   {
      Pmax[i]=Math.max(Pmax[i-1],Arr[i]); 
    } 
   Smax[n-1]=Arr[n-1];
   for(int i=n-2;i>=0;i--)
   {
       Smax[i]=Math.max(Smax[i+1],Arr[i]);
   
   }
int decided_h= 0;
    for(int i=1;i<n-1;i++)
    {
       // if(Arr[i]<Pmax[i-1]&& Arr[i]<Smax[i+1])
        //{
      decided_h= Math.min(Smax[i] ,Pmax[i]);
      if(decided_h>Arr[i])
     {
      ans+= decided_h-Arr[i];
      }
     
   }
   	System.out.println(ans);
}
}
        
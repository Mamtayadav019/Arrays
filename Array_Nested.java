/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        for(int i =0 ;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
        int cnt=0,temp =0, ans =0 ,max =0;
       for(int i=0;i<n;i++)
       {
      
            ans=0;
            int k = nums[i];
            int idx= i;
        while(k >=0)
        {
            
        nums[idx]=-1;
        idx = k;
        k = nums[k];
        ans++;
         
        
  
        }  
       
      max = Math.max(max, ans);
       }
        System.out.println(max);
    }
}

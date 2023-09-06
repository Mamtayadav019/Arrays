/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Main
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        long x =0, cnt = 0;
        long maxi=0;
        for(int i = 0 ;i<n;i++)
        { 
            cnt = 0;
            x = arr[i];
            int j = i;
            while(j<n)
            {
                if(x == arr[j])
                cnt++;
                
                j++;
            }
            if(cnt>n/2)
            maxi = arr[i];
        }
        System.out.println(maxi);
    }
}
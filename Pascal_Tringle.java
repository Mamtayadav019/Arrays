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
        int arr[][] = new int[n][n];
        if(n==1)
        {
        System.out.println("1");
        }
        else{
        
        arr[0][0]=1;
        arr[1][0]=1;
        arr[1][1]=1;
        for(int i = 2;i<n;i++)
        {
            arr[i][0]=arr[i][i]=1;
            for(int j =1 ;j<i;j++)
            arr[i][j]= arr[i-1][j-1]+arr[i-1][j];
        }
        
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            { 
                if(arr[i][j]==0)
                break;
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            
        }
        }
         
    }
}

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
       int m = sc.nextInt();
       int n = sc.nextInt();
       int arr[][] = new int[m][n];
       for(int i =0;i<arr.length;i++)
       {
           for(int j =0;j<arr[0].length;j++)
           {
               arr[i][j] = sc.nextInt();
           }
       }
       int minr = 0;
       int minc= 0 ;
       int maxr = arr.length-1;
       int maxc = arr[0].length-1;
       int temp = m*n;
       int cnt = 0;
       while(cnt<temp)
       {
           //right 
           
           for( int i= minr , j = minc;j<=maxc && cnt<temp;j++)
           {
               System.out.print(arr[i][j]+" ");
               cnt++;
               
           }minr++;
           
           
           //down 
           for( int i= minr , j = maxc;i<=maxr && cnt<temp;i++)
           {
            System.out.print(arr[i][j]+" ");
           
             cnt++;
                
           } maxc--;
          
           
           //left
            for( int i= maxr , j = maxc;j>=minc && cnt<temp;j--)
           {
               System.out.print(arr[i][j]+" ");
               cnt++;
              
               
           } maxr--;
            
           
           //up
            for( int i= maxr , j = minc; i>=minr && cnt<temp;i--)
          { 
              System.out.print(arr[i][j]+" ");
              cnt++;
              
              
          }
          minc++;
           
           
       }
    }
}
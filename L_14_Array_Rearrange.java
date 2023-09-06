/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


import java.util.Scanner;
//import java.io.*;
public class L_14_Array_Rearrange
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
        L_14_Array_Rearrange  mn = new L_14_Array_Rearrange();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nums[] = new int[n];
	    //List <Integer> nums = new ArrayList<>(n);
	    for(int i=0;i<n;i++)
	    nums[i]=sc.nextInt();
	    mn.reArrange(nums);
	   
	
	}
}


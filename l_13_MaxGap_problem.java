
import java.util.Scanner;
import java.io.*;
public class Main
{
    void maxgap(int nums[])
    {
       int n = nums.length;
       if(n<2)
       System.out.println("0");
       int maxnum = 0 ;
       int minnum =  Integer.MAX_VALUE;
       for(int i =0;i<n;i++)
       {
           maxnum = Math.max(maxnum , nums[i]);
           minnum = Math.min(minnum , nums[i]);
       }
       System.out.println("maxnum " +maxnum );
       System.out.println("Minnum " +minnum);
       
       if(minnum==maxnum)
       
        System.out.println("0");
        
       int gap = (maxnum-minnum)/(n-1);
       
       if((maxnum-minnum)%(n-1)!=0) gap++;
       System.out.println("gap " +gap);
       
       int minArr[] = new int[n];
       int maxArr[]=new int[n];
       
       for(int j=0;j<n;j++){
            minArr[j]=Integer.MAX_VALUE;
            maxArr[j]=-1;
        }
        
       for(int i =0;i<n;i++)
       {
           int bkt = (nums[i]-minnum)/gap;
           System.out.println("bkt " +bkt);
           minArr[bkt] = Math.min(minArr[bkt],nums[i]);
           System.out.println("Min "+bkt+"= " +minArr[bkt] );
           maxArr[bkt] = Math.max(maxArr[bkt],nums[i]);
           System.out.println( "Max "+bkt+"= " +maxArr[bkt] );
       }
       
       int ans = 0;
       int prev= maxArr[0];
       for(int i =1;i<n;i++)
       {
           
           
               ans = Math.max(ans,minArr[i]-prev);
               prev = maxArr[i];
           
       }
       System.out.println(ans);
    }
	public static void main(String[] args) {
	  Main  mn = new Main ();
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int nums[] = new int[n];
	    //List <Integer> nums = new ArrayList<>(n);
	    for(int i=0;i<n;i++)
	    nums[i]=sc.nextInt();
	    mn.maxgap(nums);
	
	}
}



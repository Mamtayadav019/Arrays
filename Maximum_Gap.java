
import java.util.Scanner;
import java.io.*;
public class Main
{
    void maxgap(int nums[])
    {
       int n = nums.length;
       if(n<2)
        {System.out.println("0");
       return;}
       int maxnum = 0 ;
       int minnum =  Integer.MAX_VALUE;
       for(int i =0;i<n;i++)
       {
           maxnum = Math.max(maxnum , nums[i]);
           minnum = Math.min(minnum , nums[i]);
       }
       
       
       if(minnum==maxnum)
       { System.out.println("0");
        return;
       }
        
       int gap = (maxnum-minnum)/(n-1);
       
       if((maxnum-minnum)%(n-1)!=0) gap++;
       
       
       int minArr[] = new int[n];
       int maxArr[]=new int[n];
       
       for(int j=0;j<n;j++){
            minArr[j]=Integer.MAX_VALUE;
            maxArr[j]=-1;
        }
        
       for(int i =0;i<n;i++)
       {
           int bkt = (nums[i]-minnum)/gap;
          
           minArr[bkt] = Math.min(minArr[bkt],nums[i]);
           
           maxArr[bkt] = Math.max(maxArr[bkt],nums[i]);
          
       }
       
       int ans = 0;
       int prev= maxArr[0];
       for(int i =1;i<n;i++)
       {
           if(minArr[i]==Integer.MAX_VALUE)
           continue;
           
           else{
               ans = Math.max(ans,minArr[i]-prev);
               prev = maxArr[i];
           }
       }
       System.out.println(ans);
    }
	public static void main(String[] args) {
	  Main  mn = new Main ();
	    Scanner sc = new Scanner(System.in);
	    int t = sc.nextInt();
	    for(int i =0;i<t;i++)
	    {
	    int n = sc.nextInt();
	    int nums[] = new int[n];
	    
	    for(int j=0;j<n;j++)
	    nums[j]=sc.nextInt();
	    mn.maxgap(nums);
	}
	
	}
}





//sum of subarray(window sliding)

public class l8_sliding_window{
public static void main(String args[]){
    // int arr[]={1,2,-1,0,4};
    // int n= arr.length;
    // int k=3;//making slides
    // int sum=0;

    // for(int i=0;i<k;i++)
    // sum+=arr[i];

    // for(int j=k;j<n;j++)
    // {
       
    //      sum=arr[j-k]-sum+arr[j];
        
    // }
    // System.out.println(sum);

    int arr[] = {2,3,2,2,6,7,2,7};
    int n = arr.length;
    int x=3;
    
    int cnt=0;
        for(int j=0;j<x;j++)
        {
            if(arr[j]==2){
               cnt++;
            }    
        }
         System.out.print(cnt+" ");
    


}
}

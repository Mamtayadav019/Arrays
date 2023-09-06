public class histogram{
    public static void main(String args[]){
        int arr[] = {0,1,0,2,1,3,0,2};
        int n= arr.length;
        int pmax[]= new int[n];
        pmax[0]=arr[0];
        for(int i=1;i<n;i++)
        {
            pmax[i]=Math.max(pmax[i-1],arr[i]);
        }
          int smax[]=new int[n];
          smax[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--)
        {
             smax[i]=Math.max(smax[i+1],arr[i]);
        }
        int decided_h=0,ans=0;
        for(int i=0;i<n;i++)
        {
            decided_h=Math.min(pmax[i],smax[i]);

            if(decided_h>=arr[i])
            ans+= decided_h-arr[i];
        }
        System.out.println(ans);
    }
}
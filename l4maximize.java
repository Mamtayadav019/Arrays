import java.util.Scanner;
class premax1D{
    public static void main(String args[]){

    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int p = 3, q = 4, r = 1;
    int ans=0,max=0;
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                ans= (p*arr[i]+q*arr[j]+r*arr[k]);
                max= Math.max(max.ans);
                

            }
        }
    }
    System.out.println(max);
    }
}
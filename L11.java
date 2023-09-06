

//lesson 10 processing queries Efficiency

public class L11

{
    public static void main(String []args)
    {
        int a[][]={{1,2,3},{1,2,3},{1,2,3}};
        int n= a.length;

        //row wise aum
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                a[i][j]=a[i][j]+a[i][j-1];
            }
        }
        
        for(int j=0;j<n;j++)
        {
            for(int i=1;i<n;i++)
            {
                a[i][j]=a[i][j]+a[i-1][j];
               
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        int i1=1;
        int j1=1;
        int i2=2;
        int j2=2;
       int sum = a[i2][j2];
        System.out.println(sum);
        if(i1>=0 && j1>=0)
        sum +=a[i1][j1]+a[i1][j2]+a[i2][j1];
       System.out.println(sum);
        


    }
}
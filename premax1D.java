
//prefix subarray sum

// import java.util.Scanner;
// public class premax1D
// {
//     public static void main(String args[])
//     {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.nextInt();
//         }
//         int r =1 , l =4;
//          for(int i=1;i<n;i++)
//         {
//             a[i]+=a[i-1];
//         }
//         int totel = a[r]-a[l-1];
//         System.out.println(totel);
//         if(l==0)
//         System.out.println(a);


//     }
// }

//############################  prefix sum  #################################################
 
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
    int pmax[]=new int[n];
    pmax[0] = arr[0];
    int totel=0;
    for(int i=1;i<n;i++)
    {
        pmax[i]=Math.max(pmax[i-1],arr[i]);
        totel=pmax[i];
       
    }
      System.out.println(totel);
  
   
}
}
//################# suffix max #############################


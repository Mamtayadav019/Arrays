import java.util.Scanner;
class gfg
{
    private int arr[];
   int count=0;
    public gfg(int length){arr = new int[length];}

    public void printArr()
    {
         for(int i=0;i<count;i++)
         {
            System.out.println(arr[i]);
         }
          
    }

    void insert(int number){
        if(arr.length==count)
        {
            int newarr[] = new int[count*2];
            for(int i =0;i<count;i++)
            {
                newarr[i]=arr[i];

            }
             arr=newarr;

        }
        arr[count++]= number;
    }
}

public class dynamicPro
{
    public static void main(String args[])
    {
       gfg element = new gfg(2);

       element.insert(3);
       element.insert(4);
       element.insert(7);
       element.insert(9);
       element.printArr();
    }
}
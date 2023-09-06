import java.util.*;
import java.lang.*;
import java.io.*;

class Matrix_block_sum {
    public void matrixBlockSum(int[][] mat, int k) 
        {
        //row wise add
        int m = mat.length;
       int n = mat[0].length;
          for(int i=0;i<m;i++)
       {
           for(int j = 1;j<n;j++)
           {
               mat[i][j] = mat[i][j]+mat[i][j-1];
           }
       }
       
       //column wise
         for(int j=0;j<n;j++)
       {
           for(int i = 1;i<m;i++)
           {
               mat[i][j] =  mat[i][j]+mat[i-1][j];
           }
       }
       int ans[][] = new int[m][n];
    for(int i=0;i<m;i++)
       {
           for(int j = 0;j<n;j++)
           {
            int x1 = i-k<0?0:i-k;

int y1 = j-k<0?0:j-k;

int x2 = i+k>m-1?m-1:i+k;

int y2 = j+k>n-1?n-1:j+k;
             int sum=0;
             if(x1==0&&y1==0)
             {
               sum=  mat[x2][y2];
             }
             else if(x1==0){
             sum=mat[x2][y2]-mat[x2][y1-1];
             }else if(y1==0){
             sum = mat[x2][y2]-mat[x1-1][y2];
            }
             else{
                 sum= mat[x2][y2]-mat[x2][y1-1]-mat[x1-1][y2]+ mat[x1-1][y1-1];
                 
             }
              ans[i][j]=sum;
           }
          
           
       }
       for(int i=0;i<m;i++)
       {
           for(int j = 0;j<n;j++)
           {
              System.out.print(ans[i][j]+" ");
           }
           System.out.println();
       }

              
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Matrix_block_sum ll = new Matrix_block_sum();
       Scanner sc = new Scanner(System.in);
       int m = sc.nextInt();
       int n = sc.nextInt();
       int k = sc.nextInt();
       int [][]mat = new int[m][n];
       for(int i=0;i<m;i++)
       {
           for(int j = 0;j<n;j++)
           {
               mat[i][j] = sc.nextInt();
           }
       }
       ll.matrixBlockSum(mat,k);
       
    }
    }
    

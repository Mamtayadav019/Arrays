
class main
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int m= matrix.length;
        int n = matrix[i].length;
        int j=n-1;
        while(i<m && j>=0)
        {
            if(matrix[i][j]==target)
            {
                return true;
               
            }
            else if(matrix[i][j]>target)
            j--;
            else if(matrix[i][j]<target)
            i++;
            
            
        }
        return false;
        
    }
    public static void main(String []args)
    {
        Solution ll =new Solution();
        Scanner sc = new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]= new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        
          int target = sc.nextInt();
          ll.searchMatrix(arr,target);

    }
}

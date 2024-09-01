class Solution {
    public void rowmark(int i,int matrix[][])
    {
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[i][j]!=0){
                matrix[i][j]='a';
            }
            
        }
    }

      public void colmark(int j,int matrix[][])
    {
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][j]!=0){
                matrix[i][j]='a';
            }
            
        }
    }

     

    public void setZeroes(int[][] matrix) {
        
        int flag=0;
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {

                if(matrix[i][j]==0)
                {
                    flag++;
                    rowmark(i,matrix);
                    colmark(j,matrix);

                }
            }

        }
        if(flag!=0){
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                if(matrix[i][j]=='a'){
                    matrix[i][j]=0;
                }
            }
        }
        }
    }
}

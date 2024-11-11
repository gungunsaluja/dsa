class Node
{
    int row,col;
    public Node(int row,int col)
    {
        this.row = row;
        this.col = col;
    }
}


class Solution {
    int dir[][] = new int[][]{{-1,0},{0,-1},{0,1},{1,0}};
    private boolean isValid(int row,int col,int rows,int cols)
    {
        if(row>=0 && row<rows && col>=0 && col<cols )
        {
            return true;
        }
        return false;
    
    }

    public void solve(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        Queue<Node> queue = new LinkedList<>();
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(i==0 || i == rows-1 || j==0 || j == cols-1)
                {
                    if(board[i][j] == 'O')
                    {
                        queue.add(new Node(i,j));
                        board[i][j] = 'V';
                    }

                }
            }
        }

        while(!queue.isEmpty())
        {
            Node node = queue.poll();
            for(int dir[]:dir)
            {
                int newrow = node.row + dir[0];
                int newcol = node.col+ dir[1];
                if(isValid(newrow,newcol,rows,cols) && board[newrow][newcol]=='O')
                {
                    queue.add(new Node(newrow,newcol));
                    board[newrow][newcol] = 'V';

                }
            }
        }
 
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                if(board[i][j]=='V')
                {
                    board[i][j] = 'O';
                }
                else{
                    board[i][j] = 'X';
                }
            }
        }
        
    }
}

package algo.matrix.leetcode;

public class AvailableRookCaptures {
    public int numRookCaptures(char[][] board) {
        int[] rookPos = getRookPosition(board);
        int rookRow = rookPos[0];
        int rookCol = rookPos[1];
        int attack = 0;
        for(int i = rookRow+1; i < 8; i++){ //down
            if(board[i][rookCol] != '.'){
                if(board[i][rookCol]=='p')
                    attack++;
                break;
            }
        }

        for(int i = rookCol+1; i < 8; i++){ //right
            if(board[rookRow][i] != '.'){
                if(board[rookRow][i]=='p')
                    attack++;
                break;
            }
        }

        for(int i = rookRow-1; i >= 0; i--){ //up
            if(board[i][rookCol] != '.'){
                if(board[i][rookCol]=='p')
                    attack++;
                break;
            }
        }

        for(int i = rookCol-1; i >= 0; i--){ //left
            if(board[rookRow][i] != '.'){
                if(board[rookRow][i]=='p')
                    attack++;
                break;
            }
        }
        return attack;
    }

    private int[] getRookPosition(char[][] grid){
        int rookRow = 0, rookCol = 0;
        for(int i = 0; i < 8; i++){
            for(int j = 0; j < 8; j++){
                if(grid[i][j] == 'R')
                    return new int[]{i,j};
            }
        }
        return new int[0];
    }
}

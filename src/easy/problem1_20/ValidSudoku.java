package easy.problem1_20;

/**
 * Created by Adam on 2015/5/15.
 */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            if(!isValid(board,i,i,0,8)){
                return false;
            }
            if(!isValid(board,0,8,i,i)){
                return false;
            }
            if(!isValid(board,(i/3)*3,(i/3)*3+2,(i%3)*3,(i%3)*3+2)){
                return false;
            }
        }
        return true;

    }

    private boolean isValid(char[][] board,int x1,int x2,int y1,int y2){
        boolean[] boolArrays = new boolean[10];
        for(int i=x1;i<=x2;i++){
            for(int j=y1;j<=y2;j++){
                if(board[i][j]!='.'){
                    if(boolArrays[Character.getNumericValue(board[i][j])]){
                        return false;
                    }else{
                        boolArrays[Character.getNumericValue(board[i][j])] = true;
                    }
                }
            }
        }
        return true;
    }
}

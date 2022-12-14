package leetcode;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {
		String[][]board = { {"8","3",".",".","7",".",".",".","."},
				            {"6",".",".","1","9","5",".",".","."},
				            {".","9","8",".",".",".",".","6","."},
				            {"8",".",".",".","6",".",".",".","3"},
				            {"4",".",".","8",".","3",".",".","1"},
				            {"7",".",".",".","2",".",".",".","6"},
				            {".","6",".",".",".",".","2","8","."},
				            {".",".",".","4","1","9",".",".","5"},
				            {".",".",".",".","8",".",".","7","9"},
				            };
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		
		
		for (int i = 0; i<board.length; i++){
			
			for (int j = 0; j<board[i].length; j++){
				
				if (!board[i][j].equals(".")){
					int x = Integer.valueOf(board[i][j]);
					
					if (!hs.contains(x)){
						hs.add(x);
					}
					else
					{
						System.out.println("Not Valid Sudoku");
						break;
					}	 
				}
			}
			hs.clear();
		}
	
		for (int i = 0; i<board.length; i++){
			
			for (int j = 0; j<board[i].length; j++){
				
				if (!board[j][i].equals(".")){
					int x = Integer.valueOf(board[j][i]);
					
					if (!hs.contains(x)){
						hs.add(x);
					}
					else
					{
						System.out.println("Not Valid Sudoku");
						break;
					}	 
				}
			}
			hs.clear();
		}
		
	}
	
	
	public static boolean verifyValidSudoku(String[][]board){
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for (int i = 0; i<board.length; i++){
			
			for (int j = 0; j<board[i].length; j++){
				
				if (!board[i][j].equals(".")){
					
					int x = Integer.valueOf(board[i][j]);
					
					if (!hs.contains(x)){
						hs.add(x);
					}
					else
					{
						System.out.println("Not Valid Sudoku");
						break;
					}	 
				}
			}
			hs.clear();
		}
		
		
		return false;
	}

}



/*[[".",".",".",   ".","5",".",   ".","1","."],
 [".","4",".",   "3",".",".",   ".",".","."],
 [".",".",".",   ".",".","3",   ".",".","1"],
 
 ["8",".",".",   ".",".",".",   ".","2","."],
 [".",".","2",   ".","7",".",   ".",".","."],
 [".","1","5",   ".",".",".",   ".",".","."],
 
 [".",".",".",    ".",".","2",  ".",".","."],
 [".","2",".",    "9",".",".",  ".",".","."],
 [".",".","4",   ".",".",".",   ".",".","."]]*/

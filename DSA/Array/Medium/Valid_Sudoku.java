package Medium;
import java.util.*;
public class Valid_Sudoku {
	
	// brute force phle row check krlo fr col and fr boxes 3*3 ke 
	public static boolean validSudoku(char [][] sudoku) {
		
		Set<String> set = new HashSet<>();
		
		int n = sudoku.length;
		
		
		for(int i =0;i<n;i++) {
			
			for(int j=0;j<n;j++) {
				
				char ch =  sudoku[i][j];
				
				if(ch!='.') {
					
			
				
				int box = (i/3) *3 + (j/3);
				
				  String key1 = "Row"+i+"ch"+ch;
                  
                  String key2 = "Col"+j+"ch"+ch;
                  
                  String key3 = "Box"+box+"ch"+ch;
			    
			    if(set.contains(key1) || set.contains(key2)||set.contains(key3)) {
			    	return false;
			    }
			    
			    else {
			    	
			    	set.add(key1);
			    	set.add(key2);
			    	set.add(key3);
			    }
			}
			}
		}
		
		
		return true;
	}

	public static void main(String[] args) {
		
		char [][] sudoku = {{'5','3','.','.','7','.','.','.','.'},
				            {'6','.','.','1','9','5','.','.','.'},
				            {'.','9','8','.','.','.','.','6','.'},
				            {'8','.','.','.','6','.','.','.','3'},
				            {'4','.','.','8','.','3','.','.','1'},
				            {'7','.','.','.','2','.','.','.','6'},
				            {'.','6','.','.','.','.','2','8','.'},
				            {'.','.','.','4','1','9','.','.','5'},
				            {'.','.','.','.','8','.','.','7','9'}};

		boolean ans = validSudoku(sudoku);
		
		System.out.println(ans);
	}

}

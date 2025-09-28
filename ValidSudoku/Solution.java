import java.util.Arrays;

class Solution {
	public boolean isValidSudoku(char[][] board) {
		char[] arr = new char[9];
		System.out.println(board.length);
		System.out.println(board[0].length);
		int j = 0;
		for (int i = 0; i < board.length; i++) {
			for (j = 0; j < board[0].length; j++) {
//				System.out.print(board[i][j]);
				arr[j] = board[i][j];
//				System.out.println(i + "+" + j);
			}
			if (!sequence(arr))
				return true;

		}
		sequence(board[0][0], board[0][1], board[0][2],board[1][0], board[1][1], board[2][2]board[2][0], board[2][1], board[2][2]s);
		// i
//		for (int i = 0; i < board.length; i++) {
//			arr[i]=board[i][1];
//		}
		return true;
	}

	public boolean sequence(char[] arr) {
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '.') {
				for (int j = i + 1; j > 8 - i; j++) {
					
					if (arr[i] == arr[j])
						return false;
				}
			}
		}
		
		return true;
		
	}
}

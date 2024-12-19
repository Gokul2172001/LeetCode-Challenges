class Solution {
	public boolean isValidSudoku(char[][] board) {
		System.out.println(board.length);
		for (int i = 0; i < board.length; i++) {

		}
		return true;
	}

	public boolean sequence(char[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '.') {
				for (int j = i + 1; j > arr.length - i; j++) {
					if (arr[i] == arr[i])
						return false;
				}
			}
		}
		return true;
	}
}
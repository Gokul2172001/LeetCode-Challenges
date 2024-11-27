public class practice {

	public static void main(String[] args) {

		Solution s1 = new Solution();
		int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 }; // =>49
		System.out.println(s1.maxArea(arr));
	}

}

class Solution {
	public int maxArea(int[] height) {
		int biggest = 0;
		int i = 0;
		int j = height.length - 1;
		System.out.println(height[j]);
		System.out.println(Math.max(j, biggest));
		while (i < j) {
			int width = j - i;
//			System.out.println(width);
			int minHight = Math.min(height[i], height[j]);
			int area = width * minHight;

			biggest = Math.max(area, biggest);
			if (height[i] < height[j])
				i++;
			else
				j--;
		}
		return biggest;
	}
}
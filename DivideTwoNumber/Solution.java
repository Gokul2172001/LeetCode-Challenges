public class practice {

	public static void main(String[] args) {

		Solution s1 = new Solution();
//		int divid = 2147483647;
//		int divic = 1;
		// => 2147483647
		int divid = 10;
		int divic = 3;
		System.out.println(s1.divide(divid, divic));
	}

}

class Solution {
	public int divide(int divident, int divison) {
		if (divident == 0)
			return 0;
		int divide = (divident) / (divison);
//		System.out.println(divident < Integer.MIN_VALUE);
//		System.out.println(Integer.MAX_VALUE);
		if (divident == Integer.MIN_VALUE && divison == -1)
			return Integer.MAX_VALUE;
		boolean sign = (divident < 0) ^ (divison < 0);

		long absdivident = Math.abs((long) divide);
		long absdivisor = Math.abs((long) absdivident);
		long quot = 0;

		while (absdivident >= absdivisor) {
			long temp = absdivisor, multiple = 1;
			while (absdivident >= (temp << 1)) {
				temp <<= 1;
				multiple <<= 1;
			}
			absdivisor -= temp;
			quot += multiple;
		}
		if (sign) {
			quot = -quot;
		}

		if (quot < Integer.MIN_VALUE) {
			return Integer.MIN_VALUE;
		}
		if (quot > Integer.MAX_VALUE) {
			return Integer.MAX_VALUE;
		}

		return divide;
	}
}
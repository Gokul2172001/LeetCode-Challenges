class Solution {
	public String fancy(String str) {
		StringBuilder s = new StringBuilder();
		s.append(str);
		int i = 0, count = 0;
//		System.out.println();
		while (i < s.length() - 1) {
			if (s.charAt(i) == s.charAt(i + 1))
				count = count + 1;
			else
				count = 0;
			if (count >= 2) {
				s.deleteCharAt(i + 1);
				i = i - 1;
			}
			i = i + 1;
		}
		System.out.println(s);
//		System.out.println(s.toString());
		return s.toString();
	}
}

class Soultion {
	 public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	        int[] merge = new int[nums1.length + nums2.length];
			for (int i = 0; i < nums1.length; i++) {
				merge[i] = nums1[i];
			}
			for (int j = 0; j < nums2.length; j++) {
				merge[nums1.length + j] = nums2[j];
			}
	        Arrays.sort(merge);
			// System.out.println(Arrays.toString(merge));
			// System.out.println(merge.length);
			// System.out.println(merge.length / 2);
			// System.out.println(merge.length % 2);
			// System.out.println(merge.length % 2 == 0);
					double len = merge.length;
			double rem = len % 2;
			double half = len / 2;
			if (rem == 0) {
				double mean = merge[(int) half - 1] + merge[(int) half];
				double median = mean / 2;
//				System.out.println("Mean " + mean);
//				System.out.println("Median " + median);
				return median;
			} else {
				return merge[merge.length / 2];
			}
}

import java.util.ArrayList;

public class solution {
	public int maximumUniqueSubarray(int[] nums) {
		ArrayList list = new ArrayList<Integer>();
		int max = 0, value = 0;
		for (int i = 0; i < nums.length; i++) {
//			System.out.println(list);
			System.out.println(i + " " + list.contains(nums[i]) + value);
			if (list.contains(nums[i])) {
				value = nums[i];
				list.clear();
				if (max < value)
					max = value;
			} else {
				value = value + nums[i];
				System.out.println("value: " + value);
			}
			list.add(nums[i]);
		}
		System.out.println("All val: " + list);
		System.out.println("Maximum: " + max);
		return 0;
	}
}
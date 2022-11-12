public class LinearSearch {
	public static int linear_search(int[] nums, int target) {
		int index = -1;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) {
		int[] array = {1, 3, 5, 8, 12, 34, 15}; // array can be sorted or unsorted
		int target = 34;
		System.out.println(linear_search(array, target));
	}
}
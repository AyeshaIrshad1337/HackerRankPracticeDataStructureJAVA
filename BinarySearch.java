public class BinarySearch {
	public static int binary_search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right-left)/2;
			if (nums[mid] == target) {
				return mid;
			} else if (target > nums[mid]) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // array must be sorted
		int target = 6;
		System.out.println(binary_search(array, target));
	}
}
public class OperationsIn1DArray {

	public static int get(int[] nums, int index) {
		return nums[index];
	} // TC: O(1)

	public static void insert(int[] nums, int index, int val) {
		nums[index] = val;
	} // TC: O(1)

	public static void update(int[] nums, int index, int val) {
		nums[index] = val;
	} // TC: O(1)

	public static void delete(int[] nums, int index) {
		nums[index] = 0;
	} // TC: O(1)

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 4, 5, 6};
		get(nums1, 0); // it will return, 1

		int[] nums2 = new int[4]; // {0,0,0,0}
		insert(nums2, 0, 1); // {1,0,0,0}
		insert(nums2, 1, 2); // {1,2,0,0}
		insert(nums2, 2, 3); // {1,2,3,0}
		insert(nums2, 3, 4); // {1,2,3,4}

		int[] nums3 = {1, 2, 3};
		update(nums3, 0, 4); // {4,2,3}
		update(nums3, 1, 5); // {4,5,3}
		update(nums3, 2, 6); // {4,5,6}

		int[] nums4 = {1,2,3};
		delete(nums4,0); // {0,1,2}
		delete(nums4,1); // {0,0,2}
		delete(nums4,2); // {0,0,0}
	}

}
class Solution {
    	public static int searchInsert(int[] nums, int target) {
		int length = nums.length;
		int end = nums.length - 1;
		int start = 0;
		int  mid = start + (end - start) / 2;
		
		if (length == 0) {
			return 0;
		}
		while (start <= end) {
			mid = start + (end - start) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				end = mid - 1;
			} else if (nums[mid] < target) {
				start = mid + 1;
			}

		}
		if (nums[mid] < target) {
				return mid+1;
			} 
            else {
                 return mid;
            }
	}

	public static void main(String[] args) {
    	int[] nums= {1,3,5,6};
    	System.out.println(searchInsert(nums, 5));
    }
}

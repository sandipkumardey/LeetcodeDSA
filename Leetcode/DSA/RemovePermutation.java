public class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        
        int i = n - 1;
        while (i > 0 && nums[i] <= nums[i - 1]) {
            i--;
        }
        
        if (i == 0) {
            reverse(nums, 0, n - 1);
            return;
        }
        
        int j = n - 1;
        while (nums[j] <= nums[i - 1]) {
            j--;
        }
        
        swap(nums, i - 1, j);
        reverse(nums, i, n - 1);
    }
    
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

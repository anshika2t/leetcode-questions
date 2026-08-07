class Solution {
    public int removeElement(int[] nums, int val) {

        int n = nums.length;
        int k = n;

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (nums[j] == val && nums[j + 1] != val) {

                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] == val) {
                k--;
            }
        }

        return k;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> ans = new ArrayList<>();

        Arrays.sort(nums);

        int expected = 1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == expected) {
                expected++;
            }

            else if (nums[i] > expected) {

                while (expected < nums[i]) {
                    ans.add(expected);
                    expected++;
                }

                expected = nums[i] + 1;
            }
        }

        while (expected <= nums.length) {
            ans.add(expected);
            expected++;
        }

        return ans;
    }
}
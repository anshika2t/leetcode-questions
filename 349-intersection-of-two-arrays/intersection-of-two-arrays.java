class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int[] ans = new int[Math.min(n, m)];
        int k = 0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                if (nums1[i] == nums2[j]) {

                    boolean duplicate = false;

                    for (int x = 0; x < k; x++) {
                        if (ans[x] == nums1[i]) {
                            duplicate = true;
                            break;
                        }
                    }

                    if (!duplicate) {
                        ans[k] = nums1[i];
                        k++;
                    }

                    break;
                }
            }
        }

        int[] result = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = ans[i];
        }

        return result;
    }
}
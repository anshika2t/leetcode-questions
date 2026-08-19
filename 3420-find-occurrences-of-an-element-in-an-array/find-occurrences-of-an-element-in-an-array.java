class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        ArrayList<Integer> positions = new ArrayList<>();
        int[] ans = new int[queries.length];

        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                positions.add(i);
            }
        }
            for(int j=0;j<queries.length;j++){
                if(queries[j]<=positions.size()){
                    ans[j] = positions.get(queries[j] - 1);
                }
                else {
        ans[j] = -1;
                     }

            }

        return ans;
    }
}
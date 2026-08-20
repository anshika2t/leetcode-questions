class Solution {
    public int pivotIndex(int[] nums) {
     int sum=0;
     int left=0;
     for(int i=0;i<nums.length;i++){
        sum=sum+nums[i];
     }
    for(int j=0; j<nums.length; j++){

    int right = sum - left - nums[j];

    if(left == right)
        return j;

    left = left + nums[j];
}
return-1;
    }

}
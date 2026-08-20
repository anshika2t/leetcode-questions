class Solution {
    public int findKthPositive(int[] arr, int k) {
        int num=1,n=arr.length;
        int i=0,count=0;
        while(k>0){
            if(i < n && arr[i] == num){
                i++;
            }
            else 
            k--;
            if(k==0) return num;
            num++;
        }
      
        return num;
    }
}
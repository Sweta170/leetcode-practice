class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int ts =0;
        int ls =0;
        int rs =0;

        for(int num : nums){
            ts += num;
        }

        for(int i =0; i<n; i++){
            rs = ts - ls - nums[i];
            if(ls - rs == 0)return i;
            ls += nums[i]; 
        }
        return -1;
        
    }
}
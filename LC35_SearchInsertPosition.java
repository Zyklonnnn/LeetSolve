class Solution {
    public int searchInsert(int[] nums, int target) {
        int p=0;
        while(p<nums.length&&nums[p]<=target)
        {
            if(nums[p]==target)
                return p;
            p++;
        }
        return p;
    }
}
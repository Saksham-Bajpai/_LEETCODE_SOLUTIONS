class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int n = nums.length;
        long result = 0;
        long count = 0;
        for (int i: nums)
        {
            if (i !=0)
            {
                count = 0;
            }
            else {
                count ++;
                result += count;
            }
        }
        return result;
    }
}
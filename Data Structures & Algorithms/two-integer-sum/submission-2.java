class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> remaindersMap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            remaindersMap.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int remainder = target - nums[i];
            Integer remainderIndex = remaindersMap.get(remainder);

            if(remainderIndex!=null && remainderIndex != i){
                return new int[]{i,remainderIndex};
            }
        }
        return null;
    }
}

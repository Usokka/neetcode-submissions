class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer,Integer> numsMap = new HashMap<>();
        for(int num : nums){
            Integer n = numsMap.get(num);
            if(n == null){
                numsMap.put(num,num);
                continue;
            }
            return true;
        }
        return false;
    }
}
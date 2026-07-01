class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preArr = new int[nums.length];
        int[] sufArr = new int[nums.length];
        
        int val = 1;
        preArr[0] = 1;
        sufArr[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            val *= nums[i-1]; 
            preArr[i] = val;
        }

        val = 1;
        for(int i = nums.length -2 ;i>=0;i--){
            val *= nums[i+1]; 
            sufArr[i] = val;
        }

        int[] finalArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            finalArr[i] = preArr[i]*sufArr[i];
        }

        return finalArr;
    }
}  

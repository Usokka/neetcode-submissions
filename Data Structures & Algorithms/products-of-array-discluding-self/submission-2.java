class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] preArr = new int[nums.length];
        int[] sufArr = new int[nums.length];
        
        int preVal = 1;
        int sufVal = 1;
        preArr[0] = 1;
        sufArr[nums.length-1] = 1;

        for(int i=1;i<nums.length;i++){
            preVal *= nums[i-1]; 
            preArr[i] = preVal;
            
            sufVal *= nums[nums.length-i-1+1]; 
            sufArr[nums.length-i-1] = sufVal;
        }

        int[] finalArr = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            finalArr[i] = preArr[i]*sufArr[i];
        }

        return finalArr;
    }
}  

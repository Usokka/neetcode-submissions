class Solution {
    public int maxArea(int[] heights) {
        int areaMax = 0;
        for(int i=0;i<heights.length;i++){
            for(int j=0;j<heights.length;j++){
                
                if(j==i)
                    continue;
                
                int l = Math.abs(i - j );
                int h = Math.max(heights[i],heights[j]) - Math.abs(heights[i] - heights[j]);
                if(l*h > areaMax)
                    areaMax = l*h;
            }
        }

        return areaMax;
    }
}

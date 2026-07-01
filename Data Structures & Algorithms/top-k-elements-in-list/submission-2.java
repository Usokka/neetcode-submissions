class Solution {
   
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer,Integer> numsOccur = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            numsOccur.put(nums[i], numsOccur.getOrDefault(nums[i], 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>(k,(e1,e2) -> e2.getValue() - e1.getValue() );
        pq.addAll(numsOccur.entrySet());
        int[] res = new int[k];
        for(int i=0;i<k;i++){
            res[i] = pq.poll().getKey();
        }

        return res;
    }
}

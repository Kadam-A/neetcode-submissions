class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> count = new HashMap<>();

        for ( int i = 0; i < nums.length; i++) {

            count.put(nums[i], count.getOrDefault(nums[i], 0)+1);


        }

        int[] topK = new int[k];

        PriorityQueue<Integer> top = new PriorityQueue( (a,b) -> count.get(b) - count.get(a));

        for (int i: count.keySet()) {
            top.offer(i);
        }


        for (int i = 0; i < k; i++) 
            topK[i] = top.poll();

        // for (int i = 0; i < k; i++) {

        //     int maxKey = 0, maxVal = 0;

        //     Set<Integer> keys = count.keySet();

        //     for (int key : keys) {

        //         if  (count.get(key) > maxVal) {
        //             maxKey = key;
        //             maxVal = count.get(key);
        //         }

        //     }

        //     topK[i] = maxKey;
        //     count.remove(maxKey);
        // }
        
        return topK;
    }
}

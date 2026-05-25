class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initilize counter
        HashMap<Integer, Integer> count = new HashMap<>();

        // Loop through the numbers
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        // Get the K most frequent elements
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            Integer num = entry.getKey();
            Integer freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList();
            }

            buckets[freq].add(num);
        }

        // Get Top K values
        int[] topK = new int[k];
        int counter = 0;

        for (int pos = buckets.length - 1; pos >= 0 && counter < k; pos--) {
            if (buckets[pos] != null) {
                for (int num : buckets[pos]) {
                    topK[counter++] = num;
                    if (counter == k) {
                        return topK;
                    }
                }
            }
        }

        return topK;
    }
}

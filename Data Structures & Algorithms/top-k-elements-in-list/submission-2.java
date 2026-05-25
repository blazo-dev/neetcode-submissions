class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Initilize counter
        HashMap<Integer, Integer> count = new HashMap<>();

        // Loop through the numbers
        for (int n : nums) {
            if (count.containsKey(n)) {
                count.put(n, count.get(n) + 1);
            } else {
                count.put(n, 1);
            }
        }

        // Get the K most frequent elements
        List<Integer>[] buckets = new ArrayList[nums.length + 1];

        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            Integer item = entry.getKey();
            Integer freq = entry.getValue();

            if (buckets[freq] == null) {
                buckets[freq] = new ArrayList();
            }

            buckets[freq].add(item);
        }

        int[] res = new int[k];
        int counter = 0;

        for (int pos = buckets.length - 1; pos >= 0 && counter < k; pos--) {
            if (buckets[pos] != null) {
                for (int num : buckets[pos]) {
                    res[counter++] = num;
                    if (counter == k) {
                        return res;
                    }
                }
            }
        }


        return res;
    }
}

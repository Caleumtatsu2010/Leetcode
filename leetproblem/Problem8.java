public class Problem8 
{
    public List<List<Integer>> combinationSum2(int[] candidates, int target) 
    {
        // container to hold the final combinations
        List<List<Integer>> results = new ArrayList<>();
        LinkedList<Integer> comb = new LinkedList<>();

        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int candidate : candidates) {
            if (hashmap.containsKey(candidate))
                hashmap.put(candidate, hashmap.get(candidate) + 1);
            else
                hashmap.put(candidate, 1);
        }

        // convert the hashmap table to a list of (num, count) tuples
        List<int[]> hashmapList = new ArrayList<>();
        hashmap.forEach((key, value)
        {
            hashmapList.add(new int[]{key, value});
        });

        backtrack(comb, target, 0, hashmapList, results);
        return results;
    }

    private void backtrack(LinkedList<Integer> comb, int target, int curr, List<int[]> hashmapList, List<List<Integer>> results) 
    {
        if (target == 0) {
            // make a deep copy of the current combination.
            results.add(new ArrayList<Integer>(comb));
            return;
        }

        for (int nextCurr = curr; nextCurr < hashmap.size(); ++nextCurr) 
        {
            int[] entry = hashmap.get(nextCurr);
            Integer candidate = entry[0], freq = entry[1];

            if (freq <= 0)
                continue;

            // add a new element to the current combination
            comb.addLast(candidate);
            hashmap.set(nextCurr, new int[]{candidate, freq - 1});

            // continue the exploration with the updated combination
            backtrack(comb, target - candidate, nextCurr, hashmap, results);

            // backtrack the changes, so that we can try another candidate
            hashmap.set(nextCurr, new int[]{candidate, freq});
            comb.removeLast();
        }
    }
}
    public static void main(String[] args) 
    {
        
    }
    
}

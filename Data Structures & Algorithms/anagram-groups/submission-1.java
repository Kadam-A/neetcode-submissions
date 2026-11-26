class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //need a way to represent each anagram group? 
        // use hashmap, key will rep the anagram, 
        // the value will be the group represented by an arraylist that grows dynamically

        //first check length
        //check letters,
        //could go with array approach, create rep array then its 
        //emptied at ech next word in arrasy and a match represents a group anagram, but array seems heavy
        // it will be K * m for space compliexity. 
        //but arrays are difficult to compare? but its fconstant time.

        Map<String,ArrayList<String>> groups = new HashMap<>();
        for (String s : strs) {

            int[] rep = new int[26];
            //create rep
            for (char c : s.toCharArray()) {
                int pos = c - 'a';
                rep[pos] += 1;
            }

            String key = Arrays.toString(rep);
            groups.computeIfAbsent(key,f -> new ArrayList<>()).add(s);

        }

        return new ArrayList<>(groups.values()) ;
    }
}

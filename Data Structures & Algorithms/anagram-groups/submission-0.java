class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        

        Map<String, List<String>> groupAnams = new HashMap<>();

        for (String word: strs) {

            String frequencyKey = getFrequencyKey(word);

            if (groupAnams.containsKey(frequencyKey)) {
                groupAnams.get(frequencyKey).add(word);
            } else {
                groupAnams.put(frequencyKey, new ArrayList<>(Arrays.asList(word)));
            }

        }

        return new ArrayList<>(groupAnams.values());
    }

    private String getFrequencyKey( String word) {

        int[] freq = new int[26];

        for (char c: word.toCharArray()) {
            freq[c - 'a']++;
        }

        return Arrays.toString(freq);
    }
}

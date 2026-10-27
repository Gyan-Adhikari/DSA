class Solution {
    public int maxVowels(String s, int k) {
        int maxVowels = 0;
        int windowVowels = 0;

        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i');
        vowels.add('o'); vowels.add('u');

        // First window (indices 0 to k-1)
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i)))
                windowVowels++;
        }

        maxVowels = windowVowels;

        // Slide the window
        for (int i = k; i < s.length(); i++) {
            if (vowels.contains(s.charAt(i - k)))   // leaving character
                windowVowels--;

            if (vowels.contains(s.charAt(i)))       // entering character
                windowVowels++;

            maxVowels = Math.max(maxVowels, windowVowels);
        }

        return maxVowels;
    }
}
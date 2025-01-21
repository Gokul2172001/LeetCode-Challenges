
class Solution {

	public String[] findWords(String[] words) {
    
		Set<Character> row1 = new HashSet<>(Arrays.asList('q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'));
        Set<Character> row2 = new HashSet<>(Arrays.asList('a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'));
        Set<Character> row3 = new HashSet<>(Arrays.asList('z', 'x', 'c', 'v', 'b', 'n', 'm'));
        
        List<String> result = new ArrayList<>();
        
        for (String word : words) {
            String lowerCaseWord = word.toLowerCase();
            
            Set<Character> currentRow = getRow(lowerCaseWord.charAt(0), row1, row2, row3);
            
            boolean canBeTyped = true;
            for (char c : lowerCaseWord.toCharArray()) {
                if (!currentRow.contains(c)) {
                    canBeTyped = false;
                    break;
                }
            }
            
            if (canBeTyped) {
                result.add(word);
            }
        }
        
        return result.toArray(new String[0]);
    }

    private Set<Character> getRow(char c, Set<Character> row1, Set<Character> row2,         Set<Character> row3) {
        if (row1.contains(c)) {
            return row1;
        } else if (row2.contains(c)) {
            return row2;
        } else {
            return row3;
        }
    }
}
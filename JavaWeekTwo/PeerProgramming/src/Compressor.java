public class Compressor {
	
	private String[] spaces;
	private int iteration;

    public void compress(String inputString) {
    	
        String[] words = inputString.split(" ");
        String[] compWords = new String[words.length];
        spaces = new String[words.length];
        
        compWords[0] = words[0];

        for (int i = 0; i < words.length - 1; i++) {

        	iteration = i;
            compWords[i + 1] = deleteOverlap(new StringBuilder(words[i]), new StringBuilder(words[i + 1]));
        }

        System.out.println(genString(compWords));
    }

    private String genString(String[] compWords) {
        StringBuilder s = new StringBuilder();
        //for (String e : compWords){
        for (int i = 0; i < compWords.length; i++) {
        	if (spaces[i] != null) {
        		s.append(compWords[i] + " ");
        	}
        	else {
        		s.append(compWords[i]);
        	}
        }
        return s.toString();
    }

    private String deleteOverlap(StringBuilder word1, StringBuilder word2) {
        int count = 0;
        for (int i = 0; i < word1.length(); i++){

            if (word1.charAt(i) == word2.charAt(0)){

                if (i != word1.length() - 1){
                    count = findCountOfOverlap(i, word1, word2);
                }
                else count = 1;
            }
        }
        
        if (count == 0) {
        	int j = getIteration();
        	spaces[j] = " ";
        }
        return word2.delete(0, count).toString();
    }

    private int getIteration() {
		return iteration;
	}

	private int findCountOfOverlap(int i, StringBuilder word1, StringBuilder word2) {
    	int index = 0;
    	int count = 0;
    	while (word1.charAt(i) == word2.charAt(index)){
            count++;
            if (i == word1.length() - 1 || index == word2.length() - 1){
                return count;
            }
            else {
                index++;
                i++;
            }
        }
    	return 0;
    }
}

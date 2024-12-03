class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
       
        int n = sentence.length();
        int m = searchWord.length();
        String arr[] = sentence.split(" ");
        for (i = 0; i < n ; i ++) {
            String word = sentence[i];
                if(m <= word.length() && word.substring(0, m).equals(searchWord) ) {
                    return i + 1;
                }
            }

        }
        return -1;



    }
}

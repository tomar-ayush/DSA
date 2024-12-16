class Solution {
    public int maximumLength(String s) {

        HashMap<Pair<Char, Integer> , Integer> mp = new HashMap()<>;
        int maxLen = 0;

        for (int i = 0; i < s.length(); i++) {
            
            int len = 1;
            mp[{s.charAt(i), len}]++;
            for (int j = i + 1; j < n; j++) {
                
                if(s.charAt(j) == s.charAt(j - 1)) {
                    len++;
                    mp[{s.charAt(j), len}] ++;
                } else {
                        break;
                }

            }

            if(mp[{s.charAt(i), len}] >= 3) {
                        Math.max(maxLen, len);
                    }

        }

        return maxLen == 0 ? -1 : maxLen;
        
    }
}

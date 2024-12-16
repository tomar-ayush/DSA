class Solution {
    public String addSpaces(String s, int[] spaces) {
        
        int i = 0, n = spaces.length;
        int ptr = 0;
        StringBuilder sol = new StringBuilder();
        int prev = 0;
        while( i < n ) {
           
           ptr = spaces[i]; 
            sol.append(s.substring(prev, ptr));
            sol.append(" ");
            prev = ptr;
            i++;
            

        }

        sol.append(s.substring(prev, s.length()));
        return sol.toString();

    }
}

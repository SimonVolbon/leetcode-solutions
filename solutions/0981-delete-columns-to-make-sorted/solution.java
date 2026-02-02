class Solution {
    public int minDeletionSize(String[] strs) {
        int count = 0;
        for(int i = 0; i <= strs[0].length() - 1; i++) {
            for(int j = 0; j < strs.length - 1; j++ ) {
                if(strs[j+1].charAt(i) < strs[j].charAt(i)) {
                    count = count + 1;
                    break;
                }  
            }
        }
        return count;
    }
}

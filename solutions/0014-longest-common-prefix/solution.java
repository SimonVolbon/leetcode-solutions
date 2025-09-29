class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];

        String sub = "";
        for(int i = 1; i <= strs[0].length(); i++) {
            String estSub = strs[0].substring(0,i);
            //System.out.println(estSub);
            for(int j = 0; j < strs.length; j++){

                if(strs[j].length() < i) return sub;

                if(strs[j].substring(0,i).equals(estSub) == false) return sub;
            }
            sub = estSub;
        }

        //System.out.println("Finished with: " + sub);

        return sub;
    }
}

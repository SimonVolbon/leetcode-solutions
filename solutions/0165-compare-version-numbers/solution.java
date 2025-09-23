class Solution {
    public int compareVersion(String version1, String version2) {
        String[] splited1 = version1.split("[\\.]");
        String[] splited2 = version2.split("[\\.]");
        
        int len1 = splited1.length;
        int len2 = splited2.length;
        int bound = len1 > len2 ? len1 : len2;

        for(int i = 0; i < bound; i++) {

            int num1 = len1 > 0 ? Integer.parseInt(splited1[i]) : 0;
            int num2 = len2 > 0 ? Integer.parseInt(splited2[i]) : 0;

            if(num1 > num2) return 1;
            if(num1 < num2) return -1;
        
            len1--;
            len2--;
        }
        return 0;
    }
}

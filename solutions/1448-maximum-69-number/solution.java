class Solution {
    public int maximum69Number (int num) {
        char[] charNum = String.valueOf(num).toCharArray();

        for(int i = 0; i < charNum.length; i++)
        {
            if(charNum[i] == '6') {
                charNum[i] = '9';
                return Integer.parseInt(new String(charNum)); 
            }
        }
        
        return num;
    }
}

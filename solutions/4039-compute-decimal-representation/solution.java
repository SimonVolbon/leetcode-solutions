class Solution {
    public int[] decimalRepresentation(int n) {
        int size = String.valueOf(n).length();
        List<Integer> ans = new ArrayList<>();
        for(int i = 1; i <= size; i++) {
            int component = n % (int) (Math.pow(10, i));
            if(component > 0) {
                ans.add(component);
                n = n - component; 
            } 
            //System.out.println(n);
        }

        Collections.reverse(ans);
        return ans.stream()
                .mapToInt(Integer::intValue) // Map Integer objects to primitive int
                .toArray();
    }
}

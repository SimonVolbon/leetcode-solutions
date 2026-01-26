class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int n = arr.length;
        List<List<Integer>> solution = new ArrayList<List<Integer>>();
        Arrays.sort(arr);
        int min = 999999999;
        for(int i = 0; i < arr.length - 1; i++) {
            int diff = Math.abs(arr[i] - arr[i+1]);
            if(diff == min) {
                solution.add(List.of(arr[i], arr[i+1]));
            }

            if(diff < min) {
                min = diff;
                solution.clear();
                solution.add(List.of(arr[i], arr[i+1]));
            }
        }

        return solution;
    }
}

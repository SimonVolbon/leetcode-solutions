class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> res = Arrays.asList(words);
        boolean changed;
        
        do {
            changed = false;
            if (res.size() < 2) {
                break;
            }
            
            List<String> newWords = new ArrayList<>();
            int i = 0;
            
            while (i < res.size()) {
                if (i + 1 < res.size()) {
                    String current = res.get(i);
                    String next = res.get(i + 1);

                    if (isAnagramm(current, next)) {
                        newWords.add(current); 
                        i += 2; 
                        changed = true;
                    } else {
                        newWords.add(current);
                        i += 1;
                    }
                } else {
                    newWords.add(res.get(i));
                    i += 1;
                }
            }
            
            if (changed) {
                res = newWords;
            } else {
                break;
            }

        } while (changed);

        return res;
    }

    public Boolean isAnagramm(String a, String b) {
        char[] c1 = a.toLowerCase().toCharArray();
        char[] c2 = b.toLowerCase().toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        return Arrays.equals(c1, c2);
    }
}

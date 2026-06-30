class Solution {
    public boolean isAnagram(String s, String t) {
        String[] sArr = s.split("");
        String[] tArr = t.split("");
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        String sSorted = Arrays.toString(sArr);
        String tSorted = Arrays.toString(tArr);

        return sSorted.equals(tSorted);
    }
}

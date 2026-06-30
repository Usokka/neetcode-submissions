class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> strMap = new HashMap<>();

        for(String str:strs){
            String[] sArr = str.split("");
            Arrays.sort(sArr);
            String strSorted = Arrays.toString(sArr);
            
            List<String> anagList = strMap.get(strSorted);
            if(anagList == null){
                anagList = new ArrayList<>();
            }
            anagList.add(str);
            strMap.put(strSorted,anagList);
        }
        return new ArrayList<>(strMap.values()); 
    }
}

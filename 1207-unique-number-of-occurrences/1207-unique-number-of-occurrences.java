class Solution {
    public boolean uniqueOccurrences(int[] arr) {
     
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr){
            if(map.containsKey(i)){
                int value=map.get(i);
                map.replace(i, value+1);
            }else{
                map.put(i,1);
            }
        }
        
        List<Integer> values = new ArrayList<>(map.values());
        
        Set<Integer> set=new HashSet<>();
        
        for(int i : values){
            if(set.contains(i)){
                return false;
            }
            set.add(i);
        }
        
        return true;
    }
}
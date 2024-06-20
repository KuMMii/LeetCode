class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        Set<Integer> set1=new HashSet<>();
        for(int i : nums1){
            set1.add(i);
        }
        
        Set<Integer> set2=new HashSet<>();
        for(int i : nums2){
            set2.add(i);
        }
        
        List<Integer> list1=new ArrayList<>(set1);
        List<Integer> list2=new ArrayList<>(set2);
        
        for(int i=list1.size()-1; i>=0; i--){
            if(set2.contains(list1.get(i))) {list1.remove(list1.get(i));}
        }
        
        for(int i=list2.size()-1; i>=0; i--){
            if(set1.contains(list2.get(i))) {list2.remove(list2.get(i));}
        }
        
        
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(list1);
        ans.add(list2);
        
        return ans;
        
        
        
    }
}
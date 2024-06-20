class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        return Arrays.asList(setToArray(nums2,nums1), setToArray(nums1,nums2));
        
    }
    
    public List<Integer> setToArray(int[] arr1, int[] arr2){
        
        Set<Integer> set1=new HashSet<>();
        for(int i : arr1){
            set1.add(i);
        }
        
        Set<Integer> set2=new HashSet<>();
        for(int i : arr2){
            if(!set1.contains(i)){ set2.add(i); }
        }
        
        return new ArrayList<>(set2);
        
    }
}
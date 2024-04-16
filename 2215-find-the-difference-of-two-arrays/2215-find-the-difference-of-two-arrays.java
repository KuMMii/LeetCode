class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getList(nums1,nums2),getList(nums2,nums1));
    }
    
    public List<Integer> getList(int[] arr1, int[] arr2){
        
        Set<Integer> setArr1=new HashSet<>();
        
        Set<Integer> setArr2=new HashSet<>();
        for(int i : arr2){
            setArr2.add(i);
        }
        
        for(int i : arr1){
            if(!setArr2.contains(i)){
                setArr1.add(i);
            }
        }
        
        return new ArrayList<>(setArr1);
        
    }
}
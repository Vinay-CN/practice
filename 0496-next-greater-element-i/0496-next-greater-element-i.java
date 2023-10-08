class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
    int[] re = new int[nums1.length];
    Map<Integer, Integer> m = new HashMap<>();
    
    for(int i = 0;i < nums2.length;i++) {
        m.put(nums2[i], i);
    }

    for(int i = 0;i < nums1.length;i++) {
        re[i] = -1;
        for(int j = m.get(nums1[i]) + 1;j < nums2.length;j++) {
            if(nums2[j] > nums1[i]) {
                re[i] = nums2[j];
                break;
            }
        }
    }

    return re;
}
}
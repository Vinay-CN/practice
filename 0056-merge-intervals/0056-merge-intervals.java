class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> al = new ArrayList<>();
        //it will sort based on starting point if two sp are equal then takes end point as a , b
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]); 
        int sp = intervals[0][0];
        int ep = intervals[0][1];
        for(int[] interval : intervals){
            
            if( interval[0] <= ep ){
                ep = Math.max(ep,interval[1]);
            }
            else{
                al.add(new int[]{sp,ep});
                sp = interval[0];
                ep = interval[1];
            }
        }

        al.add(new int[]{sp,ep});
        return al.toArray(new int[0][1]);
    }
}





// class Solution {
//     public int[][] merge(int[][] intervals) {
        
//          List<int[]> res = new ArrayList<>();

//         if(intervals.length == 0 || intervals == null){
//         return res.toArray(new int[0][]);
//         }
//         Arrays.sort(intervals,(a,b)-> a[0]-b[0]);
//         int start = intervals[0][0];
//         int end = intervals[0][1];
//         for(int[] i : intervals){
//             if(i[0] <= end){
//                 end = Math.max(end,i[1]);
//             }else{
//                 res.add(new int[]{start,end});
//                 start = i[0];
//                 end = i[1];
//             }
//         }
//         res.add(new int[]{start,end});
//         return res.toArray(new int[0][1]);
//     }
// }
  
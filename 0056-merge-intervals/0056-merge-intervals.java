class Solution {
    public int[][] merge(int[][] intervals) {
        LinkedList<int[] > li = new LinkedList<>();
        //sort the array
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        for(int[] interval : intervals){
            //if list is empty or the previous pair ep < curr sp  , add new pair
            //li.getLast()[1] will give last pair ep and compare with current point if (1,6) and 
            //curr is (7,8) 6 < 7 add the current pair to list
            if(li.isEmpty() || li.getLast()[1] < interval[0]){
                li.add(interval);
            }
            //or just update the end point 
            //if (1,6) and curr is (3 , 7) //overlapping and get the max as ep
            else{
                li.getLast()[1] = Math.max(li.getLast()[1],interval[1]);
            }
        }

        return li.toArray(new int[0][1]);
    }
}

/*class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> al = new ArrayList<>();
        //it will sort based on starting point if two sp are equal then takes end point as a , b
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]); 
        int sp = intervals[0][0];
        int ep = intervals[0][1];
        for(int[] interval : intervals){
            //if current sp is less than or equla to previous ep  means overlapping
            //so take max of two ep as ep
            if( interval[0] <= ep ){
                ep = Math.max(ep,interval[1]);
            }
            //if current sp > previous ep means not overlapping add them to list and assign new sp and ep
            else{
                al.add(new int[]{sp,ep});
                sp = interval[0];
                ep = interval[1];
            }
        }
        //at last one sp and ep will be left that we need to add explicitly
        al.add(new int[]{sp,ep});
        return al.toArray(new int[0][1]);
    }
}*/




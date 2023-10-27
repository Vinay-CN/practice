class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer > hs = new HashSet<>();
       for(int num : nums) hs.add(num);
       int longStreak = 0;

       for(int num : nums){

           if(hs.contains(num - 1) == false) //i am the starting point for the streak
           {
               int currStreak = 1;
               int currNum = num;
               while(hs.contains(currNum+1)){
                   currStreak++;
                   currNum +=1;
               }
                longStreak = Math.max(longStreak, currStreak);
           }
          
       }
        return longStreak;

    }

}
// class Solution {
//     public int longestConsecutive(int[] nums) {
        
//         if(nums.length==0) return 0;
//         HashSet<Integer> hs = new HashSet<>();
//         for(int i = 0 ; i < nums.length;i++){
//             hs.add(nums[i]);
//         }
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{
//            return a-b;
//        }) ;

//        for(int ele : hs){
//            pq.add(ele);
//        }

//        int prev = pq.remove();
//        int maxCount = 0 ;
//        int currCount= 0 ;
//        while(pq.size()>0){
//            int curr = pq.remove();
//            if(curr==prev+1){
//                currCount++;
//                if(currCount>maxCount){
//                    maxCount = currCount;
//                }
               
//            }
//            else{
//                currCount = 0;
//            }
//            prev = curr;
//        }
//        return maxCount+1;
//     }
// }
class Solution {
    public double averageWaitingTime(int[][] customers) {
        int totalTime = 0;
        double avg = 0;
        for(int[] curr : customers){
            int aT = curr[0];
            int cT = curr[1];
            if(aT>totalTime) totalTime = aT; // cook was free after 15 and new arrived at 20 so we take total as him
            totalTime+=cT; // add the cooking time + total time and sub with my arrival time
           
            avg+= totalTime - aT;
        }
        return avg/customers.length ;
    }
}
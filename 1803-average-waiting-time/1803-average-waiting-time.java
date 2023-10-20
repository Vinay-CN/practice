class Solution {
    public double averageWaitingTime(int[][] customers) {
        int totalTime = 0;
        double avg = 0;
        for(int[] curr : customers){
            int aT = curr[0];
            int cT = curr[1];
            if(aT>totalTime) totalTime = aT;
            totalTime+=cT;
           
            avg+= totalTime - aT;
        }
        return avg/customers.length ;
    }
}
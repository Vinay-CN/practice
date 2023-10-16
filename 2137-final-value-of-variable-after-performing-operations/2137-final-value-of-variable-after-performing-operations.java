// class Solution {
//     public int finalValueAfterOperations(String[] operations) {
//         int ans = 0 ;
//         for(int i = 0 ; i < operations.length;i++)
//         {
//             String temp  = operations[i];
//             if(temp.charAt(0) == '+' || temp.charAt(2) =='+') ans++;
//             else ans--;
//         }

//         return ans;
//     }
// }

class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for(String o : operations) x += (44 - o.charAt(1)); //asci code of + is 43 and -  is 45  so 44 - 43 is 1 and 44-45 = -1
        return x;
    }
}
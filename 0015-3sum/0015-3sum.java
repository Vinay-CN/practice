class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length ;
        Arrays.sort(nums);
        int i = 0 ;
        int target = 0 ;
        while(i < n){
            int remTarget = target - nums[i];
            
            int l = i+1 ;
            int r = n -1 ;
            while(l < r ){
              
                int currSum = nums[l] + nums[r];
                 // System.out.println(remTarget + "  " +currSum);
                if(currSum == remTarget){
                    List<Integer> li = new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[l]);
                    li.add(nums[r]);
                    ans.add(li);
                    int prevL = nums[l];
                    while(l<r && nums[l] == prevL) l++;
                    int prevR = nums[r];
                    while(r>l && prevR == nums[r]) r--;
                                                
                }
                else if(currSum > remTarget){
                     int prevR = nums[r];
                    while(r>l && prevR == nums[r]) r--;
                }
                else{
                     int prevL = nums[l];
                    while(l<r && nums[l] == prevL) l++;
                }
            }
            int prevI = nums[i];
            while(i<n && nums[i] == prevI)  i++;
           
        }
        return ans;
    }
}
/*class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
    int n = arr.length ;
       Arrays.sort(arr); 
       int i = 0 ;
       List<List<Integer>> ans= new ArrayList<>();
       while(i < n)
       {
           int mysum= 0-arr[i]; //target - arr[i] will be mu new target a+b+c = 0 --> b+c = 0-a;
           int l = i+1 ; //l will start from  i+1 ;
           int r = n-1; // r will be end pointer
           while(l<r)   
           {
              int sum = arr[r]+arr[l]; //b+c ;
              if(sum == mysum) // b+c == t- a;
              {
                  ArrayList<Integer> al = new ArrayList<>();
                  al.add(arr[i]); //add i
                  al.add(arr[l]); //add l
                  al.add(arr[r]); //add r
                ans.add(al); //add list
                int prevr = arr[r];
                while(r > 0 && arr[r] == prevr) r--; //decrement r to next different value to avoid duplicates in list
                int prevl = arr[l];
                while(l < r && arr[l] == prevl ) l++; //increment l t0 next different value
             }
             else if(sum<mysum) //if(b+c<t-a)
             {
                int prevl = l; //increment l
                while(l < r && arr[l] == arr[prevl] ) l++;
             } 
             else
             {   //if b+c > t - a
                  int prevr = r; //
                while(r > l && arr[r] == arr[prevr]) r--;
             }
           }
            int previ = arr[i];
            while(i < n && arr[i] == previ) i++; //increment i
       }
       return ans; //return ans;
    }
}*/
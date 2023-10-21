
class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; i++){
            
            int rem = ((arr[i]%k)+k)%k;//to convert to positive
            
            map.put(rem,map.getOrDefault(rem,0)+1);
            }
        
        
        for(int key : map.keySet()) {
    		
    		
    		if(key == 0) {
    			
    			if(map.get(key)%2!=0) //if zero means i will not have pair so i want to make sure i am even
    				return false;
    		}
    		
    		else if(!map.get(key).equals(map.get(k-key)))  //i will copmare my rem to key - rem : 2 5 - 3 = 2 both must be same
    			return false;
    	}
        
        return true;
        
    }
}
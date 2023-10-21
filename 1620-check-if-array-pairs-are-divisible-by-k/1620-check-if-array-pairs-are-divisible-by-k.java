
class Solution {
    public boolean canArrange(int[] arr, int k) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < arr.length; i++){
            
            int rem = ((arr[i]%k)+k)%k;
            
            map.put(rem,map.getOrDefault(rem,0)+1);
            }
        
        
        for(int key : map.keySet()) {
    		
    		
    		if(key == 0) {
    			
    			if(map.get(key)%2!=0)
    				return false;
    		}
    		
    		else if(!map.get(key).equals(map.get(k-key)))
    			return false;
    	}
        
        return true;
        
    }
}
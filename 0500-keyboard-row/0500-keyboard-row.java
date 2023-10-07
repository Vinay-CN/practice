class Solution {

    public  boolean con(String s , HashSet<Character> hm){

	   for(int i = 0 ; i < s.length() ; i++ ){
		   boolean ans = hm.contains(s.charAt(i));
		   if(ans == false) return false;
	   }
	   return true;
   }


    public String[] findWords(String[] words) {
     //int[] charRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
        ArrayList<String> al = new ArrayList<>();
		HashSet<Character> hm1 = new HashSet<>();
		HashSet<Character> hm2 = new HashSet<>();
		HashSet<Character> hm3 = new HashSet<>();
		String s1 = "qwertyuiopQWERTYUIOP";
		String s2 = "asdfghjklASDFGHJKL";
		String s3 = "zxcvbnmZXCVBNM";
		for(int i = 0 ; i < s1.length();i++){
			hm1.add(s1.charAt(i));
		}
		for(int i = 0 ; i < s2.length();i++){
			hm2.add(s2.charAt(i));
		}
		for(int i = 0 ; i < s3.length();i++){
			hm3.add(s3.charAt(i));
		}
		for(String a : words){    
            	if(con(a,hm1) || con(a,hm2) || con(a,hm3) ) al.add(a);   
			}

		String[] ans = new String[al.size()];
        for(int i = 0 ; i < ans.length ; i++) ans[i]=al.get(i);
         
         return ans;
		}
    }

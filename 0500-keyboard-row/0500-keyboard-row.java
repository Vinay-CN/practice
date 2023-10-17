// class Solution {

//     public  boolean con(String s , HashSet<Character> hm){

// 	   for(int i = 0 ; i < s.length() ; i++ ){
// 		   boolean ans = hm.contains(s.charAt(i));
// 		   if(ans == false) return false;
// 	   }
// 	   return true;
//    }


//     public String[] findWords(String[] words) {
//      //int[] charRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
//         ArrayList<String> al = new ArrayList<>();
// 		HashSet<Character> hm1 = new HashSet<>();
// 		HashSet<Character> hm2 = new HashSet<>();
// 		HashSet<Character> hm3 = new HashSet<>();
// 		String s1 = "qwertyuiopQWERTYUIOP";
// 		String s2 = "asdfghjklASDFGHJKL";
// 		String s3 = "zxcvbnmZXCVBNM";
// 		for(int i = 0 ; i < s1.length();i++){
// 			hm1.add(s1.charAt(i));
// 		}
// 		for(int i = 0 ; i < s2.length();i++){
// 			hm2.add(s2.charAt(i));
// 		}
// 		for(int i = 0 ; i < s3.length();i++){
// 			hm3.add(s3.charAt(i));
// 		}
// 		for(String a : words){    
//             	if(con(a,hm1) || con(a,hm2) || con(a,hm3) ) al.add(a);   
// 			}

// 		String[] ans = new String[al.size()];
//         for(int i = 0 ; i < ans.length ; i++) ans[i]=al.get(i);
         
//          return ans;
// 		}
//     }




// static ArrayList<String> getStrings(ArrayList<String> arr)
// {
//     // Your Code Here
//     int[] charRow = new int[]{2, 3, 3, 2, 1, 2, 2, 2, 1, 2, 2, 2, 3, 3, 1, 1, 1, 1, 2, 1, 1, 3, 1, 3, 1, 3};
//     ArrayList<String> result = new ArrayList<String>();
//     for(int i = 0; i < arr.size(); i++){
//         String cur = arr.get(i);   //get the string();
//         Set<Integer> temp = new HashSet<Integer>();
//         int len = cur.length();  //get the length of the word
//         for(int j = 0; j < len; j++)
//             temp.add(charRow[cur.charAt(j) - 'a']); // and add the row number to the map and 
//             //check if the map size is 1 then it belongs one row only
//         if(temp.size() == 1) result.add(cur);
//     }

//     return result;
// }

class Solution {
    public String[] findWords(String[] words) {
        String one = "qwertyuiopQWERTYUIOP";
        String two = "asdfghjklASDFGHJKL";
        String three = "zxcvbnmZXCVBNM";
        List<String> list = new LinkedList<>();
        for(int i=0;i<words.length;i++){
            if(check(words[i],one) || check(words[i],two) || check(words[i],three)){
                list.add(words[i]);
            }
        }
        
        return list.toArray(new String[0]);
    }
    public boolean check(String s,String checker){
        boolean temp = true;
        for(char c : s.toCharArray()){
            boolean isTrue = false;
            for(char ch : checker.toCharArray()){
                if(c == ch){
                    isTrue = true;
                    break;
                }
            }
            if(!isTrue){
                return false;
            }
        }
        return temp;

    }
}



// class Solution {
//     public String[] findWords(String[] words) {
//         String s1 = "qwertyuiopQWERTYUIOP";
//         String s2 = "asdfghjklASDFGHJKL";
//         String s3 = "zxcvbnmZXCVBNM"; 
//         ArrayList<String> list = new ArrayList<>();
//         for(int i=0;i<words.length;i++){
//             int count1=0,count2=0,count3=0,len=words[i].length();
//             for(int j=0;j<len;j++){
//                 if(s1.contains(Character.toString(words[i].charAt(j))))
//                     count1++;
//                 else if(s2.contains(Character.toString(words[i].charAt(j))))
//                     count2++;
//                 else if(s3.contains(Character.toString(words[i].charAt(j))))
//                     count3++;
//                 if(count1==len || count2==len || count3==len)
//                     list.add(words[i]);
//             }
//         }
//         String ans[] = new String[list.size()];
//         list.toArray(ans);
//         return ans;
//     }
// }
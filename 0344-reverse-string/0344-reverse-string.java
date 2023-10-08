class Solution {
    public void reverseString(char[] s) {
        rec(s,0,s.length-1);
    }
    
    public void rec(char[] s , int b , int e){
        if(b>=e) return;
        char temp = s[b];
        s[b] = s[e];
        s[e] = temp;
        rec(s,b+1,e-1);
    }
}
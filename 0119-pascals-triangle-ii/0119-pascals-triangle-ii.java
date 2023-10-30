class Solution {
    public List<Integer> getRow(int n) {
        List<Integer> ans1 = new ArrayList<>();
        n = n + 1;
         long ans = 1;
         ans1.add((int)ans);
        // Printing the rest of the part:
        for (int i = 1; i < n; i++) {
            ans = ans * (n - i);
            ans = ans / i;
            ans1.add((int)ans);
        }
        return ans1;
    }
}
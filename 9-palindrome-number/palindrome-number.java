class Solution {
    public boolean isPalindrome(int x) {

        if(x < 0 ) return false;
        
        int rev = 0;
        int original = x;
        while(x!=0){
            int last = x%10;
            rev = rev*10 + last;
            x = x/10;
        }
        return rev == original;
    }
}
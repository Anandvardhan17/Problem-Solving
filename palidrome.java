class palidrome {
    public static boolean isPalindrome(int x) {
    	int ans =x;
        int y =0;
        while(!(x ==0)){
            y = y*10 + x%10;
            x=x/10;
        }
        if(y == ans ){
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
    	System.out.println(isPalindrome(121));
    }
}
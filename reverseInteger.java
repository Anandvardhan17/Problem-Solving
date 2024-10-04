class reverseInteger {
	public static int reverse(int x) {
	int y =0;
    while(!(x ==0)){
        y = y*10 + x%10;
        x=x/10;
    }
    if (y<Integer.MIN_VALUE || y>Integer.MAX_VALUE ){
        return 0;
    }
    else {
        return y;
    }
	}
    
    public static void main(String[] args) {
    	System.out.println(reverse(1534236469));
    }
}
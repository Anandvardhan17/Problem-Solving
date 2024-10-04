class staticVariable {
    
    
    public static void main(String[] args) {
    test t1 = new test();
    test t2 = new test();
    t1.setM(2);
    int k = t2.getM();
    System.out.println(k);
    }
}

class test{
    public  static int m;
    public void setM(int m){
        this.m = m;
    }
    public int getM(){
        return m;
    }
}

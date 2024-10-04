class A{
    public void show1(){
        System.out.println("A");
    }
}
class B extends A{
    public void show(){
        System.out.println("B");
    }
}
public class methodOverriding {
	public static void main(String[] args) {
		   
	       A obj = new B();
	       obj.show1();
	       
	       B obj1 = (B) obj  ;
	       obj1.show();
	    }
}

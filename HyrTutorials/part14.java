
package HyrTutorials;


public class part14 {
	static int id = 21; //static field //global variable declared outsisde the class
	String name="Chidanand"; //non-static Field //global variable
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int pincode; //defining
//		pincode=517001;	//initializing	
//		pincode=517002; //overwriting or re-assigning
//		System.out.println(pincode);
		//part14 studentid=new part14();
		
		//_ , $ symbols can be used in variable name
		
		
		System.out.println(id);
	    System.out.println(new part14().name);	
	    int weight=60; //local variable only accessed after the declaration and used inside the class
	    System.out.println("weight: "+ weight);
	    test1(60);
	}
	public static void test1(int weight) {
		System.out.println(id);
		System.out.println(weight);
		
	}
}

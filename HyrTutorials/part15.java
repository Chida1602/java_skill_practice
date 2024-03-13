package HyrTutorials;

/**
 * class is used for performing operations on bloodbank
 * @author chidanand
 */
public class part15 {
	static int currentunits=25;
	
	public static void greetEmployee() {   //static method
		System.out.println("Welcome to Dedalus blood bank :)");
		
	} 
	/**
	 * class is used for donating operation on bloodbank
	 * @version 17.0.0
	 */
	
	public void donate (int unit ) {       //non-static method which will be access through objects
		currentunits= currentunits +unit;
		System.out.println("Blood Donated Successfully");
	}
	public static void requestBlood(int unit) {
		currentunits=currentunits - unit;
		System.out.println("Blood provided to Donar");
	}
	
	public int  getcurrentUnitOfBlood() {
		return currentunits;
	}
	public static void main(String[] args) {
		part15 bloodcamp=new part15();
		greetEmployee(); //calling the method in main method
		System.out.println("current blood units in bloodbank "+bloodcamp.getcurrentUnitOfBlood());
		bloodcamp.donate(2);
		System.out.println("current blood units in bloodbank "+bloodcamp.getcurrentUnitOfBlood());
		requestBlood(1);
		System.out.println("current blood units in bloodbank "+bloodcamp.getcurrentUnitOfBlood());
		
	}

}

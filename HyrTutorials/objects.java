package HyrTutorials;

public class objects {
    int i=16;
    int j=20;
    
	public objects() {
		i=16;
		j=20;
		
	}
	public objects(int i,int j) {
		this.i=i;
		this.j=j;
	}

	public static void main(String[] args) {
		
		objects obj1=new objects(); //syntax for parameterless constructor
		objects obj2=new objects(16,20);   //parameterized constructor
		objects obj3=new objects(60,60);		
		objects obj4=new objects(56,45);
		System.out.println(obj1.add());
		System.out.println(obj2.add());
		System.out.println(obj3.add());
		System.out.println(obj4.add());

	}
	public int add() {
	    return i+j;
	}
}

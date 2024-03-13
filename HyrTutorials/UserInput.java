package HyrTutorials;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		Scanner userinput=new Scanner(System.in);
		System.out.println("What is your name ?");
		String name=userinput.nextLine();
		System.out.printf("Hey %s,How are you ? %n",name);
		String Status=userinput.nextLine();
		System.out.println("What is your age ?");
		int age=userinput.nextInt();
		System.out.println("Thankyou for the information");
		userinput.close();
    }
}

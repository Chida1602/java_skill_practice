package HyrTutorials;

import java.util.Scanner;

public class ConditionalStatements {

	public static void main(String[] args) {
		
		//nested-switch
		Scanner ei=new Scanner(System.in);
		System.out.print("Enter the number of case:");
		int i=ei.nextInt();
		switch(i) {
		case 1:
			int j=4;
			switch(j){
			   case 4:
				   System.out.println("j value is 4,i value is 1");
				   break;	
			   default:
				   break; 
			}
			break;
		case 2:
			System.out.println("Case 2 is executed");
			break;
		case 3:
			System.out.println("Case 3 is executed");
			break;
		case 4:
			System.out.println("Case 4 is executed");
			break;
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
			System.out.println("switch Case is executed");
			break;
		default:
			System.err.println("none of the case is performed,bcoz of irrelavent case numver");
			break;
		
		}
//		//Switch 
////		//int i=5;
//		Scanner ei=new Scanner(System.in);
//		System.out.print("Enter the number of case:");
//		int i=ei.nextInt();
//		switch(i) {
//		case 1:
//			System.out.println("Case 1 is executed");
//			break;
//		case 2:
//			System.out.println("Case 2 is executed");
//			break;
//		case 3:
//			System.out.println("Case 3 is executed");
//			break;
//		case 4:
//			System.out.println("Case 4 is executed");
//			break;
//		case 5:
//		case 6:
//		case 7:
//		case 8:
//		case 9:
//			System.out.println("switch Case is executed");
//			break;
//		default:
//			System.err.println("none of the case is performed,bcoz of irrelavent case numver");
//			break;
//		}
		
		
		//nested if statement
//		Scanner userinput=new Scanner(System.in);
//		System.out.println("Enter the result of written exam ");
//		String examStatus=userinput.nextLine();
////		String examStatus ="Pass";
//		
//		if(examStatus == "Pass") {
//			System.out.println("Please wait for Further rounds");
//			String round1Status="Pass";
//			if(round1Status == "Pass") {
//				System.out.println("You have cleared round 1 ,plaese wait for the further rounds");
//				String round2Status="Pass";
//				if(round2Status == "Pass") {
//					System.out.println("You have cleared round 2 ,plaese wait for the HR round");
//				}
//				else {
//					System.out.println("You can go to home :(");
//				}
//			}
//			else {
//				System.out.println("You can go to home :(");
//			}
//		}
//		else {
//			System.out.println("You can go to home :(");
//		}
//      userinput.close();
		
		
		
		//if-else
//		Scanner userinput=new Scanner(System.in);
//		System.out.println("Enter the number: ");
//		int i=userinput.nextInt();
//		if(i>0) {
//			System.out.println("The given number is an Postive number");
//		}
//		else {
//			System.out.println("The given number is an Negative number");
//		}
//		userinput.close();
		
		//assignment-1:
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("Enter the number:");
//		int num=scanner.nextInt();
//		if(num%2==0) {
//			System.err.printf("%d is a Even Number",num);
//		}
//		else {
//			System.err.printf("%d is a odd Number",num);
//		}
//		scanner.close();
		
		
		//assignment-2:
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("");
//		int mark=scanner.nextInt();
//		if(mark>85) {
//			System.out.println("Student secured First class");
//		}
//		else if(mark >=70 && mark<=85) {
//			System.out.println("Student secured second class");	
//		}
//		else if(mark >35 && mark<=70) {
//			System.out.println("Student secured Third class");	
//		}
//		else if (mark==35) {
//			System.out.println("pass");
//		}
//		else {
//			System.err.println("Student is failed");
//		}
//		scanner.close();
		
		//assignment-3
//		Scanner scanner=new Scanner(System.in);
//		System.out.print("");
//		String day=scanner.nextLine();	    
//
//	    if (day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
//	            day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") ||
//	            day.equalsIgnoreCase("Friday")) {
//	        System.out.println("Uff, It's a Weekday");
//	    }
//	    else if (day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday")) {
//	        System.out.println("Yayy, It's a Weekend");
//	    } 
//	    else {
//	    	System.out.println("Invalid day entered");
//	     }
//		scanner.close();
		
	}
   
}

package HyrTutorials;

public class singledimensional {
	public static void main(String[] args) {

		//single dimensional Array
		
//	     int[] j= {1,2,3,4,5}; //defining an array
//	     
//	     int k[]=new int[5]; //initialization of array
//	     //index=Size of Array-1
//	     k[2]=1;
//	     k[3]=16;
//	     k[1]=02;
//	     k[0]=34;
//	     int sum=k[0]+ k[1]+k[2]+k[3]+k[4];
//	     System.err.println(sum);
//	     int i=0;
////	     for(i=0;i<k.length;i++ ) {
////	    	 System.out.print(k[i]+" ");
////	     }
//	     while(i<k.length) {
//	    	 System.err.print(k[i]+" ");
//	    	 i++;
//	    	 
//	     }
//	     System.out.println(" ");
//	     for(int x=0;x<j.length;x++) {
//	    	 System.out.print(j[x]+" ");
//	     }
		
		
		//assignment-1
		int j[]= {2,5,1,9,6};
		int sum=0;
		for(int i=0;i<j.length;i++) {
			sum+=j[i];
		}
		System.out.println(sum);
		
		
}
}
package core_java_exercises;
import java.util.*;
import java.io.IOException;

class holder_class extends main_class {
	
	
	    public void pattern2_temp(int n2) {           // template function used in draw2 and draw3
	    	for(int i=n2;i>=1;i--) {                  //Row for loop
	    		if(i%2 != 0) {                        //condition to check only odd no. of rows must get printed
	    			for(int j=1;j<i;j++) {            //White space for loop
	    				System.out.print(" ");
	    			}
	    			for(int z=n2;z>=i;z--) {          //Star for loop
	    				System.out.print("* ");      
	    			}
	    			System.out.println();
	    		}
	    	}	
	    }
	    
	    
	  
	
		public void draw1(int n1){		
				for(int i=n1; i>=1;i--) {                 //Row for loop
					if(i%2!=0) {                          //condition to check only odd no. of rows must get printed
						for(int j=n1;j>i;j--) {           //White space for loop
							System.out.print(" ");
						}
						for(int z=i;z>=1;z--) {           //Star for loop
							System.out.print("* ");
						}
						System.out.println();
					}
				}	
				System.out.println("\n");
				main(null);
		}
	
	
		public void draw2(int n2) {	
		    	pattern2_temp(n2);                        //calling template function
		    	System.out.println("\n");
				main(null);
		}
		
		
		public void draw3(int n3) {                     
	    	for(int i=(n3-1); i>=1;i--) {                  //Row for loop
				if(i%2!=0) {                          	   //condition to check only odd no. of rows must get printed
					for(int j=n3;j>i;j--) {          	   //White space for loop
						System.out.print(" ");
					}
					for(int z=i;z>=1;z--) {                //Star for loop
						System.out.print("* ");
					}
					System.out.println();
				}
			}	 	
	    	System.out.println("\n");
			main(null);
	    }
		
			
		public void draw4(int n4) {
			for(int i=0;i<=(n4/2)+1;i++) {                //upper triangle
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			for(int i=(n4/2);i>=0;i--) {	    		 //lower triangle
				for(int j=1;j<=i;j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("\n");
			main(null);
		}
		
		
		public void draw5(int n5) {
			for(int i=1;i<=(n5/2)+1;i++) {	            //upper triangle
				for(int j=(n5/2);j>=i;j--) {
					System.out.print("  ");
				}
			for(int k=1;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();	
		}
		for(int i=1;i<=(n5/2)+1;i++) {                   //upper triangle
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int z=(n5/2);z>=i;z--) {
				System.out.print("* ");
			}
			System.out.println();	
		 }	
		System.out.println("\n");
		main(null);
		}
		
		
	}


public class main_class {

	public static void main(String[] args) {

		holder_class obj = new holder_class();
		
		System.out.println("Please enter Function number [from 1-5] "
				           + "\n 1. Reverse Isosceles Triangle "
				           + "\n 2. Regular Isosceles Triangle"
				           + "\n 3. Kite shape pattern"
				           + "\n 4. Left Base Triangle"
				           + "\n 5. Right Base Triangle"
				           );
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		
		//Switch - case to select pattern number.
		
		switch(choice) {
			case 1:
				System.out.println("You have selected Reverse Isosceles Triangle, Please Enter an odd number");
				int n1 =sc.nextInt();
				obj.draw1(n1);
				break;
			case 2:
				System.out.println("You have selected Regular Isosceles Triangle, Please Enter an odd number");
				int n2 =sc.nextInt();
				obj.draw2(n2);
				break;
			case 3:
				System.out.println("You have selected Kite shape pattern, Please Enter an odd number");
				int n3 =sc.nextInt();
				obj.pattern2_temp(n3);              //Reusing pattern2_temp
				obj.draw3(n3);
				break;
			case 4:
				System.out.println("You have selected Left Base Triangle, Please Enter an odd number");
				int n4 =sc.nextInt();
				obj.draw4(n4);
				break;
			case 5:
				System.out.println("You have selected Right Base Triangle, Please Enter an odd number");
				int n5 =sc.nextInt();
				obj.draw5(n5);
				break;
			default:
				System.out.println("Please enter valid input");
				main(null);
				break;
		}
	}

}

import java.util.Scanner;


public class CreditCheck {
		
	public static void main(String[] args) {
		int addednum = 0;
		int addednum2 = 0;
		String creditcard;
		String good = " Credit card is valid";
		String decline = "Credit card is not valid";
		Scanner creditcardnumber = new Scanner(System.in);
		
		System.out.println("Type in your credit card number: ");
		creditcard = creditcardnumber.nextLine();
	
	for (int a = creditcard.length() -2 ; a > 0; a=a -2  ) {
		
	    	int mult = 2 * Character.getNumericValue(creditcard.charAt(a));
	    	
		    	String ToString= creditcard.substring(mult);
		    	
			    for (int b = 0; b < ToString.length(); b= b +1 ) {
			    	
			    	int x = Character.getNumericValue(ToString.charAt(b));
		    	
			    	addednum = addednum + x;
		    	
			    }
			    
		    }
	    
	   for (int c = creditcard.length() -1 ; c>0; c= c -2) {
		   
	    	addednum2 = addednum2 + Character.getNumericValue(creditcard.charAt(c));
	    	
	    }
	   
	    int final1 =  addednum+addednum2;

	    if (final1%10 == 0 ) {
	    	
	    System.out.println("Credit Card #" + creditcard + good);
	    
	    }   	  
		
	    else {
		
	    System.out.println("Credit Card #" + creditcard + decline);

		} 
	    System.out.println(final1);

	}				}

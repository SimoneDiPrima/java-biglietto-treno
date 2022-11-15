import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		
		

		   Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Quanti chilometri vuoi fare??");
	        System.out.print("\n");
	        double kilometers = sc.nextInt();
	        
	        
	        
	       
	        System.out.print("Quanti anni hai??");
	        System.out.print("\n");
	        double age = sc.nextInt();
	        double prezzo = (0.21*kilometers);
	        

	        if(age<=18){
	        	double tariffa = prezzo/20 ;
	        	double totale = prezzo - tariffa;
	        	System.out.println("il prezzo del biglietto per il ragazzo sara: " + totale + "€");
	        }
	        else if(age>=65) {
	        	double tariffa = prezzo/40 ;
	        	double totale = prezzo - tariffa;
	        	System.out.println("il prezzo del biglietto per il signore sara: " + totale + "€");
	        }
	        else {
	    		
	    		System.out.println("il prezzo del biglietto sara: " + prezzo + "€");
	    	}
}
	
}

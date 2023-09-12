/**
 * <p> The purpose of this class is to print out all of the programmer objects created.</p>
 * @author Braden Howard
 */
public class PaymeInterfaceTest  {
	/**
	 * 
	 * @param args (not used)
	 */
	public static void main(String[] args) {
		// Initialize
		Payme first = new Invoice("22776", "brakes", 3, 300.00);
		Payme second = new Invoice("3342", "gear", 5, 90.99);
		Payme sp = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320.00, null);
		Payme hp = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40.00, null);
		Payme cp = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500.00, 0.44, null);
		Payme bpcp = new BasePlusCommissionProgrammer("Braden", "Howard", "102-34-5888", 1200.00, 0.04, 720.00, null);
		// Array of programmers
		Payme[] paymeObjects = {first, second, sp, hp, cp, bpcp};

		 System.out.println(
		    "Payment for Invoices and Programmers are processed polymorphically:\n"); 
		
		 // Process each element in array paymeObjects
		 for (Payme currentPayme : paymeObjects) {
		    // Print out each objects toString 
		    System.out.printf("%s \n", currentPayme.toString()); 
		       
		    if (currentPayme instanceof BasePlusCommissionProgrammer) {

		       BasePlusCommissionProgrammer programmer = 
		          (BasePlusCommissionProgrammer) currentPayme;
		
		       double oldBaseSalary = programmer.getBaseSalary();
		       programmer.setBaseSalary(1.10 * oldBaseSalary);
		       System.out.printf(
		          "new base salary with 10%% increase is: $%,.2f\n",
		          programmer.getBaseSalary());// Format to 2 decimal places
		    } 
		 // Print each objects paymentAmount
		 System.out.printf("payment due: $%,.2f \n\n", currentPayme.getPaymentAmount());// Format to 2 decimal places	
	 	}
	}
}



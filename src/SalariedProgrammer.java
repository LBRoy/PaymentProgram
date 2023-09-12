/**
 * <p> The purpose of this class is to create a Salaried Programmer employee.</p>
 * @author Braden Howard
 */
public class SalariedProgrammer extends Programmer {
	private double weeklySalary;
	//constructor
	/**
	 * <p>This constructor sets the first name, last name, ssn, clearance level and weeklySalary of the salaried programmer.</p>
	 * @param firstName the first name of the salaried programmer
	 * @param lastName the last name of the salaried programmer
	 * @param socialSecurityNumber the social security number of the salaried programmer
	 * @param weeklySalary the weekly salary of the Salaried programmer
	 * @param clearance the clearance of the salaried programmer
	 * @throws IllegalArgumentException if weekly salary is not greater/equal to 0
	 */
	public SalariedProgrammer(String firstName, String lastName, 
	String socialSecurityNumber, double weeklySalary, ClearanceLevel clearance) {
	super(firstName, lastName, socialSecurityNumber, clearance); 
	
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	} 

	/**
	 * This method sets weeklySalary of this SalariedProgrammer.
	 * @param weeklySalary sets weeklySalary of this SalariedProgrammer
	 * @throws IllegalArgumentException if weekly salary is not greater/equal to 0
	 */
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
		  throw new IllegalArgumentException(
		     "Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	} 

	/**
	 * This method returns weeklySalary of this SalariedProgrammer.
	 * @return weeklySalary of this SalariedProgrammer
	 */
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	/**
	 * This method calculate earnings and returns Payment amount this SalaridProgrammer.
	 * @return PaymentAmount of this SalaridProgrammer
	 */
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             

	/**
	 * This method returns String of information for SalaridProgrammer.
	 * @return String of information for SalaridProgrammer
	 */
	@Override        
	public String toString() {
		return "salaried Programmer: " + super.toString() + String.format("\n%s%.2f",
				"Weekly salary: $",  getWeeklySalary());// Format to 2 decimal places
	}                                             
}


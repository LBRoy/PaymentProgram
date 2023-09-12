/**
 * <p> The purpose of this class is to create a HourlyProgrammer employee.</p>
 * @author Braden Howard
 */
public class HourlyProgrammer extends Programmer {
	// Declarations
	private double wage; // wage per hour
	private double hours; // hours worked for week
	//constructor
	/**
	 * <p>This constructor sets the first name, last name, ssn, clearance level, wage,
	 *  and hours of the HourlyProgrammer.</p>
	 * @param firstName the first name of the HourlyProgrammer
	 * @param lastName the last name of the HourlyProgrammer
	 * @param socialSecurityNumber the social security number of the HourlyProgrammer
	 * @param wage the wage of the HourlyProgrammer
	 * @param hours the hours of the HourlyProgrammer
	 * @param clearance the clearance level of the HourlyProgrammer
	 * @throws IllegalArgumentException if hourly wage is less than 0
	 * @throws IllegalArgumentException if hours is less than 0 or greater/equal to 168.0
	 */
	public HourlyProgrammer(String firstName, String lastName,
	String socialSecurityNumber,  double wage, double hours, ClearanceLevel clearance) {
	super(firstName, lastName, socialSecurityNumber, clearance);
		
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}
		
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
		this.wage = wage;
		this.hours = hours;
	} 
	
	/**
	 * This method sets the wage of the HourlyProgrammer.
	 * @param wage sets the wage of the HourlyProgrammer
	 * @throws IllegalArgumentException if wage is less than 0
	 */
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
		  throw new IllegalArgumentException(
		     "Hourly wage must be >= 0.0");
		}		
		this.wage = wage;
	} 
	
	/**
	 * This method returns the wage of the HourlyProgrammer.
	 * @return wage of the HourlyProgrammer
	 */
	public double getWage() {
		return wage;
	} 
	
	/**
	 * This method sets the hours of the HourlyProgrammer.
	 * @param hours sets the hours of the HourlyProgrammer
	 * @throws IllegalArgumentException if hours is less than 0 or greater/equal to 168.0
	 */
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
		  throw new IllegalArgumentException(
		     "Hours worked must be >= 0.0 and <= 168.0");
		}
	this.hours = hours;
	} 
	
	/**
	 * This method returns the hours of the HourlyProgrammer
	 * @return hours of the HourlyProgrammer
	 */
	public double getHours() {
		return hours;
	} 
	
	/**
	 * This method calculate earnings and returns Payment amount this HourlyProgrammer.
	 * @return PaymentAmount of this HourlyProgrammer
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
		  return getWage() * getHours();   
		}
			else {                                                             
			  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
			}
	}                                          
	
	/**
	 * This method returns String of information for HourlyProgrammer.
	 * @return String of information for HourlyProgrammer
	 */
	@Override                                                             
	public String toString() {
		return "hourly Programmer: " + super.toString() + String.format("\n%s%.2f%s%.2f", "hourly wage: $", getWage(), 
				"; hours worked: ", getHours());// Format to two decimal places
	}               
}


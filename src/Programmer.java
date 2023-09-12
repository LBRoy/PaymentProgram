/**
 * <p> The purpose of this class is to create a programmer employee.</p>
 * @author Braden Howard
 */
public abstract class Programmer implements Payme, SecurityClearance {
	
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private ClearanceLevel clearance;
	
	//three-argument constructor
	/**
	 * <p>This constructor sets the first name, last name, ssn and clearance level of the Programmer.</p>
	 * @param first the first name of the programmer
	 * @param last the last name of the programmer
	 * @param ssn the social security number of the programmer
	 * @param clearance the clearance level of the programmer
	 */
	public Programmer(String first, String last, String ssn, ClearanceLevel clearance) {
		this.firstName = first;
		this.lastName = last;
		this.socialSecurityNumber = ssn;
		this.clearance = clearance;
	}
	
	/**
	 * This method returns String of information for Programmer object
	 * @return String of information for Programmer object
	 */
	@Override
	public String toString() {
		return String.format("%s %s\n%s: %s",  
		  getFirstName(), getLastName(), "social security number", getSocialSecurityNumber());
	} 
	
	/**
	 * This method returns lastName for this programmer
	 * @return lastName for this programmer
	 */
	private Object getLastName() {
		return lastName;
	}
	/**
	 * This method returns firstName for this programmer
	 * @return firstName for this programmer
	 */
	private Object getFirstName() {
		return firstName;
	}
	/**
	 * This method returns socialSecurityNumber for this programmer
	 * @return socialSecurityNumber for this programmer
	 */
	private Object getSocialSecurityNumber() {
		return socialSecurityNumber;
	}
	
	/**
	 * This method is abstract and must be implemented by subclasses, 
	 * calculates and returns the payment amount for an entity.
	 */
	public abstract double getPaymentAmount();
	/**
	 * This method returns the clearance of this Programmer.
	 * @return clearance of this Programmer
	 */
	public ClearanceLevel getSecurityLevel() {
		return this.clearance;
	}
} 





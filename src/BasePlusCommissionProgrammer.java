/**
 * <p> The purpose of this class is to create a BasePlusCommissionProgrammer employee.</p>
 * @author Braden Howard
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer{ 
	
	private double baseSalary; // base salary per week
	//constructor
	/**
	 * <p>This constructor sets the first name, last name, ssn, clearance level, gross sales, commission rate, base salary
	 *  of the BasePlusCommissionProgrammer.</p>
	 * @param firstName the first name of the BasePlusCommissionProgrammer
	 * @param lastName the last name of the BasePlusCommissionProgrammer
	 * @param socialSecurityNumber the social security number of the BasePlusCommissionProgrammer
	 * @param grossSales the gross sales of the BasePlusCommissionProgrammer
	 * @param commissionRate the commission rate of the BasePlusCommissionProgrammer
	 * @param baseSalary the base salary of the BasePlusCommissionProgrammer
	 * @param clearance the clearance of the BasePlusCommissionProgrammer
	 * @throws IllegalArgumentException if the base salary is less than 0
	 */
	public BasePlusCommissionProgrammer(String firstName, String lastName, String socialSecurityNumber, 
	double grossSales, double commissionRate, double baseSalary, ClearanceLevel clearance) {
	super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate, clearance);
		
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}		
		this.baseSalary = baseSalary; 
	}
	
	/**
	 * This method sets base salary of BasePlusCommissionProgrammer.
	 * @param baseSalary sets base salary
	 * @throws IllegalArgumentException if the base salary is less than 0
	 */
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
		  throw new IllegalArgumentException("Base salary must be >= 0.0");
		}		
		this.baseSalary = baseSalary;                
	} 
	
	/**
	 * This method returns base salary of BasePlusCommissionProgrammer.
	 * @return base salary of BasePlusCommissionProgrammer
	 */
	public double getBaseSalary() {
		return baseSalary;
	}
	
	/**
	 * This method calculates and returns the payment amount for BasePlusCommissionProgrammer.
	 * @return payment amount of the BasePlusCommissionProgrammer
	 */
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 
	
	/**
	 * This method returns String of information for BasePlusCommissionProgrammer.
	 * @return String of information for BasePlusCommissionProgrammer
	 */
	@Override     
	public String toString() {
		return "base-plus " + super.toString() + String.format("%s%.2f", "; base salary: $", getBaseSalary()); // Format to 2 decimal paces
	}                                                       
}




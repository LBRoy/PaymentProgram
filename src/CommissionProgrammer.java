/**
 * <p> The purpose of this class is to create a CommissionProgrammer employee.</p>
 * @author Braden Howard
 */
public class CommissionProgrammer extends Programmer { 
	
	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage
	//constructor
	/**
	 * <p>This constructor sets the first name, last name, ssn,clearance level, gross sales,
	 *  commission rate of the CommissionProgrammer.</p>
	 * @param firstName the first name of the CommissionProgrammer
	 * @param lastName the last name of the CommissionProgrammer
	 * @param socialSecurityNumber the social security number of the CommissionProgrammer
	 * @param grossSales the gross sales of the CommissionProgrammer
	 * @param commissionRate the commission rate of the CommissionProgrammer
	 * @param clearance the clearance of the CommissionProgrammer
	 * @throws IllegalArgumentException if commission rate is not greater than 0 and less than 1
	 * @throws IllegalArgumentException if gross sales is not greater/equal to 0
	 */
	public CommissionProgrammer(String firstName, String lastName, String socialSecurityNumber,  
	double grossSales, double commissionRate, ClearanceLevel clearance) {
	super(firstName, lastName, socialSecurityNumber, clearance);
				
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}
		
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}		
		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 

	/**
	 * This method sets the gross sales amount of CommissionProgrammer.
	 * @param grossSales sets gross sales amount of CommissionProgrammer
     * @throws IllegalArgumentException if gross sales is not greater/equal to 0
	 */
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
		  throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}		
		this.grossSales = grossSales;
	} 

	/**
	 * This method returns gross sales amount of CommissionProgrammer.
	 * @return gross sales amount of CommissionProgrammer
	 */
	public double getGrossSales() {
		return grossSales;
	} 

	/**
	 * This method sets commission rate of CommissionProgrammer.
	 * @param commissionRate sets commission rate of CommissionProgrammer
	 * @throws IllegalArgumentException if commission rate is not greater than 0 and less than 1
	 */
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
		  throw new IllegalArgumentException(
		     "Commission rate must be > 0.0 and < 1.0");
		}		
		this.commissionRate = commissionRate;
	} 
	
	/**
	 * This method returns commission rate of CommissionProgrammer.
	 * @return commission rate of CommissionProgrammer
	 */
	public double getCommissionRate() {
		return commissionRate;
	} 
	
	/**
	 * This method calculate earnings and returns Payment amount this CommissionProgrammer.
	 * @return PaymentAmount of this CommissionProgrammer
	 */
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             
	
	/**
	 * This method returns String of information for CommissionProgrammer.
	 * @return String of information for CommissionProgrammer
	 */
	@Override      
	public String toString() {
		return "commission programmer: " + super.toString() + String.format("\n%s%,.2f%s%.2f", "gross sales: $", 
				getGrossSales(), "; commission rate: ", getCommissionRate());// Format to 2 decimal places
	}                                              
}


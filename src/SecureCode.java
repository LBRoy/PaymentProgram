/**
 * <p> The purpose of this class is to create a SecureCode with a clearance level associated with the code.</p>
 * @author Braden Howard
 */
public class SecureCode implements SecurityClearance {

	private ClearanceLevel clearance;
	private int documentNumber;
	
	/**
	 * This constructor sets the documentNumber and clearance for the SecureCode.
	 * @param documentNumber sets the documentNumber of this SecureCode
	 * @param clearance sets the clearance of this SecureCode
	 */
	public SecureCode(int documentNumber, ClearanceLevel clearance) {
		this.documentNumber = documentNumber;
		this.clearance = clearance;
	}
	
	/**
	 * This method returns the clearance for this SecureCode.
	 * @return clearance of this SecureCode
	 */
	public ClearanceLevel getSecurityLevel() {
		return this.clearance;
	}
}

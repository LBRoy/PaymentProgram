/**
 * <p> The purpose of this class is to create 6 security codes with difference clearance levels associated to them.</p>
 * @author Braden Howard
 */
public class SecureLibrary {
	/**
	 * This method creates an array with 6 SecureCode in it with clearance levels associated with each one.
	 * @return clearanceLibrary array
	 */
	public SecurityClearance[] getLibrary() {
		// Create Array clearanceLibrary
		SecurityClearance[] clearanceLibrary = {
			new SecureCode(1111, SecurityClearance.ClearanceLevel.NONE),
			new SecureCode(1112, SecurityClearance.ClearanceLevel.TOP_SECRET),
			new SecureCode(1113, SecurityClearance.ClearanceLevel.REGULAR),
			new SecureCode(1114, SecurityClearance.ClearanceLevel.TOP_SECRET),
		    	new SecureCode(1112, SecurityClearance.ClearanceLevel.SECRET),
		    	new SecureCode(1113, SecurityClearance.ClearanceLevel.TRUMP_LEVEL_SECURITY)};
		return clearanceLibrary;
	}
}

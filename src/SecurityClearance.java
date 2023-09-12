/**
 * <p> The purpose of this class is to create 6 security clearance levels.</p>
 * @author Braden Howard
 */
public interface SecurityClearance {
	/**
	 * This method gets the Security level of the object.
	 * @return securityLevel for the programmer
	 */
	public ClearanceLevel getSecurityLevel();
	/**
	 * This method creates 6 different security level clearances with enum values associated with them.
	 */
	public enum ClearanceLevel {// Citing for knowledge of enum below code [1].
		/**
		 * No clearance (0)
		 */
		NONE(0), 
		/**
		 * Regular Clearance (1)
		 */
		REGULAR(1), 
		/**
		 * Enhanced Clearance (2)
		 */
		ENHANCED(2), 
		/**
		 * Secret Clearance (3)
		 */
		SECRET(3), 
		/**
		 * Top Secret Clearance (4)
		 */
		TOP_SECRET(4),
		/**
		 * Trump Level Security (5)
		 */
		TRUMP_LEVEL_SECURITY(5);  // I can classify it just by thinking about it
		
		private final int clearanceLevel;
		/**
		 * This constructor sets the clearance level constant with the associated number value.
		 * @param clearanceLevel number value associated with the clearance level
		 */
		ClearanceLevel(int clearanceLevel){this.clearanceLevel = clearanceLevel;}		
	}
}
/**
 * References:
 * Learned more about enum from javaTpoint.com, citing below[1].
 * [1] Java Enums. www.javatpoint.com. 
 * https://www.javatpoint.com/enum-in-java (accessed Jul. 29, 2023). 
 */

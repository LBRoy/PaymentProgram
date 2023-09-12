/**
 * <p> The purpose of this class is to print out what each programmer created has access to. </p>
 * @author Braden Howard
 */
public class SecurityClearanceTester {
	/**
	 * @param args (not used)
	 */
	public static void main(String[] args) {
		// Array of Programmers
		SecurityClearance[] programmers = { 
			new CommissionProgrammer("", "", "", .5, .5, SecurityClearance.ClearanceLevel.TOP_SECRET),
			new BasePlusCommissionProgrammer("", "", "", .5, .5, .5, SecurityClearance.ClearanceLevel.SECRET),
			new SalariedProgrammer("", "", "", .5, SecurityClearance.ClearanceLevel.NONE)
		};
					
		SecureLibrary library = new SecureLibrary();
		SecurityClearance[] clearanceLibrary = library.getLibrary();
        System.out.printf("\t\t");
        // Prints out Programmer and number of programmers index position + 1
        for (int i = 0; i < programmers.length; i++) {
        	// Initialize position equals index position + 1
        	int position = i + 1;
            System.out.printf("Programmer #%d\t\t", position);// "%d" for int value of position, "\t" tab to create spacing for table
        }
        // Prints out a new line to create separation
        System.out.println("\n");
        // Using a nested for loop with clearanceLibrary array, prints out the SecureCode and index position +1 then if each programmer is granted access or not
        for (int i = 0; i < clearanceLibrary.length; i++) {
        	// Initialize position equals index position + 1
        	int position = i + 1;
        	// Prints SecureCode plus position number
            System.out.printf("SecureCode #%d\t", position);// "%d" for int value of position, "\t" tab to create spacing for table
            // inner for loop prints out if user is granted access or not, using programmers array
            for (int k = 0; k < programmers.length; k++) {
            	// Initialize programmerClearance equals programmer array index Security Level
            	SecurityClearance.ClearanceLevel programmerClearance = programmers[k].getSecurityLevel();
            	// Initialize libraryClearance equals clearanceLibrary array index Security Level
                SecurityClearance.ClearanceLevel libraryClearance = clearanceLibrary[i].getSecurityLevel();
                /* 
                 * if libraryClearance ordinal value is greater than programmerClearence ordinal value then output Access Denied.
                 * if programmerClearance ordinal value is equal to or greater than libraryClearance ordinal value output Cleared for Access.
                 * Citing for use or ordinal() below code[1].
                 */
                if (libraryClearance.ordinal() > programmerClearance.ordinal()) {
                    System.out.printf("Access Denied" + "\t\t");// "\t" tab to create spacing for table
                } else {
                	System.out.printf("Cleared for Access" + "\t");// "\t" tab to create spacing for table
                }
            }
            // Print new line
            System.out.println();
        }
    }
}
/*
 * References:
 * Learned what ordinal() is from javaTpoint.com, citing below.
 * [1] Java Enum ordinal() Method. javatpoint.com. 
 * https://www.javatpoint.com/post/java-enum-ordinal-method (accessed Jul. 29, 2023). 
 */



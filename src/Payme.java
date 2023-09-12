/**
 * <p> The purpose of this class is to make each class that uses Payme have to implement the getPaymentAmount() 
 * method to calculate their payment amount.</p>
 * @author Braden Howard
 */
public interface Payme {
    /**
     * This method calculates and returns the payment amount for an object, 
     * the calculations will be given by the classes implementing the Payme interface. 
     * @return paymentAmount for the programmer
     */
	public abstract double getPaymentAmount();
}

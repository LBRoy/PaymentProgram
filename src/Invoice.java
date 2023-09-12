/**
 * <p> The purpose of this class is to create a Invoice receipt.</p>
 * @author Braden Howard
 */
public class Invoice implements Payme {
	
	private String partNumber; 
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	
	//four-argument constructor
	/**
	 * This constructor sets the partNumber, description, count, and price of this Invoice.
	 * @param part sets the partNumber for this Invoice
	 * @param description sets the description for this Invoice
	 * @param count sets the count for this Invoice
	 * @param price sets the price for this Invoice
	 */
	public Invoice(String part, String description, int count, 
	 double price) {
		 partNumber = part;
		 partDescription = description;
		 setQuantity(count); // validate and store quantity
		 setPricePerItem(price); // validate and store price per item
	}

	/**
	 * This method sets part number for this Invoice.
	 * @param part set part number for this Invoice
	 */
	public void setPartNumber(String part) {
		partNumber = part; 
	}

	/**
	 * This method returns the part number for this Invoice.
	 * @return part number for this Invoice
	 */
	public String getPartNumber() {
		return partNumber;
	}

	/**
	 * This method sets the description for this Invoice.
	 * @param description set description for this Invoice
	 */
	public void setPartDescription(String description) {
	 partDescription = description; 
	}

	/**
	 * This method returns the description for this Invoice.
	 * @return description for this Invoice
	 */
	public String getPartDescription() {
		return partDescription;
	}

	/**
	 * This method sets the quantity for this Invoice.
	 * @param count set quantity for this Invoice
	 */
	public void setQuantity(int count) {
		quantity = (count < 0) ? 0 : count; // quantity cannot be negative, citing for "?" below code, code was given from prof
	}

	/**
	 * This method returns the quantity for this Invoice.
	 * @return quantity for this Invoice
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * This method sets the price per item for this Invoice.
	 * @param price set price per item for this Invoice
	 */
	public void setPricePerItem(double price) {
		pricePerItem = (price < 0.0) ? 0.0 : price; // validate price
	}

	/**
	 * This method returns the price per item for this Invoice.
	 * @return price per item for this Invoice
	 */
	public double getPricePerItem() {
		return pricePerItem;
	}

	/**
	 * This method returns String of information for Invoice object.
	 * @return String of information for Invoice object
	 */
	@Override
	public String toString() {
		return String.format("%s: \n%s: %s (%s) \n%s: %d \n%s: $%,.2f", 
				"invoice", "part number", getPartNumber(), getPartDescription(), 
				"quantity", getQuantity(), "price per item", getPricePerItem());
	} 

	/**
	 * This method calculate earnings and returns Payment amount this Invoice.
	 * @return PaymentAmount of this Invoice
	 */
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem(); // calculate total cost
	}
}
/*
 * Reference:
 * Learned what "?" and ":" does from StackOverflow.com, citing below.
 * [1] What is a question mark ‘?’ and colon ‘:’ operator used for?. StackOverflow.com.
 * https://stackoverflow.com/questions/10336899/what-is-a-question-mark-and-colon-operator-used-for (accessed Jul. 29, 2023). 
 */


package myPackage;

public class Customer {
	private String customerID, name;
	private double balance;

	public String getFormattedBalance() {
		return(String.format("$%,.2f", getBalance()));
	}
	
	public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

}

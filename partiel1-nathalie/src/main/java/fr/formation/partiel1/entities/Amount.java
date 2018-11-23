package fr.formation.partiel1.entities;

/**
 * @author Nathalie ROBERT
 */
public class Amount {

    private double amount = 0.0;

    /**
     * @param amount
     */
    public Amount(double amount) {
	setAmount(amount);
    }

    /**
     * @return amount
     */
    public double getAmount() {
	return amount;
    }

    /**
     * @param amount
     *               can't be equal or less than zero
     */
    public void setAmount(double amount) {
	if (amount <= 0) {
	    throw new IllegalArgumentException();
	}
	this.amount = amount;
    }
}

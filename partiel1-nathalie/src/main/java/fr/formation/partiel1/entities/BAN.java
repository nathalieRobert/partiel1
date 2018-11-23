package fr.formation.partiel1.entities;

import java.util.Objects;

public class BAN {

    // variables
    private int bankCode = 00000;

    private int agencyCode = 00000;

    private String customerAccountNumber = "number";

    private int checkNumber = 0;

    // constructor
    public BAN(int bankCode, int agencyCode, String customerAccountNumber,
	    int checkNumber) {
	setBankCode(bankCode);
	setAgencyCode(agencyCode);
	setCustomerAccountNumber(customerAccountNumber);
	setCheckNumber(checkNumber);
    }

    public int getBankCode() {
	return bankCode;
    }

    public void setBankCode(int bankCode) {
	Objects.requireNonNull(bankCode);
	this.bankCode = bankCode;
    }

    public int getAgencyCode() {
	return agencyCode;
    }

    public void setAgencyCode(int agencyCode) {
	Objects.requireNonNull(agencyCode);
	this.agencyCode = agencyCode;
    }

    public String getCustomerAccountNumber() {
	return customerAccountNumber;
    }

    public void setCustomerAccountNumber(String customerAccountNumber) {
	Objects.requireNonNull(customerAccountNumber);
	this.customerAccountNumber = customerAccountNumber;
    }

    public int getCheckNumber() {
	return checkNumber;
    }

    public void setCheckNumber(int checkNumber) {
	Objects.requireNonNull(checkNumber);
	this.checkNumber = checkNumber;
    }
}

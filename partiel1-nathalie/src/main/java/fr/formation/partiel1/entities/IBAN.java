package fr.formation.partiel1.entities;

import java.util.Objects;

public class IBAN {

    private BAN ban;

    private String countryCode = "fr";

    private int checkDigit = 0;

    public IBAN(BAN ban, String countryCode, int checkDigit) {
	setBan(ban);
	setCountryCode(countryCode);
	setCheckDigit(checkDigit);
    }

    public BAN getBan() {
	return ban;
    }

    public void setBan(BAN ban) {
	Objects.requireNonNull(ban);
	this.ban = ban;
    }

    public String getCountryCode() {
	return countryCode;
    }

    public void setCountryCode(String countryCode) {
	Objects.requireNonNull(countryCode);
	this.countryCode = countryCode;
    }

    public int getCheckDigit() {
	return checkDigit;
    }

    public void setCheckDigit(int checkDigit) {
	Objects.requireNonNull(checkDigit);
	this.checkDigit = checkDigit;
    }
}

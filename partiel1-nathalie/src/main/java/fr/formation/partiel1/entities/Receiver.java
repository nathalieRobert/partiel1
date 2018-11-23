package fr.formation.partiel1.entities;

import java.util.Objects;

public class Receiver {
    // variables
    private String name = "name";

    private IBAN iban;

    // constructor
    public Receiver(String name, IBAN iban) {
	setIban(iban);
	setName(name);
    }

    // getters and setters
    public String getName() {
	return name;
    }

    public void setName(String name) {
	Objects.requireNonNull(name);
	this.name = name;
    }

    public IBAN getIban() {
	return iban;
    }

    public void setIban(IBAN iban) {
	Objects.requireNonNull(iban);
	this.iban = iban;
    }
}
    


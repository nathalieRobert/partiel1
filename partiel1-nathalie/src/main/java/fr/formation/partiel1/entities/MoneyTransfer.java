package fr.formation.partiel1.entities;

import java.time.LocalDateTime;
import java.util.Objects;

public class MoneyTransfer {

    private LocalDateTime date;

    private Expeditor from;

    private Receiver to;

    private Amount amount;

    public MoneyTransfer(LocalDateTime date, Expeditor from, Receiver to,
	    Amount amount) {
    }

    public LocalDateTime getDate() {
	return date;
    }

    public void setDate(LocalDateTime date) {
	Objects.requireNonNull(date);
	this.date = date;
    }

    public Expeditor getFrom() {
	return from;
    }

    public void setFrom(Expeditor from) {
	Objects.requireNonNull(from);
	this.from = from;
    }

    public Receiver getTo() {
	return to;
    }

    public void setTo(Receiver to) {
	Objects.requireNonNull(to);
	this.to = to;
    }

    public Amount getAmount() {
	return amount;
    }

    public void setAmount(Amount amount) {
	Objects.requireNonNull(amount);
	this.amount = amount;
    }
}

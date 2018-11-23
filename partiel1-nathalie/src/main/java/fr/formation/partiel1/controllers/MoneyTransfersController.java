package fr.formation.partiel1.controllers;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import fr.formation.partiel1.entities.Amount;
import fr.formation.partiel1.entities.Expeditor;
import fr.formation.partiel1.entities.MoneyTransfer;
import fr.formation.partiel1.entities.MoneyTransfers;
import fr.formation.partiel1.entities.Receiver;

@Path("moneyTranfers")
public class MoneyTransfersController {

    @GET
    @Path("/money/{transfers}")
    @Produces(MediaType.APPLICATION_JSON)
    public MoneyTransfers money(@PathParam("tranfers") String code) {
	return null;
    }

    public static MoneyTransfers buildMoneyTransferFirst() {
	LocalDateTime date = 2017-10-06 ;
	Expeditor from = "Nathalie", ;
	Receiver to = null;
	Amount amount = null;
	MoneyTransfer moneyTransfer = new MoneyTransfer(date, from, to, amount);
	return null;
	
	
    }
}

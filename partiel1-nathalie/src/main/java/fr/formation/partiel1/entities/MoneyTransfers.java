package fr.formation.partiel1.entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class MoneyTransfers {

    private List<MoneyTransfer> moneyTransferView = new ArrayList<>();

    private LocalDateTime TransfertDate;

    public MoneyTransfers(LocalDateTime transfertDate) {
	TransfertDate = transfertDate;
    }

    // defensive copy list.
    public List<MoneyTransfer> getMoneyTransferView() {
	return Collections.unmodifiableList(moneyTransferView);
    }

    // add moneytransfer to list
    public boolean add(MoneyTransfer moneyTranfer) {
	Objects.requireNonNull(moneyTranfer);
	return moneyTransferView.add(moneyTranfer);
    }
}

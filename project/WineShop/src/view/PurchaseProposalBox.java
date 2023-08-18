package view;

import java.sql.Timestamp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import model.Purchase;


public class PurchaseProposalBox extends PurchaseBox
{
	private ButtonValue<Purchase> btnAccept;
	private ButtonValue<Timestamp> btnRefuse;
	
	/**
	 * Instantiates new purchase proposal graphic box
	 * @param p The purchase proposal to reperesent
	 * @param fAccept The handler of the accept button
	 * @param fRefuse The handler of the refuse button
	 */
	public PurchaseProposalBox(Purchase p, EventHandler<ActionEvent> fAccept, EventHandler<ActionEvent> fRefuse)
	{
		super(p);
		
		btnAccept = new ButtonValue<Purchase>("Accept", p);
		btnAccept.setOnAction(fAccept);
		btnRefuse = new ButtonValue<Timestamp>("Refuse", p.getDate());
		btnRefuse.setOnAction(fRefuse);
		super.hbRoot.getChildren().addAll(btnAccept, btnRefuse);
		if (p.getDigitalSignature() == null)
		{
			btnAccept.setDisable(true);
			btnRefuse.setDisable(true);
		}
		btnAccept.setPadding(new Insets(0, 10, 0, 0));
	}
}

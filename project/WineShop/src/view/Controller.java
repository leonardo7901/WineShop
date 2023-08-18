package view;

import controller.Client;
import javafx.fxml.Initializable;
import model.Account;


public abstract class Controller implements Initializable
{
	/** The WineShop client */
	protected Client c;
	
	/** The type of the account */
	protected Account atype;
	
	/**
	 * Set the account type
	 * @param atype The account type
	 */
	public void setAtype(Account atype)
	{
		this.atype = atype;
	}
	
	/**
	 * Set the WineShop client
	 * @param c WineShop client
	 */
	public void setClient(Client c)
	{	
		this.c = c;
	}
}

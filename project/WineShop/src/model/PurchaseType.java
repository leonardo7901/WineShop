package model;


public enum PurchaseType
{
	SALES_ORDER("salesOrder"),
	PURCHASE_PROPOSAL("purchaseProposal"),
	PURCHASE_ORDER("purchaseOrder"),
	ALL("");

	private String strPurchase;
	
	PurchaseType(String strPurchase)
	{
		this.strPurchase = strPurchase;
	}
	
	/**
	 * @return The string description of the purchase type
	 */
	public String getStrPurchaseType()
	{
		return this.strPurchase;
	}
}

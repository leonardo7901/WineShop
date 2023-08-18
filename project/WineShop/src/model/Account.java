package model;


public enum Account
{
	CUSTOMER("Customer"),
	EMPLOYEE("Employee"),
	ADMINISTRATOR("Administrator"),
	FOREIGN("Foreign");
	
	private String strType;

	Account(String strType)
	{
		this.strType = strType;
	}
	
	/**
	 * @return The string type of the account
	 */
	public String getStrType()
	{
		return this.strType;
	}
}

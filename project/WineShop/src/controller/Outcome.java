package controller;


public enum Outcome
{
	SUCCESS("success"),
	ERROR("error"),
	INSUFFICIENT_PRIVILEGES("insufficient privileges");

	private String strOutcome;
	
	Outcome(String strOutcome)
	{
		this.strOutcome = strOutcome;
	}
	
	/**
	 * @return The string description of the outcome
	 */
	public String getStrOutcome()
	{
		return this.strOutcome;
	}
}

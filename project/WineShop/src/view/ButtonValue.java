package view;

import javafx.scene.control.Button;


public class ButtonValue<T> extends Button
{
	/** Value */
	private T value;
	
	/**
	 * Instantiates new value button
	 * @param txt The text of the button
	 * @param value The incapsulated button value
	 */
	public ButtonValue(String txt, T value)
	{
		super(txt);
		this.value = value;
	}
	
	/**
	 * @return The button incapsulated value
	 */
	public T getValue()
	{
		return value;
	}
}

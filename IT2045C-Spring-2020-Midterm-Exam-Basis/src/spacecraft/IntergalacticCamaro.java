/*
 * Name: David Hollins
 * Email: hollindv@mail.uc.edu
 * Course: IT 2045C
 * Due Date: 3/5/2020
 * Assignment: IT 2045C Midterm
 * Description: New IntergalacticCamaro class
 * Citations:
 */
package spacecraft;

public class IntergalacticCamaro extends Spacecraft {

	private String color;
	
	public IntergalacticCamaro(String name, String color) {
		super(name);
		setColor(color);
	}

	@Override
	public void Launch() {
		

	}
	/***
	 * Get the color of the IntergalacticCamaro
	 * @return color
	 */
	public String getColor() {
		return color;
	}
	/***
	 * Define the color for the IntergalacticCamaro
	 * @param color
	 */
	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		return super.toString() + ", Color: " + color;
	}

}

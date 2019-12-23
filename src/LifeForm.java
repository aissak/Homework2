/**
 * Class: LifeForm
 * 
 * 
 * @version 1.0 
 * Course: ITECH 2150 Fall 2019 
 * Written: September 22, 2019
 * Purpose: Create three types of different classes that extend to one main class using inheritance and polymorphism.
 *
 */
public class LifeForm {

	private int hitPoints;
	private int strength;
	private String type;

	/**
	 * 
	 * Constructor for the lifeform
	 * 
	 */

	public LifeForm() {
		hitPoints = 100;
		strength = 15;
	}

	/**
	 * @param hitPoints
	 * @param strength
	 * 
	 * 
	 */
	public LifeForm(int hitPoints, int strength, String type) {
		this.hitPoints = hitPoints;
		this.strength = strength;
		setType(type);
	}

	/**
	 * @return the hitPoints
	 */
	public int getHitPoints() {

		return hitPoints;
	}

	/**
	 * @param hitPoints the hitPoints to set setter: sets the number of hitpoints.
	 *                  uses if statement to make sure the hitpoints do not exceed
	 *                  100.
	 */
	public void setHitPoints(int hitPoints) {

		if (hitPoints >= 0 && hitPoints <= 100) {

			this.hitPoints = hitPoints;
		}
	}

	/**
	 * @return the strength getter: gets the strength
	 */

	public int getStrength() {

		return strength;
	}

	/**
	 * @param strength the strength to set 
	 * setter: sets the strength.
	 *  uses if statement to make sure the strength is not out of bound.
	 */
	public void setStrength(int strength) {
		if (strength >= 0 && strength <= 18) {

			this.strength = strength;

		}

	}

	/**
	 * @return the type getter: gets the type of class that is need by the user.
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param  setter: sets the types of classes to their
	 *             perspective names.
	 */
	public void setType(String type) {
		if (type.equalsIgnoreCase("Human") || type.equalsIgnoreCase("Dragon") || type.equalsIgnoreCase("Unicorn"))
			this.type = type;
	}

	@Override
	public String toString() {
		return "LifeForm [hitPoints=" + hitPoints + ", strength=" + strength + ", type=" + type + "]";
	}

}

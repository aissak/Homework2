
public class Human extends LifeForm {

	private String name;
	private String weapon;
	private int magicAmount;

	/**
	 * @param weapon
	 * @param magicAmoun
	 */

	public Human() {
		this.name = "";
		this.weapon = "Sword";
		this.magicAmount = 50;

	}

	/**
	 * @param name
	 * @param weapon
	 * @param magicAmount
	 */
	public Human(int hitPoints, int strength, String type, String name, String weapon, int magicAmount) {

		super(hitPoints, strength, type);
		this.name = name;
		setWeapon(weapon);
		setMagicAmount(magicAmount);
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weapon getter: gets the type of weapon a human is using
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 */
	public void setWeapon(String weapon) {
		if (weapon.equalsIgnoreCase("Sword") || weapon.equalsIgnoreCase("Dagger"))
			this.weapon = weapon;
	}

	/**
	 * @return getter: gets the amount of magic.
	 */
	public int getMagicAmount() {
		return magicAmount;
	}

	/**
	 * @param setter: sets the amount of magic a human can have.
	 */
	public void setMagicAmount(int magicAmount) {
		if (magicAmount >= 0 && magicAmount <= 50)
			this.magicAmount = magicAmount;
	}

	/**
	 * toString: prints out the name, the weapon and the amount of magic a human has
	 */

	@Override
	public String toString() {
		return super.toString() + "Human [name=" + name + ", weapon=" + weapon + ", magicAmount=" + magicAmount + "]";
	}

}

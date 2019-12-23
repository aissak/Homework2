
public class Dragon extends LifeForm {

	private String name;
	private String weapon;
	private int magicAmount;

	/**
	 * an empty constructor
	 * @param name
	 * @param weaopn
	 * @param magicAmoun
	 */
	public Dragon() {
		name = "";
		weapon = "Fire";
		magicAmount = 100;

	}

	/**
	 * a constructor with parameters
	 * @param name
	 * @param weapon
	 * @param magicAmount
	 */
	public Dragon(int hitPoints, int strength, String type, String name, String weapon, int magicAmount) {

		super(hitPoints, strength, type);
		this.name = name;
		setWeapon(weapon);
		setMagicAmount(magicAmount);
	}

	/**
	 * @return the name
	 * getter: gets the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 * setter: sets the name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weapon getter: String getter
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set
	 * setter: sets the types of weapons a dragon can use
	 */
	public void setWeapon(String weapon) {
		if (weapon.equalsIgnoreCase("Fire ")|| weapon.equalsIgnoreCase("Ice"))
			this.weapon = weapon;
	}

	/**
	 * @return the magicAmount Getter: gets the amount of magic for the dragon
	 */
	public int getMagicAmount() {
		return magicAmount;
	}

	/**
	 * @param setter for the magic amount. calculates the amount of magic a dragon
	 *               can have
	 */
	public void setMagicAmount(int magicAmount) {
		if (magicAmount >= 0 && magicAmount <= 100)
			this.magicAmount = magicAmount;
	}

	/**
	 * toString: prints out the name, the weapon and the amount of magic a dragon
	 * has
	 */
	@Override
	public String toString() {
		return super.toString() + "Dragon [name=" + name + ", weapon=" + weapon + ", magicAmount=" + magicAmount + "]";
	}

}

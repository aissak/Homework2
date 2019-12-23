
public class Unicorn extends LifeForm {
	private String name;
	private String weapon;
	private int magicAmount;

	/**
	 * An empty contructor
	 * @param name
	 * * @param weapon
	 * @param magicAmount
	 * 
	 */

	public Unicorn() {
		name = "";
		weapon = "Horn";
		magicAmount = 500;

	}

	/**
	 * Constructor with all the parameters
	 * @param name
	 * @param weapon
	 * @param magicAmount
	 */
	public Unicorn(int hitPoints, int strength, String type, String name, String weapon, int magicAmount) {

		super(hitPoints, strength, type);
		this.name = name;
		setWeapon(weapon);
		setMagicAmount(magicAmount);
	}

	/**
	 * @return the name
	 * getter: gets the name of the type unicorn
	 */
	public String getName() {
		return name;
	}

	/**
	 * setter: sets the name
	 * 
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the weapon getter: gets the weapon
	 */
	public String getWeapon() {
		return weapon;
	}

	/**
	 * @param weapon the weapon to set setter: sets the type of weapon a unicorn has
	 */
	public void setWeapon(String weapon) {
		if (weapon.equalsIgnoreCase("Horn") || weapon.equalsIgnoreCase("Charm"))
			this.weapon = weapon;
	}

	/**
	 * @return the magicAmount getter: gets the amount of magic a unicorn has.
	 */
	public int getMagicAmount() {
		return magicAmount;
	}

	/**
	 * @param magicAmount the magicAmount to set
	 */
	public void setMagicAmount(int magicAmount) {
		if (magicAmount >= 100 && magicAmount <= 500)
			this.magicAmount = magicAmount;
	}

	/**
	 * toString: prints out the name, the weapon and the amount of magic a unicorn
	 * has
	 */
	@Override
	public String toString() {
		return super.toString() + "Unicorn [name=" + name + ", weapon=" + weapon + ", magicAmount=" + magicAmount + "]";
	}

}

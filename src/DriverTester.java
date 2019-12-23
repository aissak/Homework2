
/**
 * Class: DriverTester
 * 
 * 
 * @version 1.0 
 * Course: ITECH 2150 Fall 2019 
 * Written: September 22, 2019
 * Purpose: Create three types of different classes that use inheritance and polymorphism.   
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DriverTester {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// an array list
		ArrayList<LifeForm> life = new ArrayList<LifeForm>();

		for (int i = 1; i <=3; i++) {
			System.out.println("Enter LifeForm "+i +" :");
			
			System.out.println("Enter LifeForm type:  ");
			// an input for the type
			String type = input.nextLine();
			// the specific life form type. This is for human
			if (type.equalsIgnoreCase("human")) {

				System.out.println("Enter LifeForm Name:  ");
				String name = input.nextLine();
				// an input prompt for the hitpoints in integers
				System.out.println("Enter hit points: ");
				int hitpoints = input.nextInt();
				// an input prompt for strength
				System.out.println("Enter strength: ");
				int strength = input.nextInt();

				input.nextLine();
				// an input prompt for the weapon
				System.out.println("Enter weapon: ");
				String weapon = input.nextLine();
				// an input prompt for the amount of magic
				System.out.println("Enter magic: ");
				int magic = input.nextInt();
				input.nextLine();
				// the human object and all it's paramaters
				Human human1 = new Human(hitpoints, strength, type, name, weapon, magic);
				life.add(human1);

			}

			else if (type.equalsIgnoreCase("unicorn")) {
				// an input prompt for the unicorn name
			
				System.out.println("Enter LifeForm Name:  ");
				String name = input.nextLine();
				// an input prompt for the hitpoints using integer.
				System.out.println("Enter hit points: ");
				int hitpoints = input.nextInt();
				// an input prompt for the strength of the unicorn
				System.out.println("Enter strength: ");
				int strength = input.nextInt();

				input.nextLine();
				// an input prompt for the type of weapon the unicorn uses
				System.out.println("Enter weapon: ");
				String weapon = input.nextLine();
				// an input prompt for the amount of magic a unicorn has
				System.out.println("Enter magic: ");
				int magic = input.nextInt();
				input.nextLine();
				// an object name for the unicorn class and it's parameters
				Unicorn unicorn1 = new Unicorn(hitpoints, strength, type, name, weapon, magic);
				life.add(unicorn1);
			} else if (type.equalsIgnoreCase("dragon")) {
				// a name input prompt for the dragon class
				
				System.out.println("Enter LifeForm Name:  ");
				String name = input.nextLine();
				// a hitpoint input prompt for the dragon
				System.out.println("Enter hit points: ");
				int hitpoints = input.nextInt();
				// an input prompt for the dragon strength
				System.out.println("Enter strength: ");
				int strength = input.nextInt();

				input.nextLine();
				// an input promt for the type of weapon a dragon uses
				System.out.println("Enter weapon: ");
				String weapon = input.nextLine();
				// an input prompt for the amount of magic a dragon has.
				System.out.println("Enter magic: ");
				int magic = input.nextInt();
				input.nextLine();

				Dragon dragon1 = new Dragon(hitpoints, strength, type, name, weapon, magic);
				life.add(dragon1);
			} else {
				System.out.println("....");
			}

		}
		System.out.println("The available LifeForms are: ");
		// a for loop that gets the to sting form the LifeForm class
		for (int i = 0; i <3; i++) {
			System.out.println(life.get(i).toString());
		}
	}
}

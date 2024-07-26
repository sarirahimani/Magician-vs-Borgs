package assignment3;
/**
 * A class to descirbe a Fighter
 * @author Sahara Rahimani
 */

public class Fighter extends Hero {
private int strength;

	/**
	 * Argumented constructor
	 * @param name Fighter's name
	 */
	public Fighter(String name) {
		super(name);
		strength=3;
	}
	
	/**
	 * This method calculates the damage made by fighter
	 * @return damage
	 */
	public int dealDamage() {
		double number= 7+(Math.random()*4);
		int damage=(int)number;
		return damage;
		
	}
	
	/**
	 * This method calculates
	 * the damage made by the fighter
	 * when using berserk, it decreases 
	 * strength and health
	 * @return damage made by fighter
	 */
	public int berserk() {
		int health=getHealth();
		int damage=(int)(health*(1.0/3.0));
		int dmgCost= (int)(health*(1.0/4.0));
		takeDamage(dmgCost);
		strength--;
		return damage;
	}
	
	/**
	 * Accessor for Strength
	 * @return strength
	 */
	public int getStrength() {return strength;}
	
	/**
	 * Adds to the hero's strength
	 * @param addStrength the amount of strength
	 * that is added
	 */
	public void addStrength(int addStrength) {
		strength+=addStrength;
	}
	
	/**
	 * toString to print the status of Fighter
	 */
	public String toString() {return "Fighter[" + super. toString()+ "," + strength + "]"; }
}

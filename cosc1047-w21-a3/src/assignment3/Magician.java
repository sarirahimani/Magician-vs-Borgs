package assignment3;
/**
 * A class to descirbe a Fighter
 * @author Sahara Rahimani
 */

public class Magician extends Hero {
	private int mana;

/**
 * Argumented constructor
 * @param name of Magician
 */	
public Magician(String name) {
		super(name);
		mana=4;
	}

	/**
	 * This method calculates the damage made by Magician
	 * @return damage
	 */
	public int dealDamage() {
		double number= 4+(Math.random()*3);
		int damage=(int)number;
		return damage;
		
	}
	
	/**
	 * This method calculates
	 * the damage made by the Magician
	 * when using lightning, it decreases 
	 * mana
	 * @return damage made by Magician
	 */
	public int lightning() {
		int damage=this.dealDamage()*4;
		mana--;
		return damage;
	}
	
	/**
	 * Accessor for mana
	 * @return mana
	 */
	public int getMana() {return mana;}
	/**
	 * Adds to the hero's mana
	 * @param addMana the amount of mana
	 * that is added
	 */
	public void addMana(int addMana) {
		mana+=addMana;
	}
	
	/**
	 * toString to print the status of Magician
	 */
	public String toString() {return "Magician[" + super. toString()+ "," + mana + "]";}
	

}

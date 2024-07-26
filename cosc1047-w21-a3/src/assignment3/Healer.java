package assignment3;
/**
 * A class to descirbe a Healer
 * @author Sahara Rahimani
 *
 */
public class Healer extends Hero{
private int dexterity;

	/**
	 * rgumented constructor
	 * @param name of Healer
	 */
	public Healer(String name) {
		super(name);
		dexterity=4;
	}
	
	
	/**
	 * This method calculates the damage made by fighter
	 * @return damage
	 */
	public int dealDamage() {
		double number= 3+(Math.random()*3);
		int damage=(int)number;
		return damage;
		
	}
	
	/**
	 * This method calculates the amount 
	 * that will be used to heal
	 * @return healed amount to heal
	 */
	public int heal() {
		double number= 5+(Math.random()*6);
		int healed=(int)number;
		dexterity-=2;
		return healed;
	}
	
	/**
	 * Accessor for Strength
	 * @return dexterity
	 */
	
	public int getDexterity() {return dexterity;}
	
	/**
	 * Adds to the hero's dexterity
	 * @param addDexterity the amount of dexterity
	 * that is added
	 */
	public void addDexterity(int addDexterity) {
		dexterity+=addDexterity;
	}
	
	/**
	 * toString to print the status of Healer
	 */
	public String toString() {return "Healer[" + super. toString()+ "," + dexterity + "]";}
	

}

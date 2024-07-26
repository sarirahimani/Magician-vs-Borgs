package assignment3;

/**
 * A class to describe a basic space-villan.
 * @author Aaron
 *
 */

public class Borg {

	private int health;
	
	/**
	 * Constructor 
	 */
	public Borg(){
		this.health = (int)(Math.random()*15)+45;
	}
	
	/**
	 * Accessor for health.
	 * @return Borg's current health.
	 */
	public int getHealth() { return health; }
	
	
	/**
	 * Borg takes damage from enemy.
	 * @param damage how much damage to take.
	 */
	public void takeDamage(int damage){ 
		this.health -= damage;
		if(health <= 0)
			health = 0;
	}
	
	/**
	 * If the Borg is dead, return true.
	 * @return true if health <= 0, otherwise false
	 */
	public boolean isDead() { return health <= 0; }
	
	/**
	 * To be defined in subclasses
	 * @return how much damage to deal
	 */
	public int dealDamage() {
		return (int)(Math.random()*10) + 1;
	};
	
	/**
	 * toString for easy printing.
	 */
	public String toString(){
		return "Borg[" + health + "]";
	}

	
}

package assignment3;



public class HeroTester {
	public static void main (String[] args) {
		/*
		 * We define our int variables, the Hero array that
		 * will have a size of 3 and one hero of each kind
		 * and we define the array of borgs and initialize it.
		 * Also we print the initial status of the borgs and heroes.
		 */
		int num=0;
		int i=0;
		Hero[] Heroes=new Hero[3];
		
		Heroes[0]=new Magician("sahara");
		Heroes[1]=new Fighter("karima");
		Heroes[2]=new Healer("meru");
		Hero.setnum();
		System.out.println(Hero.getnum());
		System.out.println("Initial Status of Heros and Borgs:\n");
		System.out.println("The status of the Magician is: "+ Heroes[0]);
		System.out.println("The status of the Fighter is: "+ Heroes[1]);
		System.out.println("The status of the Healer is: "+ Heroes[2]+"\n");
		Borg[] theBorgs=new Borg[10];
		
		for(i=0;i<10;i++) {
			theBorgs[i]=new Borg();
			System.out.println("The status of borg number"+" "+i+" is: "+theBorgs[i]);	
		}
		
		System.out.println();
		int count=1;
		int numBorgsDead=0;
		int n=0;
	
		/*
		 * We do a while loop to ensure that
		 * battles only occur if at least one 
		 * hero and one borg are alive. We will 
		 * have a counter to count rounds and 
		 * another counter to count the borgs
		 *  that are dead
		 */
		
		while((Heroes[0].isDead()==false || Heroes[1].isDead()==false || Heroes[2].isDead()==false) 
		&& (theBorgs[0].isDead()==false || theBorgs[1].isDead()==false || theBorgs[2].isDead()==false 
		|| theBorgs[3].isDead()==false || theBorgs[4].isDead()==false || theBorgs[5].isDead()==false ||
		theBorgs[6].isDead()==false || theBorgs[7].isDead()==false || theBorgs[8].isDead()==false || 
		theBorgs[9].isDead()==false )) {
		
			numBorgsDead=0;
			System.out.println("ROUND:"+count+"\n");
			System.out.println("Heros attack\n");
					
			/*We have an if statement that ensures that the borg 
			 * attacked is not dead.
			 * An if statement to ensure that at least one hero is alive
			 * And if statements that check for conditions to use the heroes
			 * special power if true they do special damage, if false they do 
			 * regular damage.
			 * for healer it only does regular damage if it is alive.
			 * and there are also if statements that allow the healer to heal the heroes
			 * if they are true.
			 * Also when using a feature that only exists in a subclass we typecast it.
			 */

			if(theBorgs[n].isDead()==false) {
				if(Heroes[0].isDead()==false ||Heroes[1].isDead()==false || Heroes[2].isDead()==false) {
					if(Heroes[0].getHealth()<80 && Heroes[0].getHealth()>0 && ((Magician) Heroes[0]).getMana()>0) {

						System.out.println("The Hero: "+Heroes[0]);
						
						int damage0=((Magician)Heroes[0]).lightning();
						
						System.out.println("The borg number "+n+" has suffered a damage of "+damage0+" used lightning");
						
						theBorgs[n].takeDamage(damage0);
						
						if(theBorgs[n].isDead()==true ) {
							System.out.println("Borg number "+n+" is dead");
							n++;
						}
						if(n>=10) {
							n=0;
						}else if(Heroes[0].isDead()==false){

							System.out.println("The Hero: "+Heroes[0]);
							
							int damage=Heroes[0].dealDamage();
							
							System.out.println("The borg number "+n+" has suffered a damage of "+damage);
							
							theBorgs[n].takeDamage(damage);
							
							if(theBorgs[n].isDead()==true ) {
								System.out.println("Borg number "+n+" is dead");
								n++;
							}
							if(n>=10) {
								n=0;
							}

						}

						if(Heroes[1].getHealth()<50 && (Heroes[1].getHealth()>0 && ((Fighter) Heroes[1]).getStrength()>0)){

								System.out.println("The Hero: "+Heroes[1]);
								
								int damage1=((Fighter)Heroes[1]).berserk();
								
								System.out.println("The borg number "+n+" has suffered a damage of "+damage1+" used berserk");
								
								theBorgs[n].takeDamage(damage1);
								
								if(theBorgs[n].isDead()==true ) {
									System.out.println("Borg number "+n+" is dead");
									n++;
								}
								if(n>=10) {
									n=0;
								}
							}else if(Heroes[1].getHealth()>0){
								
								System.out.println("The Hero: "+Heroes[1]);
								
								int damages=Heroes[1].dealDamage();
								
								System.out.println("The borg number "+n+" has suffered a damage of "+damages);
								
								theBorgs[n].takeDamage(damages);
								
								if(theBorgs[n].isDead()==true) {
									System.out.println("Borg number "+n+" is dead");
									n++;
								}
								if(n>=10) {
									n=0;
								}
							}
							if(Heroes[2].getHealth()>0){
	
								System.out.println("The Hero: "+Heroes[2]);
								
								int damageh=Heroes[2].dealDamage();
								
								System.out.println("The borg number "+n+" has suffered a damage of "+damageh);
								
								theBorgs[n].takeDamage(damageh);
								
								if(theBorgs[n].isDead()==true ) {
									System.out.println("Borg number "+n+" is dead");
									n++;
								}
								if(n>=10) {
									n=0;
								}
							}
						
							if(Heroes[1].getHealth()<50 && Heroes[1].getHealth()>0 && ((Fighter) Heroes[1]).getStrength()<=1 && ((Healer) Heroes[2]).getDexterity()>=2) {
								
									int healthAddF=((Healer)Heroes[2]).heal();
									
									Heroes[1].heal(healthAddF);
									
									((Fighter)Heroes[1]).addStrength(1);
									
									System.out.println("Healer used heal on Fighter and it recieved: "+healthAddF+" of health and 1 of Strength");
							}
							if(Heroes[0].getHealth()<50 && Heroes[0].getHealth()>0 && ((Magician) Heroes[0]).getMana()<=1 && ((Healer) Heroes[2]).getDexterity()>=2) {
								
									int healthAddM=((Healer)Heroes[2]).heal();
									
									Heroes[0].heal(healthAddM);
									
									((Magician)Heroes[0]).addMana(1);
									
									System.out.println("Healer used heal on Magician and it recieved: "+healthAddM+" of health and 1 of Mana");
							}
							if(Heroes[2].getHealth()<50 && Heroes[2].getHealth()>0 && ((Healer) Heroes[2]).getDexterity()>=2) {
								
									int healthAddH=((Healer)Heroes[2]).heal();
									
									Heroes[2].heal(healthAddH);
									
									((Healer)Heroes[2]).addDexterity(1);
									
									System.out.println("Healer used heal on Healer and it recieved: "+healthAddH+" of health and 1 of Dexterity");
							}						
						}			
					}	
				}
			
						System.out.println();
						System.out.println("Borgs attack\n");
						
						/*the first if statement that ensures that at least one hero is alive if it is not 
						 * this code does not execute. 
						 * We have a for loop that will be used to ensure the attack of each borg, each borg attacks
						 * if it is alive, if it is not we get a message, stating that the borg cant attack 
						 * (if statement) then we have if statements that will print the message of damage according to
						 * the index of the hero.
						 * Lastly after each round we print the status of all heroes and borgs and print
						 * how many borgs are alive.
						 */
						
						if(Heroes[0].isDead()==false || Heroes[1].isDead()==false || Heroes[2].isDead()==false) {
							for(int k=0;k<10;k++) {
								num=(int)(Math.random()*3);
								if(theBorgs[k].isDead()==false) {

							
									int db=theBorgs[k].dealDamage();
									System.out.println("The Borg number:"+k);
									Heroes[num].takeDamage(db);
									
									if(num==0)
										
										System.out.println("Magician has suffered damage of: " + db);
									
									if(num==1)
										
										System.out.println("Fighter has suffered damage of: " + db);
									
									if(num==2)
										
										System.out.println("Healer has suffered damage of: " + db);
								}else {
									System.out.println("The borg number "+k+" is dead and it can't attack.");
								}
						
							}
						}	
			
					
						System.out.println();
						System.out.println("Status of Heros and Borgs after round: "+count+"\n");
						
						if(Heroes[0].isDead()==true) {
							System.out.println("The status of the Magician is: Dead "+ Heroes[0]);

						}else {
							System.out.println("The status of the Magician is: "+ Heroes[0]);
						}
						if(Heroes[1].isDead()==true) {
							System.out.println("The status of the Fighter is: Dead "+ Heroes[1]);
						}else {
							System.out.println("The status of the Fighter is: "+ Heroes[1]);
						}
						if(Heroes[2].isDead()==true) {
							System.out.println("The status of the Healer is: Dead "+ Heroes[2]+"\n");
						}else {
							System.out.println("The status of the Healer is: "+ Heroes[2]+"\n");
						}
					
						
						for(int b=0;b<10;b++) {
							if(theBorgs[b].isDead()==true) {
								numBorgsDead++;
								System.out.println("The status of borg number"+" "+b+" is: Dead "+theBorgs[b]);
							}else {
								System.out.println("The status of borg number"+" "+b+" is: "+theBorgs[b]);	
							}
						}
						
						count++;
						System.out.println("Number of borgs left:"+(10-numBorgsDead));
		
		}
						/*when one of the groups have no more players left
						 * we print who wins we do this by using an if statement if a hero survives 
						 * heroes win if no heroes survive the borgs win!
						 */
						if(Heroes[0].isDead()==false || Heroes[1].isDead()==false || Heroes[2].isDead()==false) {
							System.out.println("Heroes win!");
							
						}else {
							System.out.println("Borgs win!");
						}
	}

}











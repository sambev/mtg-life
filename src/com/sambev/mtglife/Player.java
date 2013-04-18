package com.sambev.mtglife;

public class Player {
	/* Player Class
	 * I am a Magic The Gathering "player"
	 * Attributes:
	 *     name - string, name of the player
	 *     life - integer, life of the player, defaults to 20
	 *     poison - integer, poison counters on the player defaults to 0
	 *     
	 * Methods:
	 *     setLife - params: integer. returns none
	 *     getLife - params: none.  returns integer
	 *     setPoison - params: integer. return None
	 *     getLife - params: None. returns integer
	 */
	private String name;
	private int life;
	private int poison;
	
	// Constructor
	public Player(String player_name) {
		name = player_name;
		life = 20;
		poison = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public void setLife(int amount) {
		life += amount;
	}
	
	public int getLife() {
		return life;
	}
	
	public void setPoison(int amount) {
		poison += amount;
	}
	
	public int getPoison() {
		return poison;
	}

	public void reset() {
		life = 20;
	}
}

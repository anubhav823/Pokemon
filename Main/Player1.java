package Main;

public class Player1 {
	String name;
	int pokeballs;
	float balance;
	int level;
	int xp;
	Pikachu pikachu=new Pikachu();
	Pokeball pokeball=new Pokeball();
	@Override
	
	public String toString() {
		return "Player1 [name=" + name + ", pokeballs=" + pokeballs + ", balance=" + balance + ", level=" + level
				+ ", xp=" + xp+" ]";
	}
	
	
}

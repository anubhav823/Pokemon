package Main;

public class Pikachu {
	String name="Pikachu";
	float height=(float) 0.15;
	float weight=15;
	float attack=50;
	float defense=30;
	float hp=100;
	String type="electric";
	@Override
	public String toString() {
		return "Your pokemon is " + name + ", height=" + height + ", weight=" + weight + ", attack=" + attack
				+ ", defense=" + defense + ", hp=" + hp + ", type=" + type + "]";
	}
	
}

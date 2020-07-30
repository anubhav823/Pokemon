package Main;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Gane {
public static void main(String[] args) {
	System.out.println("Welcome to the game of pokemon! This is the beginning of your journey!!");
	System.out.println("Please enter your name");
	Scanner sc=new Scanner(System.in);
	String name=sc.nextLine();
	Player1 player=new Player1();
	Pikachu pikachu=new Pikachu();
	Meowth meowth=new Meowth();
	Bulbasaur bulbasaur=new Bulbasaur();
	Charmander charmander=new Charmander();
	Gengar gengar=new Gengar();
	List<Object> list=new ArrayList<>();
	player.name=name;
	player.pokeballs=1;
	player.level=1;
	player.xp=0;
	player.balance=0;
	System.out.println(player.toString());
	System.out.println();
	System.out.println("Hello "+name+"!! Lets get you started.");
	System.out.println("You are given a pokemon to start with-a level 1 Pikachu!!");
	System.out.println(pikachu.toString());
	System.out.println();
	System.out.println("This is a check");
	System.out.println("You can use it to become the best pokemaster the world has seen!!");
	System.out.println("However, to do this, you will need to acquire higher level pokemons.");
	System.out.println("You can do that by battling wild pokemons and increase their level.");
	System.out.println("So lets get started.");
	
}
static void battle() {
	
}
}

import java.util.*;

//defines item class and it's variables and methods
public class Item{
		private	ItemType type;
		private String name;
		private int weight;
		private int value;
		private int strength;
	//item constructor, takes type, name, weight, value, and strength ints
	public Item(ItemType type, String name, int weight, int value, int strength){
		this.type=type;
		this.name=name;
		this.weight=weight;
		this.value=value;
		this.strength=strength;

	}
	//returns item weight	
	public int getWeight(){
		return weight;
	}
	//returns item value
	public int getValue(){
		return value;
	}
	//returns item name
	public String getName(){
		return name;
	}
	//return item type (armor, weapon, other)
	public ItemType getType(){
		return type;
	}
	//toString method for printing
	public String toString(){
		return name+" "+weight+" "+value+" "+strength;
	}
	}


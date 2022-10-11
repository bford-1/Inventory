import java.util.*;


public class Item{
		private	ItemType type;
		private String name;
		private int weight;
		private int value;
		private int strength;
	
	public Item(ItemType type, String name, int weight, int value, int strength){
		this.type=type;
		this.name=name;
		this.weight=weight;
		this.value=value;
		this.strength=strength;

	}
	
	public int getWeight(){
		return weight;
	}
	
	public int getValue(){
		return value;
	}
	
	public String getName(){
		return name;
	}
	
	public ItemType getType(){
		return type;
	}
	
	public String toString(){
		return name+" "+weight+" "+value+" "+strength;
	}
	}


import java.util.*;


public class ItemGenerator{
	public static Item generate(){
	List<String> weapons=new ArrayList<>();
	weapons.add("knife");
	weapons.add("sword");
	weapons.add("staff");
	weapons.add("bow and arrow");
	weapons.add("throwing stars");
	
	List<String> armor=new ArrayList<>();
	armor.add("chest plate");
	armor.add("chainmail");
	armor.add("shin guards");
	armor.add("bike helmet");
	armor.add("shield");

	List<String> other=new ArrayList<>();
	other.add("lock picks");
	other.add("bread");
	other.add("key");
	other.add("plant");
	other.add("bone");

	Random number=new Random();
	int weight=number.nextInt(5)+1;
	int value=number.nextInt(5)+1;
	int strength=number.nextInt(5)+1;
	
	int typeSelection=number.nextInt(3);
	ItemType type;
	int itemSelection=number.nextInt(5);
	String itemName;
	if(typeSelection==0){
		type=ItemType.Weapon;
		itemName=weapons.get(itemSelection);
	}
	else if(typeSelection==1){
		type=ItemType.Armor;
		itemName=armor.get(itemSelection);
	}
	else{
		type=ItemType.Other;
		itemName=other.get(itemSelection);
	}
	
 	Item newItem=new Item(type,itemName, weight, value, strength);	
	return newItem;


	}
}


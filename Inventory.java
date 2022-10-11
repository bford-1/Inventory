import java.util.*;


public class Inventory{
		private int maxWeight;
		private Item equippedWeapon;
		private Item equippedArmor;
		private ArrayList<Item> items=new ArrayList<Item>();
	
	//constructer for the class
	Inventory(int maxWeight){
		this.maxWeight=maxWeight;
	}
	
	
	public boolean add(Item item){
		int currentWeight=0;
		for(int i=0;i<items.size();i++){
			currentWeight=currentWeight+items.get(i).getWeight();
		}
		if(currentWeight+item.getWeight()<=maxWeight){
			items.add(item);

			System.out.println(item.getName()+" added");
			return true;
		}
		else{
			System.out.println("item could not be added");
			return false;
		}
	}
	
	public int totalWeight(){
		int sum=0;
		for(int i=0;i<items.size();i++){
			Item itemIteration=items.get(i);
			int itemWeight=itemIteration.getWeight();
			sum+=itemWeight;
		}
		return sum;
	}
	
	public void print(){
		System.out.printf("\n");
		for(int i=0;i<items.size();i++){
			System.out.println(items.get(i));
		}
	}
	
	public void drop(){
		Scanner input=new Scanner(System.in);
		System.out.println("Press the number of the item you want to drop ");
		int a;
		for(int i=0;i<items.size();i++){
			a=i+1;
			System.out.println(a+". "+items.get(i));
		}
		int selection=input.nextInt();
		selection--;
		items.remove(selection);
	}
	
	public void equipWeapon(){
		ArrayList<Item> weaponItems=new ArrayList<Item>();
		for(int i=0;i<items.size();i++){
		   	if(items.get(i).getType()==ItemType.Weapon){
				weaponItems.add(items.get(i));
			}
		}
		System.out.println("pick one item to equip (press the number associated with the item) ");
		for(int a=0;a<weaponItems.size();a++){
			System.out.println((a+1)+". "+weaponItems.get(a));
		
		}
		Scanner scanner=new Scanner(System.in);	
		int itemDrop=scanner.nextInt();
		itemDrop--;
		equippedWeapon=weaponItems.get(itemDrop);
		System.out.println(equippedWeapon.getName()+" was equipped");
		}

	
	public void equipArmor(){
		ArrayList<Item> armorItems=new ArrayList<Item>();
		for(int i=0;i<items.size();i++){
		   	if(items.get(i).getType()==ItemType.Armor){
				armorItems.add(items.get(i));
			}
		}
		System.out.println("pick one item to equip (press the number associated with the item) ");
		for(int a=0;a<armorItems.size();a++){
			System.out.println((a+1)+". "+armorItems.get(a));
		
		}
		Scanner scanner=new Scanner(System.in);	
		int itemDrop=scanner.nextInt();
		itemDrop--;
		equippedArmor=armorItems.get(itemDrop);
		System.out.println(equippedArmor.getName()+" was equipped");
		 }
}



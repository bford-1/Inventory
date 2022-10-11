import java.util.Scanner;
public class Mainmethod{
	public static void main(String args[]) {
		Inventory inv = new Inventory(200);
		
		int i = 1;
		Scanner in = new Scanner(System.in);
		while (i > 0){
			System.out.println("----------------------");
			System.out.println("1. Print Inventory");
			System.out.println("2. Add Random Item");
			System.out.println("3. Drop Item");
			System.out.println("4. Equip Weapon");
			System.out.println("5. Equip Armor");
			System.out.println("6. Exit");
			int choice = in.nextInt();
			if (choice  == 1){
				inv.print();
				i = i = 1;
			}
			else if (choice ==  2){
				inv.add(ItemGenerator.generate());

			}
			else if ( choice == 3){
				inv.drop();
				inv.totalWeight();

				i = i + 1;
			}
			else if (choice == 4) {
				inv.equipWeapon();
				i = i + 1;
			}
			else if(choice == 5){
				inv.equipArmor();
				i = i + 1;
			}
			else if (choice == 6){
				System.out.println("have a nice day :)");
				i = 0;
			}
		}
	}
}
			

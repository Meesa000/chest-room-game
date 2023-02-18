import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.ArrayList;
public class main {


    public static void main(String[] args){
        roomOne();

    }
    public static void roomOne() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> inventory = new ArrayList<>();


        System.out.println("[ ROOM ONE ]");

        boolean askOpenChest = true;
        while (askOpenChest) {
            System.out.println("\nYou see a chest, open it? y/n");
            String openOrNot = scanner.nextLine();
            if (openOrNot.equalsIgnoreCase("y")) {
                System.out.println("You open the chest.");
                System.out.println("\nYou find a rusty sword, take it? y/n");
                String takeSword = scanner.nextLine();

                if (takeSword.equalsIgnoreCase("y")) {
                    System.out.println("You put the sword in your inventory.");
                    inventory.add("1. Sword");
                    System.out.println("\nINVENTORY:" +inventory);
                    break; // after this, end up in room 2

                }
            }

        }
    }


    } // 3 chests in each room
    // each chest has an item with thee option to


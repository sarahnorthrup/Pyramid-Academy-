import java.util.*;



public class dragons {
    public static void main (String[] args) {
// declare
        int x = 1;
        int y = 2;

// print out
        System.out.print("You are in a land full of dragons. In front of you, you see " +
                "two caves. In one cave, the dragon is friendly and will share his " +
                "treasure with you. The other dragon is greedy and hungry and will eat you" +
                "on sight. Which cave will you go into? (1 or 2):");
        //scanner
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
// happy choice
        if (choice == y) {
            System.out.println("You live to fight another day. Congrats Bro :)");
        }
// sad choice
        else {
            System.out.println("You approach the cave..." +
                    "It is dark and spooky..." +
                    "A large dragon jumps out in front of you! He opens his jaws and..." +
                    "Gobbles you down in one bite!");
        }


    }
}

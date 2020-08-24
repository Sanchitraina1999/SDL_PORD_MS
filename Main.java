import java.util.BitSet;

public class Main {
    public static BitSet bs = new BitSet(3);

    public static void main(String[] args) {
        // 0 - for no one logged in!
        // 1 - for AGENT logged in!
        // 2 - for DEPOSITOR logged in!
        MainMenu mainMenu = new MainMenu();
        bs.set(0);
        while (true) {
            int nsb = bs.nextSetBit(0);
            switch (nsb) {
                case 1:
                    System.out.println("\nCurrently Logged in as AGENT");
                    break;
                case 2:
                    System.out.println("\nCurrently Logged in as DEPOSITOR");
                    break;
            }
            mainMenu.display();
        }
    }
}

/*
 * 
 * DS used -
 *
 * BISET
 * HashMap
 * Set
 * Vector
 * List
 * 
 */
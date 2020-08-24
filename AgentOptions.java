public class AgentOptions extends Agent {
    public void display() {
        System.out.println("\n1. List all Depositor's details");
        System.out.println("2. Add new Depositor");
        System.out.println("3. Add new Account");
        System.out.println("4. Logout Agent");
        System.out.println("5. EXIT");
        System.out.print("Choose one of the above:");
        String choice = input.nextLine();
        switch (choice) {
            case "1":
                ListDepositors();
                break;
            case "2":
                AddDepositor();
                break;
            case "3":
                AddAccount();
                break;
            case "4":
                Logout();
                break;
            case "5":
                Exit();
            default:
                System.out.println("Invalid choice :( Please select a valid choice :) \n");
        }
    }

    public void Exit() {
        try {
            Thread.sleep(1000);
            System.out.print("Exiting in 3...");
            Thread.sleep(1000);
            System.out.print("2...");
            Thread.sleep(1000);
            System.out.println("1");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }
}
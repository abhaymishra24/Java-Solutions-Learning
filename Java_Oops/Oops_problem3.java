import java.util.Scanner;


// File: Oops_problem3.java


class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sendMessage(ChatSystem chatSystem, String message) {
        chatSystem.displayMessage(this, message);
    }
}

class ChatSystem {
    public void displayMessage(User user, String message) {
        System.out.println(user.getName() + ": " + message);
    }
}

public class Oops_problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ChatSystem chatSystem = new ChatSystem();

        System.out.print("Enter name of User 1: ");
        User user1 = new User(scanner.nextLine());

        System.out.print("Enter name of User 2: ");
        User user2 = new User(scanner.nextLine());

        System.out.println("Start chatting! Type 'exit' to quit.");

        while (true) {
            System.out.print(user1.getName() + ": ");
            String message1 = scanner.nextLine();
            if (message1.equalsIgnoreCase("Bye")) break;
            user1.sendMessage(chatSystem, message1);

            System.out.print(user2.getName() + ": ");
            String message2 = scanner.nextLine();
            if (message2.equalsIgnoreCase("bye")) break;
            user2.sendMessage(chatSystem, message2);
        }

        System.out.println("Chat ended.");
        scanner.close();
    }
}
import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() { return name; }
    public String getPhoneNumber() { return phoneNumber; }
    public String getEmail() { return email; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }
    public void setEmail(String email) { this.email = email; }

    public void displayContact() {
        System.out.println("Name: " + name);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Email: " + email);
    }
}

public class ContactBook {
    private static ArrayList<Contact> contacts = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n📞 Contact Book");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1: addContact(); break;
                case 2: viewContacts(); break;
                case 3: searchContact(); break;
                case 4: updateContact(); break;
                case 5: deleteContact(); break;
                case 6:
                    System.out.println("Exiting Contact Book. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        }
    }

    private static void addContact() {
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Phone Number: ");
        String phone = scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();

        contacts.add(new Contact(name, phone, email));
        System.out.println("✅ Contact added successfully!");
    }

    private static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println("\n📌 Contact " + (i + 1));
                contacts.get(i).displayContact();
            }
        }
    }

    private static void searchContact() {
        System.out.print("Enter name to search: ");
        String name = scanner.nextLine();
        
        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.println("\n✅ Contact Found:");
                c.displayContact();
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    private static void updateContact() {
        System.out.print("Enter name of contact to update: ");
        String name = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                System.out.print("Enter new Phone Number: ");
                c.setPhoneNumber(scanner.nextLine());
                System.out.print("Enter new Email: ");
                c.setEmail(scanner.nextLine());
                System.out.println("✅ Contact updated successfully!");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }

    private static void deleteContact() {
        System.out.print("Enter name of contact to delete: ");
        String name = scanner.nextLine();

        for (Contact c : contacts) {
            if (c.getName().equalsIgnoreCase(name)) {
                contacts.remove(c);
                System.out.println("✅ Contact deleted successfully!");
                return;
            }
        }
        System.out.println("❌ Contact not found.");
    }
}

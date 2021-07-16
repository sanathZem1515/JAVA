import java.util.*;
public class Main {
    public static void main(String[] args) {
        SList<String> list = new SList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println(list);
        SListIterator<String> iterator = list.iterator();
        while (true) {
            System.out.println("Enter u'r choice:\n1. Insert\n2. Delete\n3. Display\n4.Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();
            if (choice == 1) {
                System.out.println("Enter the data to remove");
                String data = scanner.nextLine();
                iterator.insert(data);
            } else if (choice == 2) {
                iterator.remove();
            } else if (choice == 3) {
                System.out.println(list);
            } else if (choice == 4) {
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }

    }
}
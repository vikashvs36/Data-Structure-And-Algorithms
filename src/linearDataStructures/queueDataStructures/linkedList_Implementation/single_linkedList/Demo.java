package linearDataStructures.queueDataStructures.linkedList_Implementation.single_linkedList;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) throws Exception {

        Queue<Integer> queue= new SingleLinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\nEnter a choice : ");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Clear");
            System.out.println("5. Size");
            System.out.println("6. Display");
            System.out.println("7. IsEmpty");
            System.out.println("8. Exit");

            int choise = sc.nextInt();

            switch (choise) {
                case 1:
                    System.out.println("Enter a value : ");
                    int value = sc.nextInt();
                    try {
                        queue.enqueue(value);
                    } catch (Exception ex) {
                        System.out.println("Error : " + ex.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Deleted Items : " + queue.dequeue());
                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Peek : " + queue.peek());
                    } catch (Exception e) {
                        System.out.println("Error : " + e.getMessage());
                    }
                    break;
                case 4:
                    queue.clear();
                    System.out.println("Array is clear now");
                    break;
                case 5:
                    System.out.println("Size : " + queue.size());
                    break;
                case 6:
                    System.out.println("Display the All inserted items : ");
                    queue.display();
                    break;
                case 7:
                    System.out.println("IsEmpty : "+(queue.isEmpty() ? "Yes" : "No"));
                    break;
                case 8:
                    System.out.println("Thanks.");
                    System.exit(0);
                default:
                    System.out.println("Entered wrong choise.");
            }
        }
    }
}

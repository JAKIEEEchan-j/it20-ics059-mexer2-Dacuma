import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Queue<String> students = new LinkedList<>();

        System.out.print("Enter first student: ");
        students.offer(input.nextLine());

        System.out.print("Enter second student: ");
        students.offer(input.nextLine());

        System.out.print("Enter third student: ");
        students.offer(input.nextLine());

        System.out.println("\nService Order:");

        System.out.println("Served: " + students.poll());

        System.out.print("Enter new student: ");
        students.offer(input.nextLine());

        while (!students.isEmpty()) {
            System.out.println("Served: " + students.poll());
        }

        input.close();
    }
}
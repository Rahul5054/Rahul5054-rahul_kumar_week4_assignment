package Task1;

import java.util.Scanner;

public class StudentManagSys {
    public static void main(String[] args) {
        StudentMang studMang = new StudentMang();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nMini Student Management System:-");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Students");
            System.out.println("4. Exit");
            System.out.print("Please choose an option:- ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID:- ");
                    int id = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Student Name:- ");
                    String name = sc.nextLine();
                    System.out.print("Enter Student City:- ");
                    String city = sc.nextLine();

                    studMang.addStudent(id, name, city);
                    break;

                case 2:
                    System.out.print("Enter Student ID to remove:- ");
                    int removeId = sc.nextInt();
                    studMang.removeStudent(removeId);
                    break;

                case 3:
                    studMang.displayStudents();
                    break;

                case 4:
                    System.out.println("Exiting the system.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

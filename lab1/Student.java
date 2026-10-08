import java.util.Scanner;

public class Student {
    String usn;
    String name;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter USN: ");
        usn = sc.nextLine();

        System.out.print("Enter Name: ");
        name = sc.nextLine();
    }

    
    void display() {
        System.out.println("USN  : " + usn);
        System.out.println("Name : " + name);
        System.out.println("-------------------");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of Student " + (i + 1));

            students[i] = new Student();
            students[i].accept();
        }

  
        System.out.println("\nStudent Details");
        System.out.println("===================");

        for (int i = 0; i < n; i++) {
            students[i].display();
        }

        sc.close();
    }
}
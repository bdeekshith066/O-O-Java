package CIE;

import java.util.Scanner;

public class Student {
  public int usn;
  public String name;
  public int sem;

    public void accepts() {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter USN:");
        usn = s1.nextInt();

        System.out.println("Enter Name:");
        name = s1.next();

        System.out.println("Enter Semester:");
        sem = s1.nextInt();
    }

    public void display() {
        System.out.println("USN: " + usn + " Name: " + name + " Semester: " + sem);
    }
}
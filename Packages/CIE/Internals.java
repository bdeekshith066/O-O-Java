package CIE;

import java.util.Scanner;

public class Internals extends Student {
    int marks[];

    public void acceptInternalMarks(int s) {
        marks = new int[s];
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < s; i++) {
            System.out.println("Enter subject " + (i + 1) + " marks:");
            marks[i] = s1.nextInt();
        }
    }

    public void displayInternalMarks() {
        System.out.print("Internal Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
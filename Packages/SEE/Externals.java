package SEE;

import CIE.Student; 	
import java.util.Scanner;

public class Externals extends Student {
    int seeMarks[];

    public void acceptSeeMarks() {
        seeMarks = new int[5];
        Scanner s1 = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter subject SEE marks:");
            seeMarks[i] = s1.nextInt();
        }
    }

    public void displaySeeMarks() {
        System.out.print("SEE Marks: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }
}
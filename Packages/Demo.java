import CIE.Internals;
import SEE.Externals;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int n;
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter number of students:");
        n = s1.nextInt();

        Internals[] internalsArray = new Internals[n];
        Externals[] externalsArray = new Externals[n];

        for (int i = 0; i < n; i++) {
            internalsArray[i] = new Internals();
            externalsArray[i] = new Externals();

            System.out.println("Enter details for student " + (i + 1));
            internalsArray[i].accepts();
            internalsArray[i].acceptInternalMarks();

            externalsArray[i].accepts();
            externalsArray[i].acceptSeeMarks();
        }

        System.out.println("\nDetails of Students:");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1));
            internalsArray[i].display();
            internalsArray[i].displayInternalMarks();
            externalsArray[i].displaySeeMarks();
        }

        int[][] finalMarks = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                finalMarks[i][j] = internalsArray[i].internalMarks[j] + externalsArray[i].seeMarks[j];
            }
        }

        System.out.println("\nFinal Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("USN: " + internalsArray[i].usn + ", Name: " + internalsArray[i].name +
                    ", Semester: " + internalsArray[i].sem + ", Final Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(finalMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}

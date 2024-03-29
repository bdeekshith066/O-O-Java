/*QUESTION -  Develop a Java program that prints all real solutions to the quadratic equation ax2+bx+c = 0. 
            Read in a, b, c and use the quadratic formula. If the discriminate b2-4ac is negative, 
            display a message stating that there are no real solutions.*/



                                              //CODE

import java.util.Scanner;

class Quadratic {
    int a, b, c;
    double r1, r2, d;

    void input() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the coefficients of a, b, c");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
    }

    void compute() {
        while (a == 0) {
            System.out.println("Not a quadratic equation");
            System.out.println("Enter a non-zero value for a");
            Scanner s = new Scanner(System.in);
            a = s.nextInt();
        }

        d = b * b - 4 * a * c;

        if (d == 0) {
            r1 = -b / (2.0 * a);
            System.out.println("Roots are real and equal");
            System.out.println("Root1 = Root2 = " + r1);
        } else if (d > 0) {
            r1 = (-b + Math.sqrt(d)) / (2.0 * a);
            r2 = (-b - Math.sqrt(d)) / (2.0 * a);
            System.out.println("Roots are real and distinct");
            System.out.println("Root1 = " + r1 + ", Root2 = " + r2);
        } else if (d < 0) {
            System.out.println("Roots are imaginary");
            r1 = -b / (2.0 * a);
            r2 = Math.sqrt(Math.abs(d)) / (2.0 * a);
            System.out.println("Roots = " + r1 + " + i" + r2);
            System.out.println("Roots = " + r1 + " - i" + r2);
        }
    }
}

class QuadraticMain {
    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.input();
        q.compute();
    }
}


                                                 // OUTPUT

1)
Enter the coefficients of a, b, c
1
2
1
Roots are real and equal
Root1 = Root2 = -1.0


2)
Enter the coefficients of a, b, c
2
3
1
Roots are real and distinct
Root1 = -0.5, Root2 = -1.0


3)
Enter the coefficients of a, b, c
5
2
1
Roots are imaginary
Roots = -0.2 + i0.4
Roots = -0.2 - i0.4

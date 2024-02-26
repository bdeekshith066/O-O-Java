                                                                    //Question
/*Create a class Book that contains four members: name, author, price, and num_pages. Include a constructor to set the values for the members. 
Include methods to set and get the details of the objects. Include a toString( ) method that could display the complete details of the book. Develop
a Java program to create n book objects.*/


                                                                    //Code

import java.util.Scanner;

class Books
{

String name,author;
int price,num_pages;
Books(String name,String author,int price,int num_pages)
{
this.name=name;
this.author=author;
this.price=price;
this.num_pages=num_pages;
}

Scanner input=new Scanner(System.in);

Books(){}

void accept()
{
System.out.print("Enter name of book: ");
name=input.nextLine();
System.out.print("Enter name of author: ");
author=input.nextLine();
System.out.print("Enter price of the book: ");
price=input.nextInt();
System.out.print("Enter no. of pages in the book: ");
num_pages=input.nextInt();
System.out.print("\n");
}

public String toString()
{
String name,author,price,num_pages;
name="Book name: " + this.name + "\n";
author="Author name: " + this.author + "\n";
price="Price: " + this.price + " Rs\n";
num_pages="Number of pages: " + this.num_pages + " pages\n";
 
return name + author + price + num_pages;
}

}

class BookRun
{

public static void main(String[] args)
{
Scanner input=new Scanner(System.in);

/*String name,author;
int price,num_pages;*/
System.out.print("Enter number of books: ");
int n=input.nextInt();
/*input.nextLine();*/
System.out.print("\n");

Books[] book=new Books[n];

for(int i=0;i<n;i++)
{
System.out.println("Book " + (i+1) + ": ");

book[i]=new Books();
book[i].accept();
}

for(int i=0;i<n;i++)
{
System.out.println("Book " + (i+1) + ":\n" + book[i] + "\n");
}


input.close();

}

}




                                                                                  /*Output
Enter number of books: 2

Book 1:
Enter name of book: Java1
Enter name of author: Deekshith B
Enter price of the book: 418
Enter no. of pages in the book: 341

Book 2:
Enter name of book: Java2
Enter name of author: Dixit
Enter price of the book: 300
Enter no. of pages in the book: 250

Book 1:
Book name: Java1
Author name: Deekshith B
Price: 418 Rs
Number of pages: 341 pages


Book 2:
Book name: Java2
Author name: Dixit
Price: 300 Rs
Number of pages: 250 pages
*/

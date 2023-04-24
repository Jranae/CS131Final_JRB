import java.util.*;
/*creates an array that is capable of hold four Book objects
 * uses the parameterized constructor to specify the data 
 * in the first four elements of the array
 * calls reduceBooks method to display the discount on the four books
 * @author Jaleah Beason
 */
public class MyBook extends Book implements Discounts{


 public static void main(String[] args){

     Book[] books = new Book[6];

     Book book1 = new Book("It Starts with Us", "Collen Hoover", 1320, 149.99);
     Book book2 = new Book("It Ends with Us", "Colleen Hoover", 350, 10.99);
     Book book3 = new Book("A Dance with Dragons", "Georger R. R. Martin", 180, 8.99);
     Book book4 = new Book("The Winds of Winter", "George R. R. Martin", 320, 21.42);
     


     books[0] = book1;
     books[1] = book2;
     books[2] = book3;
     books[3] = book4;
     

     for (Book u : books)
         System.out.print(u);
     
     book1.reduceBooks();
     book2.reduceBooks();
     book3.reduceBooks();
     book4.reduceBooks();
    
 
		}

 }

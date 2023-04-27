import java.util.*;
/*  creates an array that is capable of hold four Book objects
 *  uses the parameterized constructor to specify the data 
 *  in the first four elements of the array
 *  calls reduceBooks method to display the discount on the four books
 *  @author Jaleah Beason
 *  @version 1.0
 */
public class MyBook extends Book implements Discounts{
//book 1 89.994
//book 2 6.
//book 3 8.99
//book 4 21.42

 public static void main(String[] args){

     Book[] books = new Book[4];
     
     Book book1 = new Book(1 , 89.99 ,"" [1]);
     book1.orderBook();
     System.out.println(book1.recieptStructure());
     //Book book2 = new Book(int [] quantityOrdered, double subTotal, String [] nameBook);
     //book2.orderBook();
     //System.out.println(book2.recieptStructure());
     //Book book3 = new Book( int [] quantityOrdered, double subTotal, String [] nameBook);
    // book3.orderBook();
    // System.out.println(book3.recieptStructure());
    // Book book4 = new Book(int [] quantityOrdered, double subTotal, String [] nameBook);
     //book4.orderBook();
     
     
     System.out.println(book1.recieptStructure());
     //System.out.println(book2.recieptStructure());
     //System.out.println(book3.recieptStructure());
     //System.out.println(book4.recieptStructure());
    
     books[0] = book1;
     //books[1] = book2;
     //books[2] = book3;
     //books[3] = book4;
     
     book1.reduceBooks();
     //book2.reduceBooks();
     //book3.reduceBooks();
     //book4.reduceBooks();
     
		}

 }

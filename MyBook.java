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

	 Book books = new Book();
	 Store bookStore = new Store();
     
     
     Book books1 = new Book("It Starts With us", "Jalelee B." , 345, 54.30);
     
     Book books2 = new Book("Perks of Being A Wildflower", "LeLe B." , 378 , 35.60);
     
     Book books3 = new Book("Game of Thrones", "Leah R." , 432 , 40.00);
     
     Book books4 = new Book("Where the Crawdads Sing", "Jaleah B." , 520 , 43.00);
     
     bookStore.bookList[0]=books1;
     bookStore.bookList[1]=books2;
     bookStore.bookList[2]=books3;
     bookStore.bookList[3]=books4;
     
     bookStore.orderBook();
    
     
		}

 }

import java.util.Arrays;
import java.util.Scanner;
/*This Class will be on a Bookstore that is having a 40% off sale
*Program uses Scanner class
*This class holds data such as title, author, pages, price, and discounted price
*
  @author Jaleah Beason
  @version 1.0
*/
public class Book implements Discounts {
		private String _title;
	    private String _author;
	    private int _pages;
	    private double _price;
	    public int numBooks = 1;
    	public int book =0 ;
    	public int quantity;
		private double subTotal;
		private String [] nameBook;
	    
		public  Book(){
	        for (int i = 0; i > 4; i++)
	            numBooks++;

	    }
	    public Book( int quantity, double subTotal, String [] nameBook)
	    {  
	        this.quantity = quantity;
			this.subTotal = subTotal;
			nameBook = new String[4];
			//System.out.println("created name book");
			
	    }
	 
	    //implementing a string builder for receipt
	    public String recieptStructure(){
			
			StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("Book: _title:" + _title +"\n");
			sb.append(" _author:" + _author + "\n");
			sb.append(" _pages:" + _pages +"\n");
			sb.append(" _price:" + _price +"\n");
			sb.append(" numBooks=:" + numBooks + "\n");
			sb.append(" reducedPrice:" + reduceBooks() + "\n");
			sb.append("==================================\n");
			
			return sb.toString();
	    }

	    public String getTitle()

	    {
	        return _title;
	    }

	    public void setTitle(String title)

	    {
	        this._title = title;
	    }

	    public String getAuthor()

	    {
	        return _author;
	    }

	    public void setAuthor(String author)

	    {
	        this._author = author;
	    }

	    public int getPages()

	    {
	        return _pages;
	    }

	    public void setPages(int pages)

	    {
	        this._pages = pages;
	    }

	    public double getPrice()

	    {
	        return _price;
	    }

	    public void setPrice(double price)

	    {
	        this._price = price;

	    }

		public double getSubTotal() {
			return subTotal;
		}

		public void setSubTotal(double subTotal) {
			this.subTotal = subTotal;
		}

		public String[] getNameBook() {
			return nameBook;
		}

		public double reduceBooks() 
	    {
			double per = .4;
			double cost = getPrice();
			double reducedPrice = (cost)-(per * cost);

	     return reducedPrice;
	    }
	    public void orderBook() {
	    	Scanner scan = new Scanner(System.in);
	    	Scanner input;
	    	input = new Scanner(System.in);
			do {
	            System.out.println("Please Enter A Book Number Between 1-4 or Press 0 to Exit");
	            book = input.nextInt();

	            if (book == 0)
	                break;

	            System.out.println("Please Enter Quantity");
	            int quantity = scan.nextInt();

	            switch (book) {
	                case 1:
	                    double bookPrice1 = 149.99;
	                    subTotal += (149.99 * quantity);
	                    System.out.println("It Starts with Us");
	                    break;
	                case 2:
	                	double bookPrice2 = 10.99;
	                    subTotal += (10.99 * quantity);
	                    nameBook[1] = "It Ends with Us";
	                    break;
	                case 3:
	                	double bookPrice3 = 8.99;
	                    subTotal += (8.99 * quantity);
	                    nameBook[2] = "A Dance with Dragons";
	                    break;
	                case 4:
	                	double bookPrice4 = 21.42;
	                    subTotal += (21.42 * quantity);
	                    nameBook[3] = "The Winds of Winter";
	                    break;

	                default:
	                    System.out.println("Please enter a valid product No.");
	            }
			}
		while (book != 0);
		        for (int i = 1; i < 5; i++) {
		        	System.out.println( "Product: " + nameBook[i]
		        		    + " Quantity: " + quantity++);
		        }
			}
	    
     

	    @Override
		public String toString() {
			return "Book [_title=" + _title + ", _author=" + _author + ", _pages=" + _pages + ", _price=" + _price
					+ ", numBooks=" + numBooks + ", book=" + book + ", quantityOrdered="
					+ ", subTotal=" + subTotal + ", nameBook="
					+ Arrays.toString(nameBook) + ", recieptStructure()=" + recieptStructure() + "]";
		}
	    
}

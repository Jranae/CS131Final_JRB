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
	    public int quantity;
	    
	    
		public  Book(){
	        

	    }
	    public Book( String title, String author, int pages, double price)
	    {  
	    	this._title = title;
		    this._author = author;
		    this._pages = pages;
		    this._price = price;

			
			//System.out.println("created name book");
			
	    }
	 
	    //implementing a string builder for receipt
	    public String recieptStructure(){
			
			StringBuilder sb = new StringBuilder("==================================\n");
			sb.append("Book: _title:" + _title +"\n");
			sb.append(" _author:" + _author + "\n");
			sb.append(" _pages:" + _pages +"\n");
			sb.append(" _price:" + _price +"\n");
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
		public double reduceBooks() 
	    {
			double per = .4;
			double cost = getPrice();
			double reducedPrice = (cost)-(per * cost);

	     return reducedPrice;
	    }
	   
	    
     

	    @Override
		public String toString() {
			return "Book [_title=" + _title + ", _author=" + _author + ", _pages=" + _pages + ", _price=" + _price
					+ ", recieptStructure()=" + recieptStructure() + "]";
		}
	    
}

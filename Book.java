/*This Class will be on a Bookstore that is having a 40% off sale
* user will go through and pick out books of interest and go to check out
*This class holds data such as title, author, pages, price, and discounted price
* @author Jaleah Beason
*/
public class Book implements Discounts {
	 	private String _title;
	    private String _author;
	    private int _pages;
	    private double _price;
	    public int numBooks = 1;
	    public  Book(){
	        for (int i = 0; i > 6; i++)
	            numBooks++;

	    }

	    public Book(String title, String author, int pages, double price)
	    {  
	        this._title = title;
	        this._author = author;
	        this._pages = pages;
	        this._price = price;
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
			return "Book [_title:" + _title + ", _author:" + _author + ", _pages:" + _pages + ", _price:" + _price
					+ ", numBooks=:" + numBooks + ", reducedPrice:" + reduceBooks() + "]\n";
		}
	    
}

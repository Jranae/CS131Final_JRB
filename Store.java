import java.util.Scanner;

public class Store {
	
	 public int numBooks = 1;
 	public int book =0 ;
 	
 	private double subTotal;
 	public Book [] bookList = new Book[4];
	
 	public  Store(){
        for (int i = 0; i > 4; i++)
            numBooks++;

    }
    public Store(double subTotal, int index)
    {  
		this.subTotal = subTotal;
		
		//System.out.println("created name book")
    }
 
	public void orderBook() {
    	Scanner scan = new Scanner(System.in);
    	Scanner input;
    	input = new Scanner(System.in);
		do {
			
            System.out.println("Please Enter A Book Number Between 1-4 or Press 5 to Exit");
            book = input.nextInt();

            if (book == 0)
                break;

            System.out.println("Please Enter Quantity");
            int quantity= scan.nextInt();

            switch (book) {
                case 1:
                    double bookPrice1 = 149.99;
                    subTotal += (149.99 * bookList[0].quantity);
                    System.out.println(bookList[0].getTitle());
                    System.out.println(bookList[0].recieptStructure());
                    break;
                case 2:
                	double bookPrice2 = 10.99;
                    subTotal += (10.99 * bookList[1].quantity);
                    System.out.println(bookList[1].getTitle());
                    System.out.println(bookList[1].recieptStructure());
                    break;
                case 3:
                	double bookPrice3 = 8.99;
                    subTotal += (8.99 * bookList[2].quantity);
                    System.out.println(bookList[2].getTitle());
                    System.out.println(bookList[2].recieptStructure());
                    break;
                case 4:
                	double bookPrice4 = 21.42;
                    subTotal += (21.42 * bookList[3].quantity);
                    System.out.println(bookList[3].getTitle());
                    System.out.println(bookList[3].recieptStructure());
                    break;
                case 0:
                	System.exit(0);
                default:
                    System.out.println("Please enter a valid product No.");
                
            }
            
		}
	while (book != 0);
	        for (int i = 1; i < 5; i++) {
	        	System.out.println( "Product: " + bookList[i]
	        		    + " Quantity: " );
	        }
		}
}

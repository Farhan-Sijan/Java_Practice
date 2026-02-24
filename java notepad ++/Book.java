import java.lang.*;
public class Book
{
   private String isbn;
   private String bookTitle;
   private String authorName;
   private double price;
   private int availableQuantity;

     public Book()
     {
        System.out.println("D.C called");
	 }
       public Book(String isbn,String bookTitle,String authorName,double price,int availableQuantity)
      {
        this.isbn=isbn;
        this.bookTitle=bookTitle;
        this.authorName=authorName;
        this.price=price;
        this.availableQuantity=availableQuantity;
        System.out.println("P.C Called");
	  }
     public void setIsbn(String isbn)
     {
       this.isbn=isbn;
     }
     public void setbookTitle(String bookTitle)
     {
       this.bookTitle=bookTitle;
     }
      public void setauthorName(String authorName)
     {
       this.authorName=authorName;
     }
     public void setPrice(int price)
     {
       this.price=price;
     }
      public void setavailableQuantity(int availabeQuantity)
     {
        this.availableQuantity=availableQuantity;
     }
     public String getIsbn()
    {
      return this.isbn;
    }
     public String getBookTitle()
    {
       return this.bookTitle;
    }
     public String getAuthorName()
    {
      return this.authorName;
    }
     public double getPrice()
     {
       return this.price;
     }
      public int getAvailableQuantity()
     {
        return this.availableQuantity;
     }
    public void addQuantity(int amount)
    {
       availableQuantity+=amount;
    }
      public void sellQuantity(int amount)
     {
       availableQuantity -=amount;
     }
       public void showDetails()
     {
       System.out.println("ISBN :"+this.isbn);
       System.out.println("BOOKTITLE :"+this.bookTitle);
       System.out.println("AUTHORNAME :"+this.authorName);
       System.out.println("PRICE  :"+this.price);
       System.out.println("AVAILABLEQUANTITY :"+this.availableQuantity);
     }
}
public class Book {
    //variables
    String bookName;
    String authorName;
    int year;
    int price;
    int bookNo;
    public static int syc=0;

    //constructors
    public Book(){}
    public Book(String bookName, String authorName, int year, int price) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }
    public Book(String bookName, String authorName, int year, int price,int BookNo) {
        this.bookNo=BookNo;
        this.bookName = bookName;
        this.authorName = authorName;
        this.year = year;
        this.price = price;
    }

    //methods


    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", bookNo=" + bookNo +
                '}';
    }
}

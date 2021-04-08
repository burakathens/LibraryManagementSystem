import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public ArrayList<Book> bookList=new ArrayList<>();
    public static void main(String[] args) {
    Runner runner=new Runner();
    Book book1=new Book("Veba Geceleri","Orhan PAMUK",2021,22,1001+Book.syc);
    runner.bookList.add(Book.syc,book1);
    Book.syc++;
    Book book2=new Book("Körlük","Jose SARAMAGO",2019,27,1001+Book.syc);
    runner.bookList.add(Book.syc,book2);
    Book.syc++;
    Book book3=new Book("1984","George ORWELL",1984,22,1001+Book.syc);
    runner.bookList.add(Book.syc,book3);
    Book.syc++;

    runner.ShowMenu();
    }

    //methods
    public void AddBook(){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type book's name: ");
        String name=scanner.nextLine();
        System.out.println("Please type author's name: ");
        String aName=scanner.nextLine();
        System.out.println("Please type the year of publication: ");
        int year=scanner.nextInt();
        System.out.println("Please type the price ($): ");
        int price=scanner.nextInt();
        int ss=1001;
        Book book=new Book(name,aName,year,price,ss+Book.syc);
        bookList.add(Book.syc,book);
        Book.syc++;




    }
    public void DelBook(){
        Scanner scan1=new Scanner(System.in);
        System.out.println("Please type BookNo to delete: ");
        if(bookList.size()==0){
            System.out.println("There's no book to delete! ");
            System.exit(0);
        }
        int a=scan1.nextInt();
        for(Book b:bookList){
            if(b.bookNo==a){
                bookList.remove(b);
                System.out.println("Book is removed from Library...\n");
              ListBook();
                break;
            }
        }

    }
    public void SearchBook(){
        System.out.println("Please type Book No: ");
        Scanner scan2=new Scanner(System.in);
        int t=scan2.nextInt();
        int t2;
        for(Book b:bookList){
            if(b.bookNo==t){
                t2=bookList.indexOf(b);
                System.out.println("Book is found in Library...");
                System.out.println("1- " +
                        b.bookName+" by " +b.authorName+" ("+b.year+") "+"$"+b.price);
                System.out.println("");

                break;
            }
        }

    }
    public void ListBook(){
        System.out.println("Available Books in Library: ");
        System.out.println("---------------------------------------------------");

        for (Book b:bookList){
            System.out.println((bookList.indexOf(b)+1)+"- " +
                    b.bookName+" by " +b.authorName+" ("+b.year+") "+"$"+b.price+" BN:"+b.bookNo);
        }
        System.out.println("---------------------------------------------------");
        System.out.println("             \"BN\" shows Book No");
        System.out.println("---------------------------------------------------\n");
    }
    public void ShowMenu(){
        String console="========= BOOK APPLICATION =========\n" +
                      "1: Add Book\n" +
                      "2: Delete Book with no\n" +
                      "3: Search Book with no\n" +
                      "4: List All Books\n" +
                      "5: Exit\n" +
                       "====================================";

        Scanner scan=new Scanner(System.in);
        int put;
        do{
            System.out.println(console);
            System.out.print("Please make your choice \n>>");
            put=scan.nextInt();

            switch (put){
                case 1:
                    AddBook();
                    break;
                case 2:
                    DelBook();
                    break;
                case 3:
                    SearchBook();
                    break;
                case 4:
                    ListBook();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Please type between 1 - 5 ");
                    ShowMenu();
            }
        }while (put!=5);
            {
                System.out.println("Thanks for using BookApp !");
            }
            scan.close();


    }

}

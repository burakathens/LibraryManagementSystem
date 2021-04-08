import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public ArrayList<Book> bookList=new ArrayList<>();
    public static void main(String[] args) {
    Runner runner=new Runner();
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

    }
    public void SearchBook(){

    }
    public void ListBook(){

    }
    public void ShowMenu(){
        String console="========= BOOK APPLICATION =========\n" +
                      "1: Add Book\n" +
                      "2: Delete Book with no\n" +
                      "3: Search Book with no\n" +
                      "4: List All Books\n" +
                      "5: Finish\n";

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
                for (Book b:bookList){
                    System.out.println(b);
                }

                System.out.println("Thanks for using BookApp !");
            }


    }
}

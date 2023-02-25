import java.util.Scanner;

public class lms
{
    public static void main(String[] args) {
        char r;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("****************************************");
            System.out.println("         LIBRARY MANAGEMENT SYSTEM        ");
            System.out.println("****************************************");
            System.out.println("Press 1 to Add Book.");
            System.out.println("Press 2 to Issue a Book.");
            System.out.println("Press 3 to Return a Book.");
            System.out.println("Press 4 to print Complete Issue Details.");
            System.out.println("Press 5 to Exit.");
            System.out.println("****************************************");

            System.out.println("Enter your choice:");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 -> {
                    Library a = new Library();
                    a.add();
                }
                case 2 -> {
                    Library b = new Library();
                    b.issue();
                }
                case 3 -> {
                    Library c = new Library();
                    c.returnBook();
                }
                case 4 -> {
                    Library d = new Library();
                    d.details();
                }
                case 5 -> {
                    Library e = new Library();
                    e.exit();
                }
                default -> System.out.println("Select a Valid choice!");
            }
            System.out.println("Want to select another Option Y/N :");
            r = sc.next().charAt(0);

        }
        while (r == 'y' || r == 'Y') ;
        if (r == 'n' || r == 'N') {
            Library ret = new Library();
            ret.exit();
        }
    }
}

//    Library
class Library {
    static String name, idate, rdate;
    static int id, total;

    //    Add Book
    void add() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter the Book Name, Book Id and Book Price:");
        String Bname = sc1.nextLine();
        int Bid = sc1.nextInt();
        int Bprice = sc1.nextInt();
        System.out.println("Book Details are: ");
        System.out.println("Book Name: " + Bname + "\n Book Id: " + Bid + "\n Book Price: " + Bprice);
    }

    //    Issued Books
    void issue() {
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Book Name:");
        name = sc2.nextLine();
        System.out.println("Book Id:");
        id = sc2.nextInt();
        sc2.nextLine();
        System.out.println("Book Issue Date:");
        idate = sc2.nextLine();
        System.out.println("Total Number 0f Books Issued:");
        total = sc2.nextInt();
        sc2.nextLine();
        System.out.println("Return Book Date:");
        rdate = sc2.nextLine();
    }

    //    Return a Book
    void returnBook() {
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Enter Book ID:");
        int bookid = sc3.nextInt();

        if (bookid == id) {
            System.out.println("Total Details are: ");
            System.out.println("Book Name: " + Library.name);
            System.out.println("Book Id: " + Library.id);
            System.out.println("Issue Date: " + Library.idate);
            System.out.println("Total Number 0f Books Issued: " + Library.total);
            System.out.println("Book Return Date: " + Library.rdate);
        } else {
            System.out.println("ID Invalid!. Please enter a valid ID.");
        }
    }

    //    Details
    void details() {
        System.out.println("Book Name: " + Library.name);
        System.out.println("Book Id: " + Library.id);
        System.out.println("Issue Date: " + Library.idate);
        System.out.println("Total Number 0f Books Issued: " + Library.total);
        System.out.println("Book Return Date: " + Library.rdate);
    }

    //    Exit
    void exit() {
        System.exit(0);
    }
}



public class library {
    int book_id;
    String tittle;
    String author;
    int availablecopies;

    public library(int book_id , String tittle , String author , int availablecopies);
    book_id = book_id;
    tittle = tittle;
    author = author;
    availablecopies = availablecopies;
// here we have defined the construtor  for the given class//

// next we have to define the methods for borrowing books//
 
public void borrowbook(){
    if (availablecopies > 0){
        availablecopies--;
        System.out.println("book has been borrowed ");
    } else{
        System.out.println("all copies borrowed");
    }
    }

    public void displayDetails(){
        System.out.println("book id:" + book_id);
        System.out.println("tittle of the book:" tittle);
        System.out.println("author of the book:" + author );
        System.out.println("available copies:" + availablecopies);
        
        // we will get the book id which will match the borrowe id
    public int getBookId() {
        return bookId;
    }
}

// Main class for Library Management System
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array of 5 books
        Book[] books = new Book[5];
        books[0] = new Book(1, "Java Programming", "James Gosling", 3);
        books[1] = new Book(2, "Data Structures", "Robert Lafore", 2);
        books[2] = new Book(3, "Operating Systems", "Abraham Silberschatz", 4);
        books[3] = new Book(4, "Computer Networks", "Andrew S. Tanenbaum", 1);
        books[4] = new Book(5, "Database Management", "Raghu Ramakrishnan", 5);

        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Borrow a Book");
            System.out.println("2. Display Details of All Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
        }
            switch (choice) {
                case 1:
                    System.out.print("Enter the Book ID to borrow: ");
                    int bookId = scanner.nextInt();
                    boolean found = false;

                    for (Book book : books) {
                        if (book.getBookId() == bookId) {
                            book.borrowBook();
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Book with ID " + book_id + " not found.");
                    }
                    break;

                case 2:
                    System.out.println("\nDetails of all books:");
                    for (Book book : books) {
                        book.displayDetails();
                    }
                    break;

                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }





    



    


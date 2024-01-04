package owu.javahomework.com;

public class BookDemo {
    public static void main(String[] args) {
        Book[] bookArray = new Book[5];

        Book book = new Book("Harry Potter", 4101, new String[]{"Joanne Rowling"}, "Novell");
        Book book2 = new Book("Lord of the Rings", 1120, new String[]{"J. Talkin"}, "Adventures");
        Book book3 = new Book("1984", 300, new String[]{"George Orwell"}, "Dystopia");
        Book book4 = new Book(
                        "The Master and Margarita",
                        350,
                        new String[]{"Mikhail Bulgakov"},
                        "Satire, Fantasy"
        );
        Book book5 = new Book(
                "To Kill a Mockingbird",
                320,
                new String[]{"Harper Lee"},
                "Novel, Drama"
        );

        book.setGenre("Fantasy");

        bookArray[0] = book;
        bookArray[1] = book2;
        bookArray[2] = book3;
        bookArray[3] = book4;
        bookArray[4] = book5;

        for (Object o : bookArray) {
            System.out.println(o);
        }
    }
}

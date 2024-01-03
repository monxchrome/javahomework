package owu.javahomework.com;

public class BookDemo {
    public static void main(String[] args) {
        Object[] objectArray = new Object[5];
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

        objectArray[0] = book;
        objectArray[1] = book2;
        objectArray[2] = book3;
        objectArray[3] = book4;
        objectArray[4] = book5;

        for (Object o : objectArray) {
            System.out.println(o);
        }
    }
}

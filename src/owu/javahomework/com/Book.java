package owu.javahomework.com;

public class Book {
    String title;

    int pages;

    String[] authors;

    String genre;

    public Book(String title, int pages, String[] authors, String genre) {
        this.title = title;
        this.pages = pages;
        this.authors = authors;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int newPages) {
        pages = newPages;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void setAuthors(String[] newAuthors) {
        authors = newAuthors;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        genre = newGenre;
    }

    @Override
    public String toString() {
        return "Title: "
                + title + "\nPages: "
                + pages + "\nAuthors: "
                + arrayToString(authors) + "\nGenre: " +
                genre + "\n";
    }

    private String arrayToString(String[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
        }
        return result.toString();
    }
}

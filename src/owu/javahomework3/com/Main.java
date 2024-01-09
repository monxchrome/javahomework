package owu.javahomework3.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Paper> papers = new ArrayList<>();
        ArrayList<Author> authors = new ArrayList<>();
        ArrayList<Genre> genres = new ArrayList<>();

        Author author = new Author();
        author.setAge(44);
        author.setName("Alex");
        author.setSurname("Ikoros");
        authors.add(author);

        Genre genre = new Genre();
        genre.setGenreName("Fantasy");
        genre.setGenreId(1);
        Genre genre2 = new Genre();
        genre2.setGenreName("Novel");
        genre2.setGenreId(2);
        genres.add(genre);
        genres.add(genre2);

        Paper paper = new Paper();
        paper.setLength(20);
        paper.setMaterial("Bamboo");
        papers.add(paper);

        Book book = new Book();
        book.setName("Galaxy");
        book.setAuthors(authors);
        book.setGenres(genres);
        System.out.println(book);

        Magazine magazine = new Magazine();
        magazine.setMagazineName("TestMagazine");

        Comics comics = new Comics();
        comics.setComicsName("TestComics");

        System.out.println(papers);

    }
}

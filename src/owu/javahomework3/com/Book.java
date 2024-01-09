package owu.javahomework3.com;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = false)
public class Book extends Paper {
    private String name;

    private List<Genre> genres;

    private List<Author> authors;

    public void addGenre(Genre genre) {
        if (genres == null) {
            genres = new ArrayList<>();
        }

        genres.add(genre);
    }

    public void addAuthor(Author author) {
        if (authors == null) {
            authors = new ArrayList<>();
        }

        authors.add(author);
    }
}

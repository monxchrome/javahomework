package owu.javaadditional.com;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Builder
public class Post {
    private int userId;

    private int id;

    private String title;

    private String body;

    private ArrayList<Comment> comments;

    public void addComment(Comment comment) {
        comments.add(comment);
    }
}

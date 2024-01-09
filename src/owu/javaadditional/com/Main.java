package owu.javaadditional.com;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Post> posts = new ArrayList<>();
        ArrayList<Comment> comments = new ArrayList<>();
        Post post1 = Post.builder()
                .userId(1)
                .body("Hello")
                .title("World")
                .id(1)
                .comments(new ArrayList<>())
                .build();
        Post post2 = Post.builder()
                .userId(1)
                .body("aasdasd")
                .title("Wdddsdsorld")
                .id(2)
                .comments(new ArrayList<>())
                .build();
        Post post3 = Post.builder()
                .userId(2)
                .body("lorem")
                .title("ipsum")
                .id(3)
                .comments(new ArrayList<>())
                .build();

        Comment comment1 = Comment.builder()
                .name("Helllooo")
                .body("Wooooorld")
                .postId(1)
                .id(1)
                .build();

        Comment comment2 = Comment.builder()
                .name("asdqwe")
                .body("asdasd")
                .postId(1)
                .id(2)
                .build();
        Comment comment3 = Comment.builder()
                .name("Helllasdasdasdooo")
                .body("Wooodsadsadoorld")
                .postId(2)
                .id(3)
                .build();

        posts.add(post1);
        posts.add(post2);
        posts.add(post3);

        comments.add(comment1);
        comments.add(comment2);
        comments.add(comment3);

        for (Post post : posts) {
            for (Comment comment : comments) {
                if (post.getId() == comment.getPostId()) {
                    post.addComment(comment);
                }
            }
        }
        System.out.println(posts);
    }
}

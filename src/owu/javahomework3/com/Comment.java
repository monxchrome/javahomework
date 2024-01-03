package owu.javahomework3.com;

public class Comment {
    private int postId;

    private int id;

    private String name;

    private String email;

    private String body;

    public Comment(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId(int postId) {
        return postId;
    }

    public void setPostId(int newPostId) {
        postId = newPostId;
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String getName(String name) {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getEmail(String email) {
        return email;
    }

    public void setEmail(String newEmail) {
        email = newEmail;
    }

    public String getBody(String Body) {
        return body;
    }

    public void setBody(String newBody) {
        body = newBody;
    }

    @Override
    public String toString() {
        return "Post ID: " + postId + '\n' +
                "Id: " + id + '\n' +
                "Name: " + name + '\n' +
                "Email" + email + '\n' +
                "Body" + body + '\n';
    }
}

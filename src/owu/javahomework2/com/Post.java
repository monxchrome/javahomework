package owu.javahomework2.com;

public class Post {
    private int userId;

    private int id;

    private String title;

    private String body;

    public Post(int userId, int id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }

    public int getUserId(int userId) {
        return userId;
    }

    public void setUserId(int newUserId) {
        userId = newUserId;
    }

    public int getId(int id) {
        return id;
    }

    public void setId(int newId) {
        id = newId;
    }

    public String getTitle(String title) {
        return title;
    }

    public void setTitle(String newTitle) {
        title = newTitle;
    }

    public String getBody(String body) {
        return body;
    }

    public void setBody(String newBody) {
        body = newBody;
    }

    @Override
    public String toString() {
        return "User ID: " + userId + '\n' +
                "Id: " + id + '\n' +
                "Title: " + title + '\n' +
                "Body" + body + '\n';
    }
}

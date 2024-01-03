package owu.javahomework2.com;

public class PostDemo {
    public static void main(String[] args) {
        Object[] arrayObject = new Object[5];

        Post post = new Post(1, 1, "Hello", "World");
        Post post2 = new Post(1, 2, "sunt", "quia");
        Post post3 = new Post(2, 3, "asd", "qwe");
        Post post4 = new Post(2, 4, "ert", "rty");
        Post post5 = new Post(2, 5, "asdasd", "qweqwe");

        arrayObject[0] = post;
        arrayObject[1] = post2;
        arrayObject[2] = post3;
        arrayObject[3] = post4;
        arrayObject[4] = post5;

        for (Object o : arrayObject) {
            System.out.println(o);
        }
    }
}

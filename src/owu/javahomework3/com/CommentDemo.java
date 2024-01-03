package owu.javahomework3.com;

public class CommentDemo {
    public static void main(String[] args) {
        Object[] arrayObject = new Object[5];

        Comment comment = new Comment(1,1, "id", "Eliseo@gardner.biz", "laudantium");
        Comment comment2 = new Comment(1,2, "a", "asd@gardner.biz", "lddd");
        Comment comment3 = new Comment(1,3, "sdf", "Elsdf@gardner.biz", "sdfgg");
        Comment comment4 = new Comment(2,4, "fff", "fffd@gardner.biz", "dffddf");
        Comment comment5 = new Comment(3,5, "gfgf", "gfg@gardner.biz", "fgfgg");

        comment2.setEmail("hellookten@owucom.ua");

        arrayObject[0] = comment;
        arrayObject[1] = comment2;
        arrayObject[2] = comment3;
        arrayObject[3] = comment4;
        arrayObject[4] = comment5;

        for (Object o : arrayObject) {
            System.out.println(o);
        }
    }
}

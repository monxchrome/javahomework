package owu.javahomework.com;

public class BuilderDemo {
    public static void main(String[] args) {
        User user = User.builder()
                .id(1)
                .name("Stefan")
                .email("admin@admin.com")
                .address(
                        Address.builder()
                                .street("Kulas")
                                .suite("Apt. 556")
                                .city("Gwenborough")
                                .zipcode("92998-3874")
                                .geo(
                                        Geo.builder()
                                                .lat("-37.3159")
                                                .lng("81.1496")
                                                .build()
                                )
                                .build()
                )
                .phone("+380675555555")
                .website("admin.com")
                .company(
                        Company.builder()
                                .name("Coinis")
                                .catchPhrase("Multi-layered client-server neural-net")
                                .bs("harness real-time e-markets")
                                .build()
                )
                .build();
        System.out.println(user);
    }
}

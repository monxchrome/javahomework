package owu.javahomework2.com;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum LaptopEnum {
    GAMING("Gaming"),
    BASE("For work");

    private final String userFriendlyName;

    public void printUserFriendly() {
        System.out.println("Type: " + userFriendlyName);
    }
}

package ch15;

public interface Buy {
    void Buy();

    default void order() {
        System.out.println("Buy Order");
    }
}

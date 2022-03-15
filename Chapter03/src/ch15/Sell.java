package ch15;

public interface Sell {
    void Sell();

    default void order() {
        System.out.println("Sell Order");
    }
}

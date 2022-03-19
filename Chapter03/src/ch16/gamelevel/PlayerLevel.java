package ch16.gamelevel;

public abstract class PlayerLevel {
    abstract void run();
    abstract void jump();
    abstract void turn();
    abstract void showLevelMessage();

    final public void go(int count) {
        run();
        for(int i=0; i<count; i++) {
            jump();
        }
        turn();
    }
}

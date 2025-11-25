public class Human implements Movable, Speakable {
    @Override
    public String speak() {
        return "Random gibberish";
    }

    @Override
    public String move() {
        return "Walking forward";
    }
}

package enumeration;

enum Signal {
    GREEN, YELLOW, RED
}

enum num {

}

public class TrafficLight {
    Signal color = Signal.RED;
    public void change() {
        switch (color) {
            case RED:
                color = Signal.GREEN;
                break;
            case YELLOW:
                color = Signal.RED;
                break;
            case GREEN:
                color = Signal.YELLOW;
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(Signal.RED);
    }
}
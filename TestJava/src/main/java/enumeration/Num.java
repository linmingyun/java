package enumeration;

public enum Num {
    NUM1(1), NUM2(2), NUM3(3);

    private int value;

    private Num(int num) {
        this.value = num;
    }

    public int toValue() {
        return value;
    }

    public static void main(String[] args) {
        System.out.println(Num.NUM1.toValue());
    }
}
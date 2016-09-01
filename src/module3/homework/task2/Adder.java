package module3.homework.task2;

public class Adder extends Arithmetic {
    private boolean result;


    public Adder(Integer a, Integer b, boolean result) {
        super(a, b);
        this.result = result;
    }

    public void compare() {
        if (getA() >= getB()) {
            result = true;
        } else result = false;
        System.out.println("Result of compare - " + result);
    }
}

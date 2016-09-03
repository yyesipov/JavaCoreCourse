package module3.homework.task2;

public class Arithmetic {
    private Integer a;
    private Integer b;

    public Arithmetic(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int sum;
        sum = getA() + getB();
        System.out.println("sum = " + sum);
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }
}




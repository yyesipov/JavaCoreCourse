package module3.homework.task2;

public class Main {
    public static void main(String[] args) {
        Integer a =  5;
        Integer b = 23;
        Arithmetic sum = new Arithmetic(a, b);
        sum.add();
        Adder w = new Adder(a, b, true);
        w.compare();

    }
}

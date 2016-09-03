package module3.homework.task4;

public class User {

    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public int getSalary() {
        return salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void paySalary() {
        double afterBalance;
        afterBalance = getBalance()+ getSalary();
        System.out.println(afterBalance);
    }

    public void withdraw(int sum) {
        double afterBalance;
        if (sum < 1000) {
            afterBalance = getBalance() - sum * 0.05;
        } else afterBalance = getBalance() - sum * 0.1;
        System.out.println(afterBalance);
    }

    public void companyNameLenght(String companyName) {
        System.out.println(companyName.length());

    }

    public void monthIncrease(int addMonth) {
        int monthIncrease = getMonthOfEmployment() + addMonth;
        System.out.println(monthIncrease);

    }

}

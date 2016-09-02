package module3.homework.task3;

public class SpecialStudent extends CollegeStudent {

    private String emale;
    private long secretKey;

    public SpecialStudent(String firstName, String lastName, int group) {
        super(firstName, lastName, group);
    }

    public SpecialStudent(String firstName, String lastName, int group, String collegeName, int rating, long id) {
        super(firstName, lastName, group, collegeName, rating, id);
    }

    public SpecialStudent(String lastName, Course[] coursesTaken, long secretKey) {
        super(lastName, coursesTaken);
        this.secretKey = secretKey;
    }

    public String getEmale() {
        return emale;
    }

    public long getSecretKey() {
        return secretKey;
    }

    public void setEmale(String emale) {
        this.emale = emale;
    }

    public void setSecretKey(long secretKey) {
        this.secretKey = secretKey;
    }
}

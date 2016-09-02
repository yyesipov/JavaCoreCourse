package module3.homework.task3;


import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Course course1 = new Course("Java", 200, "Teacher1");
        Course course2 = new Course("PHP", 150, "Teacher2");
        Course course3 = new Course(new Date(), "Baker");
        Course course4 = new Course("Web Design", 130, "Teacher4");
        Course course5 = new Course("Javascript", 190, "Teacher5");
        Student student1 = new Student("Jack", "Daniels", 1);
        Student student2 = new Student("Jameson", new Course[]{course1, course5});
        CollegeStudent collegeStudent1 = new CollegeStudent("Catty", "Sark", 2);
        CollegeStudent collegeStudent2 = new CollegeStudent("McArthur", new Course[]{course3, course4});
        CollegeStudent collegeStudent3 = new CollegeStudent("John", "Dewar", 5, "GoIT", 8, 3651);
        SpecialStudent spesialStudent1 = new SpecialStudent("Jim", "Beam", 3);
        SpecialStudent spesialStudent2 = new SpecialStudent("George", "Ballantine", 3, "GoIT", 9, 3624);
        SpecialStudent spesialStudent3 = new SpecialStudent("Blanton", new Course[]{course2, course5}, 38768);
    }
}

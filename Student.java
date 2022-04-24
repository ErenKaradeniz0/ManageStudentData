//Student class
public class Student {

    protected final static int NUM_OF_TESTS = 3;

    protected String name;
    protected int[] test;
    protected String courseGrade;

    public Student() {
        this("No Name");
    }

    public Student(String studentName) {
        name = studentName;
        test = new int[NUM_OF_TESTS];
        courseGrade = "*****";
    }

    public String getCourseGrade() {
        return courseGrade;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public void computeCourseGrade() {

    }

    public int average() {
        int avg = 0;
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            avg += test[i];
        }
        avg /= NUM_OF_TESTS;
        return avg;
    }

    public void setTestScore(int a, int t) {
        for (int i = 0; i < NUM_OF_TESTS; i++) {
            test[a - 1] = t;
        }

    }
}

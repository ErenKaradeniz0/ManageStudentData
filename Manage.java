//Manage class
import java.util.Scanner;

public class Manage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Enter number of Student:");
        int numberStudent = sc.nextInt();

        Student[] list = new Student[numberStudent];

        // declare type , input name and test scores from console, add the student object to array
        for (int i = 0; i < numberStudent; i++) {

            System.out.println("Enter type of student: (1: Gr  2:Ug)");
            int t = sc.nextInt();


            Student s;

            if (t == 1) {
                s = new GraduateStudent();

            } else {
                s = new UndergraduateStudent();

            }

            System.out.println("Enter name");
            s.setName(sc.next());

            System.out.println("Enter Test 1: ");
            int t1 = sc.nextInt();
            s.setTestScore(1, t1);

            System.out.println("Enter Test 2: ");
            int t2 = sc.nextInt();
            s.setTestScore(2, t2);

            System.out.println("Enter Test 3: ");
            int t3 = sc.nextInt();
            s.setTestScore(3, t3);

            s.computeCourseGrade();
            list[i] = s;
        }

        //calculate counters and average
        int averageGr = 0;

        int averageUnGr = 0;

        int countGr = 0;

        int countUnGr = 0;

        for (int i = 0; i < numberStudent; i++) {

            if (list[i] instanceof GraduateStudent) {
                averageGr = averageGr + list[i].average();
                countGr++;
            } else {
                averageUnGr = averageUnGr + list[i].average();
                countUnGr++;
            }
        }
        averageGr = averageGr / countGr;
        averageUnGr = averageUnGr / countUnGr;


        //print to console
        for (int i = 0; i < numberStudent; i++) {
            System.out.println(list[i].getName() + " : " + list[i].getCourseGrade() + " : " + list[i].average());
        }
        System.out.println("Count of Graduate student : " + countGr + " average of Graduate student: " + averageGr);
        System.out.println("Count of Undergraduate student : " + countUnGr + " average of Undergraduate student: " + averageUnGr);

    }
}

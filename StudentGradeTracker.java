import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        ArrayList<String> names =new ArrayList<>();
        ArrayList<Integer> grades =new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n=sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name =sc.nextLine();

            System.out.print("Enter grade: ");
            int grade =sc.nextInt();
            sc.nextLine();

            names.add(name);
            grades.add(grade);
        }

        int highest =grades.get(0);
        int lowest= grades.get(0);
        int sum = 0;

        for (int grade: grades) {

            sum +=grade;

            if (grade >highest) {
                highest = grade;
            }

            if (grade <lowest) {
                lowest =grade;
            }
        }

        double average = (double)sum /grades.size();

        System.out.println("\n STUDENT REPORT ");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i)+ " : " +grades.get(i));
        }

        System.out.println("\nAverage Score = "+average);
        System.out.println("Highest Score = " +highest);
        System.out.println("Lowest Score = " +lowest);

        sc.close();
    }
}
import java.util.Scanner;

public class CGPA {
    public static double CgpaCal(double[] marks, int n) {
        //Variable to store CGPA and the sum of all the grades
        double cgpa, sum = 0;

        //Variable to store the grades in each subject.
        double grade[] = new double[n];

        //Computing the Grades
        for(int i = 0; i< n; i++) {
            grade[i] = (marks[i] / 10);
        }
        //Computing the sum of Grades
        for(int i = 0; i <n ; i++) {
            sum += grade[i];
        }
        cgpa = sum/n;
        return cgpa;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Subjects:");
        int n = sc.nextInt();

        double[] marks =new double[n];
        System.out.println("Enter the marks of Subjects:");

        for(int i = 0; i<n; i++) {
            marks[i] = sc.nextInt();
        }
        double cgpa = CgpaCal(marks, n);

        System.out.println("cgpa=" + cgpa);
        System.out.println("percentage from cgpa= " +cgpa*9.5);
        }


    }

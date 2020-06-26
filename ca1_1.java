/* wap to store attendance of N students.
 * Students contains attributes reg no. marks of 2 subjects
 * return aggregate attendance in an array
 * and list of detained students...
 */

import java.util.Scanner;

class Student {
    int regNo;
    int sub1, sub2;

    Student(int regNo, int sub1, int sub2) {
        this.regNo = regNo;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }
}


public class ca1_1 {
    public static void main(String[] args) {
        Student[] students = new Student[5];
        Scanner sc = new Scanner(System.in);

        int reg, s1, s2;

        for(int i = 0; i < students.length; i++) {
            System.out.println("Enter details of Student:: " + (i + 1));
            System.out.print("Enter RegNo :: ");
            reg = sc.nextInt();
            System.out.print("Enter marks of sub1 :: ");
            s1 = sc.nextInt();
            System.out.print("Enter marks of sub2 :: ");
            s2 = sc.nextInt();

            students[i] = new Student(reg, s1, s2);
        }

        double[] aggAttendance = aggregateAttendance(students).clone();


        System.out.println("Aggregate Attendance::");
        for(int i = 0; i < students.length; i++) {
            System.out.println("RegNo. :: " + students[i].regNo + ", Attendance :: " + aggAttendance[i]);
        }
        showDetainedStudents(aggAttendance, students);
    }

    private static double[] aggregateAttendance(Student[] obj) {
        double[] aggAttendance = new double[obj.length];
        for(int i = 0; i < obj.length; i++) {
            aggAttendance[i] = (obj[i].sub1 + obj[i].sub2) / 2.0;
        }
        return aggAttendance;
    }

    private static void showDetainedStudents(double[] aggAttendanceList, Student[] studentList) {
        System.out.println("\n\nList of Detained Studets...");
        for(int i = 0; i < aggAttendanceList.length; i++) {
            if(aggAttendanceList[i] < 75) {
                System.out.println("RegNo. :: " + studentList[i].regNo + "\nAttendance :: " + aggAttendanceList[i] + "\n");
            }
        }
    }
}

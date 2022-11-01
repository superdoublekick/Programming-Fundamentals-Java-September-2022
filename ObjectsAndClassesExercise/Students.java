import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Students {
    public static class Student {
        private String name;
        private String lastName;
        private double grade;

        public Student(String name, String lastName, double grade) {
            this.name = name;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.name,this.lastName,this.grade);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countStudents = Integer.parseInt(sc.nextLine());
        List<Student> students = new ArrayList<>();

        for (int student01 = 1; student01 <=countStudents ; student01++) {
            String data = sc.nextLine();
            String[] dataParts = data.split(" ");
            String firstName = dataParts[0];
            String lastName = dataParts[1];
            double grade = Double.parseDouble(dataParts[2]);

            Student student = new Student(firstName,lastName,grade);
            students.add(student);

        }
        students.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student: students) {
            System.out.println(student);
        }
    }
}

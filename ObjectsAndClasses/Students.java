import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students {
    static class Student {
        private String firstName;
        private String lastName;
        private int age;
        private String town;

        public Student(String firstName, String lastName, int age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getTown() {
            return this.town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public int getAge() {
            return age;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        List<Student> studentsList = new ArrayList<>();
        while (!inputLine.equals("end")) {
            String[] arrStudents = inputLine.split("\\s+");
            String firstName = arrStudents[0];
            String lastName = arrStudents[1];
            int age = Integer.parseInt(arrStudents[2]);
            String town = arrStudents[3];

            Student currentStudent = new Student(firstName,lastName,age,town);
            studentsList.add(currentStudent);
            inputLine = sc.nextLine();
        }
        String homeTown = sc.nextLine();
        for (Student item: studentsList) {
            if(item.getTown().equals(homeTown)) {
                System.out.printf("%s %s is %d years old%n",item.getFirstName(),item.getLastName(),item.getAge());
            }
        }

    }
}

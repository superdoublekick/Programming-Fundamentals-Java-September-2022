import java.security.DigestOutputStream;
import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, List<Double>> studentsGrade = new LinkedHashMap<>();
        int countStudents = Integer.parseInt(sc.nextLine());
        for (int student = 1; student <= countStudents ; student++) {
            String name = sc.nextLine();
            double grade = Double.parseDouble(sc.nextLine());
            if(!studentsGrade.containsKey(name)) {
                studentsGrade.put(name, new ArrayList<>());


            }
            studentsGrade.get(name).add(grade);

        }
        Map<String, Double> averageGrade = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry: studentsGrade.entrySet()) {
            String studentsName = entry.getKey();
            List<Double> listGrades = entry.getValue();
            double average = getAverageGrade(listGrades);
            if(average >= 4.5) {
                averageGrade.put(studentsName, average);
            }
        }
        averageGrade.entrySet().forEach(stringDoubleEntry -> System.out.printf("%s -> %.2f%n",stringDoubleEntry.getKey(), stringDoubleEntry.getValue()));
    }
    private static double getAverageGrade(List<Double> listGrades) {
        double sumGrades = 0;
        for (double grade:listGrades) {
            sumGrades += grade;
        }
        return sumGrades / listGrades.size();
    }
}

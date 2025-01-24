package DAY18;
import java.util.*;
import java.util.stream.Collectors;

public class StuDetails {
    private String name;
    private String dept;
    private List<Integer> marks;
    private double avgMarks;
    private String grade;

    public StuDetails(String name, String dept, List<Integer> marks) {
        this.name = name;
        this.dept = dept;
        this.marks = marks;
        this.avgMarks = marks.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public String getName() { return name; }
    public String getDept() { return dept; }
    public double getAvgMarks() { return avgMarks; }
    public String getGrade() { return grade; }

    public void setGrade(String grade) { this.grade = grade; }

    @Override
    public String toString() {
        return "Name = " + name + ", Dept = " + dept + ", AvgMarks = " + avgMarks + ", Grade = " + grade;
    }

    public static void main(String[] args) {
        List<StuDetails> students = Arrays.asList(
                new StuDetails("Kavin", "CS", Arrays.asList(90, 85, 88, 92, 87)),
                new StuDetails("Arjun", "Maths", Arrays.asList(70, 75, 80, 78, 72)),
                new StuDetails("Sanji", "Physics", Arrays.asList(60, 62, 58, 65, 55)),
                new StuDetails("Jeeva", "CS", Arrays.asList(50, 45, 48, 55, 40)),
                new StuDetails("Vasanth", "Maths", Arrays.asList(88, 90, 85, 82, 87)),
                new StuDetails("Gnana", "Physics", Arrays.asList(30, 35, 40, 25, 20))
        );

        students.forEach(student -> {
            double avgMarks = student.getAvgMarks();
            if (avgMarks >= 85) student.setGrade("A");
            else if (avgMarks >= 70) student.setGrade("B");
            else if (avgMarks >= 50) student.setGrade("C");
            else student.setGrade("D");
        });

        List<StuDetails> top3Students = students.stream()
                .sorted(Comparator.comparingDouble(StuDetails::getAvgMarks).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println("Top 3 Students:");
        top3Students.forEach(System.out::println);

        Map<String, Double> avgMarksByDept = students.stream()
                .collect(Collectors.groupingBy(
                        StuDetails::getDept,
                        Collectors.averagingDouble(StuDetails::getAvgMarks)
                ));
        System.out.println("\nAvgMarks by Dept:");
        avgMarksByDept.forEach((dept, avg) ->
                System.out.println(dept + ": " + avg)
        );

        Map<String, Optional<StuDetails>> topStudentByDept = students.stream()
                .collect(Collectors.groupingBy(
                        StuDetails::getDept,
                        Collectors.maxBy(Comparator.comparingDouble(StuDetails::getAvgMarks))
                ));
        System.out.println("\nTop Student in Each Dept:");
        topStudentByDept.forEach((dept, student) ->
                System.out.println(dept + ": " + student.orElse(null))
        );

        Map<String, Long> failedStudentsByDept = students.stream()
                .filter(student -> student.getAvgMarks() < 50)
                .collect(Collectors.groupingBy(
                        StuDetails::getDept,
                        Collectors.counting()
                ));
        System.out.println("\nFailed Students by Dept:");
        failedStudentsByDept.forEach((dept, count) ->
                System.out.println(dept + ": " + count)
        );
    }
}
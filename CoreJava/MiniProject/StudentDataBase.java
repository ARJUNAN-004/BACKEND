package MiniProject;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.io.*;
import java.util.stream.Collectors;

class Student {
    private int id;
    private String name;
    private int age;
    private char grade;
    private String email;

    public Student(int id, int age, String name, char grade, String email) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.grade = grade;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayDetails() {
        System.out.println("Student ID =" + id);
        System.out.println("Student Name =" + name);
        System.out.println("Student Age =" + age);
        System.out.println("Student Grade =" + grade);
        System.out.println("Student Email =" + email);
        System.out.println("-------------------------------");
    }
}
public class StudentDataBase {
    static List<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void AddStudent() {
        try {
            System.out.println("Enter Student ID =");
            int id = sc.nextInt();
            sc.nextLine();
            if (id > 0) {
                for (Student student : students) {
                    if (student.getId() == id) {
                        System.out.println("Student ID Already Exist");
                        System.out.println("-------------------------------");
                        return;
                    }
                }
                System.out.println("Enter Student Name =");
                String name = sc.nextLine().toUpperCase();
                System.out.println("Enter Student Age =");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Grade(A-F) =");
                char grade = sc.nextLine().toUpperCase().charAt(0);
                if (grade < 'A' || grade > 'F') {
                    System.out.println("Invalid Grade");
                    System.out.println("-------------------------------");
                    return;
                }
                System.out.println("Enter Student Email =");
                String email = sc.nextLine();
                if (!email.matches("^[a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$")) {
                    System.out.println("Email Invalid");
                    System.out.println("-------------------------------");
                    return;
                }

                StudentDataBase.students.add(new Student(id, age, name, grade, email));
                System.out.println("Student Add Successful");
                System.out.println("-------------------------------");
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Input !!!");
            sc.next();
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            Store();
        }
    }
    public static void DisplayDetails() {
        try {
            if (students.isEmpty()) {
                System.out.println("No Student Found");
            } else {
                students.forEach(Student::displayDetails);
            }
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            Store();
        }
    }
    public static void SearchByID() {
        try {
            if (students.isEmpty()) {
                System.out.println("No Student Found");
            } else {
                System.out.println("Enter Student ID =");
                int searchid = sc.nextInt();
                Optional<Student> res = students.stream().filter(s -> s.getId() == searchid).findFirst();
                if (res.isEmpty()) {
                    System.out.println("No Student Found");
                } else {
                    res.get().displayDetails();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Input !!!");
            sc.next();
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            Store();
        }
    }
    public static void UpdateDetails() {
        try {
            System.out.println("Enter Student ID =");
            int newid = sc.nextInt();
            sc.nextLine();
            Optional<Student> upt = students.stream().filter(s -> s.getId() == newid).findFirst();
            if (upt.isEmpty()) {
                System.out.println("No Student Found");
                System.out.println("-------------------------------");
            } else {
                System.out.println("Enter Student Name =");
                String newname = sc.nextLine();
                System.out.println("Enter Student Age =");
                int newage = sc.nextInt();
                sc.nextLine();
                System.out.println("Enter Student Grade =");
                char newgrade = sc.nextLine().charAt(0);
                if (newgrade < 'A' || newgrade > 'F') {
                    System.out.println("Invalid Grade");
                    System.out.println("-------------------------------");
                    return;
                }
                System.out.println("Enter Student Email =");
                String newemail = sc.nextLine();
                if (!newemail.matches("^[a-zA-Z0-9._-]*@[a-zA-Z0-9.-]+\\.(com|org|net)$")) {
                    System.out.println("Email Invalid");
                    System.out.println("-------------------------------");
                    return;
                }
                Student student=upt.get();
                student.setAge(newage);
                student.setName(newname);
                student.setGrade(newgrade);
                student.setEmail(newemail);
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Input !!!");
            sc.next();
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            Store();
        }
    }
    public static void DeleteStudent() {
        try {
            System.out.println("Enter Student ID =");
            int deleteid = sc.nextInt();
            Iterator<Student> it = students.iterator();
            while (it.hasNext()) {
                if (it.next().getId() == deleteid) {
                    it.remove();
                    System.out.println("Student Deleted Successfully");
                    System.out.println("-------------------------------");
                    break;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Enter Valid Input !!!");
            sc.next();
        } catch (Exception e) {
            System.out.println("Error!!!");
        } finally {
            Store();
        }
    }
    public static void Store() {
        try {
            FileWriter fileWriter = new FileWriter("D:\\Backend\\DAY01\\src\\MiniProject\\db.txt");
            fileWriter.write(students.stream()
                    .filter(Objects::nonNull)
                    .map(s ->
                            "\nStudent ID = " + s.getId() +
                                    "\nStudent Name = " + s.getName() +
                                    "\nStudent Age = " + s.getAge() +
                                    "\nStudent Grade = " + s.getGrade() +
                                    "\nStudent Email = " + s.getEmail())
                    .collect(Collectors.joining("\n----------------------------------------")));
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Data Stored Successfully");
    }
    public static void Sort() {
            System.out.println("1. Sort by Name\n2. Sort by Age\n3. Sort by Grade");
            while (true) {
                try {
                    System.out.println("Enter Choice =");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1 -> {
                            students.sort(Comparator.comparing(Student::getName));
                            students.forEach(Student::displayDetails);
                            return;
                        }
                        case 2 -> {
                            students.sort(Comparator.comparing(Student::getAge));
                            students.forEach(Student::displayDetails);
                            return;
                        }
                        case 3 -> {
                            students.sort(Comparator.comparing(Student::getGrade));
                            students.forEach(Student::displayDetails);
                            return;
                        }
                        default -> System.out.println("Invalid Choice");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Enter Valid Input !!!");
                    sc.next();
                } catch (Exception e) {
                    System.out.println("Error!!!");
                } finally {
                    Store();
                }
            }
        }
    public static void loadFromFile() {
        new Thread(() -> {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("D:\\Backend\\DAY01\\src\\MiniProject\\db.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Student ID = ")) {
                    int id = Integer.parseInt(line.substring(13).trim());
                    String name = reader.readLine().substring(14).trim();
                    int age = Integer.parseInt(reader.readLine().substring(14).trim());
                    String gradeLine = reader.readLine().substring(15).trim();
                    char grade = gradeLine.isEmpty() ? 'N' : gradeLine.charAt(0);
                    String email = reader.readLine().substring(15).trim();
                    students.add(new Student(id, age, name, grade, email));
                    reader.readLine();
                }
            }
            System.out.println("Data Loaded Successfully");
        } catch (IOException | NumberFormatException | NullPointerException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        }).start();
    }

    public static void main(String[] args) {
                        System.out.println("----------------- STUDENT DATABASE MANAGEMENT -----------------");
        loadFromFile();
        while (true) {
            try {
                System.out.println("\n1. Add Student\n2. Display Student\n3. Search by ID\n4. Update Student\n5. Delete Student\n6. Sort\n7. Save");
                System.out.println("Enter process =");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1 -> AddStudent();
                    case 2 -> DisplayDetails();
                    case 3 -> SearchByID();
                    case 4 -> UpdateDetails();
                    case 5 -> DeleteStudent();
                    case 6 -> Sort();
                    case 7 -> System.exit(0);
                    default -> System.out.println("Invalid Choice");
                }
            } catch (InputMismatchException e) {
                System.out.println("Enter Valid Input !!!");
                sc.next();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Error!!!");
            }
        }
    }
}

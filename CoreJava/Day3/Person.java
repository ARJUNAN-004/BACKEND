package DAY03;

import java.util.Scanner;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void DisplayDetails() {
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
    }
    static class Student extends Person {
        int rollnum;
        int[] marks;

        public Student(String name, int age, int rollnum, int[] marks) {
            super(name, age);
            this.rollnum = rollnum;
            this.marks = marks;
        }

        public void DisplayDetails1() {
            super.DisplayDetails();
            System.out.println("RollNum = " + rollnum);
            System.out.print("Marks = ");
            for (int x : marks) {
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            Student s1 = new Student("Joyboy", 21, 1, new int[]{1,2,3,4,5});
            s1.DisplayDetails1();
        }
    }

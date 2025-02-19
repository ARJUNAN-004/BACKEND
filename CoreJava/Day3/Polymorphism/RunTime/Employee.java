//Write a program with a base class Employee that has a method calculateSalary(). Derive two classes Manager and Developer, and override the calculateSalary() method in both to display different salaries.

package DAY03.Polymorphism.RunTime;

public class Employee {
    public void calculateSalary(){
        System.out.println("Salary of Employee is 100000");
    }
    static class Manager extends Employee{
        public void calculateSalary(){
            super.calculateSalary();
            System.out.println("Salary of Manager is 500000");
        }
    }
    static class Developer extends Employee{
        public void calculateSalary(){
            System.out.println("Salary of Developer is 300000");
        }
    }
    public static void main(String[] args) {
        Employee e2=new Manager();
        e2.calculateSalary();
        Employee e3=new Developer();
        e3.calculateSalary();

    }

}

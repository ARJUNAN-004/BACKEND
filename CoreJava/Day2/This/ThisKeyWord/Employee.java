//Create a class Employee with attributes id, name, and salary. Use the this keyword to resolve naming conflicts between local variables and instance variables.

package DAY02.This.ThisKeyWord;

public class Employee {
    private int id;
    private String name;
    private int salary;
    public Employee(int id,String name,int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void DisplayDetails(){
        System.out.println("Employee ID = "+id);
        System.out.println("Employee Name = "+name);
        System.out.println("Employee Salary = "+salary);
    }
    public static void main(String[] args) {
        Employee emp=new Employee(1,"Luffy",10000);
        emp.DisplayDetails();
    }
}

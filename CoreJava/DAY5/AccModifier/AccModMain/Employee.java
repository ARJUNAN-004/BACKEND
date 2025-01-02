//Create a subclass Employee in the same package to demonstrate which members are accessible.

package DAY05.AccModifier.AccModMain;
public class Employee extends Person{
    public void DisplayDetails(){
        System.out.println("Employee Name = "+name);
        System.out.println("Employee Age = "+age);
        System.out.println("Employee Address = "+address);
        //System.out.println("Employee Salary = "+salary);
    }
}

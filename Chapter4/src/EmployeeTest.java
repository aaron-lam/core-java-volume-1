/**
 * Test the Employee class
 * @version 1.8.0 09-14-2017
 * @author Aaron Lam
 */
public class EmployeeTest {

    public static void main(String args[]){
        Employee[] staff = new Employee[4];
        staff[0] = new Employee("Aaron", 120000, 2017, 6, 24);
        staff[1] = new Employee("Harry", 40000);
        staff[2] = new Employee(60000);
        staff[3] = new Employee();
        for (Employee aEmployee : staff)
            System.out.println(aEmployee);
        System.out.println("After raising the salary: ");
        for (Employee aEmployee : staff){
            aEmployee.raiseSalary(12);
            System.out.println(aEmployee.getName() + ": " + aEmployee.getSalary());
        }
    }
}

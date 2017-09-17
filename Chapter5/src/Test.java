/**
 * Test Person class, Student class, Employee class, and Manager Class
 * @version 1.8.0 09-16-2017
 * @author Aaron Lam
 */
public class Test {

    public static void main(String args[]){
        //test the Person and Student
        Person[] people = new Person[2];
        people[0] = new Student("Michael", "computer science");
        people[1] = new Employee("Devin", 50000, 1989, 10, 1);
        for(Person p : people)
            System.out.println(p.getName() + ", " + p.getDescription());
        //test the Manager and Employee
        Manager boss = new Manager("David", 150000, 1987, 12, 15);
        boss.setBonus(5000);
        Employee[] staff = new Employee[5];
        staff[0] = new Employee("Aaron", 120000, 2017, 6, 24);
        staff[1] = new Employee("Harry", 40000);
        staff[2] = new Employee(60000);
        staff[3] = new Employee();
        staff[4] = boss;
        for (Employee aEmployee : staff)
            System.out.println(aEmployee);
        //test the raise salary
        System.out.println();
        System.out.println("After raising the salary: ");
        for (Employee e : staff){
            e.raiseSalary(12);
            System.out.println(e.getName() + ": " + e.getSalary());
        }
    }
}

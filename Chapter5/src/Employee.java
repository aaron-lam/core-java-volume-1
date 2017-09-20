import java.time.*;
import java.util.Random;

/**
 * Employee class stores employee name, salary, and hire date.
 * @version 1.8.0 09-14-2017
 * @author Aaron Lam
 */
public class Employee extends Person{
    private static int nextId;

    private int id;
    private String name = "";
    private double salary = 0;
    private LocalDate hireDay = LocalDate.now();

    //static initialization block
    static{
        Random generator = new Random();
        nextId = generator.nextInt(10000);
    }

    //object initialization block
    {
        id = nextId;
        nextId++;
    }

    //constructors
    public Employee(String name, double salary, int year, int month, int day){
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public Employee(String name, double salary){
        super(name);
        this.salary = salary;
    }

    public Employee(double salary){
        this("Employee #" + nextId, salary);
    }

    public Employee(){
        super("null");
    }

    //getters
    public double getSalary(){
        return salary;
    }

    public int getId(){
        return id;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String toString(){
        return getClass().getName() + ": [name = " + this.getName() + ", id = " + this.getId() + ", salary = " + this.getSalary() + ", hire date: " + this.getHireDay() + "]";
    }

    /**
     * Raises the salary of an employee.
     * @param byPercent the percent of raising salary (e.g: 10 means 10%)
     */
    public void raiseSalary (double byPercent) {
        double raise = salary * byPercent / 100;
        salary += raise;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%.2f", salary);
    }
}

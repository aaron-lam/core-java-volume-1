/**
 * Manager class demonstrate inheritance in java.
 * Manager class inherits Employee class, and Manager also have bonus salary which employee don't.
 * @version 1.8.0 09-16-2017
 * @author Aaron Lam
 */
public class Manager extends Employee{
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double aBonus){
        bonus = aBonus;
    }
}

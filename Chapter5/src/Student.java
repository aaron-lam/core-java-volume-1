/**
 * Student class helps demonstrating the inheritance in java.
 * version 1.8.0 09-16-2017
 * @author Aaron Lam
 */
public class Student extends Person{
    private String major;

    public Student(String name, String major){
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in " + major;
    }
}

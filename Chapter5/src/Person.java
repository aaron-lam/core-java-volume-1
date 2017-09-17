/**
 * Person class demonstrate the abstract in java.
 * @version 1.8.0 09-16-2017
 * @author Aaron Lam
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}

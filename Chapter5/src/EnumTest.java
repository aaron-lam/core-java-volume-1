import java.util.*;

/**
 * This program demonstrates enumerated types.
 * @version 1.8.0 09-17-2017
 * @author Aaron Lam
 */
public class EnumTest {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a size: (SMALL, MEDIUM, LARGE, EXTRA_LARGE) ");
        String input = in.next().toUpperCase();
        Size size = Enum.valueOf(Size.class, input);
        System.out.println("size = " + size);
        System.out.println("abbreviation = " + size.getAbbreviation());
        if(size == Size.EXTRA_LARGE)
            System.out.println("Good job -- you paid attention to the _.");
    }
}

enum Size{
    SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
    private String abbreviation;
    Size(String abbreviation) {this.abbreviation = abbreviation;}
    public String getAbbreviation() {return abbreviation;}
}

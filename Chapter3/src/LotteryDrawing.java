import java.util.*;

/**
 * Using arrays to generate custom amount of random numbers in a custom range
 * @version 1.8.0 09-13-2017
 * @author Aaron Lam
 */
public class LotteryDrawing {
    public static void main(String args[]) {
        //read user input
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to bet? ");
        int betAmount = in.nextInt();
        System.out.print("What is the highest number you can bet? ");
        int highestBetNumber = in.nextInt();
        //fill an array with numbers 1, 2, 3, ..., n
        int[] numbers = new int[highestBetNumber];
        for(int i = 0; i < numbers.length; i++)
            numbers[i] = i + 1;
        //create an array for bet
        int[] result = new int [betAmount];
        for(int i = 0; i < result.length; i++){
            int randomNum = (int) (Math.random() * highestBetNumber);
            //pick the bet at random location of the number array
            result[i] = numbers[randomNum];
            //move the last bet into random location of the number array
            numbers[randomNum] = numbers[highestBetNumber-1];
            highestBetNumber--;
        }
        //Print out random numbers
        Arrays.sort(result);
        System.out.println("Bet the following combination. It will make you rich!");
        for(int i : result)
            System.out.println(i);
    }
}

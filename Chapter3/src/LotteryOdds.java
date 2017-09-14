import java.util.*;

/**
 * Using "for loop" to compute the possibility of getting lottery prize
 * @version 1.8.0 09-13-2017
 * @author Aaron Lam
 */
public class LotteryOdds {

    //compute binomial coefficient n * (n-1) * (n-2) * ... * (n-k+1) / (1 * 2 * ... * k)
    private static int computeBinomialCoefficient(int lotteryOdds, int numNeedToDraw, int numHighestDraw){
        for(int i = 1; i <= numNeedToDraw; i++)
            lotteryOdds = lotteryOdds * (numHighestDraw - i + 1) / i;
        return lotteryOdds;
    }

    public static void main(String args[]){
        //read user input
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers do you need to draw? ");
        int numNeedToDraw = in.nextInt();
        System.out.print("What is the highest number you can draw? ");
        int numHighestDraw = in.nextInt();
        int lotteryOdds = computeBinomialCoefficient(1, numNeedToDraw, numHighestDraw);
        System.out.println("Your odds are 1 in " + lotteryOdds + ". Good Luck!");
    }

}

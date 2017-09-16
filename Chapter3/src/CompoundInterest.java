/**
 * Using 2D array to create tabular data, then compute growth of investment at different Interest Rate
 * @version 1.8.0 09-13-2017
 * @author Aaron Lam
 */
public class CompoundInterest {

    private static final double STARTRATE = 10;
    private static final int NUMOFRATES = 6;
    private static final int NUMOFYEARS = 10;

    //print balance table
    private static void printBalanceTable(double[][] balances){
        for(double row[] : balances){
            for (double i : row)
                System.out.printf("%10.2f", i);
            System.out.println();
        }
    }

    public static void main(String args[]){
        //set interest rates in array to 10, 11, ..., 15%
        double[] interestRate = new double[NUMOFRATES];
        for(int i = 0; i < interestRate.length; i++)
            interestRate[i] = (STARTRATE + i) / 100.00;
        double[][] balances = new double[NUMOFYEARS][NUMOFRATES];
        //set initial balances to 10000
        for(int i = 0; i < balances[0].length; i++)
            balances[0][i] = 10000;
        //compute interest rate for future years
        for(int i = 1; i < balances.length; i++){
            for(int j = 0; j < balances[i].length; j++) {
                //get last year balances from previous row
                double oldBalance = balances[i-1][j];
                //compute interest rate
                double interest = oldBalance * interestRate[j];
                //compute this year's balances
                balances[i][j] = oldBalance + interest;
            }
        }
        //print one row of interest rates
        for(int i = 0; i < interestRate.length; i++)
            System.out.printf("%9.0f%%", 100 * interestRate[i]);
        System.out.println();
        printBalanceTable(balances);
    }
}

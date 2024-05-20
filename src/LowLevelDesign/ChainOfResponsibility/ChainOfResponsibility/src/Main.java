import atm.ATMDebit;
import atm.Debit1T;
import atm.Debit2T;
import atm.Debit5H;
import logger.DebugLogger;
import logger.ErrorLogger;
import logger.InfoLogger;
import logger.Logger;

public class Main {
    public static void main(String[] args) {

        System.out.println("Logger!");

        Logger logger = new InfoLogger(new DebugLogger(new ErrorLogger(null)));
        logger.log(Logger.ERROR, "Exception occurred");
        logger.log(Logger.DEBUG, "Missing data");
        logger.log(Logger.INFO, "Received data");
        logger.log(5, "Test");

        //ATM
        System.out.println("ATM!");
        ATMDebit atm = new Debit2T(new Debit1T(new Debit5H(null)));
        atm.debit(ATMDebit.twoT, 10000);
        atm.debit(ATMDebit.oneT, 10000);
        atm.debit(ATMDebit.fiveH, 10000);
        atm.debit(ATMDebit.twoT, 1000);
    }
}
package atm;

public class Debit2T extends ATMDebit{
    public Debit2T(ATMDebit type) {
        super(type);
    }

    @Override
    public void debit(int type, int amount) {
        if(type == twoT){
            if(amount%2000==0){
                System.out.println(amount/2000 + " two thousand notes");
            } else {
                System.out.println("Cannot process the request");
            }
        } else {
            super.debit(type, amount);
        }
    }
}

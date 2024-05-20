package atm;

public class Debit5H extends ATMDebit{
    public Debit5H(ATMDebit type) {
        super(type);
    }

    @Override
    public void debit(int type, int amount) {
        if(type == fiveH){
            if(amount%500==0){
                System.out.println(amount/500 + " five hundred notes");
            } else {
                System.out.println("Cannot process the request");
            }
        } else {
            super.debit(type, amount);
        }
    }
}

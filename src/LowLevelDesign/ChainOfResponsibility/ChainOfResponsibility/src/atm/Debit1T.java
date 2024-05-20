package atm;

public class Debit1T extends ATMDebit{
    public Debit1T(ATMDebit type) {
        super(type);
    }
    @Override
    public void debit(int type, int amount) {
        if(type == oneT){
            if(amount%1000==0){
                System.out.println(amount/1000 + " one thousand notes");
            } else {
                System.out.println("Cannot process the request");
            }
        } else {
            super.debit(type, amount);
        }
    }
}

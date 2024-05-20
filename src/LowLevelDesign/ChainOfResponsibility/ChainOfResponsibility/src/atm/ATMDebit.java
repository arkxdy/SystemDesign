package atm;

public abstract  class ATMDebit {
    public static int twoT = 2000;
    public static int oneT = 1000;
    public static int fiveH = 500;
    ATMDebit nextType;
    ATMDebit(ATMDebit type){
        this.nextType = type;
    }

    public void debit(int type,int amount){
        if(nextType!=null){
            nextType.debit(type, amount);
        }else{
            System.out.println("UNKNOWN: " + amount);
        }
    }

}

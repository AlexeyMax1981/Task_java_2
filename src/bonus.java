public class bonus {
    public static void main(String[] args) {
        int myCount = 100;
        int myDepositedFunds = 13500;
        int myBonus;
        int schet;
        if (myDepositedFunds > 1000) {
            myBonus = myDepositedFunds / 100;
            schet = myCount + myDepositedFunds + myBonus;
        } else {
            myBonus = 0;
            schet = myCount + myDepositedFunds + myBonus;
        }
//        int schet = myCount + myDepositedFunds + myBonus;
        System.out.println("Сумма бонусов равна " + myBonus);
        System.out.println("Сумма счета равна " + schet);
    }
}

public class Main {
    public static void main(String[] args) {
        int clientAccount = 100;
        int addFunds = 1350;
        int bonus;
        if (addFunds > 1000) {
            bonus = addFunds / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Начислено " + bonus + " бонусов");
        System.out.println("Итоговый счёт: " + (clientAccount + addFunds + bonus) + " руб");
    }
}
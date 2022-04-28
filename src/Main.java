public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int depositAmount = 1500;
        int bonus;
        if (depositAmount >= 1000) {
            bonus = (startBalance + depositAmount) / 100;
        } else {
            bonus = 0;
        }
        int balance = startBalance + depositAmount + bonus;
        System.out.println("Итоговый счет: " + balance + " руб. Бонус: " + bonus + " руб.");
    }
}

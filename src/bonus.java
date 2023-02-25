public class bonus {
    public static void main(String[] args) {
        int a = 100;
        int b = 13500;
        int c;
        int schet;
        if (b > 1000) {
            c = b / 100;
            schet = a + b + c;
        } else {
            c = 0;
            schet = a + b + c;
        }
//        int schet = a + b + c;
        System.out.println("Сумма бонусов равна " + c);
        System.out.println("Сумма счета равна " + schet);
    }
}

public class Main {
    public static void main(String[] args) {
        int priceTicket = 5500; // стоимость билета
        int priceMile = 20; // количество рублей для одной бонусной мили

        int bonus = priceTicket / priceMile;
        // Рассчитываете количество бонусных миль, используя
        // значения заведённых переменных. Ответ сохраняете в
        // новую переменную и выводите на экран

        System.out.println("Вам начислены бонусные " + bonus + " миль. ");

    }
}
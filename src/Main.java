public class Main {
    public static void main(String[] args) {

        int price = 30_000;
        int rublesAmount = 20;
        int miles = (price / rublesAmount); // 1 миля за каждые 20 рублей
        System.out.println("Бонусных миль начислено: " + miles);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Здравствуйте!");
        System.out.println("Введите цену билета для того, чтобы узнать количество бонусных миль");
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles + " бонусных миль(и)");
    }
}


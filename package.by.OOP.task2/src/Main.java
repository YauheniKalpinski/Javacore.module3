import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Flower roseRed = new Rose(7, LocalDate.now(), 7, "red");

        Flower roseWhite = new Rose(6.5, LocalDate.now(), 5, "white");

        Flower carnation = new Carnation(4.5, LocalDate.now(), 5, "red");

        Flower tulip = new Tulip(3, LocalDate.now(), 2, "yellow");

        Flower lily = new Lily(5, LocalDate.now(), 6, "cream");

        System.out.println("Введите размер букета");
        Scanner scanner = new Scanner(System.in);
        int flowersQuantity = scanner.nextInt();

        Bouquet bouquet = new Bouquet(flowersQuantity);

        fillBouquet(bouquet, roseRed, roseWhite, carnation, tulip, lily, scanner, flowersQuantity);
        bouquet.differentColourBouquet();
        bouquet.getExpirationDateOfBouquet();
    }

    public static void fillBouquet(Bouquet bouquet, Flower roseRed, Flower roseWhite,
                                   Flower carnation, Flower tulip, Flower lily,
                                   Scanner scanner, int flowersQuantity) {
        while (flowersQuantity != 0) {
            System.out.println("_________________________________");
            System.out.println("Выберите цветок который добавить");
            System.out.println("Чтобы выбрать красную розу нажмите 1");
            System.out.println("Чтобы выбрать белую розу нажмите 2");
            System.out.println("Чтобы выбрать красную гвоздику нажмите 3");
            System.out.println("Чтобы выбрать желтый тюльпан нажмите 4");
            System.out.println("Чтобы выбрать кремовую лилию нажмите 5");
            int flowerChoice = scanner.nextInt();
            if (flowerChoice == 1) {
                System.out.println("Вы выбрали " + roseRed);
                bouquet.createBouquet(roseRed);
                flowersQuantity--;
            } else if (flowerChoice == 2) {
                bouquet.createBouquet(roseWhite);
                flowersQuantity--;
            } else if (flowerChoice == 3) {
                bouquet.createBouquet(carnation);
                flowersQuantity--;
            } else if (flowerChoice == 4) {
                bouquet.createBouquet(tulip);
                flowersQuantity--;
            } else if (flowerChoice == 5) {
                bouquet.createBouquet(lily);
                flowersQuantity--;
            } else {
                System.out.println("Неправильный ввод, Введите значение от 1 до 5. ");
            }
        }
    }
}
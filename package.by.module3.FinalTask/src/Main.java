//Умный дом
//        1) Реализовать класс House с параметрами: температура, влажность.
//
//   2 ) Добавить классы Humidifier и Heater с методом execute(int value, House house),
//   который увеличивает влажность либо температуру в доме на value
//
//   2) Написать класс HouseManager, который вызывает метод execute(int value, House house) у объектов Humidifier
//   или  Heater , в результате увеличивается температура в доме на value (объекте класса House)
//
//  4) Реализовать программу через паттерн Factory Method так, чтобы HouseManager не зависел
//  от Heater и Humidifier и можно было легко добавлять новые классы для обслуживания дома.



import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру в доме");
        int temperature = scanner.nextInt();
        System.out.println("Введите влажность в доме");
        int humidity = scanner.nextInt();

        House house1 = new House(temperature, humidity);
        HouseManager houseManager = new HouseManagerHumidifier();
        houseManager.applyChange(27, house1);
        scanner.close();
    }
}
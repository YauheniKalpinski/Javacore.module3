//Параметризованный гараж
//
//Cоздать классы Car и Motorcycle, которые наследуются от общего класса Vehicle.
//
//Создать поле name в классе Vehicle и проинициализировать его через конструктора.
//
//Создать generic класс Garage, который может хранить только объекты типа наследуемого от Vehicle.
//Создать 2 объекта класса Garage (все поля ввести с клавиатуры) и вывести на экран имя хранимого транспортного средства.


import java.util.Scanner;

public class Main {
    private static Garage<Vehicle>[] garages = new Garage[2];
    private static int count = 0;
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        chooseAndAddGarage();
        printVehicleCount();
        chooseAndAddGarage();
        printVehicleCount();
    }

    public static void addGarage(String vehicleType, String vehicleBrand) {
        if (vehicleType == null || vehicleType.isEmpty()) {
            System.out.println("Не передан тип транспортного средства");
            return;
        }
        if (vehicleBrand == null || vehicleBrand.isEmpty()) {
            System.out.println("Не введена марка траспортного средства");
            return;
        }

        Vehicle vehicle;
        if (vehicleType.equalsIgnoreCase("Car")) {
            vehicle = new Car(vehicleBrand);
        } else if (vehicleType.equalsIgnoreCase("Motorcycle")) {
            vehicle = new Motorcycle(vehicleBrand);
        } else {
            System.out.println("Неизвестный тип транспорта");
            return;
        }

        if (count < garages.length) {
            garages[count] = new Garage<>(vehicle);
            count++;
        } else {
            System.out.println("Массив гаражей переполнен");
        }
    }

    public static void chooseAndAddGarage() {
        System.out.println("Выберите тип создаваемого транспортного средства:" +
                " Car , или Motorcycle");
        String vehicleType = SCANNER.nextLine();
        System.out.println("Введите марку создаваемого транспортного средства:");
        String vehicleBrand = SCANNER.nextLine();
        addGarage(vehicleType, vehicleBrand);
    }

    public static void printVehicleCount() {
        System.out.println("Всего транспортных средств: " + count);
        for (int i = 0; i < count; i++) {
            System.out.println(garages[i].getVehicle().getName());
        }
    }
}
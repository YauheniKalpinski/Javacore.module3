//Сезоны года
//
//1) Создать enum, который описывает сезоны года.
//
//Добавить поле description в этот enum.
//
//Добавить поле countOfDays в этот enum.
//
//Вывести на экран все константы сезоны года.
//
//2) Написать метод, который выводит следующий сезон от заданного во входном параметре.
//
//Входной параметр ввести с клавиатуры.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (SeasonsOfYear seasonsOfYear: SeasonsOfYear.values()) {
            System.out.println(seasonsOfYear.name() + " "
                    + seasonsOfYear.getDescription() + " "
                    + seasonsOfYear.getCountOfDays());
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пору года");
        String season = scanner.nextLine();
        System.out.println(SeasonsOfYear.returnNextSeason(season));
        scanner.close();
    }
}
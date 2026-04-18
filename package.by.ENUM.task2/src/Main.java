//Vegetarian
//
//Создать enum - FoodType (PORRIDGE, BREAD, SOUP, VEGETABLE, NUT, FRUIT,  DAIRY, FISH, GREENS, MEAT, UNKNOWN)
//
//○  Создать базовый абстрактный класс Food и в нем абстрактный метод public FoodType getFoodType();
//
//○  Создать 2-3 класса наследника Food
//и реализовать методы get/set name, a также переопределить getFoodType для каждого.
//
//○   Создать отдельный класс с методом проверки boolean isVegetarian(Food[] foods)
//в метод передается набор ингредиентов, на выходе true если все они вегетарианские.


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Food vegetable1 = new Vegetable("Cucumber");
        Food vegetable2 = new Vegetable("Tomato");

        Food fruit1 = new Fruit("Orange");
        Food fruit2 = new Fruit("Apple");

        Food meat1 = new Meat("Beef");

        Food[] foods1 = new Food[] {vegetable1, fruit1, meat1};
        Food[] foods2 = new Food[] {vegetable1, vegetable2, fruit1, fruit2};

        VegetarianValidator vegetarianValidator = new VegetarianValidator();
        System.out.println("Результат комплекта продуктов: " + Arrays.toString(foods1) +
                ": " + vegetarianValidator.isVegetarian(foods1));
        System.out.println("Результат комплекта продуктов: " + Arrays.toString(foods2) +
                ": " + vegetarianValidator.isVegetarian(foods2));
    }
}
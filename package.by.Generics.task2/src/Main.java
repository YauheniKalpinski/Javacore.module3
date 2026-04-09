//Параметризованный массив
//        Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.).
//        Реализовать метод, который возвращает элемент массива по индексу и выводит его значение на экран.

public class Main {
    public static void main(String[] args) {
        GenericArray<Integer> array1 = new GenericArray<Integer>(5);
        GenericArray<String> array2 = new GenericArray<String>(5);
        array1.addData(10);
        array1.addData(20);
        array1.addData(30);
        array1.addData(40);
        array1.addData(50);
        showResult(array1,3);

        array2.addData("Masha");
        array2.addData("Vasya");
        array2.addData("Yura");
        array2.addData("Zhora");
        array2.addData("Edgar");
        showResult(array2,4);
    }

    public static <T> void showResult (GenericArray<T> array,int index) {
        Object object = array.getElement(index);
        System.out.println("Переменная массива по индексу " + index + " равна " + object);
    }
}
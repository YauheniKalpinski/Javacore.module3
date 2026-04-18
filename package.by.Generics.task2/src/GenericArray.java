public class GenericArray<T> {

    private T[] array;
    private int arraySize = 0;
    private int count = 0;

    private T[] getArray() {
        return array;
    }

    public GenericArray(int arraySize) {
        this.arraySize = arraySize;
        this.array = (T[]) new Object[arraySize];//создаем object и приводим к T
    }

    public int getArraySize() {
        return arraySize;
    }

    public int getCount() {
        return count;
    }


    public void addData(T element ) {
        if (count < arraySize) {
            array[count] = element;
            count++;
        } else {
            System.out.println("Массив уже заполнен");
        }
    }

    public T getElement(int index) {
        if (index < 0 || index >= arraySize) {
            System.out.println("Введен неверный индекс");
            return null;
        }
        return array[index];
    }
}

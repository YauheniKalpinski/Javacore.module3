import java.time.LocalDate;
import java.util.Scanner;

public class Bouquet {
    private Flower[] flowers;
    private int flowersCount = 0;
    private int bouquetSize = 0;
    private double bouquetPrice = 0;

    public Flower[] getFlowers() { return flowers;}

    public int getFlowersCount() { return flowersCount;}

    public double getBouquetPrice() { return bouquetPrice;}

    public Bouquet(int bouquetSize) {
        this.bouquetSize = bouquetSize;
        this.flowers = new Flower[bouquetSize];
    }

    public void createBouquet(Flower flower) {
        if (flowersCount >= bouquetSize) {
            System.out.println("Букет полный");
            return;
        }
        flowers[flowersCount] = flower;
        flowersCount++;
        bouquetPrice += flower.getPrice();
        System.out.println("В букет добавлен цветок: " + flower + " Всего цветов букете: " + flowersCount);
        System.out.println("Цена букета равна: " + bouquetPrice);
    }

    public void differentColourBouquet() {
        String [] tempArray = new String[flowersCount];
        int uniqueElementsCount = 0;
        for (int i = 0; i < flowersCount; i ++) {
            boolean isDuplicate = false;
            for (int j = 0; j < i ;j++) {
                if (flowers[i].getColour().equals(flowers[j].getColour())) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                tempArray[uniqueElementsCount] = flowers[i].getColour();
                uniqueElementsCount++;
            }
        }
        String [] finalArray = new String[uniqueElementsCount];
        for (int i = 0; i < uniqueElementsCount; i++){
            finalArray[i] = tempArray[i];
        }
        System.out.println("Всего " + finalArray.length + " цвета в букете");
        System.out.println("Цвета в букете:");
        for (int i = 0; i < finalArray.length; i++){
            System.out.println(finalArray[i]);
        }
    }

    public void getExpirationDateOfBouquet () {
        LocalDate[] dateExp = new LocalDate[flowersCount];
        LocalDate maxDate;
        for (int i = 0 ; i < dateExp.length; i++) {
            //мы получаем дату привоза и сразу к ней прибавляем дату сколько цветок годен ,
            // а потом в массиве найдем максимальную дату
            dateExp[i] = flowers[i].getDateOfReceipt().plusDays(flowers[i].getExpirationDate());
        }
        maxDate = dateExp [0];
        for (int i = 1; i < dateExp.length; i++) {
            if (dateExp[i].isAfter(maxDate)) {
                maxDate = dateExp[i];
            }
        }
        System.out.println("Букет завянет " + maxDate );
    }
}

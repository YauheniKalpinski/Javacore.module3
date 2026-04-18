public class Humidifier implements Indicators {
    @Override
    public void execute(int value, House house) {
        if (house == null) {
            System.out.println("Ошибка вы не передали обьект класса Дом");
            return;
        }
        System.out.println("Влажность была " + house.getHumidity());
        house.setHumidity(house.getHumidity() + value);
        System.out.println("Влажность увеличена на " + value
                + " Влажность стала " + house.getHumidity());
    }
}


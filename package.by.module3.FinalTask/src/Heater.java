public class Heater implements Indicators {
    @Override
    public void execute(int value, House house) {
        System.out.println("Температура была " + house.getTemperature());
        house.setTemperature(house.getTemperature() + value);
        System.out.println("Температура увеличена на " + value
                + " Температура стала" + house.getTemperature());
    }
}


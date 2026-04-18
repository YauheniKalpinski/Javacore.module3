public class HouseManagerHumidifier extends HouseManager {
    @Override
    public Indicators createIndicators() {
        return new Humidifier();
    }
}


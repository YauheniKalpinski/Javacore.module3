public class HouseManagerHeater extends HouseManager {
    @Override
    public Indicators createIndicators() {
        return new Heater();
    }
}

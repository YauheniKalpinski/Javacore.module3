public abstract class HouseManager {
    public abstract Indicators createIndicators();

    public void applyChange(int value, House house) {
        Indicators indicators = createIndicators();
        indicators.execute(value, house);//вызываем объект типа Indicators и передаем в него параметры
    }
}


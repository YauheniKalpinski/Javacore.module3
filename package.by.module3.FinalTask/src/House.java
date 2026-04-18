public class House {
    private static final int MIN_TEMP = 10;
    private static final int MAX_TEMP = 50;
    private static final int MIN_HUM = 30;
    private static final int MAX_HUM = 70;

    private int temperature;
    private int humidity;

    public House(int temperature, int humidity) {
        setTemperature(temperature);
        setHumidity(humidity);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        if (temperature >= MIN_TEMP && temperature <= MAX_TEMP) {
            this.temperature = temperature;
        } else if (temperature > MAX_TEMP) {
            System.out.println("Температура выше максимума, установлено " + MAX_TEMP);
            this.temperature = MAX_TEMP;
        } else {
            System.out.println("Температура ниже минимума, установлено " + MIN_TEMP);
            this.temperature = MIN_TEMP;
        }
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        if (humidity >= MIN_HUM && humidity <= MAX_HUM) {
            this.humidity = humidity;
        } else if (humidity > MAX_HUM) {
            System.out.println("Влажность выше максимума, установлено " + MAX_HUM);
            this.humidity = MAX_HUM;
        } else {
            System.out.println("Влажность ниже минимума, установлено " + MIN_HUM);
            this.humidity = MIN_HUM;
        }
    }
}


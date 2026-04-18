public class Garage<T extends Vehicle> {
    private T vehicle;//это поле которое принимает объект типа vehicle и все его наследники то есть по нисходящей

    Garage(T vehicle) {
        this.vehicle = vehicle;
    }

    public T getVehicle() {
        return vehicle;
    }
}

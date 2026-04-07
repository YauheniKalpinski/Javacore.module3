
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Welder();

        FactoryInfo factoryInfo = new FactoryInfo();
        factoryInfo.getSalary(worker1);
    }
}
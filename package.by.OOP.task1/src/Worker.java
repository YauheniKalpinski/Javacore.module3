public abstract class Worker extends Employee {
    //абстрактный потому что подразумевается что будут специалисты
    //нельзя создать рабочего без специализации
    protected int salary = 100;

    @Override
    int getSalary() {
        System.out.println("Зарплата рабочего без квалификации: " + salary);
        return salary;
    }
}

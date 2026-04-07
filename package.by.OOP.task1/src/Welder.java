public class Welder extends Worker {
    private static final int WELDER_BONUS = 200;//константа
    private int finalSalary;

    @Override
    int getSalary() {
        finalSalary = super.getSalary() + WELDER_BONUS;
        System.out.print("Зарплата рабочего с квалификацией сварщик: ");
        return finalSalary;
    }
}

public class VegetarianValidator {

    public boolean isVegetarian(Food[] foods) {
        if (foods == null || foods.length == 0 ) {
            System.out.println("Не передан набор ингредиентов");
            return false;
        }
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].getFoodType().equals(FoodType.MEAT)
                    || foods[i].getFoodType().equals(FoodType.FISH)
                    || foods[i].getFoodType().equals(FoodType.UNKNOWN)) {
                return false;
            }
        } return true;
    }
}
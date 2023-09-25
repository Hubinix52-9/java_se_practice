package pl.globallogic.streamsRestaurant;

import java.util.ArrayList;
import java.util.List;

public class MenuDataProcessor {

    public static int getTotalCaloriesForMenu(Menu menu) {
        int total = 0;
        for (Dish dish :
            menu.getDishList()) {
            total += dish.getCalories();
        }
        return total;
    }

    public static List<Dish> getVeganDishesForMenu(Menu menu) {
        List<Dish> veganDishes = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.isVegan()) {
                veganDishes.add(dish);
            }
        }
        return veganDishes;
    }

    public static List<Dish> getDishesWithCaloriesLessThan(int calories, Menu menu) {
        List<Dish> veganDishes = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.getCalories() < calories) {
                veganDishes.add(dish);
            }
        }
        return veganDishes;
    }

    public static List<Dish> getDishesWithCaloriesGreaterThan(int calories, Menu menu) {
        List<Dish> veganDishes = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.getCalories() > calories) {
                veganDishes.add(dish);
            }
        }
        return veganDishes;
    }

    public static List<Dish> getDishesWithCookingTimeLessThan(int minutes, Menu menu) {
        List<Dish> dishList = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.getCookingTime() < minutes) {
                dishList.add(dish);
            }
        }
        return dishList;
    }

    public static List<Dish> getDishesWithCookingTimeGreaterThan(int minutes, Menu menu) {
        List<Dish> dishList = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.getCookingTime() > minutes) {
                dishList.add(dish);
            }
        }
        return dishList;
    }

    public static List<Dish> getDishesWithIngredients(List<String> expectedIngredients, Menu menu) {
        List<Dish> dishList = new ArrayList<>();
        for (Dish dish : menu.getDishList()) {
            if (dish.getIngredients().containsAll(expectedIngredients)) {
                dishList.add(dish);
            }
        }
        return dishList;
    }

    public static List<Dish> getTop5DishesSortedByCalories(Menu menu) {
        List<Dish> sorted = new ArrayList<>(menu.getDishList());
        List<Dish> dishList = new ArrayList<>();
        sorted.sort(new DishCaloriesComparator());
        for (int i = 0; i < 4; i++) {
            dishList.add(sorted.get(i));
        }
        return dishList;
    }

    public static List<Dish> getVeganDishesWithCaloriesLT200Top3(Menu menu) {
        List<Dish> dishList = new ArrayList<>();
        List<Dish> vegan = getVeganDishesForMenu(menu);
        List<Dish> veganLT200Cal = getDishesWithCaloriesLessThan(200, new Menu(vegan));
        List<Dish> sorted = new ArrayList<>(veganLT200Cal);
        sorted.sort(new DishCaloriesComparator());
        for (int i = 0; i < 3; i++) {
            dishList.add(sorted.get(i));
        }
        return dishList;
    }
}

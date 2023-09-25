package pl.globallogic.streamsRestaurant;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class MenuDataProcessorTest {

    Menu menu;

    @BeforeClass
    public void testSetUp() {
        List<Dish> dishList = List.of(
                new Dish("Pasta", 450, 30, false, List.of("pasta", "cheese", "tomato", "olive oil")),
                new Dish("Pizza", 600, 20, false, List.of("flower", "cheese", "tomato", "ham")),
                new Dish("Hot dog", 300, 15, false, List.of("white bread", "sausage", "mustard")),
                new Dish("Ham sandwich", 270, 10, false, List.of("bread", "ham", "sauce", "salad")),
                new Dish("Pastrami sandwich", 250, 24, false, List.of("bread", "ham", "sauce", "salad")),
                new Dish("Kebab", 250, 13, false, List.of("tortilla", "chicken", "sauce", "tomato", "cucumber", "chili")),
                new Dish("Sushi", 200, 10, false, List.of("rice", "fish", "algi", "avocado")),
                new Dish("Boiled eggs", 130, 10, false, List.of("egg")),
                new Dish("Tofu", 130, 5, true, List.of("tofu")),
                new Dish("Vegetable biryani", 97, 60, true, List.of("rice", "olive oil", "vegetables", "chili")),
                new Dish("Bunny Carrots", 57, 0, true, List.of("carrots")) );
        menu = new Menu(dishList);
    }

    @Test
    public void shouldReturnTotalCaloriesForMenu() {
        int expectedTotalCalories = 2677;
        int totalCalories = MenuDataProcessor.getTotalCaloriesForMenu(menu);
        Assert.assertEquals(expectedTotalCalories, totalCalories);
    }

    @Test
    public void shouldReturnOnlyVeganDishes() {
        List<String> veganDishesTitle = List.of("Tofu", "Vegetable biryani");
        List<Dish> veganMenu = MenuDataProcessor.getVeganDishesForMenu(menu);
        Assert.assertTrue(veganDishesTitle.contains(veganMenu.get(0).getTitle()));
    }

    @Test
    public void shouldReturnDishesWithCaloriesLessThanSpecifiedValue() {
        int calories = 100;
        List<Dish> dishesWithLT150Cal = MenuDataProcessor.getDishesWithCaloriesLessThan(calories, menu);
        Assert.assertEquals("Vegetable biryani", dishesWithLT150Cal.get(0).getTitle());
    }

    @Test
    public void shouldReturnDishesWithCaloriesGreaterThanSpecifiedValue() {
        int calories = 200;
        List<Dish> dishesWithGT150Cal = MenuDataProcessor.getDishesWithCaloriesGreaterThan(calories, menu);
        Assert.assertEquals("Pasta", dishesWithGT150Cal.get(0).getTitle());
    }

    @Test
    public void shouldReturnDishesWithCookingTimeGTSpecified() {
        int expectedMinutes = 21;
        List<Dish> dishesWithCookingTimeLT20Min = MenuDataProcessor.getDishesWithCookingTimeLessThan(expectedMinutes, menu);
        Assert.assertEquals("Pizza", dishesWithCookingTimeLT20Min.get(0).getTitle());
    }
// get dishes with specified ingredient

    @Test
    public void shouldReturnDishesWithSpecifiedIngredients() {
        List<String> expectedIngredients = List.of("bread");
        int expectedNumOfDishes = 2;
        List<Dish> dishesWithIngredient = MenuDataProcessor.getDishesWithIngredients(expectedIngredients, menu);
        Assert.assertEquals(expectedNumOfDishes, dishesWithIngredient.size());
    }
// get dishes without specified ingredient

    // get top 5 less calories dishes
    @Test
    public void shouldReturn5LessCaloriesDishes() {
        String expected2ndDishTitle = "Boiled eggs";
        List<Dish> top5LessCalories = MenuDataProcessor.getTop5DishesSortedByCalories(menu);
        Assert.assertEquals(expected2ndDishTitle, top5LessCalories.get(1).getTitle());
    }

    // get top 3 vegan dishes cooking time with calories less than 200
    @Test
    public void shouldReturnTop3VeganDishLessThan200Calories() {
        List<Dish> top3VeganLT200Cal = MenuDataProcessor.getVeganDishesWithCaloriesLT200Top3(menu);
        Assert.assertEquals(3, top3VeganLT200Cal.size());
    }
}

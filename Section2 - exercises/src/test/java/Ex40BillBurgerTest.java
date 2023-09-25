import org.junit.Assert;
import org.junit.Test;

public class Ex40BillBurgerTest {
    @Test
    public void testHamburgerClass() {
        Ex40BillBurger obj = new Ex40BillBurger();
        Ex40BillBurger.Hamburger hamburger = obj.new Hamburger(6, "Beef burger", "Beef", "White");
        hamburger.addHamburgerAddition1("Addition1", 0.50);
        hamburger.addHamburgerAddition2("Addition2", 0.75);
        hamburger.addHamburgerAddition3("Addition3", 1.00);
        Assert.assertEquals(8.25, hamburger.itemizeHamburger(), 0.01);
    }

    @Test
    public void testDeluxeBurgerClass() {
        Ex40BillBurger obj = new Ex40BillBurger();
        Ex40BillBurger.DeluxeBurger deluxeBurger = obj.new DeluxeBurger();
        Assert.assertEquals(19.10, deluxeBurger.itemizeHamburger(), 0.01);
    }

    @Test
    public void testHealthyBurgerClass() {
        Ex40BillBurger obj = new Ex40BillBurger();
        Ex40BillBurger.HealthyBurger healthyBurger = obj.new HealthyBurger("Chicken", 6.50);
        healthyBurger.addHealthyAddition1("Addition1", 1.25);
        healthyBurger.addHealthyAddition2("Addition2", 1.50);
        Assert.assertEquals(9.25, healthyBurger.itemizeHamburger(), 0.01);
    }
}

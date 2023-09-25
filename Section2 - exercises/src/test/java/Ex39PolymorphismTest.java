import org.junit.Assert;
import org.junit.Test;
public class Ex39PolymorphismTest {
    @Test
        public void carClassTest() {
            Ex39Polymorphism obj = new Ex39Polymorphism();
            Ex39Polymorphism.Car car = obj.new Car(4, "Base Car");
            Assert.assertEquals("Car's engine is starting", car.startEngine());
            Assert.assertEquals("Car is accelerating", car.accelerate());
            Assert.assertEquals("Car is braking", car.brake());
            Assert.assertEquals(4, car.getCylinders());
            Assert.assertEquals("Base Car", car.getName());
        }

        @Test
        public void mitsubishiClassTest() {
            Ex39Polymorphism obj = new Ex39Polymorphism();
            Ex39Polymorphism.Mitsubishi mitsubishi = obj.new Mitsubishi(6, "Outlander");
            Assert.assertEquals("Mitsubishi's engine is starting", mitsubishi.startEngine());
            Assert.assertEquals("Mitsubishi is accelerating", mitsubishi.accelerate());
            Assert.assertEquals("Mitsubishi is braking", mitsubishi.brake());
            Assert.assertEquals(6, mitsubishi.getCylinders());
            Assert.assertEquals("Outlander", mitsubishi.getName());
        }

        @Test
        public void holdenClassTest() {
            Ex39Polymorphism obj = new Ex39Polymorphism();
            Ex39Polymorphism.Holden holden = obj.new Holden(8, "Commodore");
            Assert.assertEquals("Holden's engine is starting", holden.startEngine());
            Assert.assertEquals("Holden is accelerating", holden.accelerate());
            Assert.assertEquals("Holden is braking", holden.brake());
            Assert.assertEquals(8, holden.getCylinders());
            Assert.assertEquals("Commodore", holden.getName());
        }

        @Test
        public void fordClassTest() {
            Ex39Polymorphism obj = new Ex39Polymorphism();
            Ex39Polymorphism.Ford ford = obj.new Ford(6, "Fusion");
            Assert.assertEquals("Ford's engine is starting", ford.startEngine());
            Assert.assertEquals("Ford is accelerating", ford.accelerate());
            Assert.assertEquals("Ford is braking", ford.brake());
            Assert.assertEquals(6, ford.getCylinders());
            Assert.assertEquals("Fusion", ford.getName());
    }
}

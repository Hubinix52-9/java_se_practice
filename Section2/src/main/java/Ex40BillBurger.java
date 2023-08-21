public class Ex40BillBurger {
    class Hamburger{
        double price;
        String name, meat, breadRollType,addition1Name , addition2Name, addition3Name, addition4Name;
        double addition1Price, addition2Price, addition3Price, addition4Price;
        public Hamburger(double price, String name, String meat, String breadRollType){
            this.name = name;
            this.meat = meat;
            this.breadRollType = breadRollType;
            this.price = price;
        }
        public void addHamburgerAddition1(String name, double price){
            this.addition1Price = price;
            this.addition1Name = name;
        }
        public void addHamburgerAddition2(String name, double price){
            this.addition2Price = price;
            this.addition2Name = name;
        }
        public void addHamburgerAddition3(String name, double price){
            this.addition3Price = price;
            this.addition3Name = name;
        }
        public void addHamburgerAddition4(String name, double price){
            this.addition4Price = price;
            this.addition4Name = name;
        }
        public double itemizeHamburger(){
            double totalPrice = price;
            if (addition1Name != null) {
                totalPrice += addition1Price;
            }
            if (addition2Name != null) {
                totalPrice += addition2Price;
            }
            if (addition3Name != null) {
                totalPrice += addition3Price;
            }
            if (addition4Name != null) {
                totalPrice += addition4Price;
            }
            return totalPrice;
        }
    }
    public class DeluxeBurger extends Hamburger {
        public DeluxeBurger() {
            super(19.10, "Deluxe burger", "Chicken meat", "White Roll");
            addHamburgerAddition1("Chips", 2);
            addHamburgerAddition2("Drink", 1);
        }

        @Override
        public void addHamburgerAddition1(String name, double price) {
            System.out.print("Cannot add additional items to a deluxe burger.\n");
        }

        @Override
        public void addHamburgerAddition2(String name, double price) {
            System.out.print("Cannot add additional items to a deluxe burger.\n");
        }

        @Override
        public void addHamburgerAddition3(String name, double price) {
            System.out.print("Cannot add additional items to a deluxe burger.\n");
        }

        @Override
        public void addHamburgerAddition4(String name, double price) {
            System.out.print("Cannot add additional items to a deluxe burger.\n");
        }
    }
    public class HealthyBurger extends Hamburger {
        String healthyExtra1Name;
        double healthyExtra1Price;
        String healthyExtra2Name;
        double healthyExtra2Price;

        public HealthyBurger(String meat, double price) {
            super(price, "Healthy Burger",meat , "Brown roll");
        }

        public void addHealthyAddition1(String name, double price) {
            this.healthyExtra1Name = name;
            this.healthyExtra1Price = price;
        }

        public void addHealthyAddition2(String name, double price) {
            this.healthyExtra2Name = name;
            this.healthyExtra2Price = price;
        }

        @Override
        public double itemizeHamburger() {
            double totalPrice = super.itemizeHamburger();
            if (healthyExtra1Name != null) {
                totalPrice += healthyExtra1Price;
            }
            if (healthyExtra2Name != null) {
                totalPrice += healthyExtra2Price;
            }
            return totalPrice;
        }
    }
}

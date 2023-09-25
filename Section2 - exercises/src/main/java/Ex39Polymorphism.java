public class Ex39Polymorphism {
    class Car {
        private boolean engine;
        private int cylinders;
        private String name;
        private int wheels;

        public Car(int cylinders, String name) {
            this.cylinders = cylinders;
            this.name = name;
            this.engine = true;
            this.wheels = 4;
        }

        public String startEngine() {
            return "Car's engine is starting";
        }

        public String accelerate() {
            return "Car is accelerating";
        }

        public String brake() {
            return "Car is braking";
        }

        public int getCylinders() {
            return cylinders;
        }

        public String getName() {
            return name;
        }
    }

    class Mitsubishi extends Car {
        public Mitsubishi(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Mitsubishi's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Mitsubishi is accelerating";
        }

        @Override
        public String brake() {
            return "Mitsubishi is braking";
        }
    }

    class Holden extends Car {
        public Holden(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Holden's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Holden is accelerating";
        }

        @Override
        public String brake() {
            return "Holden is braking";
        }
    }

    class Ford extends Car {
        public Ford(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "Ford's engine is starting";
        }

        @Override
        public String accelerate() {
            return "Ford is accelerating";
        }

        @Override
        public String brake() {
            return "Ford is braking";
        }
    }
}

public class Ex33CarpetCostCalculator {
    public class Floor{
        double width, length;
        public Floor(double width, double length){
            if (width < 0) {
                this.width = 0;
            }
            else{
                this.width = width;
            }
            if (length < 0) {
                this.length = 0;
            }
            else{
                this.length = length;
            }
        }

        public double getArea(){
            return this.length*this.width;
        }
    }

    public class Carpet{
        double cost;
        public Carpet(double cost){
            if (cost < 0){this.cost = 0;}
            else {this.cost = cost;}
        }
        public double getCost(){return this.cost;}
    }

    public class Calculator{
        Floor floor;
        Carpet carpet;

        public Calculator(Floor floor, Carpet carpet){
            this.floor = floor;
            this.carpet = carpet;
        }

        public double getTotalCost(){
            double cost = this.carpet.getCost();
            double area = this.floor.getArea();
            return area*cost;
        }
    }

}

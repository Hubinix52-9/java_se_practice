public class Ex35Cylinder {
    public class Circle{
        double radius;
        public Circle(double radius){
            if (radius < 0){
                this.radius = 0;
            }
            else {
                this.radius = radius;
            }
        }
        public double getRadius(){
            return this.radius;
        }
        public double getArea(){
            return this.radius * this.radius * Math.PI;
        }
    }
    public class Cylinder extends  Circle{
        double height;
        public Cylinder(double radius, double height){
            super(radius);
            this.height = (height < 0) ? 0 : height;
        }
        public double getHeight(){
            return this.height;
        }
        public double getVolume(){
            return this.getArea()*this.height;
        }
    }
}

public class Ex36PoolArea {
    public class Rectangle{
        private double width;
        private double length;
        public Rectangle(double width, double length){
            this.width = (width < 0) ? 0 : width;
            this.length = (length < 0) ? 0 : length;
        }
        public double getWidth(){
            return this.width;
        }
        public double getLength(){
            return this.length;
        }
        public double getArea(){
            return this.length*this.width;
        }
    }
    public class Cuboid extends Rectangle{
        double height;
        public Cuboid(double height, double width, double length){
            super(width, length);
            this.height = (height < 0) ? 0 : height;
        }
        public double getHeight(){
            return this.height;
        }
        public double getVolume(){
            return this.height* this.getWidth() *this.getLength();
        }
    }
}

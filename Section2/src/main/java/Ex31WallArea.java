public class Ex31WallArea {
    private double width, height;
    public Ex31WallArea(){}
    public Ex31WallArea(double widthA, double heightA){
        if (widthA<0){width = 0;}
        else {width = widthA;}
        if (heightA<0){height = 0;}
        else {height = heightA;}
    }
    public double getWidth(){return width;}
    public double getHeight(){return height;}
    public void setWidth(double value){
        if(value<0){width=0;}
        else {width = value;}
    }
    public void setHeight(double value){
        if(value<0){height=0;}
        else {height = value;}
    }
    public double getArea(){return width*height;}

}

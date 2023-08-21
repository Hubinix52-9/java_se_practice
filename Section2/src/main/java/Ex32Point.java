public class Ex32Point {
    private int x,y;
    public Ex32Point(){}
    public Ex32Point(int arg1, int arg2){
        this.x = arg1;
        this.y = arg2;
    }
    public int getX(){return x;}
    public int getY(){return y;}
    public void setX(int value){this.x = value;}
    public void setY(int value){this.y = value;}
    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(int x, int y) {
        int xDiff = x - this.x;
        int yDiff = y - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }

    public double distance(Ex32Point another) {
        int xDiff = another.getX() - this.x;
        int yDiff = another.getY() - this.y;
        return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
}

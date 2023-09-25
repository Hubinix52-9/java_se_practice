public class Ex34ComplexNumber  {
    double real, imaginary;
    public Ex34ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    public double getReal(){
        return this.real;
    }
    public double getImaginary(){
        return this.imaginary;
    }
    public void add(double real, double imaginary){
        this.real += real;
        this.imaginary += imaginary;
    }
    public void add(Ex34ComplexNumber complexNumber){
        this.real += complexNumber.real;
        this.imaginary += complexNumber.imaginary;
    }
    public void subtract(double real, double imaginary){
        this.real -= real;
        this.imaginary -= imaginary;
    }
    public void subtract(Ex34ComplexNumber complexNumber){
        this.real -= complexNumber.real;
        this.imaginary -= complexNumber.imaginary;
    }
}

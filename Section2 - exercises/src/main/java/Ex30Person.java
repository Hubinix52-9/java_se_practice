public class Ex30Person {
    private String firstName, lastName;
    private int age;

    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public int getAge(){return age;}
    public void setFirstName(String name){firstName=name;}
    public void setLastName(String name){lastName=name;}
    public void setAge(int years){
        if (years>100 || years<0){age=0;}
        else {age=years;}
    }
    public boolean isTeen(){
        return age>12 && age<20;
    }
    public String getFullName(){
        if (firstName.isEmpty() && !lastName.isEmpty()){return lastName;}
        else if (!firstName.isEmpty() && lastName.isEmpty()){return firstName;}
        else if (!firstName.isEmpty()){return firstName + " " + lastName;}
        else {return "";}
    }

}

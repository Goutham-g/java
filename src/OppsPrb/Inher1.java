package OppsPrb;

public class Inher1 {
    String st="inheritence1";


int a=20;

    Inher1(){
        System.out.println("Constructor in Inher1");
    }


    void Display(){
        System.out.println("parent display");

    }
    void overload(){
        System.out.println("overload demo");
    }
    void overload(int a){
        System.out.println("overload single argument:"+a);
    }
    void overload(double a){
        System.out.println("float overload"+a);
    }
    String overload(String a){
        System.out.println("returned value"+a);
        return a;

    }

}

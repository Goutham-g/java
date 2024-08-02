package OppsPrb;

public class Inher2 extends Inher1 {
 int a=100;
   public Inher2(){
        System.out.println(
                "Constructor in inhr2"
        );
    }
    void sum(){
        int c=a+super.a;

        System.out.println("sum :"+c);
    }

    void Display(){

        System.out.println("child display");
    }
    void superDisplay(){
        super.Display();
    }
    void overload(double a){
        System.out.println("float overload"+a);
    }


}

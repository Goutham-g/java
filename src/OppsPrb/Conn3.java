package OppsPrb;

public class Conn3 extends Conn2 {

    Conn3(){

        System.out.println("Const no argument 3 ");

    }
    Conn3(int a){
        super(10);
        System.out.println("const with argument 3:"+a);
    }
    void Display(){
        super.Display();
        System.out.println("Conn3");
    }





}

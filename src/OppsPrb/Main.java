package OppsPrb;

import java.util.Arrays;

public class Main {

    static int stt=10;

    public static void main(String[] args) {
        Cat  cat=new Cat();
        Animal a1=new Animal();
        Animal a2=new Animal();
        a1.a=10;
        a1.b=20;

        a2.a=30;
        a2.b=40;

        System.out.println("a1:"+a1.b+" "+"a2:"+a2.b );

        a1.display();
        a2.display();

        //sum class

        Sum add1=new Sum();
        Sum add2= new Sum();
        add1.b=15;
        add1.c=20;

        add2.b=50;
        add2.c=40;

        add1.add();
        add2.add();

        add1.displaySum();
        add2.displaySum();

        add1.sub(20,10);
        add2.sub(30,10);

        int val1=20;
        int val2=10;

        add1.sub(val1,val2);
        add1.displaySum();
         //   //   //

        First nF=new First();

        nF.displayFst();
        Final ff=new Final();
        ff.displayfinal();

        // static
        System.out.println(stt);
        Final f1=new Final();
        Final f2 = new Final();
        f1.stVal=20;
        f2.stVal=30;
        System.out.println(f1.stVal
        );

        //constructor

        Conn c1=new Conn(3000);
        c1.displaySum();

        Conn c2=new Conn(2000);
        c2.displaySum();

        //
        //inheritence

            Inher2 in=new Inher2();

            Inher2 in2=new Inher2();
            in2.Display();


// method overloading

        Inher1 ovr=new Inher1();
        ovr.overload("String");
        ovr.overload(4);
        ovr.overload( 10.5);



        //Super keyword
        Inher2 inn= new Inher2();
        inn.superDisplay();
        inn.Display();
        inn.sum();
        //constructor using super

        Conn3 newCon=new Conn3(20);

        Conn3 coo=new Conn3(10);
        Conn2 co2= new Conn2();
        coo.Display();
        Vehicle ve=new Car();
        System.out.println(ve.brand);
        ve.makeSound();


































    }
}

package OppsPrb;
import OppsPrb1.com.*;


public class Second
{
   Pack pk= new Pack();



    void displaySec(){
        pk.view();
        System.out.println("second class");
    }

    public static void main(String[] args) {
        Second se=new Second();
        se.displaySec();
    }
}

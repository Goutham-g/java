package OppsPrb1.com;

public class Sample extends Abs {
    @Override
    void onText(String text) {
        System.out.println( text); //text get after scan
    }
    Sample(){
        Scann Sc=new Scann(this);
        Sc.scan();
    }


}

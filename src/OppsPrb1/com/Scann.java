package OppsPrb1.com;


public class Scann {
    Abs obj;

    public  Scann(Abs obj){
        this.obj=obj;

    }
    void scan(){
        obj.onText("Scanned text");
    }

}

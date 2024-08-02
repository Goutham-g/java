package OppsPrb1.com;

public class Inhr11 implements Inter2,Inter{

    public void display(){
        System.out.println("Inherit 1");
    }

    @Override
    public void name() {
        System.out.println("display name");

    }

    @Override
    public void displayView() {
        System.out.println("display view");
    }

}

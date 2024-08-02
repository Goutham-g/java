package OppsPrb1.com;

public class Hen implements Fly,Walk {



//    @Override
//    public void canFly() {
//
//        System.out.println("canFly");
//    }

    @Override
    public void canWalk() {
        Walk.super.canWalk();

        System.out.println("canWalk");


    }
}

package OppsPrb;

public class Conn {
    int a,value=200;

    Conn(int num){
        System.out.println(num);
         this.value=num;
        System.out.println("display in con:"+num);
        System.out.println("Constructor Created");
    }

    void displaySum(){
        int sum =10+value;
        System.out.println(sum);
    }
}

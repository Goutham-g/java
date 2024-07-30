package javaBasics;

public class StringQue {


    public static void main(String[] args) {

        String Str = "Sample String"+ "!!";

        System.out.println(Str);
        System.out.println(Str.endsWith("g"));
        System.out.println(Str.endsWith("!!"));
        System.out.println(Str.startsWith("S"));
        System.out.println(Str.length());
        System.out.println(Str.indexOf("t"));
        System.out.println(Str.replace("!","**"));

    }

}

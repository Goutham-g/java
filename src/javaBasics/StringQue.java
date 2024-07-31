package javaBasics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StringQue {


    public static void main(String[] args) {

        String Str = "Sample String"+ "!!"; // immutable

        System.out.println(Str);
        System.out.println(Str.endsWith("g"));
        System.out.println(Str.endsWith("!!"));
        System.out.println(Str.startsWith("S"));
        System.out.println(Str.length());
        System.out.println(Str.indexOf("t"));
        System.out.println(Str.replace("!","**"));
        System.out.println(Str.replaceAll("S","*"));

        String str=new String();
        str.length();
        str="nameee";
        System.out.println(str.charAt(4));
        System.out.println(str.toUpperCase());


        boolean result=(str==Str);
        System.out.println(result);

        int l=str.length();
        System.out.println(l);

        //print each char


        //String copy
        String R="Sample";
        String copy= String.valueOf(R.charAt(3));




//        copy=R;
        System.out.println(copy);

      //reverse a string
        String rev="malayalam";
        String newRev="";
        boolean flag=true;
        for(int i=0;i<rev.length();i++){
            newRev = rev.charAt(i)+newRev;

        }
        for(int i=0;i<newRev.length();i++){
            if(newRev.charAt(i)!=rev.charAt(i)){
               flag=false;
            }

        }
        if(flag){
            System.out.println("String is paliondrome");
        }else{
            System.out.println("not a paliondrome");
        }

        System.out.println("String rev:"+newRev);



        //split method
        String arrS="apple,orange,mango";
        String[] Arr=arrS.split(",");

        for(int i=0;i<Arr.length;i++){
            System.out.println(Arr[i]);
        }
        //charArray

        char[] charArray= arrS.toCharArray();
        for(char ar:charArray){
            System.out.print(ar+"");
        }
        System.out.println();

        //StringBuffer

        StringBuffer sb=new StringBuffer("Sample");
        sb.append("String");
        System.out.println(sb);


        String SS=sb.toString();


        System.out.println(SS);
       sb.deleteCharAt(4);
        System.out.println(sb.reverse());

        //String reverse using String buffer

        String Revv="reverse";

       StringBuffer SSb=new StringBuffer(Revv);
       SSb.reverse();
       String op=SSb.toString();
        System.out.println("reverse using class:"+op);


// collection - java.util package


        Collection<Integer> num = new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(4);
        num.add(5);
        num.add(4);
        num.add(5);

        System.out.println(num);

        List<Integer> lis=new ArrayList<>();
        lis.add(4);
        lis.add(3);
        lis.add(33);
        lis.add(5);
        lis.add(8);
        lis.add(9);
        System.out.println("index is :"+lis.indexOf(5));
        System.out.println(lis.get(4));










    }

}

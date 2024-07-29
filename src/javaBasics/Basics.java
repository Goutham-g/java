package javaBasics;

import java.util.Scanner;

public class Basics {








    public static void main(String[] args) {

        System.out.println("enter two no");
        Scanner scan =new Scanner(System.in);
        try{
        int n1=scan.nextInt();
        int n2 =scan.nextInt();

            int div=n1/n2;
            System.out.println(div);
}
        catch(Exception e){
            System.out.println("the input type mismatch"+e);
        }




//        System.out.println("   J    a   ");
//        System.out.println("   J   a a   ");
//        System.out.println("J  J  aaaaa     ");
//        System.out.println(" JJ  a     a ");

        // swap two variables
        int a=10;
        int b=20;
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("a="+a+"and"+"b="+b);

        System.out.println("enter a binary no");
       Scanner scan1 =new Scanner(System.in);
       int num1=scan.nextInt();
       int sum=0;
       while(num1!=0){
           int n=num1%10;
           sum=sum+n;
           num1=num1/10;
       }
        System.out.println(sum);

        //reverse the digit of an integer

           System.out.println("enter a  no");
          Scanner scan2 =new Scanner(System.in);
          int numm1=scan.nextInt();
          int i=0;
          int var=0;
         while(num1!=0) {
             int n = num1%10;
             var=var*10+n;
             num1=num1/10;


         }
        System.out.println(var);

//        Count the no of digit in an integer

        System.out.println("enter a digit");
        Scanner scan3 =new Scanner(System.in);
        int num=scan.nextInt();
        int count=0;
          while(num!=0){
              int n=num%10;
              num = num/10;
              count++;
          }
        System.out.println(count);

          // find the largest digit in an integer
        //12345
             int current=0;
        while(num!=0){
            int n=num%10;

            if(n>current){
                current=n;

            }else{
                num=num/10;
            }


        }
        System.out.println("largest"+current);

//paliondrome

        //1221

         int n = 12221;
         int ogNum=n;
         int rev=0;

         while(n!=0){
             int quo =n%10;
             rev=rev*10+ quo;
             n=n/10;

         }


        if(rev==ogNum){
            System.out.println("the num is paliondrome:"+rev);
        }else{
            System.out.println("not a paliondrome");
        }

        //product of the digits of an integer

        int num2=12345;
        int pro=1;

        for(int temp1=num1;temp1>0;temp1=temp1/10){
                int n2=temp1%10;
                pro=pro*n2;


        }
        System.out.println(pro+"pro");



    }

}

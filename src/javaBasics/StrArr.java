package javaBasics;

import java.util.Arrays;

public class StrArr {
    public static void main(String[] args) {


        //multidimensional array
        int[][] new1 = new int[4][5];
        new1[3][4] = 4;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(new1[i][j]);
            }
            System.out.println();
        }

// test if 10 appears as first or last in an array

        int[] digits = {10, -20, 0, 30, 40, 20, 10};

        boolean result = (digits[0] == 10 && digits[digits.length - 2] == 10);
        System.out.println(result);

        //check first and last element of an array of integer is same

        boolean result1 = (digits[0] == digits[digits.length - 1]);
        System.out.println(result1);

        //check first and last element of two array is equal
        int[] digits2 = {30, 40, 50, 20};
        if (digits.length > 2 && digits2.length > 2) {
            boolean result2 = (digits[0] == digits2[0] && digits[digits.length - 1] == digits2[digits2.length - 1]);
            System.out.println(result2);
        } else {
            System.out.println("length of array is less than 2");
        }

        // rotate the array

        if (digits2.length > 2) {
            int[] newArr = {digits2[1], digits2[2], digits2[3], digits2[0]};

            System.out.println(Arrays.toString(newArr));
        }

        //get largest value between first and last element

        int[] a1 = {2, 3, 4, 5, 6,};
        int max_val = 0;

        for (int i = 0; i < a1.length - 2; i++) {
            if (a1[i] > max_val) {
                max_val = a1[i];

            } else {
                System.out.println("largest"+max_val);
            }


        }


        //copy element to another
        int[] c1 = {1, 2, 3, 4, 5, 6, 7};

        int[] nwArr = new int[c1.length];

        for (int i = 0; i < c1.length; i++) {
            nwArr[i] = c1[i];
        }
        for (int i = 0; i < nwArr.length; i++) {
            System.out.println(nwArr[i]);
        }
        System.out.println(Arrays.toString(nwArr));


        //sum of array integer
        int[] arrayS = {2, 3, 4, 5, 6, 7};

        int sum = 0;
        for (int i = 0; i < arrayS.length; i++) {
            sum = sum + arrayS[i];

        }
        System.out.println("sum=" + sum);

        //find the largest

        int[] lar = {2, 3, 4, 5, 6, 7, 2, 33};

        int larger = lar[0];
        for (int i = 0; i < lar.length; i++) {
            if (lar[i] > larger) {
                larger = lar[i];
            }


        }
        System.out.println("largest element:" + larger);

        //reverse of array

        int[] revArr = {1, 2, 3, 4, 5, 6};
        int[] newRev = new int[revArr.length];
        int num=0;
        for (int i = revArr.length - 1; i >= 0; i--) {


                newRev[num] = revArr[i];
                num++;

        }
        System.out.println("reversed array:"+Arrays.toString(newRev));
        if(newRev==newRev){
            System.out.println("the number is paliondrome");
        }else{
            System.out.println("not a paloiondrome");
        }



        //reverse String array

        String [] A2={"m","a","l","a","y","a","l","a","m"};
        int len=A2.length;
        String [] newArr=new String[len];
        int count=0;

        for(int i=len-1;i>=0;i--){
            newArr[count]=A2[i];
            count=count+1;
        }
        System.out.println(Arrays.toString(newArr));


// swap an array

        String[] swapA ={"A","B","C","D"};
        int arLen=swapA.length;

           for(int i=0;i<arLen/2;i++){
               String temp =swapA[i];
               swapA[i] = swapA[arLen-i-1];
               swapA[arLen-i-1] = temp;
           }
        System.out.println(Arrays.toString(swapA));


           //move zero to end
        int[] zero={2,3,0,5,0,3,0,2,5};
        int lenn=zero.length;
        int a=0;

        for(int i=0;i<=zero.length-1;i++){


            if(zero[i]!=0){
               zero[a]=zero[i];
               a++;
            }


        }
        for(int i =a;i<zero.length;i++){
            zero[i]=0;
        }
        System.out.println(Arrays.toString(zero));

        //Arrays class
//sort
       int[] A1={16,4,6,22,4,55,1,5};
       String[] B={"A","a","d","W","D","g","l","C"};


       Arrays.sort(A1);
        System.out.println("sorted:"+Arrays.toString(A1));
        Arrays.sort(B);
        System.out.println("String Sorted"+Arrays.toString(B));


        //binarySearch

        int search=Arrays.binarySearch(A1,22);
        System.out.println("index is:"+search);

        int S=Arrays.binarySearch(B,"W");
        System.out.println("index String:"+S);

        //fill
        int[] fill= new int[5];
        Arrays.fill(fill,5);
        System.out.println("filled array:"+Arrays.toString(fill));



        int[] num1={2,0,4,6,0,3,0};
        int[] newArr1=new int[num1.length];
        int c=0;

        for(int i=0;i<num1.length;i++){
            if(num1[i]!=0){

                newArr1[a]=num1[i];
                a++;

            }
            System.out.println(Arrays.toString(newArr));



        }

    }


    }



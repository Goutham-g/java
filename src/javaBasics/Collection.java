package javaBasics;

import java.util.*;

public class Collection {
    public static void main(String[] args) {


        // Arraylist
        // adding element to array list
        List  <String>  newLi = new ArrayList<>();
          newLi.add("lis");
        newLi.add("lis1");
        newLi.add("lis2");
        newLi.add("lis3");
        newLi.add("lis4");
        newLi.add("lis6");

        System.out.println("list:"+newLi);

        //remove element

        List <Integer>  L1= new ArrayList<>();
        L1.add(9);
        L1.add(6);
        L1.add(53);
        L1.add(7);
        L1.add(59);
          L1.remove(2);
          L1.remove(3);
        System.out.println("After remove:"+L1);

        Collections.sort(L1);
        System.out.println("sorted:"+L1);

        //convert array to list

        String[] Arr={"aaa","bb","cc","dd","dd","sss","ff"};

          List <String> lii= Arrays.asList(Arr);

          System.out.println("ListArray:"+lii);

          //resize

        List<String> Resize=new ArrayList<>(Arrays.asList(Arr));

        Resize.add("NewEle");

        System.out.println("ResizeArr:"+Resize);


        //set

        Set <Integer> newSet =new HashSet<>();
        newSet.add(54);
        newSet.add(22);
        newSet.add(33);
        newSet.add(44);
        newSet.add(75);
        newSet.add(21);
        System.out.println("set:"+newSet);

        //treeset

        Set <Integer> newSet1 =new TreeSet<>();
        newSet.add(54);
        newSet.add(22);
        newSet.add(33);
        newSet.add(44);
        newSet.add(75);
        newSet.add(21);
        System.out.println("set:"+newSet);
        newSet.remove(44);
        System.out.println("removedSet:"+newSet);

        //convert array to set

        int[] Arrr={5,4,3,2,3,5,66,3,};

        Set<Integer> Arrset=new HashSet<>();








    }
}

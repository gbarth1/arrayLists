package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args)
    {
	    ArrayList<String> myers = new ArrayList();
        myers.add("Bubb");
        myers.add("Mr. P");
        myers.add(0, "Argen the dragon");
        myers.add("27");
        myers.remove(0);
        String num = myers.get(2);
        //indexOf and lastIndexOf
        //indexOf - beginning to end
        //lastIndexOf - end to beginning
        //myers.clear();
        System.out.println(myers.size());
        System.out.println(num);
        System.out.println(myers);
    }
}

package com.ripal.testproject;


import java.util.*;

class Application
{
    public static void main(String[] args)
    {
        String testString1 = "The quick brown fox jumps ";
        String testString2 = "The brown jumps";
        returnString(testString1, testString2);


        /*String[] s1 = testString1.split(" ");

        //System.out.println(s1[0]);
        String[] s2 = testString2.split(" ");
        //System.out.println(s2[0]);
        ArrayList<String> l1 = new ArrayList<String> (Arrays.asList(s1));
        ArrayList<String> l2 = new ArrayList<String> (Arrays.asList(s2));

        l1.removeAll(l2);
        String[] s3 = l1.toArray(new String[l1.size()]);
        for(String i : s3)
        System.out.print(" "+i);
*/

    }

    public static void returnString(String ss1, String ss2)
    {
        String[] s1 = ss1.split(" ");

        //System.out.println(s1[0]);
        String[] s2 = ss2.split(" ");
        //System.out.println(s2[0]);
        ArrayList<String> l1 = new ArrayList<String> (Arrays.asList(s1));
        ArrayList<String> l2 = new ArrayList<String> (Arrays.asList(s2));

        l1.removeAll(l2);
        String[] s3 = l1.toArray(new String[l1.size()]);
        for(String i : s3)
            System.out.print(" "+i);
    }


}

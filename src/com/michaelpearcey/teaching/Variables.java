package com.michaelpearcey.teaching;

public class Variables {

    static byte bt;
    static short sht;
    static int num;
    static long longNum;
    static float floatyBoi;
    static double doublyFloatyBoi;
    static char characteryBoi;
    static boolean baloon;

    public static void main(String[] args) {
        bt = Byte.MAX_VALUE;
        sht = Short.MAX_VALUE;
        num = Integer.MAX_VALUE;
        longNum = Long.MAX_VALUE;
        floatyBoi = Float.MAX_VALUE;
        doublyFloatyBoi = Double.MAX_VALUE;
        characteryBoi = Character.MAX_VALUE;
        baloon = true;
        System.out.println("Byte: " + bt);
        System.out.println("Short: " + sht);
        System.out.println("Int: " + num);
        System.out.println("Long: " + longNum);
        System.out.println("Float: " + floatyBoi);
        System.out.println("Double: " + doublyFloatyBoi);
        System.out.println("Character: " + (int)characteryBoi);
        System.out.println("Boolean: " + baloon);
    }
}

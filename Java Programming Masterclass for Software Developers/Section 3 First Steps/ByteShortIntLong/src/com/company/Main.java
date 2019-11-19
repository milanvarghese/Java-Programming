package com.company;

import java.net.SocketOption;

public class Main {

    public static void main(String[] args) {
        int myValue=10000;
        int myMinIntValue=Integer.MIN_VALUE;
        int myMaxIntValue=Integer.MAX_VALUE;
        System.out.println("My Minimum Int Value: "+ myMinIntValue);
        System.out.println("My Maximum Int Value: "+ myMaxIntValue);
        System.out.println("Busted MIN Value: "+ (myMinIntValue+1)); //Underflow
        System.out.println("Busted MAX Value: "+(myMaxIntValue-1)); //Overflow

        int myMaxIntTest = 2_147_483_647;

        Short myMinShortValue = Short.MIN_VALUE;
        Short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("My Minimum Short Value: "+myMinShortValue);
        System.out.println("My Maximum Short Value: "+myMaxShortValue);

        long myLongValue=100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("My Minimum Long Value: "+myMinLongValue);
        System.out.println("My Maximum Long Value: "+myMaxLongValue);

        long bigLongLiteralValue=2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue=32767;

        int myTotal = (myMinIntValue/2);
        byte myNewByteValue=(byte) (myTotal/2);

        short myNewShortValue=(short)(myMaxIntValue/2);
    }
}

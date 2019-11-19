package com.company;

public class Main {

    public static void main(String[] args) {
        byte myByteNumber=25;
        int myIntNumber=245;
        short myShortNumber=532;
        long myLongNumber=50000L+10L*(myByteNumber+myShortNumber+myIntNumber);
        System.out.println(myLongNumber);
        short shortTotal= (short)(1000+10*(myByteNumber+myIntNumber+myShortNumber));
    }
}

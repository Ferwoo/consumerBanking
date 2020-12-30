package com.companyname.bank;

/**
 * @description:
 * @author:
 * @create: 2020-12-30 11:11
 **/

public class TestThread{
    public static void main(String []args){
        RunnableDemo R1 = new RunnableDemo("Thread-1 ");
        R1.start();
        RunnableDemo R2 = new RunnableDemo("Thread-2 ");
        R2.start();

    }
}
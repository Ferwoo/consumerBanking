package com.companyname.bank;

import java.io.InterruptedIOException;
import java.io.*;
/**
 * @description:
 * @author:
 * @create: 2020-12-30 10:53
 **/
public class RunnableDemo implements Runnable{
   private Thread t;
   private String threadName ;
   RunnableDemo(String name){
       threadName = name;
       System.out.println("creating "+threadName);
   }

   public void run(){
       System.out.println("Running " +  threadName );
       try{
           for (int i=5;i>0;i--){
               System.out.println("Thread :"+threadName+ ", " + i);
               Thread.sleep(50);
           }
       }catch (InterruptedException e) {
           System.out.println("Thread :"+threadName+"interrupted.");
       }
       System.out.println("Thread " +  threadName + "exiting.");
    }

    public void start(){
       System.out.println("Starting " +  threadName );
       if (t == null){
           t = new Thread(this,threadName);
           t.start();
       }
    }
}


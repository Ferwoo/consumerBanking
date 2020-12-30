package com.companyname.bank;

import java.io.*;

/**
 * @description:
 * @author:
 * @create: 2020-12-30 09:33
 **/
public class SerializeDemo {
    public static void main(String [] args){
        Employee e =new Employee();
        e.name = "Ray";
        e.address = "Beijing";
        e.SSN = 11123333;
        e.number = 302;
        try {
            FileOutputStream fileOut = new FileOutputStream("/tmp/employee.ser");
            ObjectOutputStream out =new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Serialized data is saved in /tmp/employee.ser");
        }catch(IOException i){
            i.printStackTrace();
        }
    }
}

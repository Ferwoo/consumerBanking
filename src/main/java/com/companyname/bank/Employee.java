package com.companyname.bank;

/**
 * @description:
 * @author:
 * @create: 2020-12-30 09:25
 **/
public class Employee implements java.io.Serializable {
    public String name;
    public String address;
    public transient int SSN;
    public int number;

    public void mailCheck()
    {
        System.out.println("Mailing a check to " + name
                + " " + address);
    }
}

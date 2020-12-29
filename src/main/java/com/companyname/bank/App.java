package com.companyname.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //枚举
        FreshJuice juice = new FreshJuice() ;
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println(juice.size);

        //hashmap
        HashMap<String,String> Sites = new HashMap<String, String>();
        Sites.put("wufei","sleep");
        Sites.put("lino","jump");
        Sites.put("jack","run");

        System.out.println(Sites);
        System.out.println(Sites.get("jack"));
        System.out.println(Sites.isEmpty());

        //动态修改的数组ArrayList
        ArrayList<String> sites =new ArrayList<String>();
        sites.add("goolge");
        sites.add("Runoob");
        sites.add("Taobao");
        System.out.println(sites);

        //异常处理
        int a[] =new int[2];
        try {
            System.out.println("access element free :"+a[3]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown :"+e);
        }
        finally {
            a[0]=6;
            System.out.println("First element value: " +a[0]);
            System.out.println("The finally statement is executed");
        }

        //链表
        LinkedList<String> site1 = new LinkedList<String>();
        site1.add("a1");
        site1.add("b1");
        site1.add("c1");
        site1.addFirst("d1");
        site1.addLast("e1");
        System.out.println(site1);
        site1.removeFirst();
        site1.removeLast();
        System.out.println(site1);
        System.out.println(site1.getFirst());

        for (int size = site1.size(),i = 0;i <size;i++){
            System.out.println(site1.get(i));
        }

        //Iterator（迭代器）
        Iterator<String> it= sites.iterator();
        System.out.println(it.next());

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }

}

class FreshJuice{
    enum FreshJuiceSize{ SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;

}

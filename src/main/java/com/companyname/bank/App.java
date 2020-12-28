package com.companyname.bank;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" ) ;
        FreshJuice juice = new FreshJuice() ;
        juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
        System.out.println(juice.size);

        HashMap<String,String> Sites = new HashMap<String, String>();
        Sites.put("wufei","sleep");
        Sites.put("lino","jump");
        Sites.put("jack","run");

        System.out.println(Sites);
        System.out.println(Sites.get("jack"));
        System.out.println(Sites.size());
        System.out.println(Sites.isEmpty());

        ArrayList<String> sites =new ArrayList<String>();
        sites.add("goolge");
        System.out.println(sites);


    }

}

class FreshJuice{
    enum FreshJuiceSize{ SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;

}

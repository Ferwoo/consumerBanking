package com.companyname.bank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ParseException {
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

        //时间time
        SimpleDateFormat st = new SimpleDateFormat("yyyy年MM月dd日");
        String birthday = "2000年1月2日";
        Date d = st.parse(birthday);
        long myTime = d.getTime();
        long currentTime = new Date().getTime();
        System.out.println((currentTime-myTime)/1000/60/60/24/365);

        //Scanner 获取输入
//        Scanner scan = new Scanner(System.in);
//        System.out.println("next 方式接受： ");
//        if (scan.hasNext()){
//            String str1 = scan.next();
//            System.out.println("输入的数据为："+str1);
//        }
//        scan.close();

        // StringBuffer和StringBuilder
        StringBuilder sb = new StringBuilder(10);
        sb.append("Rubby");
        System.out.println(sb);
        sb.append("!");
        System.out.println(sb);
        sb.insert(3,"nana");
        System.out.println(sb);
        sb.delete(3,5);
        System.out.println(sb);

        //泛型,创建不同类型数组： Integer, Double 和 Character
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4 };
        Character[] charArray = { 'H', 'E', 'L', 'L', 'O' };

        System.out.println( "整型数组元素为:" );
        printArray( intArray  ); // 传递一个整型数组

        System.out.println( "\n双精度型数组元素为:" );
        printArray( doubleArray ); // 传递一个双精度型数组

        System.out.println( "\n字符型数组元素为:" );
        printArray( charArray ); // 传递一个字符型数组

        //时间
        Date dNow = new Date( );
        System.out.println(dNow);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");

        System.out.println("当前时间为: " + ft.format(dNow));
    }

    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }

}

class FreshJuice{
    enum FreshJuiceSize{ SMALL,MEDIUM,LARGE}
    FreshJuiceSize size;

}


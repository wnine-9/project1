package learn.bean;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
    //模版六：prsf：可生成private static final(私有静态常量)
    private static final Customer CUST = new Customer();
        //变形：psf：可生成public static final（共有静态常量）
        public static final int  NUM = 1;
        //变形：psfi
        public static final int NUM2 = 2;
        //变形：psfs
        public static final String NATION = "china";


    //模版一：psvm
    public static void main(String[] args) {

    //模版二：sout
    System.out.println();
        //变形：soutp/soutm/soutv/***.sout
        //soutp：p代表parameter（形参），打印方法形参
        System.out.println("args = " + Arrays.deepToString(args));

        //soutm：m代表method（方法），打印方法的名字
        System.out.println("Customer.main");

        //soutv：v代表value（变量），打印最近的变量值
        int num=10;
        System.out.println("num = " + num);

        //num.sout
        System.out.println(num);
        
    //模版三：fori
    String[] arr = new String[]{"tom","jerry","lelei","hanmeimei"};
    for (int i = 0; i < 9; i++) {

    }
        //变形（增强for循环）：iter
        for (String s : arr) {

        }
        //变形（普通for循环）：itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];

        }

    //模版四：list.for
    ArrayList list = new ArrayList();
    for (Object o : list) {

    }
        //变形：list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形：list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

    //模版五：ifn
    if (list == null) {

    }
        //变形：inn
        if (list != null) {

        }
        //变形：***.nn/***.null
        if (list != null) {//list.nn

        }
        if (list == null) {//list.null

        }
    }
}

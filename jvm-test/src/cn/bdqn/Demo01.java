package cn.bdqn;

import java.util.Random;

/**
 * @author LiSheng
 * @create 2020-11-25 0:28
 */
public class Demo01 {
    public static void main(String[] args){
     /*   long maxMemory = Runtime.getRuntime().maxMemory() ;//返回 Java 虚拟机试图使用的最大内存量。
        long totalMemory = Runtime.getRuntime().totalMemory() ;//返回 Java 虚拟机中的内存总量。
        System.out.println("MAX_MEMORY = " + maxMemory + "（字节）、" + (maxMemory / (double)1024 / 1024) + "MB");
        System.out.println("TOTAL_MEMORY = " + totalMemory + "（字节）、" + (totalMemory / (double)1024 / 1024) + "MB");*/
        System.out.println("123");
        String str = "www.bdqn.com" ;
        while(true)
        {
            str += str + new Random().nextInt(88888888) + new Random().nextInt(999999999) ;
        }
     /*   Thread.State*/


    }

}

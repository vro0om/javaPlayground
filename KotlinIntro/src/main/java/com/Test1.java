package com;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test1 {

    public static void main(String[] args) {
        Test1 t = new Test1();
        HashSet<Practice> set = new HashSet();
        System.out.println(set.add(new Practice()));
        System.out.println(set.add(new Practice()));
        System.out.println(set.add(new Practice()));

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        try{
            System.out.println(1);
            throw new NullPointerException();
        }catch (Exception e)
        {
            System.out.println(2);
            System.exit(0);
        }
        finally {
            System.out.println(3);

        }
//        BigDecimal b = new BigDecimal(0.1);
//        BigDecimal b2 = new BigDecimal("0.1");
//
//        System.out.println(b+ "  "+ b2);
//        Practice p = new Practice();
//        Thread t = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000000; i++) {
//                        p.method1();
//                }
//            }
//        });
//        Thread t2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 1000000; i++) {
//                    p.method2();
//                }
//            }
//        });
////        t.start();
////        t2.start();
    }
}

class Practice
{
    public synchronized void method1(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
    public synchronized void method2(){
        System.out.println("Hello World");
    }

    @Override
    public boolean equals(Object obj) {
        return true;
    }
}

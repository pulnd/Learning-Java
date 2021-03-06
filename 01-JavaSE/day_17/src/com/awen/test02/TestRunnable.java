package com.awen.test02;

/**
 * @author Liu Awen Email:willowawen@gmail.com
 * @create 2020-05-20
 */
public class TestRunnable {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
//		my.start();
        //借人家的
        Thread t = new Thread(my);
        t.start();

        for (int i = 1; i <=100; i++) {
            System.out.println("main:" + i);
        }
    }
}

class MyRunnable implements Runnable {
    // abstract Runnable
    // public abstract void run();
    @Override
    public void run() {
        // 例如：这个线程要完成的任务是，打印1-100之间的数字
        for (int i = 1; i <= 100; i++) {
            System.out.println("自定义线程：" + i);
        }
    }

}
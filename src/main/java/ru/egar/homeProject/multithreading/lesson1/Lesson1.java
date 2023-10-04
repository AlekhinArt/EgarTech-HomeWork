package ru.egar.homeProject.multithreading.lesson1;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Lesson1 {


    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException, ExecutionException {

//        var start = System.currentTimeMillis();
//        Runtime.getRuntime().addShutdownHook(new Thread(
//                ()->System.out.printf("duration %d \n", System.currentTimeMillis() - start)));
//        System.out.println("start");
//        TaskThread t1 = new TaskThread("Develop resume section");
//        TaskThread t2 = new TaskThread("Develop profile section");
//        t1.start();
//        t2.start();

//        Thread t1 = new Thread(new TickTack("1 "));
//        Thread t3 = new Thread(new TickTack("2 "));
//        Thread t4 = new Thread(new TickTack("3 "));
//        Thread t2 = new Thread(new TickTack("4\n"));
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();


//        var end = System.currentTimeMillis();

//        System.out.printf("duration %d \n", end - start);
        Callable<String> c = () -> {
            Thread.sleep(1000);
            return Thread.currentThread().getName();
        };
        List<Callable> l = new LinkedList<>();
        l.add(c);
        l.add(c);
        l.add(c);
        l.add(c);
        var executorService = Executors.newFixedThreadPool(4);
//        var futures = executorService.invokeAll(l);
//        List<Runnable> list = new LinkedList<>();
//        executorService.execute(r);
//        var s1 = executorService.submit(r);
//
//        var s2 = executorService.submit(r);
//        var s3 = executorService.submit(r);
//        var s4 = executorService.submit(r);
//        System.out.println(s1.get());
//        System.out.println(s2.get());
//        System.out.println(s3.get());
//        System.out.println(s4.get());


        executorService.shutdown();


//      executorService.


    }

    static class TaskThread extends Thread {
        private String taskName;

        TaskThread(String taskName) {
            this.taskName = taskName;
        }


        @Override
        public void run() {
            System.out.printf("Now exe %s and portal task %s \n", Thread.currentThread().getName(), taskName);
        }
    }

    static class TickTack implements Runnable {
        private final String tickOrTuck;

        public TickTack(String tickOrTuck) {
            this.tickOrTuck = tickOrTuck;
        }

        public synchronized void tick() {
//            System.out.print(" tick ");
            try {
                Thread.sleep(500);


            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        public synchronized void tuck() {
//            System.out.print(" tuck\n");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {

                synchronized (lock) {
                    try {
                        System.out.print(tickOrTuck);
                        Thread.sleep(500);
                        lock.notify();
                        if (i < 9) lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
//                tick();
//                tuck();

            }

        }
    }
}



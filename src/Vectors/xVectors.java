package Vectors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class xVectors {
    public static void main(String[] args) throws InterruptedException {
        int size = 1_000_000;
        List<Integer> victor = new Vector<>();
        long start2 = System.currentTimeMillis();

        for (int i = 0; i < size; i++){
            victor.add(i);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to Vector: " + (end2 - start2) + "ms");


        List<Integer> arrayList = new ArrayList<>();
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++){
            arrayList.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to ArrayList: " + (end - start) + "ms");

        //////////////////////////////////////////////////////////////////////////////////////////////

        List<Integer> multithreadedVector = new Vector<>();
        start = System.currentTimeMillis();

        Thread tv1 = new Thread(()-> {
            for (int i = 0; i < size; i++) {
                multithreadedVector.add(i);
            }
        });
        Thread tv2 = new Thread(()-> {
            for (int i = 0; i < size; i++) {
                multithreadedVector.add(i);
            }
        });
        tv1.start();
        tv2.start();
        tv1.join();
        tv2.join();
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to multithreadedVector: " + (end - start) + "ms");
        System.out.println("multithreadedVector Size: " + multithreadedVector.size());

        //////////////////////////////////////////////////////////////////////////////////////////////

        List<Integer> multithreadedList = Collections.synchronizedList(new ArrayList<>());
        start = System.currentTimeMillis();

        Thread t1 = new Thread(()-> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });
        Thread t2 = new Thread(()-> {
            for (int i = 0; i < size; i++) {
                multithreadedList.add(i);
            }
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("Added " + size + " elements to multithreadedList: " + (end - start) + "ms");
        System.out.println("multithreadedList Size: " + multithreadedList.size());



    }
}

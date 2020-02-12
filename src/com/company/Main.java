package com.company;

public class Main {

    public static void main(String[] args) {

        Thread[] threads = new Thread[100];


      FactorialTask  arrayOfSttreams = new FactorialTask(threads.length);

      for(int index = 0;index<=threads.length;index++){


              threads[index] = new Thread(arrayOfSttreams);
              threads[index].start();


      }
    }
}

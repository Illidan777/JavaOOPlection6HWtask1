package com.company;

import java.math.BigInteger;

public class FactorialTask implements Runnable{

    private int number;


    public FactorialTask(int number) {
        this.number = number;
    }

    public BigInteger factorial(int number){
    BigInteger fact = new BigInteger("1");
    for (int index = 1;index<=number;index++){

            fact = fact.multiply(new BigInteger(""+index));

    }
    return fact;
    }
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        for (int index = 1;index<=100;index++){
            if(thread.isInterrupted()){
                System.out.println(thread.getName() + "interrupted");
                return;
            }else{
                System.out.println(thread.getName()+" -> "+index+" !="+factorial(index));
            }
        }

    }
}

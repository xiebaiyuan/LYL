package com.example.javalearning.multithread.communication.example7;

/**
 * Created by Brian on 2016/4/14.
 */

/**
 * P158
 * 生产者/消费者模式,一生产一消费
 */
public class Run7_ProducerAndConsumer_One {
    public static void main(String[] args) {
        String lock = new String("");
        Producer producer = new Producer(lock);
        Consumer consumer = new Consumer(lock);
        ThreadP p = new ThreadP(producer);
        ThreadC c = new ThreadC(consumer);
        p.start();
        c.start();
    }
}


/*
输出：
set的值是1460601163700_5560941389335
get的值是1460601163700_5560941389335
set的值是1460601163700_5560941398666
get的值是1460601163700_5560941398666
set的值是1460601163700_5560941408308
get的值是1460601163700_5560941408308
set的值是1460601163700_5560941417949
get的值是1460601163700_5560941417949
set的值是1460601163700_5560941427280
get的值是1460601163700_5560941427280
set的值是1460601163700_5560941436921
get的值是1460601163700_5560941436921
set的值是1460601163700_5560941446874
get的值是1460601163700_5560941446874
set的值是1460601163700_5560941456827
get的值是1460601163700_5560941456827
set的值是1460601163700_5560941466468
get的值是1460601163700_5560941466468
set的值是1460601163700_5560941477043
get的值是1460601163700_5560941477043
set的值是1460601163700_5560941486684
get的值是1460601163700_5560941486684
set的值是1460601163700_5560941496326
get的值是1460601163700_5560941496326
set的值是1460601163700_5560941507212
get的值是1460601163700_5560941507212
set的值是1460601163700_5560941517475
get的值是1460601163700_5560941517475
set的值是1460601163700_5560941527428
get的值是1460601163700_5560941527428
set的值是1460601163700_5560941537070
get的值是1460601163700_5560941537070
set的值是1460601163700_5560941546400
get的值是1460601163700_5560941546400
set的值是1460601163700_5560941556042
get的值是1460601163700_5560941556042
set的值是1460601163700_5560941565683
get的值是1460601163700_5560941565683
set的值是1460601163700_5560941575325
get的值是1460601163700_5560941575325
set的值是1460601163700_5560941584656
get的值是1460601163700_5560941584656
 */
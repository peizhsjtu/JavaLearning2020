package com.java.lang.staticLearning;

/**
 * 如果静态字段new了一个对象，则先执行对象的构造函数，再执行静态块
 */
public class BooleanTest4 {

    static{
        System.out.println("静态块");
    }

    {
        System.out.println("普通块");
    }

    public BooleanTest4(){
        System.out.println("构造函数");
    }

    public static void main(String[] args) {
        //System.out.println("kkk"instanceof String);
        new BooleanTest4();
    }
}

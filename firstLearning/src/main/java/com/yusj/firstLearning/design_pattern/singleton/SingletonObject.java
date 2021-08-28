package com.yusj.firstLearning.design_pattern.singleton;

public class SingletonObject {

    private SingletonObject(){}

    private static class Holder{
        private static SingletonObject instance = new SingletonObject();
    }

    private enum Singleton{
        SINGLETON;
        private SingletonObject instance;
        Singleton(){
            instance = new SingletonObject();
        }
        private SingletonObject getInstance(){
            return instance;
        }
    }

//    public static SingletonObject getInstance(){
//        return Singleton.SINGLETON.getInstance();
//    }

    public static SingletonObject getInstance(){
        return Holder.instance;
    }
}

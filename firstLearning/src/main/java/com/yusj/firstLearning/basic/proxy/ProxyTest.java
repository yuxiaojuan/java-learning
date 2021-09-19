package com.yusj.firstLearning.basic.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyTest {

    public static void main(String[] args) {

//        Class CalculatorProxyClazz = Proxy.getProxyClass(Calculator.class.getClassLoader(),Calculator.class.getInterfaces());
        CalculatroImpl target = new CalculatroImpl();
        Calculator calculatorProxy = (Calculator) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method.getName() + " start......");
                return method.invoke(target,args);
            }
        });
        System.out.println(calculatorProxy.add(2,3));
    }
}

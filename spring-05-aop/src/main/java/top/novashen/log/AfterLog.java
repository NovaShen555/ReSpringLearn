package top.novashen.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AfterLog implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) {
        System.out.println("在方法返回后的通知");
        System.out.println("返回结果为：" + returnValue);
    }
}

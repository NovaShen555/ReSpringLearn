package top.novashen.log;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) {
        System.out.println("在方法执行前的通知");
        assert target != null;
        System.out.println(target.getClass().getName() + "的" + method.getName() + "被执行了");

    }
}

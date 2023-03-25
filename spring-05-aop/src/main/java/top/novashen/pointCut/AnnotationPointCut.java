package top.novashen.pointCut;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

@Aspect
public class AnnotationPointCut {
//    @Before("execution(* top.novashen.service.UserServiceImpl.*(..))")
//    public void before() {
//        System.out.println("before method");
//    }
//    @After("execution(* top.novashen.service.UserServiceImpl.*(..))")
//    public void after() {
//        System.out.println("after method");
//    }
    @Around("execution(* top.novashen.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before method");
        Object result = proceedingJoinPoint.proceed();
        System.out.println(result);
        System.out.println("around after method");
    }
}

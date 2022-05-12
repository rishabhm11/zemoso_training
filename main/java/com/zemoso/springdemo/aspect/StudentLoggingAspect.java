package com.zemoso.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Aspect
@Component
public class StudentLoggingAspect {

    private Logger logger= Logger.getLogger(getClass().getName());

    @Pointcut("execution(* com.zemoso.springdemo.controller.*.*(..))")
    private void forControllerPackage(){
    }

    @Pointcut("execution(* com.zemoso.springdemo.service.*.*(..))")
    private void forServicePackage(){
    }

    @Pointcut("execution(* com.zemoso.springdemo.dao.*.*(..))")
    private void forDaoPackage(){
    }

    @Pointcut("forControllerPackage() || forServicePackage() || forDaoPackage()")
    private void appFlow(){}

    @Before("appFlow()")
    public void before(JoinPoint joinPoint){
        String theMethod= joinPoint.getSignature().toShortString();
        logger.info("===>> in @Before: Calling method"+ theMethod);
        Object[] args= joinPoint.getArgs();
        for (Object temp: args){
            logger.info("===>> argument: "+temp);
        }
    }

    @AfterReturning(
            pointcut = "appFlow()",
            returning = "result"
    )
    public void afterReturning(JoinPoint joinPoint, Object result){
        String theMethod= joinPoint.getSignature().toShortString();
        logger.info("===>> in @AfterReturning: Calling method"+ theMethod);
        logger.info("===>> result: "+ result);
    }

}

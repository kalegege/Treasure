package com.wasu.aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogAopAction {

    private static Logger logger = Logger.getLogger(LogAopAction.class.getName());

    @Pointcut("execution(* com.wasu.controller..*.*(..))")
    private void controllerAspect(){}

    /**
     * 方法开始执行
     */
    @Around("controllerAspect()")
    public Object doBefore(ProceedingJoinPoint pjp) throws Throwable{
        long start=System.currentTimeMillis();
        Object object=pjp.proceed();
        long end=System.currentTimeMillis();
        logger.info("aop方法"+pjp.getSignature().getName()+"耗时:"+(end-start));
        return object;
    }


}

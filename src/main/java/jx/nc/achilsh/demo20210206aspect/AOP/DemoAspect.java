package jx.nc.achilsh.demo20210206aspect.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class DemoAspect {
    @Before("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))")
    public void befCall() {
        log.info("call before");
    }
    @Before("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..)) && bean(demoTwo)")
    public void befCallTwo() {
        log.info("before two call");
    }
    @After("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))")
    public void afterCallAll() {
        log.info("call after all");
    }

    @AfterReturning("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))")
    public void afterRet() {
        log.info("after returning");
    }
    @AfterThrowing("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))")
    public void afterThrow() {
        log.info("after throwing");
    }

    @Around ( "execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))" )
    public void aroundCall( ProceedingJoinPoint p) {
        try {
            log.info("around start .....>>>> ");
            p.proceed ();
            log.info("around end .....<<<<<<");
        } catch(Throwable ex) {
            ex.printStackTrace ();
        }
    }

    //////////
    @Pointcut("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoIf.Buy(..))")
    public void pointcut() {}

    @Before("pointcut()")
    public void beforePoint() {
        log.info("0000000000000 before pointcut");
    }

    @After("pointcut()")
    public void afterPoint() {
        log.info("111111111 after pointcut");
    }

    @Around("pointcut()")
    public void arountPointcut(ProceedingJoinPoint p) {
        try {
            log.info("pointcut around before");

            p.proceed ();

            log.info("pointcut around after");


        } catch( Throwable ex) {
            //
        }

    }

}

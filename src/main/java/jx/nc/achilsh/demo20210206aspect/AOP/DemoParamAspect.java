package jx.nc.achilsh.demo20210206aspect.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class DemoParamAspect {
    @Pointcut("execution(* jx.nc.achilsh.demo20210206aspect.AOP.DemoParamIf.BuyPrice(double)) && args(price)")
    public void pointParam(double price){}

    @Around("pointParam(price)")
    public  void paramCall( ProceedingJoinPoint d, double price ) {
        try {
            d.proceed ();
            if (price > 68) {
                log.info("ccccccccccccccccccc price more than: " + 68);
            }

        } catch(Throwable ex) {

        }
    }
}

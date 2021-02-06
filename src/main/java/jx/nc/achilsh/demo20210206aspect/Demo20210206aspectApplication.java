package jx.nc.achilsh.demo20210206aspect;

import jx.nc.achilsh.demo20210206aspect.AOP.AppConfig;
import jx.nc.achilsh.demo20210206aspect.AOP.DemoOne;
import jx.nc.achilsh.demo20210206aspect.AOP.DemoTwo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
@Slf4j

@SpringBootApplication
public class Demo20210206aspectApplication {

    public static void main ( String[] args ) {

        ApplicationContext ctx = new AnnotationConfigApplicationContext ( AppConfig.class);
        DemoOne one = ctx.getBean("demoOne", DemoOne.class);
        log.info("----- one buy begin: --");
        one.Buy ();
        log.info("------- one buy end ----");

        log.info("==== two buy begin: =======");
        DemoTwo two = (DemoTwo)ctx.getBean("demoTwo");
        two.Buy();
        log.info("===== two buy end: =========");



        one.BuyPrice(1);
        one.BuyPrice(100);
        SpringApplication.run ( Demo20210206aspectApplication.class , args );

    }

}

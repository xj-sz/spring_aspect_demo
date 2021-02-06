package jx.nc.achilsh.demo20210206aspect.AOP;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoTwo implements DemoIf, DemoParamIf{
    @Override
    public String Buy() {
        log.info("DemoTwo buy car");

        //Integer tmpInt = null;
        //int xy = tmpInt *123;
        return "car";
    }

    @Override
    public String BuyPrice(double price) {
        log.info("DemoTwo buy cccccar, price: " + price);
        return "cccccar";
    }
}

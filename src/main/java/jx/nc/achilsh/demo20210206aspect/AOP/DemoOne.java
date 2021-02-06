package jx.nc.achilsh.demo20210206aspect.AOP;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class DemoOne  implements  DemoIf, DemoParamIf{

    @Override
    public String Buy() {
        log.info("DemoOne buy book");
        return "book";
    }
    @Override
    public String BuyPrice(double price) {
        log.info("buy process: DemoOne buy bbbbbook, price:" + price);
        return "bbbbbook";
    }
}

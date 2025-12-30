package convert.cur.demo.config;

import convert.cur.demo.vo.ExternalRateResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Exchange",url= "${exchange.api.base-url}",
        configuration = CurConverterConfig.class)
public interface ExchangeClient {

    @GetMapping("/v6/latest/{base}")
    ExternalRateResponse getRates(@PathVariable("base") String base);
}

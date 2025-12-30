package convert.cur.demo.config;

import feign.codec.ErrorDecoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurConverterConfig {

    @Bean
    public ErrorDecoder customdecoder(){
        return new FeignErrorDecoder();
    }
}

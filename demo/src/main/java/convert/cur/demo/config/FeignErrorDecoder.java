package convert.cur.demo.config;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {
        return new RuntimeException("Exchange rate API failed with status " + response.status());
    }
}

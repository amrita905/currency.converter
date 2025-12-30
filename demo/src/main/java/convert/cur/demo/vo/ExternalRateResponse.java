package convert.cur.demo.vo;

import lombok.Data;

import java.util.Map;

@Data
public class ExternalRateResponse {

    private String result;
    private String base_code;
    private Map<String, Double> rates;

    // getters and setters
}

package convert.cur.demo.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
public class ExchangeResponse {
    private final String from;
    private final String to;
    private final double rate;
    private double amount;
    private double convertedAmount;
    private final LocalDateTime fetchedAt;
}

package convert.cur.demo.sevice;

import convert.cur.demo.config.ExchangeClient;
import convert.cur.demo.vo.ExchangeResponse;
import convert.cur.demo.vo.ExternalRateResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@RequiredArgsConstructor
public class ExchangeService {

    private  final ExchangeClient client;


    public ExchangeResponse getRate(String from, String to) {

        from = from.trim().toUpperCase();
        to = to.trim().toUpperCase();
        ExternalRateResponse response = client.getRates(from);

        Double rate = response.getRates().get(to);
        if (rate == null) {
            throw new IllegalArgumentException("Invalid target currency");
        }

        return new ExchangeResponse(from, to, rate, LocalDateTime.now());
    }


}

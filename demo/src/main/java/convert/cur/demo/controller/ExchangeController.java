package convert.cur.demo.controller;

import convert.cur.demo.sevice.ExchangeService;
import convert.cur.demo.vo.ExchangeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/exchange")
@RequiredArgsConstructor
public class ExchangeController {

    final ExchangeService service;

    @GetMapping
    public ExchangeResponse getRate(
            @RequestParam String from,
            @RequestParam String to) {
        return service.getRate(from, to);
    }
}

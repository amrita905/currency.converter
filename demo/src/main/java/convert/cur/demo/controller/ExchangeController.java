package convert.cur.demo.controller;

import convert.cur.demo.sevice.ExchangeService;
import convert.cur.demo.vo.ExchangeResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService service;

    @GetMapping("/exchange")
    @ResponseBody
    public ExchangeResponse getRate(
            @RequestParam String from,
            @RequestParam String to) {
        return service.getRate(from, to);
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }
}

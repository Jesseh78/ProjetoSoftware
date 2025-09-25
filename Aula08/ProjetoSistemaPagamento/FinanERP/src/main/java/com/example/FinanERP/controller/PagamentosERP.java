package com.example.FinanERP.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosERP {

    @PostMapping
    public void cadastrarPagamentos(@RequestBody String pagamento) {
        System.out.println(pagamento);
    }
}

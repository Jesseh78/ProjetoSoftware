package com.example.FinanERP.controller;

import com.example.FinanERP.model.DadosCadastroPagamento;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosERP {

    @PostMapping
    public void cadastrarPagamentos(@RequestBody DadosCadastroPagamento pagamento) {
        System.out.println(pagamento);
    }
}

package com.example.FinanERP.controller;

import com.example.FinanERP.model.DadosCadastroPagamento;
import com.example.FinanERP.model.Pagamento;
import com.example.FinanERP.model.PagamentosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pagamentos")
public class PagamentosERP {

    @Autowired
    private PagamentosRepository pagamentosRepository;

    @PostMapping
    public void cadastrarPagamentos(@RequestBody DadosCadastroPagamento pagamento) {
        pagamentosRepository.save(new Pagamento(pagamento));
    }
}

package com.anderson.produtos.controller;


import com.anderson.produtos.model.Produto;
import com.anderson.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController     // detrmina que a classe seja um controller
@RequestMapping(value = "/api")     // determina o ponto de chamada da api
public class ProdutoResource {

    // ponto de injeção do repository


    @Autowired
    ProdutoRepository produtoRepository;

    // lista todos os produtos

    @GetMapping("/produtos")
    public List<Produto> listaProdutos() {
        return produtoRepository.findAll();
    }

    // retorna um único produto
    @GetMapping("/produto/{id}")
    public Produto listaProduto(@PathVariable(value = "id") long id) {
        return produtoRepository.findById(id);
    }

    // salva um produto

    @PostMapping("/produto")
    public Produto salvarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }

    // deleta um produto

    @DeleteMapping("/produto")
    public void deletearProduto(@RequestBody Produto produto) {
        produtoRepository.delete(produto);
    }

    // Atualiza um produto

    @PutMapping("/produto")
    public Produto atualizarProduto(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }


}

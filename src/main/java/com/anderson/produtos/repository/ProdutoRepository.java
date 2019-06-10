package com.anderson.produtos.repository;

import com.anderson.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    // para busca de produto unico

    Produto findById(long id);
}





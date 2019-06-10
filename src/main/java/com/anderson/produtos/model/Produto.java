package com.anderson.produtos.model;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity     //Define uma entidade do banco de dados
@Table(name = "TB_PRODUTO")     // Define o nome da tabela no banco de dados
public class Produto implements Serializable {

    private static final long serialVersionUDI = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)     //Cria id automátio no banco

    private long id;
    private String nome;
    private BigDecimal quantidade;
    private BigDecimal valor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}

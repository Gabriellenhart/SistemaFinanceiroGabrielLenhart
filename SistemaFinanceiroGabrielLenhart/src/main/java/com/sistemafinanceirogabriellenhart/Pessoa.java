/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sistemafinanceirogabriellenhart;

/**
 *
 * @author dell
 */
public class Pessoa {
    private int id;
    private String nome;
    private String TipoPessoa;
    private int CNPJ_CPF;
    private int Telefone;
    private String EnderecoNome;
    private String EnderecoNumero;
    private String Bairro;
    private int Cidadde;
    private String Cliente;
    private String Fornecedor;
    private int RegistroAtivo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoPessoa() {
        return TipoPessoa;
    }

    public void setTipoPessoa(String TipoPessoa) {
        this.TipoPessoa = TipoPessoa;
    }

    public int getCNPJ_CPF() {
        return CNPJ_CPF;
    }

    public void setCNPJ_CPF(int CNPJ_CPF) {
        this.CNPJ_CPF = CNPJ_CPF;
    }

    public int getTelefone() {
        return Telefone;
    }

    public void setTelefone(int Telefone) {
        this.Telefone = Telefone;
    }

    public String getEnderecoNome() {
        return EnderecoNome;
    }

    public void setEnderecoNome(String EnderecoNome) {
        this.EnderecoNome = EnderecoNome;
    }

    public String getEnderecoNumero() {
        return EnderecoNumero;
    }

    public void setEnderecoNumero(String EnderecoNumero) {
        this.EnderecoNumero = EnderecoNumero;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public int getCidadde() {
        return Cidadde;
    }

    public void setCidadde(int Cidadde) {
        this.Cidadde = Cidadde;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getFornecedor() {
        return Fornecedor;
    }

    public void setFornecedor(String Fornecedor) {
        this.Fornecedor = Fornecedor;
    }

    public int getRegistroAtivo() {
        return RegistroAtivo;
    }

    public void setRegistroAtivo(int RegistroAtivo) {
        this.RegistroAtivo = RegistroAtivo;
    }
 }

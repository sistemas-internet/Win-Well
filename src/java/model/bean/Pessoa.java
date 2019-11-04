package model.bean;

import java.io.Serializable;

public class Pessoa implements Serializable {

    // Atributos da classe
    private int id;
    private String nome;
    private String telefone;
    private int cep;
    private String logradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private String email;
    private int id_vinculado;
    
    // Método construtor
    public Pessoa() {
    }

    public int getId_vinculado() {
        return id_vinculado;
    }

    public void setId_vinculado(int id_vinculado) {
        this.id_vinculado = id_vinculado;
    }

    // Métodos getters e setters
    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.laboratorio02;

/**
 *
 * @author robson
 */
public class Funcionario {
    private int id;
    private String nome;
    private int cpf;
    private String rg;
    private long telCel;
    private long telResid;
    private String email;
    private String endereco;
    private int cep;
    private String bairro;
    private String cidade;
    private String uf;
    private String usuario;
    private String senha;
      
    public int getId(){
        return id;
    }    
    public String getNome(){
        return nome;
    }    
    public int getCpf(){
        return cpf;
    }    
    public String getRg(){
        return rg;
    }    
    public long getTelCel(){
        return telCel;
    }    
    public long getTelResid(){
        return telResid;
    }    
    public String getEmail(){
        return email;
    }    
    public String getEndereco(){
        return endereco;
    }    
    public int getCep(){
        return cep;
    }    
    public String getBairro(){
        return bairro;
    }    
    public String getCidade(){
        return cidade;
    }    
    public String getUf(){
        return uf;
    }    
    public String getUsuario(){
        return usuario;
    }    
    public String getSenha(){
        return senha;
    }
    
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    public void setRg(String rg){
        this.rg = rg;
    }
    public void setTelCel(long telCel){
        this.telCel = telCel;
    }
    public void setTelResid(long telResid){
        this.telResid = telResid;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setCep(int cep){
        this.cep = cep;
    }
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
}

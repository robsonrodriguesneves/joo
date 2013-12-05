/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.laboratorio02;

import java.util.Date;


/**
 *
 * @author robson
 */
public class Servico {
   private int id;
   private Funcionario funcionarioResp;
   private String cliente;
   private Date data;
   private Date hora;
   private String enderecoColeta;
   private String enderecoEntrega;
   private Double distanciaKm;
   private Double altura;
   private Double largura;
   private Double comprimento;
   private Double peso;
   
   public int getId(){
       return id;
   }
   public Funcionario getFuncionarioResp(){
       return funcionarioResp;
   }
   public String getCliente(){
       return cliente;
   }
   public Date getData(){
      return data;
   }
   public Date getHora(){
       return hora;
   }
   public String getEnderecoColeta(){
       return enderecoColeta;
   }
   public String getEnderecoEntrega(){
       return enderecoEntrega;
   }
   public Double getDistanciaKm(){
       return distanciaKm;
   }
   public Double getAltura(){
       return altura;
   }
   public Double getLargura(){
       return largura;
   }
   public Double getComprimento(){
       return comprimento;
   }
   public Double getPeso(){
       return peso;
   }
   
   public void setId(int id){
       this.id = id;
   }
   public void setFuncionarioResp(Funcionario funcionarioRsp){
       this.funcionarioResp = funcionarioRsp;
   }
   public void setCliente(String cliente){
       this.cliente = cliente;
   }
   public void setData(Date data){
       this.data = data;
   }
   public void setHora(Date hora){
       this.hora = hora;
   }
   public void setEnderecoColeta(String enderecoColeta){
       this.enderecoColeta = enderecoColeta;
   }
   public void setEnderecoEntrega(String enderecoEntrega){
       this.enderecoEntrega = enderecoEntrega;
   }
   public void setDistanciaKm(Double distanciaKm){
       this.distanciaKm = distanciaKm;
   }
   public void setAltura(Double altura){
       this.altura = altura;
   }
   public void setLargura(Double largura){
       this.largura = largura;
   }
   public void setComprimento(Double comprimento){
       this.comprimento = comprimento;
   }
   public void setPeso(Double peso){
       this.peso = peso;
   }
}
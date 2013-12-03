/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.laboratorio02;

import java.text.SimpleDateFormat;

/**
 *
 * @author robson
 */
public class Teste {
    public static void main (String[] args){
        Funcionario func = new Funcionario();
        func.setId(01);
        func.setNome("Robson");
        func.setCpf(123456789);
        func.setRg("123456");
        func.setTelCel(99998888);
        func.setTelResid(32165498);
        func.setEmail("robson@4linux.com.br");
        func.setEndereco("Rod. Jk");
        func.setCep(234564554);
        func.setBairro("Zerão");
        func.setCidade("Macapá");
        func.setUf("AP");
        func.setUsuario("robson");
        func.setSenha("123456");
        System.out.println(func.getNome());
        
        
        Servico serv = new Servico();
        serv.setId(01);
        serv.setFuncionarioResp(null);
        serv.setCliente("Cliente 01");
        SimpleDateFormat data = new SimpleDateFormat("yyyy-MM-dd");
        serv.setData(2013, 9, 25, 0, 0, 0);
        serv.setHora(0,0,0,18,37,5);
        //serv.setData("2013-9-25");
        //serv.setHora(10);
        serv.setEnderecoColeta("Av. Raimundo Peres, 613");
        serv.setEnderecoEntrega("Av. FAB, 1256");
        serv.setDistanciaKm(25.10);
        
        serv.setAltura(5.14);
        serv.setLargura(3.37);
        serv.setComprimento(7.35);
        serv.setPeso(20.50);
        System.out.println(serv.getCliente());
        System.out.println(serv.getData().getTime());
        System.out.println(serv.getHora().getTime());
        
        
        

    }
    
   
    
}
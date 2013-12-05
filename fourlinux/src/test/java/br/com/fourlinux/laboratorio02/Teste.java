/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.laboratorio02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author robson
 */
public class Teste {
    public static void main (String[] args) throws ParseException{
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
        
        
        DateFormat formataData = DateFormat.getDateInstance();
        DateFormat formataHora = DateFormat.getTimeInstance();
        
        Servico serv = new Servico();
        serv.setId(01);
        serv.setFuncionarioResp(null);
        serv.setCliente("Cliente 01");
        serv.setData(formataData.parse("12/10/2013"));
        serv.setHora(formataHora.parse("22:58:37"));
        serv.setEnderecoColeta("Av. Raimundo Peres, 613");
        serv.setEnderecoEntrega("Av. FAB, 1256");
        serv.setDistanciaKm(25.10);
        serv.setAltura(5.14);
        serv.setLargura(3.37);
        serv.setComprimento(7.35);
        serv.setPeso(20.50);
        System.out.println("Funcionario: "+func.getNome());
        System.out.println("Cliente: "+serv.getCliente());
         
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat h = new SimpleDateFormat("k:mm:ss");
        
        //System.out.println("Data: "+serv.getData());
        System.out.println("Data: "+d.format(serv.getData()));
        //System.out.println("Data: "+formataData.format(serv.getData()));
        System.out.println("Hora: "+serv.getHora());
        System.out.println("Hora: "+h.format(serv.getHora()));
        //System.out.println("Hora: "+formataHora.format(serv.getHora()));
        
    }
}
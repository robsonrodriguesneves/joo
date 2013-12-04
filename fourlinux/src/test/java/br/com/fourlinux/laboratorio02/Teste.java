/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fourlinux.laboratorio02;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.xml.crypto.Data;

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
        
        
        
        Servico serv = new Servico();
        serv.setId(01);
        serv.setFuncionarioResp(null);
        serv.setCliente("Cliente 01");
        serv.setData(22,9,2013);
        serv.setHora(19,37,5);
        serv.setEnderecoColeta("Av. Raimundo Peres, 613");
        serv.setEnderecoEntrega("Av. FAB, 1256");
        serv.setDistanciaKm(25.10);
        serv.setAltura(5.14);
        serv.setLargura(3.37);
        serv.setComprimento(7.35);
        serv.setPeso(20.50);
        System.out.println("Funcionario: "+func.getNome());
        System.out.println("Cliente: "+serv.getCliente());
        
        DateFormat formataData = DateFormat.getDateInstance();
        DateFormat formataHora = DateFormat.getTimeInstance();
        
        //System.out.println("Data: "+serv.getData());
        System.out.println("Data: "+formataData.format(serv.getData()));
        //System.out.println("Hora: "+serv.getHora());
        System.out.println("Hora: "+formataHora.format(serv.getHora()));
        
        
        
        
        Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		DateFormat f = DateFormat.getDateInstance();
		
		Date data2 = f.parse("12/01/1995");
		System.out.println(data2);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Data formatada: "+sdf.format(data));
		
		//Converte Objetos
		System.out.println("Data convertida: "+sdf.parse("02/08/1970"));


        
        
    }
}
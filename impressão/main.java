package poo.view;

import java.util.Date;
import java.util.Scanner;

import poo.entidade.Cliente;
import poo.entidade.PessoaFisica;
import poo.entidade.PessoaJuridica;


public class Principal {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		//criação dos objetos da classe Cliente
		Cliente c1 = new Cliente("Gabriela","R Dunas 189", "Rio de Janeiro", 21099832);
		
		//impressão dos objetos da classe Cliente
		System.out.println("Cliente 1: "+c1.getNome()+", "+c1.getEndereco()+", "+c1.getCidade()+", "+c1.getCep()+".");
		
		//criação dos objetos da classe PessoaJuridica
		PessoaJuridica pj1 = new PessoaJuridica("Ana Maria","Rua da Fábrica 800, Bangu", "Rio de Janeiro", 21556789, "0219800001", "Minas Gerais", "Provitechne");
		
		//impressão dos objetos da classe Cliente
		System.out.println("Pessoa Jurídica 1: "+pj1.getNome()+", "+pj1.getEndereco()+", "+pj1.getCidade()+", "+pj1.getCep()+", "+pj1.getCnpj()+", "+pj1.getInscricaoEstadual()+", "+pj1.getRazaoSocial()+".");
		
		//criação dos objetos da classe PessoaFisica
		PessoaFisica pf1 = new PessoaFisica("José","Rua Ademir 332", "São Paulo", 11234677, "12398872703", "24678901", 'M', new Date());
		
		//impressão dos objetos da classe Cliente
		System.out.println("Pessoa Física 1: "+pf1.getNome()+", "+pf1.getEndereco()+", "+pf1.getCidade()+", "+pf1.getCep()+", "+pf1.getCpf()+", "+pf1.getRg()+", "+pf1.getGenero()+", "+pf1.getDataNascimento()+".");
		
		sc.close();
	}
}
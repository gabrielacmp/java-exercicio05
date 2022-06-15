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
		Cliente c1 = new Cliente("Gabriela","Rua Dunas 189, Padre Miguel", "Rio de Janeiro", 21099832);
		Cliente c2 = new Cliente("Brendon","Rua Londres 327, Niterói", "Canoas", 96200003);
		Cliente c3 = new Cliente("Carla","Rua Amanda 682, Nazaré", "Salvador", 40015970);
		//impressão dos objetos da classe Cliente
		System.out.println("Cliente 1: "+c1.getNome()+", "+c1.getEndereco()+", "+c1.getCidade()+", "+c1.getCep()+".");
		System.out.println("Cliente 2: "+c2.getNome()+", "+c2.getEndereco()+", "+c2.getCidade()+", "+c2.getCep()+".");
		System.out.println("Cliente 3: "+c3.getNome()+", "+c3.getEndereco()+", "+c3.getCidade()+", "+c3.getCep()+".");
		
		//criação dos objetos da classe PessoaJuridica
		PessoaJuridica pj1 = new PessoaJuridica("Ana Maria","Rua da Fábrica 800, Bangu", "Rio de Janeiro", 21556789, "0219800001", "RJ", "Provitechne");
		PessoaJuridica pj2 = new PessoaJuridica("Guilherme Silva","Rua da Feira 641, Marechal Hermes", "Rio de Janeiro", 21778421, "0123457899", "RJ", "Senac");
		PessoaJuridica pj3 = new PessoaJuridica("Fábio de Jesus","Rua Pereira Passos 923, Centro", "Rio de Janeiro", 21846839, "0788631543", "RJ", "McDonald's");

		//impressão dos objetos da classe Cliente
		System.out.println("Pessoa Jurídica 1: "+pj1.getNome()+", "+pj1.getEndereco()+", "+pj1.getCidade()+", "+pj1.getCep()+", "+pj1.getCnpj()+", "+pj1.getInscricaoEstadual()+", "+pj1.getRazaoSocial()+".");
		System.out.println("Pessoa Jurídica 2: "+pj2.getNome()+", "+pj2.getEndereco()+", "+pj2.getCidade()+", "+pj2.getCep()+", "+pj2.getCnpj()+", "+pj2.getInscricaoEstadual()+", "+pj2.getRazaoSocial()+".");
		System.out.println("Pessoa Jurídica 3: "+pj3.getNome()+", "+pj3.getEndereco()+", "+pj3.getCidade()+", "+pj3.getCep()+", "+pj3.getCnpj()+", "+pj3.getInscricaoEstadual()+", "+pj3.getRazaoSocial()+".");
		
		//criação dos objetos da classe PessoaFisica
		PessoaFisica pf1 = new PessoaFisica("José Alencar","Rua Ademir 332", "São Paulo", 11234677, "12398872703", "24678901", 'M', new Date());
		PessoaFisica pf2 = new PessoaFisica("Adair Costa","Rua Alecrim Dourado 446", "São Paulo", 11234665, "19786346672", "21232467", 'M', new Date());
		PessoaFisica pf3 = new PessoaFisica("Renato Russo","Rua Pudim de Pão 778", "São Paulo", 11234623, "19084324685", "20989863", 'M', new Date());
		
		//impressão dos objetos da classe Cliente
		System.out.println("Pessoa Física 1: "+pf1.getNome()+", "+pf1.getEndereco()+", "+pf1.getCidade()+", "+pf1.getCep()+", "+pf1.getCpf()+", "+pf1.getRg()+", "+pf1.getGenero()+", "+pf1.getDataNascimento()+".");
		System.out.println("Pessoa Física 2: "+pf2.getNome()+", "+pf2.getEndereco()+", "+pf2.getCidade()+", "+pf2.getCep()+", "+pf2.getCpf()+", "+pf2.getRg()+", "+pf2.getGenero()+", "+pf2.getDataNascimento()+".");
		System.out.println("Pessoa Física 3: "+pf3.getNome()+", "+pf3.getEndereco()+", "+pf3.getCidade()+", "+pf3.getCep()+", "+pf3.getCpf()+", "+pf3.getRg()+", "+pf3.getGenero()+", "+pf3.getDataNascimento()+".");
		
		sc.close();
	}
}
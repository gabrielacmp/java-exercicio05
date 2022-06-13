package poo.entidade;

import java.util.Date;

public class PessoaFisica {
	
	private String cpf;
	private String rg;
	private char genero;
	private Date dataNascimento;
	
	//classe Cliente
	private Cliente cf;
		
	//inicializando as variáveis da classe
	public PessoaFisica() {
		this.cpf = "";
		this.rg = "";
		this.genero = 'x';
		this.dataNascimento = new Date();
		this.cf = new Cliente();
	}
		
	//criação do objeto, onde "o" significa objeto
	public PessoaFisica(String oCpf, String oRg, char oGenero, Date oDNascimento){
		this.cpf = oCpf;
		this.rg = oRg;
		this.genero = oGenero;
		this.dataNascimento = oDNascimento;
	}
	
	//métodos de modificação
	public void setCpf (String cf) {
		this.cpf = cf;
	}
			
	public void setRg (String r) {
		this.rg = r;
	}
			
	public void setGenero (char gen) {
		this.genero = gen;
	}
	
	public void setDataNascimento (Date dn) {
		this.dataNascimento = dn;
	}
	
	public void setCliente (Cliente clf) {
		this.cf = clf;
	}
	
	//métodos de acesso
	public String getCpf() {
		return this.cpf;
	}
	
	public String getRg() {
		return this.rg;
	}
	
	public char getGenero() {
		return this.genero;
	}
	
	public Date getDataNascimento() {
		return this.dataNascimento;
	}
	
	public Cliente getCliente() {
		return this.cf;
	}
}

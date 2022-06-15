package poo.entidade;

import java.util.Date;

public class PessoaFisica extends Cliente{
	public PessoaFisica(String nome, String endereco, String cidade, int cep) {
		super(nome, endereco, cidade, cep);
	}
	private String cpf;
	private String rg;
	private char genero;
	private Date dataNascimento;
	
		
	//inicializando as variáveis da classe
	public PessoaFisica(){
		this.cpf = "";
		this.rg = "";
		this.genero = 'x';
		this.dataNascimento = new Date();
	}
		
	//criação do objeto, onde "o" significa objeto
	public PessoaFisica(String nome, String endereco, String cidade, int cep, String oCpf, String oRg, char oGenero, Date oDNascimento){
		super(nome, endereco, cidade, cep);
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
	
}

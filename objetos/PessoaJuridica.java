package poo.entidade;

public class PessoaJuridica extends Cliente{
	public PessoaJuridica(String nome, String endereco, String cidade, int cep) {
		super(nome, endereco, cidade, cep);
	}
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	//inicializando as variáveis da classe
	public PessoaJuridica() {
		this.cnpj = "";
		this.inscricaoEstadual = "";
		this.razaoSocial = "";
	}
		
	//criação do objeto, onde "o" significa objeto.
	public PessoaJuridica(String nome, String endereco, String cidade, int cep, String oCnpj, String oInscricaoE, String oRazaoS){
		super(nome, endereco, cidade, cep);
		this.cnpj = oCnpj;
		this.inscricaoEstadual = oInscricaoE;
		this.razaoSocial = oRazaoS;

	}
	
	//métodos de modificação
	public void setCnpj (String cpj) {
		this.cnpj = cpj;
	}
		
	public void setInscricaoEstadual (String ie) {
		this.inscricaoEstadual = ie;
	}
		
	public void setRazaoSocial (String rs) {
		this.razaoSocial = rs;
	}

	
	//métodos de acesso
	public String getCnpj() {
		return this.cnpj;
	}
	
	public String getInscricaoEstadual() {
		return this.inscricaoEstadual;
	}
	
	public String getRazaoSocial() {
		return this.razaoSocial;
	}
	
}

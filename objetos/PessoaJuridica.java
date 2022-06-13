package poo.entidade;

public class PessoaJuridica {
	
	private String cnpj;
	private String inscricaoEstadual;
	private String razaoSocial;
	
	//classe Cliente
	private Cliente cj;
	
	//inicializando as variáveis da classe
	public PessoaJuridica() {
		this.cnpj = "";
		this.inscricaoEstadual = "";
		this.razaoSocial = "";
		this.cj = new Cliente();
	}
		
	//criação do objeto, onde "o" significa objeto.
	public PessoaJuridica(String oCnpj, String oInscricaoE, String oRazaoS){
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

	public void setCliente (Cliente clj) {
		this.cj = clj;
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
	
	public Cliente getCliente() {
		return this.cj;
	}
	
}

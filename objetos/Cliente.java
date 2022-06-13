package poo.entidade;

public class Cliente {
	
	private String nome;
	private String endereco;
	private String cidade;
	private int cep;	
	
	//inicializando as variáveis da classe
	public Cliente() {
		this.nome = "";
		this.endereco = "";
		this.cidade = "";
		this.cep = 0;
	}
	
	//criação do objeto, onde "o" significa objeto.
	public Cliente(String oNome, String oEndereco, String oCidade, int oCep){
		this.nome = oNome;
		this.endereco = oEndereco;
		this.cidade = oCidade;
		this.cep = oCep;
	}
	
	//métodos de modificação
	public void setNome (String n) {
		this.nome = n;
	}
	
	public void setEndereco (String e) {
		this.endereco = e;
	}
	
	public void setCidade (String c) {
		this.cidade = c;
	}
	
	public void setCep(int cp) {
		this.cep = cp;
	}
	
	//métodos de acesso
	public String getNome() {
		return this.nome;
	}
	
	public String getEndereco() {
		return this.endereco;
	}
	
	public String getCidade() {
		return this.cidade;
	}
	
	public int getCep() {
		return this.cep;
	}
}
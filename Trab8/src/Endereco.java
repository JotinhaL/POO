public class Endereco{
	private String logradouro;
	private int nmr;
	private String bairro;
	private String cidade;
	private String UF;
	private String CEP;

	public Endereco() {
	}

	public Endereco(String logradouro, int nmr, String bairro, String cidade, String UF, String CEP) {
		this.logradouro = logradouro;
		this.nmr = nmr;
		this.bairro = bairro;
		this.cidade = cidade;
		this.UF = UF;
		this.CEP = CEP;
	}

	public void setLogradouro(String log){
		this.logradouro=log;
	}
	public void setNmr(int nmr){
		this.nmr = nmr;
	}
	public void setBairro(String barr){
		this.bairro = barr;
	}
	public void setCidade(String cdd){
		this.cidade = cdd;
	}
	public void setUF(String uf){
		this.UF = uf;
	}
	public void setCEP(String cep){
		this.CEP = cep; 
	}

	public String getLogradouro() {
		return logradouro;
	}

	public int getNmr() {
		return nmr;
	}

	public String getBairro() {
		return bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public String getUF() {
		return UF;
	}

	public String getCEP() {
		return CEP;
	}
}

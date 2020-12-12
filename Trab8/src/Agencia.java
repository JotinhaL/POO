public class Agencia implements Imprimivel{
	private String nome;
	private int numero;
	private Endereco endereco;
	private Gerente gerente;

	public Agencia() {
		this("",0,null,null);
	}

	public Agencia(String nome, int numero, Endereco endereco, Gerente gerente) {
		this.nome = nome;
		this.numero = numero;
		this.endereco = endereco;
		this.gerente = gerente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	@Override
	public String toString() {
		return "Agencia{" +
				"nome='" + nome + '\'' +
				", numero=" + numero +
				", endereco=" + endereco +
				", gerente=" + gerente +
				'}';
	}

	@Override
	public void mostraDados() {
		System.out.println(toString());
	}
}

import java.util.Date;

public class Cliente extends Pessoa{
	private Agencia agencia;

	public Cliente() {
		this("","",null,null,"","",null);
	}

	public Cliente(String CPF, String nome, Endereco endereco, Date dataNasc, String estCivil, String escolaridade, Agencia agencia) {
		this.setCPF(CPF);
		this.nome = nome;
		this.endereco = endereco;
		this.dataNasc = dataNasc;
		this.estCivil = estCivil;
		this.escolaridade = escolaridade;
		this.agencia = agencia;
	}


	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"agencia=" + agencia +
				", CPF='" + CPF + '\'' +
				", nome='" + nome + '\'' +
				", endereco=" + endereco +
				", estCivil='" + estCivil + '\'' +
				", escolaridade='" + escolaridade + '\'' +
				", telefone='" + telefone + '\'' +
				", dataNasc=" + dataNasc +
				", sexo=" + sexo +
				'}';
	}

	@Override
	public void mostraDados() {
		System.out.println(toString());
	}
}


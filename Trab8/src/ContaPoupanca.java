import java.util.Date;

public class ContaPoupanca extends Conta{
	private Float rendMes;

	public ContaPoupanca() {
		this(null,0,0f,"",'\0',null,null,0f);
	}

	public ContaPoupanca(Agencia agencia) {
		super(agencia);
	}

	public ContaPoupanca(Cliente titular, Integer numero, Float saldo,
						 String senha, char ativo, Agencia agencia,
						 Date abr, Float rendMes) {
		super(titular, numero, saldo, senha, ativo, agencia, abr);
		this.rendMes = rendMes;
	}

	public void setRendMes(float rend){
		this.rendMes = rend;
	}

	public float getRendMes(){
		return this.rendMes;
	} 
}

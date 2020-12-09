public class ContaPoupanca extends Conta{
	private Float rendMes;

	public ContaPoupanca() {
		this(null,0,0f,"",null,null,null,0f);
	}

	public ContaPoupanca(Agencia agencia) {
		super(agencia);
	}

	public ContaPoupanca(Cliente titular, Integer numero, Float saldo,
						 String senha, Byte ativo, Agencia agencia,
						 Date abr, Float rendMes) {
		super(titular, numero, saldo, senha, ativo, agencia, abr);
		this.rendMes = rendMes;
	}

>>>>>>> 6968b7252b16bd759dd72c836fb8a7470d6d8143
	public void setRendMes(float rend){
		this.rendMes = rend;
	}

	public float getRendMes(){
		return this.rendMes;
	} 
}

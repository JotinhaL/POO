import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public abstract class Conta{

    protected List<Cliente> titular;
    protected Integer numero;
    protected Float saldo;
    protected String senha;
    protected Byte ativo;
    protected Agencia agencia;
	protected List<Transacao> transacoes;
	protected Date dtaAbertura;

    public Conta() {
        this.titular = new ArrayList<Cliente>();
		this.transacoes = new ArrayList<Transacao>();
    }

    public Conta(Agencia agencia){
        this.agencia = agencia;
		this.titular = new ArrayList<Cliente>();
		this.transacoes = new ArrayList<Transacao>();
    }

    public Conta(Cliente titular, Integer numero, Float saldo, String senha, char ativo, Agencia agencia, Date abr) {
        this.titular = new ArrayList<Cliente>();
        this.titular.add(titular);
        this.numero = numero;
        this.depositar(saldo);
        this.senha = senha;
        this.setAtivo(ativo);
        this.agencia = agencia;
		this.dtaAbertura = abr;
    }

    public List<Cliente> getTitular() {
        return titular;
    }

    public void setTitular(List<Cliente> titular) {
        this.titular = titular;
    }

    public void addTitular(Cliente titular) {
        this.titular.add(titular);
    }

    public void removeTitular(Cliente cl){
        this.titular.remove(cl);
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Byte getAtivo() {
        return ativo;
    }

    public void setAtivo(char ativo) {
        if(ativo=='A'||ativo=='a')this.ativo = 1;
        else if(ativo=='I'||ativo=='i')this.ativo = 2;
        else this.ativo = 3;
    }


    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

	public List<Transacao> getTranscoes() {
        return this.transacoes;
    }

    public void setTransacoes(List<Transacao> transacoes) {
        this.transacoes = transacoes;
    }
    
    public void sacar(float saque){
    	if(saque<=this.saldo){
    		Transacao t = new Transacao(new Date(),this.agencia,saque,"Saque");
    		this.saldo -= saque;
    		this.transacoes.add(t);
    	}
    }
    
    public void depositar(float deposito){
    	Transacao t = new Transacao(new Date(),this.agencia,saque,"deposito");
    	this.saldo += deposito;
    	this.transacoes.add(t);
    }
    
    public void transferencia(float val,Conta cc){
    	if(val<=this.saldo){
    		Transacao t = new Transacao(new Date(),this.agencia,val,"transferencia");
    		this.saldo -= val;
    		this.transacoes.add(t);
    		cc.depositar(val);
    	}
    }
    
    public void sacar(float saque,Agencia ag){
    	if(saque<=this.saldo){
    		Transacao t = new Transacao(new Date(),ag,saque,"Saque");
    		this.saldo -= saque;
    		this.transacoes.add(t);
    	}
    }
    
    public void depositar(float deposito,Agencia ag){
    	Transacao t = new Transacao(new Date(),ag,saque,"deposito");
    	this.saldo += deposito;
    	this.transacoes.add(t);
    }
    
    public void transferencia(float val,Conta cc,Agencia ag){
    	if(val<=this.saldo){
    		Transacao t = new Transacao(new Date(),ag,val,"transferencia");
    		this.saldo -= val;
    		this.transacoes.add(t);
    		cc.depositar(val,ag);
    	}
    }
    
    public abstract float calculaTarifa();
}

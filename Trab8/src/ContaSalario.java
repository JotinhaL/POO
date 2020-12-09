import java.util.Date;

public class ContaSalario extends Conta{
    private Float saldoMin;

    public ContaSalario() {
        this(null,0,0f,"",'\0',null,null,0f);
    }

    public ContaSalario(Agencia agencia) {
        super(agencia);
    }

    public ContaSalario(Cliente titular, Integer numero, Float saldo, String senha, char ativo, Agencia agencia, Date abr, Float saldoMin) {
        super(titular, numero, saldo, senha, ativo, agencia, abr);
        this.saldoMin = saldoMin;
    }
    
    public void sacar(float saque){
    	if(saque<=this.saldo-this.saldoMin){
    		Transacao t = new Transacao(new Date(),this.agencia,saque,"Saque");
    		this.saldo -= saque;
    		this.transacoes.add(t);
    	}
    }
    
    public void transferencia(float val,Conta cc){
    	if(val<=this.saldo-this.saldoMin){
    		Transacao t = new Transacao(new Date(),this.agencia,val,"transferencia");
    		this.saldo -= val;
    		this.transacoes.add(t);
    		cc.depositar(val);
    	}
    }
    
    public void sacar(float saque,Agencia ag){
    	if(saque<=this.saldo-this.saldoMin){
    		Transacao t = new Transacao(new Date(),ag,saque,"Saque");
    		this.saldo -= saque;
    		this.transacoes.add(t);
    	}
    }
    
    public void transferencia(float val,Conta cc,Agencia ag){
    	if(val<=this.saldo-this.saldoMin){
    		Transacao t = new Transacao(new Date(),ag,val,"transferencia");
    		this.saldo -= val;
    		this.transacoes.add(t);
    		cc.depositar(val,ag);
    	}
    }
}

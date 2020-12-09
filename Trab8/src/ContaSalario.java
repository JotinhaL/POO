import java.util.Date;

public class ContaSalario extends Conta{
    private Float saldoMin;

    public ContaSalario() {
        this(null,0,0f,"",null,null,null,0f);
    }

    public ContaSalario(Agencia agencia) {
        super(agencia);
    }

    public ContaSalario(Cliente titular, Integer numero, Float saldo, String senha, Byte ativo, Agencia agencia, Date abr, Float saldoMin) {
        super(titular, numero, saldo, senha, ativo, agencia, abr);
        this.saldoMin = saldoMin;
    }
}

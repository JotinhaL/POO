import java.util.Date;

public class ContaCorrente extends Conta {
    private Date dtaAbertura;
    private Float imtCheque;
    private Float virTaxa;

    public ContaCorrente() {
        this(null,0,0f,"",null,"",null,null,0f,0f);
    }

    public ContaCorrente(Agencia agencia) {
        super(agencia);
    }

    public ContaCorrente(Cliente titular, Integer numero, Float saldo, String senha, Byte ativo, String tipo, Agencia agencia, Date dtaAbertura, Float imtCheque, Float virTaxa) {
        super(titular, numero, saldo, senha, ativo, tipo, agencia);
        this.dtaAbertura = dtaAbertura;
        this.imtCheque = imtCheque;
        this.virTaxa = virTaxa;
    }

    public Date getDtaAbertura() {
        return dtaAbertura;
    }

    public void setDtaAbertura(Date dtaAbertura) {
        this.dtaAbertura = dtaAbertura;
    }

    public Float getImtCheque() {
        return imtCheque;
    }

    public void setImtCheque(Float imtCheque) {
        this.imtCheque = imtCheque;
    }

    public Float getVirTaxa() {
        return virTaxa;
    }

    public void setVirTaxa(Float virTaxa) {
        this.virTaxa = virTaxa;
    }
}

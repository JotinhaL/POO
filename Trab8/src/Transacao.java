import java.util.Date;

public class Transacao {
    private Date data;
    private Agencia agencia;
    private Float valor;
    private String tipo;

    public Transacao() {
        this(null,null,0f,"");
    }

    public Transacao(Date data, Agencia agencia, Float valor, String tipo) {
        this.data = data;
        this.agencia = agencia;
        this.valor = valor;
        this.tipo = tipo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}

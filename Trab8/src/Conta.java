import java.util.ArrayList;
import java.util.List;

public class Conta{

    private List<Cliente> titular;
    private Integer numero;
    private Float saldo;
    private String senha;
    private Byte ativo;
    private String tipo;
    private Agencia agencia;


    public Conta() {
        this.titular = new ArrayList<Cliente>();
    }

    public Conta(Agencia agencia){
        this.agencia = agencia;
    }

    public Conta(Cliente titular, Integer numero, Float saldo, String senha, Byte ativo, String tipo, Agencia agencia) {
        this.titular = new ArrayList<Cliente>();
        this.titular.add(titular);
        this.numero = numero;
        this.saldo = saldo;
        this.senha = senha;
        this.ativo = ativo;
        this.tipo = tipo;
        this.agencia = agencia;
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

    public void setAtivo(Byte ativo) {
        this.ativo = ativo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public void setAgencia(Agencia agencia) {
        this.agencia = agencia;
    }
}
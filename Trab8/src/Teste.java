import java.util.List;
import java.util.Scanner;
import java.util.Date;
// importanto a classe "ValidaCPF" do pacote "meuPacote"
import meuPacote.ValidaCPF;

public class Teste {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Date dt = new Date();

        Endereco end = new Endereco("Rua do Morango", 473, "Pacaembu", "Udia", "MG", "não sei");
        Agencia ag = new Agencia();
        Gerente gr = new Gerente("Ze Ruela", end, "12345678901", "insiraUmCTPSAqui", 8000.1f, dt, ag, true);
        Cliente cl = new Cliente("85125769606", "Jão Bolão", end, dt, "Solteiro", "Analfabeto", ag);
        Cliente cl2 = new Cliente("18142725428", "Maria Bolão", end, dt, "Viuva", "Bacharel", ag);
        Funcionario fun = new Funcionario("18142725428", "Manuel", end, "casado", "Ensino Medio", "3842-8181", dt, 'M', "18142725428", dt, "Entregador");

        ag.setNome("Agencia Lucy");
        ag.setNumero(666);
        ag.setEndereco(end);
        ag.setGerente(gr);

        Conta[] ct = new Conta[3];

        ct[0] = new ContaSalario(cl, 555, 44.9f, "SEnha", (byte) 1, ag, dt, 50f);
        ct[1] = new ContaCorrente(cl2, 123, 999f, "123sdad", (byte) 1, ag, dt, 300f, 30f);
        ct[2] = new ContaPoupanca(cl, 333, 703f, "AsDf", (byte) 2, ag, dt, 0.33f);

        for (Conta cc : ct) {
            System.out.println(cc.getSaldo());
        }
    }
}
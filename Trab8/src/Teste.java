import java.util.List;
import java.util.Scanner;
import java.util.Date;
// importanto a classe "ValidaCPF" do pacote "meuPacote"
import meuPacote.ValidaCPF;

public class Teste {
    public static byte func(char c){
        if(c=='A'||c=='a')return 1;
        else if(c=='I'||c=='i')return 2;
        else return 3;

    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Date dt = new Date();

        Endereco end = new Endereco("Rua do Morango",473,"Pacaembu","Udia","MG","não sei");
        Agencia ag = new Agencia();
        Gerente gr = new Gerente("Ze Ruela",end,"12345678901","insiraUmCTPSAqui",8000.1f,dt,ag,true);
        Cliente cl = new Cliente("85125769606","Jão Bolão",end,dt,"Solteiro","Analfabeto",ag);
        Cliente cl2 = new Cliente("18142725428","Maria Bolão",end,dt,"Viuva","Bacharel",ag);
        Conta ct = new Conta(cl,999,500.5f,"S3nh4D1f1c1l", (byte) 1,"Corrente",ag);
        Funcionario fun = new Funcionario("Manuel das Couves",end,"19216800101","CLTVargao",1045.75f);

        ag.setNome("Agencia Lucy");
        ag.setNumero(666);
        ag.setEndereco(end);
        ag.setGerente(gr);

        ct.addTitular(cl2);

        List tt = ct.getTitular();


        System.out.println("Titulares:");
        for(int i=0;i<tt.size();i++){
            Cliente cc = (Cliente) tt.get(i);
            System.out.println(cc.getNome()+" - "+ cc.getCPF());
        }

        String CPF;

        System.out.printf("Informe o CPF do cliente: ");
        CPF = ler.next();


        // usando os metodos isCPF() e imprimeCPF() da classe "ValidaCPF"
        if (ValidaCPF.isCPF(CPF) == true){
            cl.setCPF(CPF);
            System.out.println("\nResultado: "+ cl.getCPF());
        }
        else System.out.printf("Erro, CPF invalido !!!\n");

        System.out.printf("Qual o estado da conta?(A,I,N)\n");
        char c = ler.next().charAt(0);
        ct.setAtivo(func(c));
        System.out.println(ct.getAtivo());

    }
}
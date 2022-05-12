package prefjaboataovacina;
import java.util.Scanner;
import java.util.Random;

public class Paciente {
    String nome;
    int rg;
    boolean jaVacinado;
    int qtdDoses;
    int loteDose1;
    int loteDose2;
    int loteDose3;
    
    Paciente(String nome,int rg, boolean jaVacinado, int qtdDoses){
        this.nome = nome;
        this.rg = rg;
        this.jaVacinado = jaVacinado;
        this.qtdDoses = qtdDoses;
    }
    
    
    boolean registrarNovaDose(){
        Scanner teclado = new Scanner(System.in);
        boolean doseRegistrada;
        if(qtdDoses==1){
          System.out.println("Por favor, digite o Número do lote:");
          loteDose2 = teclado.nextInt();
          qtdDoses = qtdDoses +1;
          doseRegistrada = true;
          System.out.println("2a DOSE REGISTRADA COM SUCESSO");
        }else if(qtdDoses ==2){
           System.out.println("Por favor, digite o Número do lote:");
           loteDose3 = teclado.nextInt();
           qtdDoses = qtdDoses +1;
            System.out.println("3a DOSE REGISTRADA COM SUCESSO");
            doseRegistrada = true;
        }else {
            doseRegistrada = false;
        }
        
        return doseRegistrada;
    }
    int gerarLogDoses(){
        int logGerado;
        Random log = new Random();
        logGerado = log.nextInt(94561);
        System.out.println("PRIMEIRA DOSE: Lote no"+loteDose1);
        if(qtdDoses==2){
            System.out.println("SEGUNDA DOSE: Lote no"+loteDose2);
            System.out.println("O número do log registrado é: "+logGerado);
        }else if (qtdDoses==3){
            System.out.println("TERCEIRA DOSE: Lote no"+loteDose3);
            System.out.println("O número do log registrado é: "+logGerado);
        }
        return logGerado;
    }
    
}




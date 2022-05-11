
package prefjaboataovacina;
import java.util.Scanner;

public class PrefJaboataoVacina {

    public static void main(String[] args) {
        int verificaRG, escolhaMenu;
        /*Dados já inseridos anteriormente que serão utilizados*/
        Paciente p1 = new Paciente();
        p1.nome="Marieta Conceição de Lima";
        p1.rg= 9800130;
        p1.jaVacinado = true;
        p1.qtdDoses=3;
        p1.loteDose1=215485;
        p1.lotedose2=784596;
        /**/
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite, por favor, o RG do paciente:");
        verificaRG = teclado.nextInt();
        if(verificaRG ==p1.rg){
            if(p1.jaVacinado == false){
                System.out.println("O paciente não foi vacinado com nenhuma dose e seu cadastro deve ser feito por completo antes da aplicação.");
            } else if (p1.qtdDoses ==3){
                System.out.println("O paciente já completou seu esquema vacinal. Consulte o Log do paciente para mais detalhes.");
            } else if(p1.qtdDoses<3){
                System.out.println("O que você deseja fazer?");
                System.out.println("1- REGISTRAR NOVA DOSE");
                System.out.println("2- GERAR LOG DE DOSES APLICADAS");
                escolhaMenu = teclado.nextInt();
                switch (escolhaMenu){
                    case 1:
                        System.out.println("1- REGISTRAR NOVA DOSE");
                        if(p1.qtdDoses==1){
                            System.out.println("Por favor, digite o Número do lote:");
                            p1.lotedose2 = teclado.nextInt();
                            p1.qtdDoses = p1.qtdDoses +1;
                            System.out.println("2a DOSE REGISTRADA COM SUCESSO");
                        }else if(p1.qtdDoses ==2){
                            System.out.println("Por favor, digite o Número do lote:");
                            p1.loteDose3 = teclado.nextInt();
                            p1.qtdDoses = p1.qtdDoses +1;
                            System.out.println("3a DOSE REGISTRADA COM SUCESSO");
                        }
                    break;
                    case 2:
                        System.out.println("PRIMEIRA DOSE: Lote no"+p1.loteDose1);
                        if(p1.qtdDoses==2){
                            System.out.println("SEGUNDA DOSE: Lote no"+p1.lotedose2);
                            
                        }else if (p1.qtdDoses==3){
                            System.out.println("TERCEIRA DOSE: Lote no"+p1.loteDose3);
                        }
                }
            }
        }else{
            System.out.println("Dados não localizados no sistema. Consulte a UBS mais próxima da sua residência para mais detalhes.");
        }
        
        
        
    }
    
}

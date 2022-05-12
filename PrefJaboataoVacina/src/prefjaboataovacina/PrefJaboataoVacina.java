
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
        p1.loteDose2=784596;
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
                        p1.registrarNovaDose();
                    break;
                    case 2:
                        p1.gerarLogDoses();
                }
            }
        }else{
            System.out.println("Dados não localizados no sistema. Consulte a UBS mais próxima da sua residência para mais detalhes.");
        }
        
        
        
    }
    
}

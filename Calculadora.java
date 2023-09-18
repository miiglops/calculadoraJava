//Importa entrada de dados em java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Cria o scanner para entrada de dados
        System.out.print("Digite um número: ");
        float n1 = (float) keyboard.nextFloat(); // nextFloat usado para float
        
        System.out.print("Digite o sinal da operação que você deseja fazer(+, - , x , /): ");
        String operacaoString = keyboard.next();

        System.out.print("Digite mais um número: ");
        float n2 = (float) keyboard.nextFloat();

        if (operacaoString.equals("+")) {
            float n3 = (float) n1 + n2;
            System.out.println("A soma é: "+n3);
        } else{
            if (operacaoString.equals("-")) {
                float n3 = (float) n1 - n2;
                System.out.println("A subtração é: "+n3);
            } else {
                if (operacaoString.equals("x")) {
                    float n3 = (float) n1 * n2;
                    System.out.println("A multiplicação é: "+n3);
                } else {
                    if (operacaoString.equals("/")) {
                        float n3 = (float) n1 / n2;
                        System.out.println("A divisão é: "+n3);
                    } else {
                        System.out.println("Operação não reconhecida. Tente novamente!");
                    }
                }
            }
        }
    }    
}

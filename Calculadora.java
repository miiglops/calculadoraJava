//Importa entrada de dados em java
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in); //Cria o scanner para entrada de dados
        System.out.print("Digite um número: ");
        float n1 = (float) keyboard.nextFloat(); // nextFloat usado para float
        
        System.out.print("Digite a operação que você deseja fazer(tudo minúsculo e sem acentos!): ");
        String operacaoString = keyboard.next();

        System.out.print("Digite mais um número: ");
        float n2 = (float) keyboard.nextFloat();

        if (operacaoString == "adicao") {
            float n3 = (float) n1 + n2;
            System.out.println("A soma é: "+n3);
        } else{
            if (operacaoString == "subtracao") {
                float n3 = (float) n1 - n2;
                System.out.println("A subtração é: ");
            } else {
                if (operacaoString == "multiplicacao") {
                    float n3 = (float) n1 * n2;
                    System.out.println("A multiplicação é: "+n3);
                } else {
                    if (operacaoString == "divisao") {
                        float n3 = (float) n1 / n2;
                        float resto = (float) n1 % n2;
                        System.out.println("A divisão é: "+n3);
                        System.out.println("E o resto da divisão é: "+resto);
                    } else {
                        System.out.println("Operação não reconhecida. Tente novamente!");
                    }
                }
            }
        }

    /*
     * if (operacaoString == "+") {
            float n3 = (float) n1 + n2;
            System.out.println("A soma é: " +n3);
        } else if (operacaoString == "-"){
            float n3 = (float) n1 - n2;
            System.out.println("A subtração é: " +n3);
        } else if (operacaoString == "x") {
            float n3 = (float) n1 * n2;
            System.out.println("A multiplicação é: " +n3);
        } else if (operacaoString == "/") {
            float n3 = (float) n1 / n2;
            System.out.println("A divisão é: "+n3);
        } else {
            System.out.println("Operação não reconhecida, tente novamente!");
        }
        */
    }    
}

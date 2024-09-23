package contador;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		try (Scanner terminal = new Scanner(System.in)) {
            System.out.print("Digite o primeiro parâmetro: ");
            int parametroUm = Integer.parseInt(terminal.nextLine());
            System.out.print("Digite o segundo parâmetro: ");
            int parametroDois = Integer.parseInt(terminal.nextLine());
            
            try {
                //chamando o método contendo a lógica de contagem
                contar(parametroUm, parametroDois);
            
            } catch (ParametrosInvalidosException e) {
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
            }
	    }
    }

	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException();
        } else {
            //caso contrário, calcular a diferença entre os parâmetros
            int contagem = parametroDois - parametroUm;
            //realizar o for para imprimir os números com base na variável contagem
            for (int i = 1; i <= contagem; i++) {
                System.out.println("Imprimindo o número " + i);
            }
        }
	}
    
}
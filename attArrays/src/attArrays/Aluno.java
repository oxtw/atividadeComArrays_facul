package attArrays;

import java.util.Scanner;

public class Aluno {

		/*Implemente um programa para cadastro de alunos de uma disciplina utilizando a linguagem Java, seguindo os seguintes critérios: 

		Criar uma estrutura heterogênea (array) do tipo string para cadastrar o nome de 25 alunos; 
		Garantir que a estrutura seja totalmente preenchida. 

		Após implementar o programa e preencher o array com o nome dos alunos, cadastre mais 5 novos alunos.

		Qual a dificuldade de inserir os novos alunos nessa estrutura de dados? Justifique a sua resposta direcionando aos conceitos de gerenciamento de memória. 

		resposta:

		A maior dificuldade em cadastrar os novos alunos foi a de ter que entender que teria que mudar o tamanho do array para 30, visto  que não é possível simplesmente adicionar novos elementos ao final do array quando o array já está totalmente preenchido. Tentei de algumas formas criar e sempre dava erro de overflow, ou seja, estouro de memória.*/
	
	
    private static final int NUMERO_TOTAL_ALUNOS = 25;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = new String[30];
        int numeroTotalAlunos = 0;

        // Preenchimento do array com os nomes dos alunos
        while (numeroTotalAlunos < NUMERO_TOTAL_ALUNOS) {
            System.out.print("Digite o nome do " + (numeroTotalAlunos + 1) + "º aluno: ");
            String nome = sc.nextLine();
            alunos[numeroTotalAlunos] = nome;
            numeroTotalAlunos++;
        }

        // Cadastro de mais 5 alunos
        int novosAlunos = 0;
        while (novosAlunos < 5) {
            System.out.print("Digite o nome do " + (numeroTotalAlunos + novosAlunos + 1) + "º aluno: ");
            String nome = sc.nextLine();
            alunos[numeroTotalAlunos + novosAlunos] = nome;
            novosAlunos++;
        }

        // Impressão dos nomes dos alunos cadastrados (com os novos alunos)
        System.out.println("\nAlunos cadastrados:");
        for (String aluno : alunos) {
            if (aluno != null) {
                System.out.println(aluno);
            }
        }

        sc.close();
    }
}



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opt;
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("Informe o número da questão que deseja exibir");
            opt = entrada.nextInt();


            switch (opt) {
                case 5:
                    int qtdPessoas = 3;
                    int qtdPessoasMaior50Anos = 0;
                    double mediaAlturaEntre10e20Anos = 0;
                    int qtdPessoasEntre10e20Anos = 0;
                    double porcentagemPessoasPesoMenor40 = 0;
                    int qtdPessoasPesoMenor40 = 0;
                    int idade;
                    double peso;
                    double altura;

                    System.out.println("Vamos começar!!");

                    for (int i = 0; i < qtdPessoas; i++) {
                        System.out.print("Informe a idade: ");
                        idade = entrada.nextInt();
                        System.out.print("\nInforme a altura: ");
                        altura = entrada.nextDouble();
                        System.out.print("\nInforme o peso ");
                        peso = entrada.nextDouble();

                        if (idade >= 50) {
                            qtdPessoasMaior50Anos++;
                        } else if (idade > 10 && idade < 20) {
                            mediaAlturaEntre10e20Anos += altura;
                            qtdPessoasEntre10e20Anos++;
                        }

                        if (peso < 40) {
                            qtdPessoasPesoMenor40++;
                        }
                    }

                    System.out.println("\n\n");
                    System.out.println("Quantidade de pessoas com idade " +
                            "superior a 50 anos " + qtdPessoasMaior50Anos);

                    System.out.println("\n\n");
                    if (qtdPessoasEntre10e20Anos > 0) {
                        mediaAlturaEntre10e20Anos = mediaAlturaEntre10e20Anos / qtdPessoasEntre10e20Anos;
                        System.out.printf("Média de altura das pessoas entre 10 e 20 anos: %.2f\n",
                                mediaAlturaEntre10e20Anos);
                    } else {
                        System.out.println("Não existem pessoas com idade entre 10 e 20 anos.");
                    }
                    System.out.println();

                    porcentagemPessoasPesoMenor40 = (double) qtdPessoasPesoMenor40 / qtdPessoas;

                    System.out.println();
                    System.out.println();
                    System.out.printf("Porcentagem de pessoas com peso menor do que 40 %.2f%%\n",
                            porcentagemPessoasPesoMenor40*100);


                    break;
                case 7:
                    Questao7 questao7 = new Questao7(4);

                    System.out.println(questao7.quadrado());
                    System.out.println(questao7.diagonaSuperiorParaEsquerda());
                    System.out.println(questao7.diagonaSuperiorParaDireita());
                    System.out.println(questao7.diagonalInferiorParaDireita());
                    System.out.println(questao7.diagonalInferiorParaEsquerda());
                    break;

                case 666:
                    return;

                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
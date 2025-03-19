import java.util.Scanner;

public class MediaNotasTurma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de alunos na turma: ");
        int quantidadeAlunos = scanner.nextInt();
        
        double somaNotas = 0;
        
        for (int i = 1; i <= quantidadeAlunos; i++) {
            System.out.print("Digite a nota do aluno " + i + ": ");
            double nota = scanner.nextDouble();
            somaNotas += nota;
        }
        
        double media = somaNotas / quantidadeAlunos;
        
        System.out.println("A média da turma é: " + media);
        
        scanner.close();
    }
}

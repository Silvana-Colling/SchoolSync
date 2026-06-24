import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do estudante: ");
        String nome = entrada.nextLine();

        System.out.print("Digite a matrícula: ");
        int matricula = entrada.nextInt();

        // Estudante
        Estudante estudante = new Estudante(nome, matricula);

        System.out.print("Digite a primeira nota: ");
        double nota1 = entrada.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = entrada.nextDouble();

        // Boletim
        Boletim boletim = new Boletim(nota1, nota2);

        // Faltas
        System.out.print("Digite o número de faltas: ");
        int faltas = entrada.nextInt();

        // Frequencia
        Frequencia frequencia = new Frequencia(faltas);
        
        System.out.println("=== ESTUDANTE ===");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Matrícula: " + estudante.getMatricula());
        System.out.println("Nota 1: " + boletim.getNota1());
        System.out.println("Nota 2: " + boletim.getNota2());
        System.out.println("Média: " + boletim.calcularMedia());
        System.out.println("Número de faltas: " + frequencia.getNumeroFaltas());

        //entrada.close();
    }
}


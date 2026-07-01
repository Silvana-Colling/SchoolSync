
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        Estudante[] estudantes = new Estudante[3];
        Boletim[] boletins = new Boletim[3];
        Frequencia[] frequencias = new Frequencia[3];

        // =============================
        // 1️⃣ CADASTRO DOS ALUNOS
        // =============================
        for (int i = 0; i < 3; i++) {

            System.out.println("\nCadastro do estudante " + (i + 1));

            System.out.print("Nome: ");
            String nome = entrada.nextLine();

            System.out.print("Matrícula: ");
            int matricula = entrada.nextInt();

            System.out.print("Mensalidade em dia? (1=SIM / 2=NAO): ");
            int opcao = entrada.nextInt();
            boolean mensalidadeDia = (opcao == 1);

            estudantes[i] = new Estudante(nome, matricula, mensalidadeDia);

            System.out.print("Nota 1: ");
            double nota1 = entrada.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = entrada.nextDouble();

            // ✅ Sempre instancia (regra exige isso)
            boletins[i] = new Boletim(nota1, nota2);

            System.out.print("Número de faltas: ");
            int faltas = entrada.nextInt();

            // ✅ Sempre instancia
            frequencias[i] = new Frequencia(faltas);

            entrada.nextLine(); // limpar buffer
        }

        // =============================
        // 2️⃣ LISTAGEM FINAL
        // =============================
        System.out.println("\n=== RELATÓRIO DOS ESTUDANTES ===");

        for (int i = 0; i < 3; i++) {

            System.out.println("\n------------------------");
            System.out.println("Aluno " + (i + 1));
            System.out.println("Nome: " + estudantes[i].getNome());
            System.out.println("Matrícula: " + estudantes[i].getMatricula());

            // ✅ REGRA PRINCIPAL
            if (!estudantes[i].isMensalidadeDia()) {
                System.out.println("Aviso: Dados retidos por pendência financeira");
                System.out.println();
            } else {
                System.out.println("Nota 1: " + boletins[i].getNota1());
                System.out.println("Nota 2: " + boletins[i].getNota2());
                System.out.println("Média: " + boletins[i].calcularMedia());
                System.out.println("Número de faltas: " + frequencias[i].getNumeroFaltas());
            }
        }

        entrada.close();
    }
}
import java.util.Scanner; 

public class Principal { public static void main(String[] args) { 

    Scanner entrada = new Scanner(System.in); 
 

    System.out.println(); 
    System.out.println(); 
    System.out.println(); 
    System.out.println(); 
    System.out.print("Digite o nome do estudante: "); 
    String nome = entrada.nextLine(); 
 
    System.out.print("Digite a matrícula: "); 
    int matricula = entrada.nextInt(); 
 
    System.out.println("Estudante está com a mensalidade em dia?"); 
    System.out.println(" "); 
    System.out.print(" Digite 1 para SIM e 2 para NÂO "); 
    int opcao = entrada.nextInt(); 
    System.out.println(); 
    System.out.println(); 
    if (opcao == 1) { 
 
        boolean mensalidadeDia = true;     
        // Estudante 
        Estudante estudante = new Estudante(nome, matricula, mensalidadeDia); 
 
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
        System.out.println(); 
        System.out.println(); 
        System.out.println("=== ESTUDANTE ==="); 
        System.out.println("Nome: " + estudante.getNome()); 
        System.out.println("Matrícula: " + estudante.getMatricula()); 
        System.out.println("Nota 1: " + boletim.getNota1()); 
        System.out.println("Nota 2: " + boletim.getNota2()); 
        System.out.println("Média: " + boletim.calcularMedia()); 
        System.out.println("Número de faltas: " + frequencia.getNumeroFaltas()); 
 
        entrada.close(); 
    } else { 
        boolean mensalidadeDia = false; 
        System.out.println(); 
        System.out.println("LANÇAMETO DE NOTAS E FRENQUENCIA NÃO PERMITIDA PARA ESTUDANTES EM ATRASO"); 
        System.out.println(); 
        System.out.println(); 
        System.out.println(); 
    } 
} 
  

} 

 
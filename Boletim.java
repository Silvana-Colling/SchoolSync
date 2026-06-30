public class Boletim { 
    private double nota1; 
    private double nota2; 

    // Construtor 
    public Boletim(double nota1, double nota2) { 
        this.nota1 = nota1; 
        this.nota2 = nota2; 
    } 

    // Método Cálculo Média 
    public double calcularMedia() { 
        return (nota1 + nota2) / 2; 
    } 

    // Getters e Setters 
    public double getNota1() { 
        return nota1; 
    } 

    public double getNota2() { 
        return nota2; 
    } 

    public void setNota1(double nota1) { 
        this.nota1 = nota1; 
    } 

    public void setNota2(double nota2) { 
        this.nota2 = nota2; 
    } 
} 
//ESTUDANTE================================= 
public class Estudante { 

    public String nome; 
    public int matricula; 
    public boolean mensalidadeDia; 
    
    public Estudante(String nome, int matricula, boolean mensalidadeDia){ 
        this.nome = nome; 
        this.matricula = matricula; 
        this.mensalidadeDia = mensalidadeDia; 
    } 
    
// Getters 
public String getNome() { 
    return nome; 
    } 

public int getMatricula(){ 
    return matricula; 
    } 

} 
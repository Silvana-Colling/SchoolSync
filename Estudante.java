public class Estudante {

    private String nome;
    private int matricula;
    private boolean mensalidadeDia;

    public Estudante(String nome, int matricula, boolean mensalidadeDia) {
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidadeDia = mensalidadeDia;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public boolean isMensalidadeDia() {
        return mensalidadeDia;
    }
}
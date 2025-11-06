public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.matricula = matricula;
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;    
    }

    public String getMatricula() {
        return matricula;
    }

    public double calcularMedia(double nota1, double nota2) {
        double mediaFinal = (nota1 + nota2) / 2;
        return mediaFinal;
    }

    public String situacao(double mediaFinal) {
        if(mediaFinal >= 7) {
            return "Aprovado!";
        } else {
            return "Reprovado!";
        }
    }

    public void exibirInfo() {
        System.out.println(
            "=== Lista de Alunos ===\n" +
            "Nome: " + this.nome + " | " + 
            "Matrícula: " + this.matricula + " | " + 
            "Notas: " + this.nota1 + " e " + this.nota2 + " | " +
            "Média: " + calcularMedia(nota1, nota2) + " | " +
            "Situação: " + situacao(calcularMedia(nota1, nota2))
            );
    }
}

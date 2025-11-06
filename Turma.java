import java.util.Scanner;

public class Turma {
    private Aluno[] alunos = new Aluno[5];
    private int quantidade;
    Scanner scanner = new Scanner(System.in);

    public void adicionarAluno(Aluno aluno) {
        for (int i = 0; i < alunos.length; i++) {
            if(alunos[i] != null){
                alunos[i] = aluno;

            }
        }
    }

    public void listarAlunos() {
        for(int i = 0; i < alunos.length; i++) {
            System.out.println(alunos[i]);
        }
    }

    public Aluno buscarPorMatricula(String matricula) {
        System.out.println("=== Buscar Aluno ===");
        System.out.println("Digite a matrícula: " + matricula);
        for(int i = 0; i < alunos.length; i++) {
            if(alunos[i].getMatricula() == matricula) {
                return alunos[i]; 
            }
        }
        return null;
    }
}

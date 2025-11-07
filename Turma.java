public class Turma {
    private Aluno[] alunos;
    private int quantidade;

    public Turma() {
      alunos = new Aluno[5];
      quantidade = 0;
    }

    public void adicionarAluno(Aluno aluno) {
        if(quantidade < alunos.length) {
          alunos[quantidade] = aluno;
          quantidade++;
        }
    }

    public void listarAlunos() {
      System.out.println("=== Lista de Alunos ===");
        for(int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null) {
              alunos[i].exibirInfo();
            }
        }
    }

    public Aluno buscarPorMatricula(String matricula) {
      System.out.println("=== Buscar Aluno ===");
      System.out.println("Digite a matrícula: " + matricula);
      for(int i = 0; i < alunos.length; i++) {
            if (alunos[i] != null && alunos[i].getMatricula().equals(matricula)) {
              return alunos[i];
            }
        }
      return null;
    }

}

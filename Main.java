public class Main {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        Aluno aluno1 = new Aluno("Nelson", "100", 0, 0);
        t1.adicionarAluno(aluno1);
        
        Aluno aluno2 = new Aluno("Nelson Filho", "101", 0, 0);
        t1.adicionarAluno(aluno2);

        Aluno alunoEn = t1.buscarPorMatricula("100");

        if(alunoEn != null){
            alunoEn.exibirInfo();
        }

        // t1.listarAlunos();

    }

}

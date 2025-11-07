public class Main {
    public static void main(String[] args) {
        Turma t1 = new Turma();
        Aluno aluno1 = new Aluno("Nelson", "100", 0, 0);
        Aluno aluno2 = new Aluno("Nelson Filho", "101", 0, 0);
        t1.adicionarAluno(aluno1);
        t1.adicionarAluno(aluno2);
        t1.adicionarAluno(new Aluno("Carol", "102", 10, 10));

        t1.listarAlunos();

        Aluno buscado = t1.buscarPorMatricula("102");

        if(buscado != null){
            buscado.exibirInfo();
        }

    }

}

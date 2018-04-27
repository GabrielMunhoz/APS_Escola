
public class Turma {
   
	private String disciplina;
    private Aluno alunos[] = new Aluno[5]; 
    public Turma(Aluno[] alunos2, String disc) {
		alunos = alunos2;
		disciplina = disc;
	}
	public String getDisciplina() {
		return disciplina;
	}
}
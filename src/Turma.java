import java.util.Arrays;

public class Turma{
   
	private String disciplina;
    private Aluno alunos[] = new Aluno[5]; 
    public Turma(Aluno[] alunos2, String disc) {
		alunos = alunos2;
		disciplina = disc;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public String[] getAlunos() {
		String alu[] = new String [5];
		int id=0;
		for(Aluno a : alunos) {
			alu[id++] = a.toString();
		}
		Arrays.sort(alu);
		return alu;
	}
	public void setAlunos(Aluno[] alunos) {
		this.alunos = alunos;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	
}
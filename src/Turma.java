import java.util.Arrays;

public class Turma{
	
	private Disciplina disciplina;
    
	private Aluno alunos[] = new Aluno[5]; 
    
	public Turma(Aluno[] alunos2, Disciplina disc) {
	
		alunos = alunos2;
		
		disciplina = disc;
	}
	
	public String[] getAlunos() {
	
		String alu[] = new String [5];
		
		int id=0;
		
		for(Aluno a : alunos) {
		
			alu[id++] = "\n"+a.toString();
		}
		
		Arrays.sort(alu);
		
		return alu;
	}
	public void setAlunos(Aluno[] alunos) {
		
		this.alunos = alunos;
	}

	@Override
	public String toString() {
		return "Turma [Alunos = " + Arrays.toString(getAlunos()) + ""
				+ "Disciplina da turma = "+ disciplina.toString() +"]";
	}
	
	
	
	
}
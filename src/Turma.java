import java.util.Arrays;

public class Turma{
	
	private Disciplina disciplina;
    
	private Aluno alunos[] = new Aluno[5]; 
    
	public Turma(Aluno[] alunos2, Disciplina disc) {
	
		alunos = alunos2;
		
		disciplina = disc;
	}

	public Aluno[] getAlunos() {
		Arrays.sort(alunos);
		return alunos;
	}



	@Override
	public String toString() {
		return "Turma "+disciplina.toString()+ "\nAlunos:" + Arrays.toString(getAlunos());
	}
	
	public void setAvaliacao(Avaliacao avaliacao) {
		disciplina.setAvaliacoes(avaliacao);
		
		for(Aluno a : alunos) {
			
			a.setAvaliacao(avaliacao); //adiciona avaliacao a todos alunos com a nota maxima
			
		}
	}
	
	
	
}
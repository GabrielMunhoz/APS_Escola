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
	
	public void setAvaliacao() {
		Console console = new Console();
		
		String data=console.dString("Digite a data 'dd/mm/aaaa' da avaliação:");
		
		for(Aluno a : alunos) {
			
			System.out.println(a.getNome());
			
			Double nota = console.dDouble("Digite a Nota do aluno: ");
			
			a.setAvaliacao(data,nota );
			
		}
		
		for(Aluno a : alunos) {
			System.out.println( "--------------------------------" );
			
			System.out.println("Aluno: "+a.getNome());
			
			a.getAvaliacao();
			
			System.out.println( "--------------------------------" );
		}
		
	}
	
	
	
}
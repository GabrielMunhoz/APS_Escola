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
			
			a.escreveAvaliacao();
			
			System.out.println( "--------------------------------" );
		}
		
	}

	public void getMedia() {
		for( Aluno a : alunos ) {
			
			Avaliacao av[] = a.getAvaliacao();
			
			int id = 0;
			double nota = 0 ;
			
			while(id<av.length) {
				if(av[id] !=null) {
					nota+=av[id].getNota();
					id++;
				}else {
					
				break;
				
				}
			}
			
			System.out.println("id="+id + "Nota: "+nota);
			double aux = nota/(id);
			nota = aux;
			System.out.println( "--------------------------------" );
			System.out.println("Nome:"+a.getNome()+" Media = "+ nota);
			System.out.println( "--------------------------------" );
		}
		
		
	}
	
	
	
}
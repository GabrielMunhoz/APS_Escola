import java.text.ParseException;

public class Escola {
	
	static Console console = new Console();
	
	static Turma turma[] = new Turma[5];
	
	static Aula aula[] = new Aula[10];
	
	public static void main(String[] args) throws ParseException {
		while(true) {
			Aluno aluno[]= CriaAluno();
			criaTurma(aluno);
			criaAula();
		}
		
    }
    private static Aluno[] CriaAluno() {
    	// cria no maximo 5 alunos e retorna 
    	
    	System.out.println("------Cadastrando Alunos-------");
    	
    	Aluno alun[] = new Aluno[5];
    	
    	int id = 0; 
    		
    		while(id<alun.length) {
    			
    			alun[id++] = new Aluno(console.dString("Digite o Nome do aluno: "), id );
    		
    		}
    	
    		return alun;
    }//Final metodo cria aluno 
    
	public static void criaTurma(Aluno[] alunos) {
		// Cria turma recebendo os alunos e chama o metodo cadastra disciplina
		
		System.out.println("------Criando Turma-------");
	
		int id = 0;
		
		while(id<turma.length) {
			
			if(turma[id]== null){ 
				
				break;
				
			}//fim if que verifica posicao livre no array t[]
			
			id++;
		
		}// fim while
			
		turma[id] = new Turma ( alunos , cadastraDisciplina() ); //recebe o nome da disciplina
	
    }// final metodo cria turma 
    
	private static Disciplina cadastraDisciplina() {
		//cria a disciplina 
		
		Disciplina disc = new Disciplina(console.dString("Digite a disciplina: "));	
		
		return disc;
	
	}// final metodo cadastra disciplina
	
	public static void criaAula() throws ParseException {
		//cria aula para turma 
		
		int id = 0; // contador
		
		while(true) {
			
			if(turma[id] != null ) {
				
				System.out.println("Posição ["+id+"] " + turma[id].toString());
			
			}else{
				
				break;
			}
			
			id++;
			
		}// verifica quantas turma estao cadastradas
		
		int esc = console.dInt("Digite a posição da turma que deseja inserir uma aula: "); // escola qual turma sera adicionado aula
		
		id = 0 ;
		
		while(id<aula.length) {
			
			if( aula[id] == null ) {
				break;
			}
			
			id++;
		
		}// fim while que verifica posicao livre
		
		aula[id] = new Aula(turma[esc] , console.dString("Digite a data 'dd/mm/aaaa'"), 
				console.dString("Digite a descriçcao da aula") ); // cria a aula passando a turma escolhida anteriormente 
																	// a data da aula e a descricao 
		
		
	}// fim metodo cria aula
	
	public static void chamada(Turma turma) {
    	// metodo que realiza a chamada por aula 
		
		
    }
    public static void adicionarAvaliação() {
    	//adiciona ate 3 avaliacoes para cada aluno selecionando a turma cadastrada
    	
    }
    public static void verificaMediaAlunos() {
    	//verifica media dos alunos de cada turma 
    	
    }
}
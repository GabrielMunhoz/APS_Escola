
public class Escola {
	static Console console = new Console();
    public static void main(String[] args) {
      Aluno aluno[] = CriaAluno();
      Turma turma = criaTurma(aluno);
      chamada(turma);
      
    }
    private static Aluno[] CriaAluno() {
    	System.out.println("------Criando alunos-------");
    	//Cria turma com no maximo 5 alunos
		Aluno aluno[] = new Aluno[5];
		int x = 0;
		while(x<aluno.length) {
			aluno[x++] = new Aluno(console.dString("Digite o nome do aluno:")
					,x);
		}
		System.out.println("------alunos Criados-------");
		return aluno;
	}
	public static Turma criaTurma(Aluno[] alunos) {
		System.out.println("------Criando Turma-------");
		Turma turma1[] = new Turma[5];
		int x = 0,id=0;
		while(x<5) {
			if(turma1[x]==null) {
				id=x;
				break;
			}
			x++;
		}
		turma1[id] = new Turma(alunos,console.dString("Digite a disciplina: "));
		int y = 0; 
		while(y<turma1.length) {
			if(turma1[y]!=null) {
			System.out.println("Posição["+y+"]"+turma1[y].getDisciplina());
			}
			y++;
		}
		int esc = console.dInt("Digite qual a posição da turma desejada: ");
		System.out.println("------Turma criada-------");
		return turma1[esc];
		
    }
    public static void chamada(Turma turma) {
    	System.out.println("------Realizando Chamada-------");
    	System.out.println("------Alunos da turma de "+turma.getDisciplina()+"-------");
    	System.out.print(turma.escreve());
    	System.out.println("Para realiza a chamada! ");
    	int x=0;
    	while(x<turma.getAlunos().length) {
    		turma.alunoPresente(console.dInt("Digite a matricula:"));
    	}
    	
    }
    public static void adicionarAvaliação() {
    	//adiciona ate 3 avaliacoes para cada aluno 
    	
    }
    public static void verificaMediaAlunos() {
    	//verifica media dos alunos
    	
    }
}
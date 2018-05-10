

public class Disciplina {
	
	private String disciplina;
	private Avaliacao[] avaliacoes = new Avaliacao[3];
	
	public Disciplina(String nomeDis) {
		
		this.disciplina = nomeDis;
	}
	
	public String getDisciplina() {
	
		return disciplina;
	
	}
	
	public void setAvaliacoes(Avaliacao avaliacao) {
		int id = 0;
		while(true) {
			if(avaliacoes[id]==null) {
				break;
			}
			id++;
		}
		avaliacoes[id] = avaliacao;
	}
	
	@Override
	
	public String toString() {
	
		return "[Disciplina =" + getDisciplina()+"]";
	}
	
	
}

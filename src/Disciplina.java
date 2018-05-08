import java.util.Arrays;

public class Disciplina {
	
	private String disciplina;
	private Avaliacao[] avaliacoes;
	
	public Disciplina(String nomeDis) {
		
		this.disciplina = nomeDis;
	}
	
	public String getDisciplina() {
	
		return disciplina;
	
	}
		
	public Avaliacao[] getAvaliacoes() {
	
		return avaliacoes;
	}
	
	
	public void setAvaliacoes(Avaliacao[] avaliacoes) {
	
		this.avaliacoes = avaliacoes;
	}
	
	@Override
	
	public String toString() {
	
		return "[Disciplina =" + getDisciplina()+"]";
	}
	
	
}


public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int mat) {
		this.nome = nome; 
		this.matricula = mat;
	}
    
	public String getNome() {
		return nome;
	}

	public int getMatricula() {
		return matricula;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + getNome() + ", matricula=" + getMatricula() + "]";
	}

}
	
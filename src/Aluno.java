
public class Aluno implements Comparable<Aluno>{
    private String nome;
    private int matricula;
    private String Presenca;
    
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

	public String getPresenca() {
		return Presenca;
	}

	public void setPresenca(String presenca) {
			if(presenca.toLowerCase().equals("p")){
				presenca = "Presente";
				
			}else {
				if(presenca.toLowerCase().equals("a")) {
					presenca = "Ausente";
	
				}
			}
		
			this.Presenca = presenca;
		
	}

	@Override
	public String toString() {
		
		return "\nAluno [nome=" + getNome() + ", matricula=" + getMatricula()+"]";
	}

	@Override
	public int compareTo(Aluno o) {
		return getNome().compareTo(o.getNome());
	}

}
	
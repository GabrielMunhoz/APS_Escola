import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
    private Date data;
    private Turma turma;
    private String descricao;
    
    
    public Aula(Turma t, String data, String descri) {
    	
    	turma = t;
    	
    	try {
			this.data = formato.parse(data);
		} catch (Exception e) {
			
			e.toString();
		}
    	
    	descricao = descri;
    	
    }
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
    
    public void chamada() {
    	Console console = new Console();
    	
    	for(Aluno p : turma.getAlunos()) {
    		
    		System.out.println(p.getNome());
    		
    		p.setPresenca(console.dString("Presença: P ou A?"));
    	}
    	for(Aluno p : turma.getAlunos()) {
    		System.out.println("--------------------------------");
    		System.out.println(toString());
    		System.out.println(p.toString()+"Presença : "+p.getPresenca());
    		System.out.println("--------------------------------");
    	}
    	
    }
	@Override
	public String toString() {
		return "Aula [data=" + formato.format(data) + "]";
	}
	
    
}
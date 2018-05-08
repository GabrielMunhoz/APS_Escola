import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Aula {
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
    private Date data;
    private Turma turma;
    private String descricao;
    
    
    public Aula(Turma t, String data, String descri) throws ParseException {
    	
    	turma = t;
    	
    	this.data = formato.parse(data);
    	
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
    	for(String p : turma.getAlunos()) {
    		System.out.println(p);
    	}
    }
	@Override
	public String toString() {
		return "Aula [data=" + formato.format(data) + "]";
	}
    
}
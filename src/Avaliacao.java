import java.text.SimpleDateFormat;
import java.util.*;
public class Avaliacao {
   
	private double nota;
    
    SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
    
    private Date data=new Date(); 

    
    
    public Avaliacao(double nota, String data)  {

		this.nota = nota;
		
		try {
			this.data = formato.parse(data);
		} catch (Exception e) {
			
			e.toString();
		}
	}

	public double getNota() {
    
    	return nota;
    }

    public void setNota(double nota) {
        
    	this.nota = nota;
    }

    public Date getData() {
        
    	return data;
    }

   

	@Override
	public String toString() {
		return "Avaliacao [data da prova =" + formato.format(data) + " nota=" + nota +"]";
	}
    
    
}

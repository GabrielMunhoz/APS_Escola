
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
public class Avaliacao {
   
	private double nota;
    
    SimpleDateFormat formato= new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
    
    private Date data=new Date(); 

    
    
    public Avaliacao(double nota, String data) throws ParseException {

		this.nota = nota;
		
		this.data = formato.parse(data);
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

    public void setData(Date data) {
        
    	this.data = data;
    }
    
}


import java.text.SimpleDateFormat;
import java.util.*;
public class Avaliacao {
    private double nota;
    
    SimpleDateFormat sdf1= new SimpleDateFormat("dd/MM/yyyy"); //você pode usar outras máscaras
    
    private Date data=new Date(); 

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

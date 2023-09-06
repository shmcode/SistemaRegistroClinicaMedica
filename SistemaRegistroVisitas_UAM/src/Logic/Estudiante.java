package Logic;
import java.util.Date;

//Abstracción
public class Estudiante extends Usuario{
    private Date date;
    private String malestar;

    public Estudiante(Date date, String malestar, String id, String primerNombre, String primerApellido, String segundoApellido, String numeroTelefono) {
        super(id, primerNombre, primerApellido, segundoApellido, numeroTelefono);
        this.date = date;
        this.malestar = malestar;
    }


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMalestar() {
        return malestar;
    }

    public void setMalestar(String malestar) {
        this.malestar = malestar;
    }
}

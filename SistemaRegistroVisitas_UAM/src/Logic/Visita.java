package Logic;

import java.util.Date;

public class Visita {
    private String id;
    private Estudiante estudiante;
    private PersonalClinica personalClinica;
    private Date date;
    private String malestar;

    public Visita(String id, Estudiante estudiante, PersonalClinica personalClinica, Date date, String malestar) {
        this.id = id;
        this.estudiante = estudiante;
        this.personalClinica = personalClinica;
        this.date = date;
        this.malestar = malestar;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public PersonalClinica getPersonalClinica() {
        return personalClinica;
    }

    public void setPersonalClinica(PersonalClinica personalClinica) {
        this.personalClinica = personalClinica;
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

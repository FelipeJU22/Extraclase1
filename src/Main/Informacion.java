package Main;

import java.util.ArrayList;

public abstract class Informacion { //Clase Padre //También es lo abstracto para crear las subclases
    private String carne;
    private String nombre;
    private String correo;
    private String telefono;
    private String nick;
    private String tipo_estudiante;
    private Integer examen_promedio;
    private Integer quiz_promedio;
    private Integer tarea_promedio;
    private Integer proyecto1;
    private Integer proyecto2;
    private Integer proyecto3;
    private String notaPA;
    private String notaPB;
    private Integer notaFinal;
    public Informacion(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                       Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3, String notaPA, String notaPB, Integer notaFinal) {
        this.carne = carne;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.nick = nick;
        this.tipo_estudiante = tipo_estudiante;
        this.examen_promedio = examen_promedio;
        this.quiz_promedio = quiz_promedio;
        this.tarea_promedio = tarea_promedio;
        this.proyecto1 = proyecto1;
        this.proyecto2 = proyecto2;
        this.proyecto3 = proyecto3;
        this.notaPA = notaPA;
        this.notaPB = notaPB;
        this.notaFinal = notaFinal;
    }

    public String getCarne() {
        return carne;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }


    public String getTelefono() {
        return telefono;
    }

    public String getNick() {
        return nick;
    }


    public String getTipo_estudiante() {
        return tipo_estudiante;
    }


    public Integer getExamen_promedio() {
        return examen_promedio;
    }



    public Integer getQuiz_promedio() {
        return quiz_promedio;
    }



    public Integer getTarea_promedio() {
        return tarea_promedio;
    }



    public Integer getProyecto1() {
        return proyecto1;
    }



    public Integer getProyecto2() {
        return proyecto2;
    }


    public Integer getProyecto3() {
        return proyecto3;
    }

    public String getNotaPB() {
        return notaPB;
    }

    public void setNotaPB(String notaPB) {
        this.notaPB = notaPB;
    }

    public String getNotaPA() {
        return notaPA;
    }

    public void setNotaPA(String notaPA) {
        this.notaPA = notaPA;
    }

    public Integer getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }


    public abstract String nota();

    public abstract Integer nota_final();

}




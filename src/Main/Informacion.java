package Main;

public class Informacion {
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


    public Informacion(String carne, String nombre, String correo, String telefono, String nick, String tipo_estudiante, Integer examen_promedio,
                       Integer quiz_promedio, Integer tarea_promedio, Integer proyecto1, Integer proyecto2, Integer proyecto3) {
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
    }

    public String getCarne() {
        return carne;
    }

    public void setCarne(String carne) {
        this.carne = carne;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getTipo_estudiante() {
        return tipo_estudiante;
    }

    public void setTipo_estudiante(String tipo_estudiante) {
        this.tipo_estudiante = tipo_estudiante;
    }

    public Integer getExamen_promedio() {
        return examen_promedio;
    }

    public void setExamen_promedio(Integer examen_promedio) {
        this.examen_promedio = examen_promedio;
    }

    public Integer getQuiz_promedio() {
        return quiz_promedio;
    }

    public void setQuiz_promedio(Integer quiz_promedio) {
        this.quiz_promedio = quiz_promedio;
    }

    public Integer getTarea_promedio() {
        return tarea_promedio;
    }

    public void setTarea_promedio(Integer tarea_promedio) {
        this.tarea_promedio = tarea_promedio;
    }

    public Integer getProyecto1() {
        return proyecto1;
    }

    public void setProyecto1(Integer proyecto1) {
        this.proyecto1 = proyecto1;
    }

    public Integer getProyecto2() {
        return proyecto2;
    }

    public void setProyecto2(Integer proyecto2) {
        this.proyecto2 = proyecto2;
    }

    public Integer getProyecto3() {
        return proyecto3;
    }

    public void setProyecto3(Integer proyecto3) {
        this.proyecto3 = proyecto3;
    }

    public double nota() {
        double nota_final = 0.0;

        nota_final = examen_promedio + quiz_promedio + tarea_promedio + proyecto1 + proyecto2 + proyecto3;
        return nota_final;
    }
}




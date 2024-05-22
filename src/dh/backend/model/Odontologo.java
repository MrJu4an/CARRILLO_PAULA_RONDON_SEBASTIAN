package dh.backend.model;

public class Odontologo {
    private Integer id;
    private String idMatricula;
    private String nombre;
    private String apellido;

    public Odontologo(Integer id, String idMatricula, String nombre, String apellido) {
        this.id = id;
        this.idMatricula = idMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Odontologo(String idMatricula, String nombre, String apellido) {
        this.idMatricula = idMatricula;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdMatricula() {
        return idMatricula;
    }

    public void setIdMatricula(String idMatricula) {
        this.idMatricula = idMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Odontologo{" +
                "id=" + id +
                ", idMatricula='" + idMatricula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}

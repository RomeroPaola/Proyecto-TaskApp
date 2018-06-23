package ado.edu.itla.taskapp.entidad;

public class Categoria {
   private Integer id;           // se protegen estos metodos encapsulandolos
   private String nombre;

    public Integer getId() {
        return id;
    }

    public Categoria setId (Integer id) {
        this.id = id;
        return this;
    }

    public Categoria(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public Categoria() {
    }

    public Categoria(Integer id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }


    public Categoria setNombre(String descripcion) {
        this.nombre = descripcion;
        return this;
    }

    @Override               // se hereda un metodo de la clase object
    public String toString() {
        final StringBuffer sb = new StringBuffer("Categoria{");
        sb.append("id=").append(id);
        sb.append(", descripcion='").append(nombre).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

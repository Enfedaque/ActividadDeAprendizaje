package domain;

import java.util.Objects;

public class Alumnos {

    public String nombre;
    public String apellido;
    public boolean repetidor;
    public int edad;
    public float media;

    //CONSTRUCTOR
    public Alumnos(String nombre, String apellido, boolean repetidor, int edad, float media) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.repetidor = repetidor;
        this.edad = edad;
        this.media = media;
    }

    //GETTER AND SETTER
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

    public boolean isRepetidor() {
        return repetidor;
    }

    public void setRepetidor(boolean repetidor) {
        this.repetidor = repetidor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getMedia() {
        return media;
    }

    public void setMedia(float media) {
        this.media = media;
    }



    //METODO EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumnos alumnos = (Alumnos) o;
        return repetidor == alumnos.repetidor &&
                edad == alumnos.edad &&
                Float.compare(alumnos.media, media) == 0 &&
                Objects.equals(nombre, alumnos.nombre) &&
                Objects.equals(apellido, alumnos.apellido);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", repetidor=" + repetidor +
                ", edad=" + edad +
                ", media=" + media +
                '}';
    }
}

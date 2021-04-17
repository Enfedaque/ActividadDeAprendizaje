package domain;

import java.util.Objects;

public class Profesores {

    //Atributos
    public String nombre;
    public String apellido;
    public String asignatura;
    public int edad;
    public float salario;

    //CONSTRUCTOR
    public Profesores(String nombre, String apellido, String asignatura, int edad, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.asignatura = asignatura;
        this.edad = edad;
        this.salario = salario;
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

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //METODO EQUALS
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Profesores that = (Profesores) o;
        return edad == that.edad &&
                Float.compare(that.salario, salario) == 0 &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(apellido, that.apellido) &&
                Objects.equals(asignatura, that.asignatura);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", asignatura='" + asignatura + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}'  + "\n";
    }
}

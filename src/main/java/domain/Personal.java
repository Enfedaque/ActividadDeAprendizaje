package domain;

import java.util.Objects;

public class Personal {

    public String nombre;
    public String apellido;
    public String oficio;
    public int edad;
    public float salario;

    //CONSTRUCTOR
    public Personal(String nombre, String apellido, String oficio, int edad, float salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.oficio = oficio;
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

    public String getOficio() {
        return oficio;
    }

    public void setOficio(String oficio) {
        this.oficio = oficio;
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
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Personal personal = (Personal) o;
        return edad == personal.edad &&
                Float.compare(personal.salario, salario) == 0 &&
                Objects.equals(nombre, personal.nombre) &&
                Objects.equals(apellido, personal.apellido) &&
                Objects.equals(oficio, personal.oficio);
    }

    //METODO TOSTRING
    @Override
    public String toString() {
        return "Personal{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", oficio='" + oficio + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}' + "\n";
    }
}


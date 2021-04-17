package colegio;

import domain.Alumnos;
import domain.Personal;
import domain.Profesores;

import java.util.Scanner;

public class Applicattion {
    public static void main(String[] args){

        Scanner sc;

        Profesores profesor;
        Alumnos alumno;
        Personal personal;

        boolean salir=false;


        while (!salir){
            sc=new Scanner(System.in);
            System.out.println("BIENVENIDO A NUESTRO COLEGIO");
            System.out.println("SELECCIONA UN NUMERO");
            System.out.println("1 - PROFESOR");
            System.out.println("2 - ALUMNO");
            System.out.println("3 - PERSONAL");
            System.out.println("4 - SALIR");

            int eleccion=sc.nextInt();

            switch (eleccion){
                case 1:
                    //Crear profesores
                    sc=new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String nombre=sc.nextLine();
                    System.out.println("Apellido:");
                    String apellido=sc.nextLine();
                    System.out.println("Asignatura: ");
                    String asignatura=sc.nextLine();
                    System.out.println("Edad: ");
                    String edadStr=sc.nextLine();
                    int edad=Integer.parseInt(edadStr);
                    System.out.println("Salario: ");
                    String salarioStr=sc.nextLine();
                    float salario=Float.parseFloat(salarioStr);

                    profesor=new Profesores(nombre, apellido, asignatura, edad, salario);

                    System.out.println("¿Ver el profesor registrado?");
                    String respuesta=sc.nextLine();
                    if(respuesta.equalsIgnoreCase("si")){
                        System.out.println(profesor.toString());
                    }
                    break;
                case 2:
                    //Crear alumnos
                    sc=new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String nombre2=sc.nextLine();
                    System.out.println("Apellido:");
                    String apellido2=sc.nextLine();
                    System.out.println("¿Repetidor?");
                    String repetidorStr=sc.nextLine();
                    boolean repetidor;
                    if(repetidorStr.equalsIgnoreCase("si")){
                        repetidor=true;
                    }else{
                        repetidor=false;
                    }
                    System.out.println("Edad: ");
                    String edadStr2=sc.nextLine();
                    int edad2=Integer.parseInt(edadStr2);
                    System.out.println("Media: ");
                    String mediaStr=sc.nextLine();
                    float media=Float.parseFloat(mediaStr);

                    alumno=new Alumnos(nombre2, apellido2, repetidor, edad2, media);

                    System.out.println("¿Ver el alumno registrado?");
                    String respuesta2=sc.nextLine();
                    if(respuesta2.equalsIgnoreCase("si")){
                        System.out.println(alumno.toString());
                    }
                    break;
                case 3:
                    //Crear personal
                    sc=new Scanner(System.in);
                    System.out.println("Nombre: ");
                    String nombre3=sc.nextLine();
                    System.out.println("Apellido:");
                    String apellido3=sc.nextLine();
                    System.out.println("Oficio: ");
                    String oficio=sc.nextLine();
                    System.out.println("Edad: ");
                    String edadStr3=sc.nextLine();
                    int edad3=Integer.parseInt(edadStr3);
                    System.out.println("Salario: ");
                    String salarioStr3=sc.nextLine();
                    float salario3=Float.parseFloat(salarioStr3);

                    personal=new Personal(nombre3, apellido3, oficio, edad3, salario3);

                    System.out.println("¿Ver el personal registrado?");
                    String respuesta3=sc.nextLine();
                    if(respuesta3.equalsIgnoreCase("si")){
                        System.out.println(personal.toString());
                    }
                    break;

                case 4:
                    salir=true;
                    break;
            }
        }


    }
}

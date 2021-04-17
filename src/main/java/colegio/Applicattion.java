package colegio;

import domain.Alumnos;
import domain.Personal;
import domain.Profesores;

import java.util.ArrayList;
import java.util.Scanner;

public class Applicattion {
    public static void main(String[] args){

        Scanner sc;

        Profesores profesor;
        Alumnos alumno;
        Personal personal;

        boolean salir=false;

        //Colecciones donde voy a guardar los objetos
        ArrayList<Profesores> profesores=new ArrayList<Profesores>();
        ArrayList<Alumnos> alumnos=new ArrayList<Alumnos>();
        ArrayList<Personal> personales=new ArrayList<Personal>();


        while (!salir){
            sc=new Scanner(System.in);
            System.out.println("BIENVENIDO A NUESTRO COLEGIO");
            System.out.println("SELECCIONA UN NUMERO");
            System.out.println("1 - PROFESOR");
            System.out.println("2 - ALUMNO");
            System.out.println("3 - PERSONAL");
            System.out.println("4 - MOSTRAR POFESORES");
            System.out.println("5 - MOSTRAR ALUMNOS");
            System.out.println("6 - MOSTRAR PERSONAL");
            System.out.println("7 - SALIR");

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
                    //Añado a la coleccion
                    profesores.add(profesor);

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
                    //Añado el objeto a la coleccion
                    alumnos.add(alumno);

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
                    //Añado a la  coleccion
                    personales.add(personal);

                    break;

                case 4:
                    System.out.println(profesores.toString());
                    break;

                case 5:
                    System.out.println(alumnos.toString());
                    break;

                case 6:
                    System.out.println(personales.toString());
                    break;

                case 7:
                    salir=true;
                    break;
            }
        }


    }
}

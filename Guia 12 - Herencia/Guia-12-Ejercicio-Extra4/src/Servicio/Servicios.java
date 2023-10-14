/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Estudiante;
import Entidad.Persona;
import Entidad.Profesor;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Adrian H
 */
public class Servicios {

    public PersonalServicio crearPersonalServicios() {
        /**
         * Pedir todos los datos del PersonalServicio
         */

        PersonalServicio PersonaNueva = new PersonalServicio();

        Scanner input = new Scanner(System.in).useDelimiter("\n");

        System.out.println("1) Ingrese su nombre y apellido: \n");
        String nombreApellido = input.next();
        PersonaNueva.setNombre(nombreApellido);
        System.out.println("2) Ingrese su DNI: \n");
        int dni = input.nextInt();
        PersonaNueva.setNumIdentificacion(dni);
        System.out.println("3) Que seccion pertenece: \n");
        String seccion = input.next();
        PersonaNueva.setSeccion(seccion);

        return PersonaNueva;
    }

    public Profesor crearProfesor() {
        /**
         * Pedir todos los datos del Profesor
         */

        Scanner input = new Scanner(System.in);

        System.out.println("A continuacion se le pedirá los datos del profesor para ingresar al sistema.");
        System.out.print("Nombre: ");
        String nomb = input.next();
        System.out.print("Apellido: ");
        String apell = input.next();
        System.out.print("Estado civil: ");
        String estCivil = input.next();
        System.out.print("Numero de identificacion: ");
        int numIdent = input.nextInt();
        System.out.print("Año de incorporacion: ");
        int anioIncorp = input.nextInt();
        System.out.print("Numero de despacho: ");
        int desp = input.nextInt();
        System.out.print("Departamente asignado: ");
        String dep = input.next();
        Profesor profesor = new Profesor(dep, anioIncorp, desp, nomb, apell, estCivil, numIdent);

        return profesor;
    }

    public Estudiante ingresarEstudiante() {
        /**
         * Pedir todos los datos del Estudiante Estudiantes(int matricula,
         * String nombre, String apellidos, String estadoCivil, int
         * numIdentificacion)
         */
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        System.out.println("> >Carga de Estudiantes< <");
        System.out.print("Número de matrícula: ");
        int matricular = input.nextInt();
        System.out.print("Nombre: ");
        String nombre = input.next();
        System.out.print("Apellido: ");
        String apellido = input.next();
        System.out.print("Estado civil: ");
        String estadoCivil = input.next();
        System.out.print("Número de identificación: ");
        int numIdentificacion = input.nextInt();

        return new Estudiante(matricular, nombre, apellido, estadoCivil, numIdentificacion);
    }

    public ArrayList<Persona> listaTotalPersonas(ArrayList<Estudiante> est, ArrayList<PersonalServicio> perSer, ArrayList<Profesor> prof) {

        ArrayList<Persona> listaTotalPersonas = new ArrayList();

        listaTotalPersonas.addAll(est);
        listaTotalPersonas.addAll(perSer);
        listaTotalPersonas.addAll(prof);

        return listaTotalPersonas;
    }

    public void cambiarDepartamento() {
        System.out.print("Ingrese el nuevo departamento del profesor: ");

    }

    public void menuFacultad() {

        /**
         * Crearemos un MENU para ACCEDER a todos los metodos del Servicio lo
         * que pide el ejercicio y los que implemente yo(edu, el emperador) y si
         * gustan agregar mas sin problema.
         */
        /*
        
         */
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        int var;// ARRAYS 
        ArrayList< Estudiante> estudiantes = new ArrayList();
        ArrayList<PersonalServicio> personasServicio = new ArrayList();
        ArrayList<Profesor> Profesores = new ArrayList();

        do {
            System.out.println("-- SISTEMA DE GESTION DE LA FACULTAD --");
            System.out.println("OPCION 1 - Ingresar Personal de Servicio \n"
                    + "OPCION 2 - Ingresar Profesor \n"
                    + "OPCION 3 - Ingresar Estudiante \n"
                    + "OPCION 4 - Cambio de Estado Civil \n"
                    + "OPCION 5 - Reasignacion de despacho Empleados \n"
                    + "OPCION 6 - Cambio de Matricula de un Estudiante \n"
                    + "OPCION 7 - Cambio de Departamento de Profesor \n"
                    + "OPCION 8 - Nueva Seccion Personal de Servicio \n"
                    + "OPCION 9 - Lista de Todas las Personas de la Facultad \n"
                    + "OPCION 0 - Salir \n");

            var = input.nextInt();

            switch (var) {
                case 1:
                    String op2;
                    do {
                        //Estudiantes predeterminados para probar codigo
                        PersonalServicio objeto1 = new PersonalServicio("Sección A", 2018, 123, "Juan", "Gómez", "Soltero", 4567890);
                        PersonalServicio objeto2 = new PersonalServicio("Sección B", 2020, 456, "María", "López", "Casada", 9876543);

                        personasServicio.add(crearPersonalServicios()); // CARGA POR TECLADO
                        personasServicio.add(objeto1);
                        personasServicio.add(objeto2);
                        System.out.println("Ingresar otro Personal de Servicio? (si/no) ");
                        do {
                            op2 = input.next();
                        } while (!op2.equalsIgnoreCase("si") && !op2.equalsIgnoreCase("no"));
                    } while (op2.equalsIgnoreCase("si"));
                    break;
                case 2:
                    String op1;
                    do {
                        //Estudiantes predeterminados para probar codigo
                        Profesor objeto3 = new Profesor("Departamento de Matemáticas", 2015, 101, "Pedro", "González", "Casado", 1234567);
                        Profesor objeto4 = new Profesor("Departamento de Historia", 2019, 202, "Laura", "Sánchez", "Soltera", 9876543);

                        Profesores.add(crearProfesor()); // CARGA POR TECLADO
                        Profesores.add(objeto4);
                        Profesores.add(objeto3);
                        System.out.println("Ingresar otro Profesor? (si/no) ");
                        do {
                            op1 = input.next();
                        } while (!op1.equalsIgnoreCase("si") && !op1.equalsIgnoreCase("no"));
                    } while (op1.equalsIgnoreCase("si"));
                    break;
                case 3:
                    String op;
                    do {
                        estudiantes.add(ingresarEstudiante()); // CARGA POR TECLADO

                        //Estudiantes predeterminados para probar codigo
                        estudiantes.add(new Estudiante(33456, "luis", "luis2", "soltero", 123456));
                        estudiantes.add(new Estudiante(989898, "yo", "asdasuis2", "sol", 555456));
                        System.out.println("Ingresar otro estudiante? (si/no) ");
                        do {
                            op = input.next();
                        } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
                    } while (op.equalsIgnoreCase("si"));
                    break;
                case 4:
                    String opcion1;
                    System.out.println("Elija la OPCION : \n"
                            + "A - Estudiantes\n"
                            + "B - Profesores\n"
                            + "C - Personal de Servicio\n");
                    String opcion = input.next();
                    switch (opcion) {
                        case "A":
                            for (Estudiante estudiate : estudiantes) {
                                System.out.println("El Estado civil de " + estudiate + "es : " + estudiate.getEstadoCivil());
                                System.out.println("Desea cambiarlo ? (si/no) ");
                                do {
                                    opcion1 = input.next();
                                } while (!opcion1.equalsIgnoreCase("si") && !opcion1.equalsIgnoreCase("no"));
                                if (opcion1.equals("si")){
                                    System.out.println("Ingrese su nuevo Estado civil");
                                    estudiate.setEstadoCivil(input.next());
                                }
                            }
                            break;
                        case "B":
                            for (Profesor Profesore : Profesores) {
                                System.out.println("El Estado civil de " + Profesore + "es : " + Profesore.getEstadoCivil());
                                System.out.println("Desea cambiarlo ? (si/no) ");
                                do {
                                    opcion1 = input.next();
                                } while (!opcion1.equalsIgnoreCase("si") && !opcion1.equalsIgnoreCase("no"));
                                if (opcion1.equals("si")){
                                    System.out.println("Ingrese su nuevo Estado civil");
                                    Profesore.setEstadoCivil(input.next());
                                }
                            }
                            break;
                        case "C":
                            for (PersonalServicio perServ : personasServicio) {
                                System.out.println("El Estado civil de " + perServ + "es : " + perServ.getEstadoCivil());
                                System.out.println("Desea cambiarlo ? (si/no) ");
                                do {
                                    opcion1 = input.next();
                                } while (!opcion1.equalsIgnoreCase("si") && !opcion1.equalsIgnoreCase("no"));
                                if (opcion1.equals("si")){
                                    System.out.println("Ingrese su nuevo Estado civil");
                                    perServ.setEstadoCivil(input.next());
                                }
                            }
                            break;
                        default:
                            System.out.println("Ingrese mal la opcion");
                    }
                case 5:
                    
                    

                case 6:
                    do {
                        System.out.print("Número de identificación de estudiante a realizar rematriculación: ");
                        int ident = input.nextInt();
                        boolean esta = false;
                        for (Estudiante estudiante : estudiantes) {
                            if (estudiante.getNumIdentificacion() == ident) {
                                System.out.print("Nueva matrícula: ");
                                estudiante.setMatricula(input.nextInt());
                                esta = true;
                            }
                        }
                        if (esta) {
                            System.out.println("Rematricular otro estudiante? (si/no) ");
                            do {
                                op = input.next();
                            } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
                        } else {
                            System.out.println("El número de identificaión no corresponde a ningún estudiante");
                            System.out.println("Buscar otro estudiante? ");
                            do {
                                op = input.next();
                            } while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no"));
                        }

                    } while (op.equalsIgnoreCase("si"));
                    break;
                case 7:
                    cambiarDepartamento();
                case 8:

                case 9:
                    ArrayList<Persona> list = listaTotalPersonas(estudiantes, personasServicio, Profesores);
                    for (Persona listaTotalPersona : list) {
                        System.out.println(listaTotalPersona.toString());
                    }
                    break;
                case 0:
                    System.out.println("Nos vemos...");
                    break;
                default:
                    System.out.println("Ingreso mal la OPCION vuelva a ingresar.");
                    throw new AssertionError();
            }
        } while (var != 0);

    }
}



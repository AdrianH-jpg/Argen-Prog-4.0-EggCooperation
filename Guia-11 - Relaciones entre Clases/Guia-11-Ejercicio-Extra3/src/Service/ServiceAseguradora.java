/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Entity.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import poliza.Poliza;
import vehiculo.Vehiculo;

/**
 *
 * @author Adrian H
 */
public class ServiceAseguradora {
     public Cliente ingresoClientes(){
        Scanner leer = new Scanner(System.in);
        Cliente cliente = new Cliente();
        
        /**
         * Nombre
         * Apellido
         * Mail
         * DNI
         * Domicilio
         * Telefono
         */
        
        System.out.println("Ingrese el Nombre del Cliente : ");
        cliente.setNombre(leer.nextLine());
        System.out.println("Ingrese el Apellido del Cliente : ");
        cliente.setApellido(leer.nextLine());
        System.out.println("Ingrese el Mail del Cliente : ");
        cliente.setMail(leer.nextLine());
        System.out.println("Ingrese el DNI del Cliente : ");
        cliente.setDni(leer.nextInt());
        System.out.println("Ingrese el Domicilio del Cliente : ");
        cliente.setDomicilio(leer.nextInt());
        System.out.println("Ingrese el Telefono del Cliente : ");
        cliente.setTelefono(leer.nextInt());
        
        return cliente;
    }
    
    public Vehiculo ingresoVehiculo(){
        Scanner leer = new Scanner(System.in);
        Vehiculo vehiculo = new Vehiculo();

        
        System.out.println("Ingrese el Marca del Vehiculo : ");
        vehiculo.setMarca(leer.nextLine());
        System.out.println("Ingrese el Modelo del Vehiculo : ");
        vehiculo.setModelo(leer.nextLine());
        System.out.println("Ingrese el Color del Vehiculo : ");
        vehiculo.setColor(leer.nextLine());
        System.out.println("Ingrese el Tipo del Vehiculo : ");
        vehiculo.setTipo(leer.nextLine());
        System.out.println("Ingrese el Chasis del Vehiculo : ");
        vehiculo.setChasis(leer.nextLine());
        System.out.println("Ingrese el Año del Vehiculo : ");
        vehiculo.setAnio(leer.nextInt());
        System.out.println("Ingrese el Numero del Motor del Vehiculo : ");
        vehiculo.setNumMotor(leer.nextInt());
        
        return vehiculo;
        
    }
    
    public Poliza ingresoPoliza(){
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Poliza poliza = new Poliza();
        String resp2;
        
        
        System.out.println("Ingrese la FECHA de INICIO de la Poliza (en formato dd/MM/yyyy):");
        /**
         * Para TRABAJAR CON DATE este quilombo... 
         */
        boolean fechaValida = false;
        do {
            String fechaInicioStr = leer.nextLine();

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fechaInicio = dateFormat.parse(fechaInicioStr);
                System.out.println("Fecha de inicio de la póliza: " + fechaInicio);
                fechaValida = true;
                poliza.setfInicio(fechaInicio);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Ingrese nuevamente:");
            }
        } while (!fechaValida);
        
        System.out.println("Ingrese la FECHA de FIN de la Poliza (en formato dd/MM/yyyy):");
        /**
         * Para TRABAJAR CON DATE este quilombo... 
         */
        fechaValida = false;
        do {
            String fechaInicioStr = leer.nextLine();
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            try {
                Date fechaFin = dateFormat.parse(fechaInicioStr);
                System.out.println("Fecha de inicio de la póliza: " + fechaFin);
                fechaValida = true;
                poliza.setfFin(fechaFin);
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido. Ingrese nuevamente:");
            }
        } while (!fechaValida);
        
        System.out.println("Ingrese Tipo de cobertura : ");
        poliza.setTipoCobertura(leer.nextLine());
        System.out.println("Ingrese Monto Asegurado : ");
        poliza.setMontoAsegurado(leer.nextInt());
        System.out.println("Desea Cobertura Granizo ? S/N : ");
        resp2 = leer.next().toUpperCase();
        if (resp2.equals("S")){
            poliza.setGranizo(true);
            System.out.println("Ingrese el Monto MAXIMO de Cobertura Granizo : ");
            poliza.setMontoMaxGranizo(leer.nextInt());
        }
        /**
         * NUMERO DE POLIZA GENERADO AUTOMATICAMENTE
         */
        Random random = new Random();
        int min = 00000000; // El número mínimo de 8 dígitos (10000000)
        int max = 99999999; // El número máximo de 8 dígitos (99999999)
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Su NUMERO de poliza es : " + randomNumber);
        
        /**
         * INGRESO DE LA COUTA 
         */
        poliza.setCoutas();
        
        return poliza;
    }
}

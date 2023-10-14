package guia.pkg13.ejercicio6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adrian H
 */
public class MioException extends Exception {

    /**
     * Creates a new instance of <code>MioException</code> without detail
     * message.
     */
    public MioException() {
    }

    /**
     * Constructs an instance of <code>MioException</code> with the specified
     * detail message.
     * @param msg the detail message.
     */
    public MioException(String msg) {
        super(msg);
    }
}

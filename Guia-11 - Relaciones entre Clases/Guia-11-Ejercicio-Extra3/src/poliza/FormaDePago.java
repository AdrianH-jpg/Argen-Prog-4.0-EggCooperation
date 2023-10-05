/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliza;

/**
 *
 * @author Adrian H
 */
public class FormaDePago {
    private final String efectivo = "Efectivo";
    private final String transBanca = "Transferencia bancaria";
    private final String tarjeBanca = "Tarjeta de crédito";
    private final String devAuto = "Débito automático";
    private final String pagoLinea = "Pago en línea";

    public FormaDePago() {
        
    }

    public String getEfectivo() {
        return efectivo;
    }

    public String getTransBanca() {
        return transBanca;
    }

    public String getTarjeBanca() {
        return tarjeBanca;
    }

    public String getDevAuto() {
        return devAuto;
    }

    public String getPagoLinea() {
        return pagoLinea;
    }
}

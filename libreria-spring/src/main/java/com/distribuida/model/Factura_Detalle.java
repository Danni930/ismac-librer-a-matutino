package com.distribuida.model;

public class Factura_Detalle {
    private int idFcatura;
    private String cantidad;
    private String subtotal;

    public Factura_Detalle() {
    }

    public Factura_Detalle(int idFcatura, String cantidad, String subtotal) {
        this.idFcatura = idFcatura;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getIdFcatura() {
        return idFcatura;
    }

    public void setIdFcatura(int idFcatura) {
        this.idFcatura = idFcatura;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(String subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "Factura_Detalle{" +
                "idFcatura=" + idFcatura +
                ", cantidad='" + cantidad + '\'' +
                ", subtotal='" + subtotal + '\'' +
                '}';
    }
}

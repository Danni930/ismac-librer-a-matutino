package com.distribuida.model;

import com.distribuida.entities.Cliente;

public class ClientePrincipal {
    public static void  main(String[] args){
        Cliente cliente = new Cliente(1, "1726698267", "Juan", "Taipe","av.tumbaco", "0996889257", "ralbuja78@gmail.com" );
        System.out.print(cliente.toString());

    }
}

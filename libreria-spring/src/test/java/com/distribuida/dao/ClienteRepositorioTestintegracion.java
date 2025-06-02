package com.distribuida.dao;

import com.distribuida.model.Cliente;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import jakarta.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Transactional
@Rollback(value = false)
public class ClienteRepositorioTestIntegracion {

    @Autowired // Anotación para inyectar dependencias
    private ClienteRepository clienteRepository;

    @Test
    public void findAll() {
        List<Cliente> clientes = clienteRepository.findAll();
        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void findOne() {
        Optional<Cliente> cliente = clienteRepository.findById(1);
        System.out.println(cliente.toString());
    }

    @Test
    public void save(){
        Cliente cliente = new Cliente(0,"1755804091","maria","TAP","Av.XD","09999999","mar@gmail.com");
        clienteRepository.save(cliente);
    }




    @Test
    public  void update(){
        Optional<Cliente> cliente = clienteRepository.findById(39);
        cliente.orElse(null).setCedula("22222222");
        cliente.orElse(null).setNombre("maria2");
        cliente.orElse(null).setApellido("TPS");
        cliente.orElse(null).setDireccion("Av.XD");
        cliente.orElse(null).setTelefono("099999");
        cliente.orElse(null).setCorreo("jaj@gmail.com");


        clienteRepository.save(cliente.orElse(null));
    }


}

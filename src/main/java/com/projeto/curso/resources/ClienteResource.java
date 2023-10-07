package com.projeto.curso.resources;

import com.projeto.curso.domain.Cliente;
import com.projeto.curso.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/clientes")
public class ClienteResource {
    @Autowired
    private ClienteService serviceCliente;

    @RequestMapping(value = "/{id}",method =RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id){
        Cliente obj = serviceCliente.buscar(id);

        return ResponseEntity.ok().body(obj);

    }
}

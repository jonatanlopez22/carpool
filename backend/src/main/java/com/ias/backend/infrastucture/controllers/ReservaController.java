package com.ias.backend.infrastucture.controllers;

import com.ias.backend.domain.Reserva;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.ias.backend.repository.ReservaRepository;

@RestController
public class ReservaController {
    
    private ReservaRepository reservaRepository;

    public ReservaController(ReservaRepository _reservaRepository){
        this.reservaRepository = _reservaRepository;
    }


    @PostMapping
    @RequestMapping("/createreserva")
    public ResponseEntity<Reserva> createReserva(@RequestBody Reserva reserva){
        return new ResponseEntity<Reserva>(reservaRepository.save(reserva), HttpStatus.CREATED);
    }


    @GetMapping
    @RequestMapping("/leareserba")
    public ResponseEntity<Iterable<Reserva>> readReserva(@RequestParam(name="user") String user){
        return new ResponseEntity<Iterable<Reserva>>(reservaRepository.findByPrestadorUsername(user), HttpStatus.ACCEPTED);
    }

    @DeleteMapping(value="/eliminar/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
     
     public void deleteById(@PathVariable int id){
       reservaRepository.deleteById(id);
   
   }

    @GetMapping
    @RequestMapping("/leareserbaU")
    public ResponseEntity<Iterable<Reserva>> readReservaU(@RequestParam(name="user") String user){
        return new ResponseEntity<Iterable<Reserva>>(reservaRepository.findByTomadorUsername(user), HttpStatus.ACCEPTED);
    }

}

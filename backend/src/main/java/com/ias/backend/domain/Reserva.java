package com.ias.backend.domain;

import lombok.Data;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name = "tbl_app_reserva")
@Data
public class Reserva {
  
@Id 
@GeneratedValue(strategy = GenerationType.AUTO) 
private int id;
@ManyToOne
private User tomador;
@ManyToOne
private User prestador;

private LocalDate fechaReserva;

public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public User getTomador() {
    return tomador;
}
public void setTomador(User tomador) {
    this.tomador = tomador;
}
public User getPrestador() {
    return prestador;
}
public void setPrestador(User prestador) {
    this.prestador = prestador;
}
public LocalDate getFechaReserva() {
    return fechaReserva;
}
public void setFechaReserva(LocalDate fechaReserva) {
    this.fechaReserva = fechaReserva;
}

}

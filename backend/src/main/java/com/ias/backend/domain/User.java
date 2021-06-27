package com.ias.backend.domain;

import lombok.Data;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "tbl_app_user",indexes = {@Index(name="user1",columnList ="username", unique = true)})
@Data

public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    @Column(unique=true)
    private String username;
    private String password;
    private String phone;
    private int rol;
    private int cupos;
    private float longit;
    private float latit;
    private String inicioR;
    private String finR;
    private String sentido;
    private String tarifa;
    private String direccion;
    private String horaInicio;
    private String horaFin;


    @OneToMany
    private Set<Reserva> prestadores;
    @OneToMany
    private Set<Reserva> tomadores;

   
  
    public Set<Reserva> getPrestadores() {
        return prestadores;
    }
    public String getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }
    public String getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public void setPrestadores(Set<Reserva> prestadores) {
        this.prestadores = prestadores;
    }
    public Set<Reserva> getTomadores() {
        return tomadores;
    }
    public void setTomadores(Set<Reserva> tomadores) {
        this.tomadores = tomadores;
    }
    public String getTarifa() {
        return tarifa;
    }
    public void setTarifa(String tarifa) {
        this.tarifa = tarifa;
    }
    public int getRol() {
        return rol;
    }
    public int getCupos() {
        return cupos;
    }
    public void setCupos(int cupos) {
        this.cupos = cupos;
    }
    public float getLongit() {
        return longit;
    }
    public void setLongit(float longit) {
        this.longit = longit;
    }
    public float getLatit() {
        return latit;
    }
    public void setLatit(float latit) {
        this.latit = latit;
    }
    public String getSentido() {
        return sentido;
    }
    public void setSentido(String sentido) {
        this.sentido = sentido;
    }
    public String getFinR() {
        return finR;
    }
    public void setFinR(String finR) {
        this.finR = finR;
    }
    public String getInicioR() {
        return inicioR;
    }
    public void setInicioR(String inicioR) {
        this.inicioR = inicioR;
    }
    public void setRol(int rol) {
        this.rol = rol;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}

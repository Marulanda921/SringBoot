package com.Taller.TallerSpring.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;



@Table(name = "Tarea")
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    private int id;
    
    @Column(length = 100, nullable = false)
    private String titulo;

    @Column(length = 255, nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private LocalDate fechaCreacion;

    @Column (nullable = false)
    private LocalDate horaCreacion;

    @Column(length = 50, nullable = false)
    private String estado;

    public Tarea() {
    }

    public Tarea(int id, String titulo, String descripcion, LocalDate fechaCreacion, LocalDate horaCreacion,
            String estado) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fechaCreacion = fechaCreacion;
        this.horaCreacion = horaCreacion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDate getHoraCreacion() {
        return horaCreacion;
    }

    public void setHoraCreacion(LocalDate horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea [id=" + id + ", titulo=" + titulo + ", descripcion=" + descripcion + ", fechaCreacion="
                + fechaCreacion + ", horaCreacion=" + horaCreacion + ", estado=" + estado + "]";
    }

    
    

    
}

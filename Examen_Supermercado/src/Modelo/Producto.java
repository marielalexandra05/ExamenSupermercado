/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import java.io.FileInputStream;
import java.sql.Date;

/**
 *
 * @author DELL
 */
public class Producto {
    private int codigo;
    private String nombre;
     private String descripcion;
    private double precio;
    private double costo;
    private int Stock;
    private Date fecha_Ingreso;
    private Image foto;
    //-----
    private FileInputStream imagen;
    private int largo;
    private String seccionProducto;

    public Producto() {
    }

    public Producto(int codigo, String nombre, String descripcion, double precio, double costo, int Stock, Date fecha_Ingreso, Image foto, FileInputStream imagen, int largo, String seccionProducto) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.costo = costo;
        this.Stock = Stock;
        this.fecha_Ingreso = fecha_Ingreso;
        this.foto = foto;
        this.imagen = imagen;
        this.largo = largo;
        this.seccionProducto = seccionProducto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Date getFecha_Ingreso() {
        return fecha_Ingreso;
    }

    public void setFecha_Ingreso(Date fecha_Ingreso) {
        this.fecha_Ingreso = fecha_Ingreso;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public FileInputStream getImagen() {
        return imagen;
    }

    public void setImagen(FileInputStream imagen) {
        this.imagen = imagen;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getSeccionProducto() {
        return seccionProducto;
    }

    public void setSeccionProducto(String seccionProducto) {
        this.seccionProducto = seccionProducto;
    }
    
}

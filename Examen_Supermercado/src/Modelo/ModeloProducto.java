/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.imageio.ImageReadParam;
import javax.imageio.ImageReader;
import javax.imageio.stream.ImageInputStream;
import javax.swing.ImageIcon;


public class ModeloProducto extends Producto {

    ConectionPg cp = new ConectionPg();

    public ModeloProducto() {
    }

    public ModeloProducto(int codigo, String nombre, String descripcion, double precio, double costo, int Stock, Date fecha_Ingreso, Image foto, FileInputStream imagen, int largo, String seccionProducto) {
        super(codigo, nombre, descripcion, precio, costo, Stock, fecha_Ingreso, foto, imagen, largo, seccionProducto);
    }



    public List<Producto> CargarProducto() {
        List<Producto> listaProducto = new ArrayList<Producto>();
        String sql = "select * from producto";
        ResultSet rs = cp.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("Stock"));
                producto.setFecha_Ingreso(rs.getDate("fechaingreso"));
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    try {
                        producto.setFoto(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               
                
                listaProducto.add(producto);

            }
            rs.close();
            return listaProducto;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public List<Producto> TraerImagen(int in) {
        List<Producto> listaProducto = new ArrayList<Producto>();
        String sql = "select codigo, foto from producto where codigo = '"+in+"'";
        ResultSet rs = cp.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("Codigo"));
                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    try {
                        producto.setFoto(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                listaProducto.add(producto);

            }
            rs.close();
            return listaProducto;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    private Image obtenerImagen(byte[] bytes) throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bytes);
        Iterator it = ImageIO.getImageReadersByFormatName("jpeg");
        ImageReader reader = (ImageReader) it.next();
        Object source = bis;
        ImageInputStream iis = ImageIO.createImageInputStream(source);
        reader.setInput(iis, true);
        ImageReadParam param = reader.getDefaultReadParam();
        param.setSourceSubsampling(1, 1, 0, 0);
        return reader.read(0, param);
    }

    public boolean CrearProductoBy() {
        try {
            String sql = "INSERT INTO public.producto(\n"
                    + "	codigo, nombre, descripcion, costo, precio, stock, fechaingreso,foto)\n"
                    + "	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo());
            ps.setString(2, getNombre());
            ps.setDouble(3, getPrecio());
            ps.setInt(4, getStock());
            ps.setBinaryStream(5, getImagen(), getLargo());
            ps.setString(6, getDescripcion());
            ps.setString(7, getSeccionProducto());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean ModificarProductoBy() {
        try {
            String sql = "UPDATE public.producto\n"
                    + "	SET codigo=?, nombre=?, descripcion=?, costo=? ,precio=?, stock=?, fechaingreso=? ,foto=?\n"
                    + "	WHERE codigo = '" + getCodigo() + "';";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo());
            ps.setString(2, getNombre());
            ps.setString(3, getDescripcion());
            ps.setDouble(4, getCosto());
            ps.setDouble(5, getPrecio());
            ps.setInt(6, getStock());
            ps.setDate(7, getFecha_Ingreso());
            ps.setBinaryStream(8, getImagen(), getLargo());
            
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean ModificarProductoBy1() {
        try {
            String sql = "UPDATE public.producto\n"
                    + "	SET codigo=?, nombre=?, descripcion=?, costo=? ,precio=?, stock=?, fechaingreso=? ,foto=?\n"
                    + "	WHERE codigo = '" + getCodigo() + "';";
            PreparedStatement ps = cp.getCon().prepareStatement(sql);
            ps.setInt(1, getCodigo());
            ps.setString(2, getNombre());
            ps.setString(3, getDescripcion());
            ps.setDouble(4, getCosto());
            ps.setDouble(5, getPrecio());
            ps.setInt(6, getStock());
            ps.setDate(7, getFecha_Ingreso());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    public boolean crearProducto() {
        String sql = "INSERT INTO producto(\n"
                + "	codigo, nombre, descripcion, costo, precio, stock, fechaingreso)\n"
                + "	VALUES ('" + getCodigo() + "', '" + getNombre() + "', '" + getDescripcion()+ "','" + getCosto()+ "', '" + getPrecio() + "', '" + getStock() + "', '" + getFecha_Ingreso()+ "');";
        System.out.println("" + sql);
        return cp.accion(sql);
    }

    public boolean ModificarProducto() {
        String sql = "UPDATE producto\n"
                + "	SET nombre='" + getNombre() +"', descripcion='" + getDescripcion()+ "', costo='" + getCosto()+"', precio='" + getPrecio() + "', cantidad='" + getStock() + "', fechaingreso='" + getFecha_Ingreso()+ "'\n"
                + "	WHERE codigo = '" + getCodigo() + "';";
        System.out.println("" + sql);
        return cp.accion(sql);
    }

    public boolean EliminarProducto(String idproduc) {
        String sql = "delete from producto where codigo = '" + idproduc + "'";
        System.out.println("" + sql);
        return cp.accion(sql);
    }
    public List<Producto> BuscarProducto(String texto) {
        List<Producto> listaProducto = new ArrayList<Producto>();
        String sql = "select * from producto where CAST(codigo AS TEXT) LIKE '" + texto + "%' or lower(nombre) like '" + texto + "%'";
        ResultSet rs = cp.consulta(sql);
        byte[] bytea;
        try {
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("Stock"));
                producto.setFecha_Ingreso(rs.getDate("fechaingreso"));

                bytea = rs.getBytes("foto");
                if (bytea != null) {
                    //Decodificando del formato de la base.(Base64)

//                bytea=Base64.decode(bytea,0,bytea.length);
                    try {
                        producto.setFoto(obtenerImagen(bytea));
                    } catch (IOException ex) {
                        Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
               
                listaProducto.add(producto);

            }
            rs.close();
            return listaProducto;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public List<Producto> filtroBusqueda(String texto) {
        List<Producto> BuscaProducto = new ArrayList<Producto>();
//        String sql = "select * from producto where idproducto like "+'"'+texto+'"'+"_%";
        String sql = "select * from producto where CAST(codigo AS TEXT) LIKE '" + texto + "%' or lower(nombre) like '" + texto + "%'";
        ResultSet rs = cp.consulta(sql);
        try {
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setCodigo(rs.getInt("Codigo"));
                producto.setNombre(rs.getString("nombre"));
                producto.setDescripcion(rs.getString("descripcion"));
                producto.setCosto(rs.getDouble("costo"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setFecha_Ingreso(rs.getDate("fechaingreso"));
                BuscaProducto.add(producto);
            }
            rs.close();
            return BuscaProducto;
        } catch (SQLException ex) {
            Logger.getLogger(ModeloProducto.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
}

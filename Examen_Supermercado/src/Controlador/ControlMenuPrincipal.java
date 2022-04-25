/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;



import Modelo.ModeloProducto;
import Vista.MenuPrincipal;
import Vista.ViewProducto;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DELL
 */
public class ControlMenuPrincipal {
    MenuPrincipal vistamp;

    public ControlMenuPrincipal(MenuPrincipal vistamp) {
        this.vistamp = vistamp;
        vistamp.setVisible(true);
        vistamp.setLocationRelativeTo(null);

    }
    
    public void iniciaControl(){

        vistamp.getBtnCProducto().addActionListener(l -> CrudProductos());
        vistamp.getMenuCrearProducto().addActionListener(l -> CrudProductos());
        vistamp.getMenuSalirSistema().addActionListener(l -> SalirSistema());

    }
    
    
    private void CrudProductos(){
        ModeloProducto modPro = new ModeloProducto();
        ViewProducto visPro = new ViewProducto();
        vistamp.getDesktopPrincipal().add(visPro);
        ControlProducto conP = new ControlProducto(modPro, visPro);
        conP.controlBoton();
    }
   
    private void SalirSistema(){
        try {
            Thread.sleep(500);
            System.exit(0);
        } catch (InterruptedException ex) {
            Logger.getLogger(ControlMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

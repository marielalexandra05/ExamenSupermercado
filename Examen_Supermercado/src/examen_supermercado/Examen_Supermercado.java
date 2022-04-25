/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_supermercado;

import Controlador.ControlMenuPrincipal;
import Vista.MenuPrincipal;

/**
 *
 * @author HP
 */
public class Examen_Supermercado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuPrincipal mp = new MenuPrincipal();
        ControlMenuPrincipal controlmp = new ControlMenuPrincipal(mp);
        controlmp.iniciaControl();
    }
    
}

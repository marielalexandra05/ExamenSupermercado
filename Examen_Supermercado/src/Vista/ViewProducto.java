/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author DELL
 */
public class ViewProducto extends javax.swing.JInternalFrame {

    /**
     * Creates new form ViewProducto
     */
    public ViewProducto() {
        initComponents();
    }

    public JSpinner getSpnCantidadProducto() {
        return SpnCantidadProducto;
    }

    public void setSpnCantidadProducto(JSpinner SpnCantidadProducto) {
        this.SpnCantidadProducto = SpnCantidadProducto;
    }

    public JTextField getTxtBuscarProducto() {
        return TxtBuscarProducto;
    }

    public void setTxtBuscarProducto(JTextField TxtBuscarProducto) {
        this.TxtBuscarProducto = TxtBuscarProducto;
    }

    public JTextField getTxtIdProducto() {
        return TxtIdProducto;
    }

    public void setTxtIdProducto(JTextField TxtIdProducto) {
        this.TxtIdProducto = TxtIdProducto;
    }

    public JTextField getTxtPrecioProducto() {
        return TxtPrecioProducto;
    }

    public void setTxtPrecioProducto(JTextField TxtPrecioProducto) {
        this.TxtPrecioProducto = TxtPrecioProducto;
    }

    public JButton getBtnCancelarP() {
        return btnCancelarP;
    }

    public void setBtnCancelarP(JButton btnCancelarP) {
        this.btnCancelarP = btnCancelarP;
    }

    public JButton getBtnCrearProducto() {
        return btnCrearProducto;
    }

    public void setBtnCrearProducto(JButton btnCrearProducto) {
        this.btnCrearProducto = btnCrearProducto;
    }

    public JButton getBtnEditarProdcuto() {
        return btnEditarProdcuto;
    }

    public void setBtnEditarProdcuto(JButton btnEditarProdcuto) {
        this.btnEditarProdcuto = btnEditarProdcuto;
    }

    public JButton getBtnImprimirProducto() {
        return btnImprimirProducto;
    }

    public void setBtnImprimirProducto(JButton btnImprimirProducto) {
        this.btnImprimirProducto = btnImprimirProducto;
    }

    public JButton getBtnRemoverProducto() {
        return btnRemoverProducto;
    }

    public void setBtnRemoverProducto(JButton btnRemoverProducto) {
        this.btnRemoverProducto = btnRemoverProducto;
    }

    public JDialog getDlgDialogoProductos() {
        return dlgDialogoProductos;
    }

    public void setDlgDialogoProductos(JDialog dlgDialogoProductos) {
        this.dlgDialogoProductos = dlgDialogoProductos;
    }

    public JTable getTblProductos() {
        return tblProductos;
    }

    public void setTblProductos(JTable tblProductos) {
        this.tblProductos = tblProductos;
    }

    public JTextArea getTxtDescripcionProducto() {
        return txtDescripcionProducto;
    }

    public void setTxtDescripcionProducto(JTextArea txtDescripcionProducto) {
        this.txtDescripcionProducto = txtDescripcionProducto;
    }

    public JButton getBtnAceptarP() {
        return btnAceptarP;
    }

    public void setBtnAceptarP(JButton btnAceptarP) {
        this.btnAceptarP = btnAceptarP;
    }

    public JButton getBtnExaminar() {
        return BtnExaminar;
    }

    public void setBtnExaminar(JButton BtnExaminar) {
        this.BtnExaminar = BtnExaminar;
    }

    public JLabel getLblFoto() {
        return LblFoto;
    }

    public void setLblFoto(JLabel LblFoto) {
        this.LblFoto = LblFoto;
    }


    public JButton getBtnActualizar() {
        return btnActualizar;
    }

    public void setBtnActualizar(JButton btnActualizar) {
        this.btnActualizar = btnActualizar;
    }

    public JTextField getTxtNombreProducto() {
        return txtNombreProducto;
    }

    public void setTxtNombreProducto(JTextField txtNombreProducto) {
        this.txtNombreProducto = txtNombreProducto;
    }


    public JTextField getTxtCosto() {
        return TxtCosto;
    }

    public void setTxtCosto(JTextField TxtCosto) {
        this.TxtCosto = TxtCosto;
    }

    public JDateChooser getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(JDateChooser fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgDialogoProductos = new javax.swing.JDialog();
        btnAceptarP = new javax.swing.JButton();
        btnCancelarP = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        TxtIdProducto = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TxtPrecioProducto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        SpnCantidadProducto = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionProducto = new javax.swing.JTextArea();
        LblFoto = new javax.swing.JLabel();
        BtnExaminar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtCosto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fechaIngreso = new com.toedter.calendar.JDateChooser();
        txtNombreProducto = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btnCrearProducto = new javax.swing.JButton();
        btnEditarProdcuto = new javax.swing.JButton();
        btnRemoverProducto = new javax.swing.JButton();
        TxtBuscarProducto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnImprimirProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JButton();

        btnAceptarP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnAceptarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-guardar-30.png"))); // NOI18N
        btnAceptarP.setText("ACEPTAR");

        btnCancelarP.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCancelarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-cancelar-30.png"))); // NOI18N
        btnCancelarP.setText("CANCELAR");

        jLabel2.setText("Codigo");

        jLabel8.setText("Stock");

        jLabel9.setText("Descripci??n:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Precio:");

        SpnCantidadProducto.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        txtDescripcionProducto.setColumns(20);
        txtDescripcionProducto.setLineWrap(true);
        txtDescripcionProducto.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionProducto);

        LblFoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        BtnExaminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-a??adir-imagen-20.png"))); // NOI18N
        BtnExaminar.setText("Examinar");

        jLabel5.setText("Foto");

        jLabel7.setText("Fecha de Ingreso:");

        jLabel10.setText("Costo");

        txtNombreProducto.setText(" ");

        javax.swing.GroupLayout dlgDialogoProductosLayout = new javax.swing.GroupLayout(dlgDialogoProductos.getContentPane());
        dlgDialogoProductos.getContentPane().setLayout(dlgDialogoProductosLayout);
        dlgDialogoProductosLayout.setHorizontalGroup(
            dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel10))
                        .addGap(62, 62, 62)
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(btnAceptarP)
                                .addGap(35, 35, 35)
                                .addComponent(btnCancelarP))
                            .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(TxtCosto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.Alignment.LEADING)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDialogoProductosLayout.createSequentialGroup()
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDialogoProductosLayout.createSequentialGroup()
                        .addComponent(BtnExaminar)
                        .addGap(101, 101, 101))))
            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(49, 49, 49)
                                .addComponent(TxtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(188, 188, 188)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(SpnCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel5))))
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        dlgDialogoProductosLayout.setVerticalGroup(
            dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel2))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDialogoProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TxtIdProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel8)
                            .addComponent(SpnCantidadProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDialogoProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtPrecioProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))))
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(TxtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dlgDialogoProductosLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaIngreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(dlgDialogoProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAceptarP)
                            .addComponent(btnCancelarP))
                        .addGap(46, 46, 46))
                    .addGroup(dlgDialogoProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BtnExaminar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btnCrearProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCrearProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-crear-30.png"))); // NOI18N
        btnCrearProducto.setText("Crear");

        btnEditarProdcuto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEditarProdcuto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-add-product-30.png"))); // NOI18N
        btnEditarProdcuto.setText("Editar");

        btnRemoverProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnRemoverProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-eliminar-30_1.png"))); // NOI18N
        btnRemoverProducto.setText("Remover");

        jLabel1.setText("Buscar");

        btnImprimirProducto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnImprimirProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-desfibradora-30.png"))); // NOI18N
        btnImprimirProducto.setText("Imprimir");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(TxtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(btnCrearProducto)
                .addGap(28, 28, 28)
                .addComponent(btnEditarProdcuto)
                .addGap(28, 28, 28)
                .addComponent(btnRemoverProducto)
                .addGap(29, 29, 29)
                .addComponent(btnImprimirProducto)
                .addGap(13, 13, 13))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemoverProducto)
                    .addComponent(btnEditarProdcuto)
                    .addComponent(btnCrearProducto)
                    .addComponent(TxtBuscarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btnImprimirProducto))
                .addGap(19, 19, 19))
        );

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Descripci??n", "Costo", "Precio", "Stock", "Ingreso", "Foto"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));

        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8-actualizar-30.png"))); // NOI18N
        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnExaminar;
    private javax.swing.JLabel LblFoto;
    private javax.swing.JSpinner SpnCantidadProducto;
    private javax.swing.JTextField TxtBuscarProducto;
    private javax.swing.JTextField TxtCosto;
    private javax.swing.JTextField TxtIdProducto;
    private javax.swing.JTextField TxtPrecioProducto;
    private javax.swing.JButton btnAceptarP;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnCancelarP;
    private javax.swing.JButton btnCrearProducto;
    private javax.swing.JButton btnEditarProdcuto;
    private javax.swing.JButton btnImprimirProducto;
    private javax.swing.JButton btnRemoverProducto;
    private javax.swing.JDialog dlgDialogoProductos;
    private com.toedter.calendar.JDateChooser fechaIngreso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextArea txtDescripcionProducto;
    private javax.swing.JTextField txtNombreProducto;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.gm.ska.giralmotor;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import mx.com.gm.ska.giralmotor.DaoImpl.EmpresaDaoImpl;
import mx.com.gm.ska.giralmotor.config.AppConfig;
import mx.com.gm.ska.giralmotor.model.Configuracion;
import mx.com.gm.ska.giralmotor.model.Empresa;
import mx.com.gm.ska.giralmotor.modelDao.ConfiguracionDao;
import mx.com.gm.ska.giralmotor.modelDao.EmpresaDao;
import mx.com.gm.ska.giralmotor.otros.AutoCompletion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *
 * @author river
 */
public class Main2 extends javax.swing.JFrame {

    /**
     * Creates new form Main2
     */
    private static EmpresaDao empresaService;
    private static ConfiguracionDao configuracionService;

    private Empresa editEmpresa;
    private Date fechaFactura;

    private void fillEmpresasList(String nombre) {
        DefaultListModel<String> listModel = new DefaultListModel<>();
        List<Empresa> allEmpresas = empresaService.searchEmpresaByName(nombre);
        for (Empresa x : allEmpresas) {
            listModel.addElement(x.getNombre() + " - " + x.getNit());
        }
        this.empresas.setModel(listModel);
    }

    public Main2() {
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        DefaultComboBoxModel<String> comboModel2 = new DefaultComboBoxModel<>();
        initComponents();
        fillEmpresasList("");
        this.nit_createFac.setEditable(true);
        this.nombre_createFac.setEditable(true);
        List<Empresa>allEmpresas=empresaService.getAllEmpresas();
        for(Empresa e:allEmpresas){
            comboModel.addElement(e.getNombre());
        }
        AutoCompletion.enable(nombre_createFac);
        this.nit_createFac.setModel(comboModel2);
        this.nombre_createFac.setModel(comboModel);
        this.empresas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        crearEmpresaTab = new javax.swing.JPanel();
        nit = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        telefono = new javax.swing.JTextField();
        guardarEmp = new javax.swing.JToggleButton();
        empresasTab = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        empresas = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        id_viewEmpresas = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nombre_viewEmpresa = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        direccion_viewEmpresa = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        nit_viewEmpresa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        telefono_viewEmpresa = new javax.swing.JTextField();
        view_empresaActualizar = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        fieldBuscar_viewEmpresa = new javax.swing.JTextField();
        viewEmpresasBuscar = new javax.swing.JButton();
        crearFacturaTab = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        numFac_createFac = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        date_createFac = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        nombre_createFac = new javax.swing.JComboBox<>();
        jLabel19 = new javax.swing.JLabel();
        nit_createFac = new javax.swing.JComboBox<>();
        jSeparator2 = new javax.swing.JSeparator();
        configTab = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        numFac_config = new javax.swing.JTextField();
        buttonSaveConfig = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 2, 24)); // NOI18N
        jLabel1.setText("Giralmotor");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(284, 284, 284)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel2.setText("Nombre");

        jLabel3.setText("Dirección");

        jLabel4.setText("NIT - Cédula");

        jLabel5.setText("Teléfono");

        guardarEmp.setText("Guardar!");
        guardarEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarEmpMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout crearEmpresaTabLayout = new javax.swing.GroupLayout(crearEmpresaTab);
        crearEmpresaTab.setLayout(crearEmpresaTabLayout);
        crearEmpresaTabLayout.setHorizontalGroup(
            crearEmpresaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearEmpresaTabLayout.createSequentialGroup()
                .addContainerGap(264, Short.MAX_VALUE)
                .addGroup(crearEmpresaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearEmpresaTabLayout.createSequentialGroup()
                        .addGroup(crearEmpresaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(nit)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombre)
                            .addComponent(direccion)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(216, 216, 216))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearEmpresaTabLayout.createSequentialGroup()
                        .addComponent(guardarEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(270, 270, 270))))
        );
        crearEmpresaTabLayout.setVerticalGroup(
            crearEmpresaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearEmpresaTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(guardarEmp)
                .addGap(16, 16, 16))
        );

        jTabbedPane1.addTab("Crear Empresa", crearEmpresaTab);

        empresas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        empresas.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                empresasValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(empresas);

        jLabel6.setText("Empresas");

        jLabel7.setText("Edición");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel9.setText("ID");

        id_viewEmpresas.setText("id");

        jLabel10.setText("Nombre:");

        jLabel11.setText("Dirección:");

        jLabel12.setText("NIT:");

        jLabel13.setText("Teléfono:");

        view_empresaActualizar.setText("Actualizar");
        view_empresaActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                view_empresaActualizarMouseClicked(evt);
            }
        });

        jLabel14.setText("Buscar nombre:");

        viewEmpresasBuscar.setText("Buscar");
        viewEmpresasBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewEmpresasBuscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout empresasTabLayout = new javax.swing.GroupLayout(empresasTab);
        empresasTab.setLayout(empresasTabLayout);
        empresasTabLayout.setHorizontalGroup(
            empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empresasTabLayout.createSequentialGroup()
                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(empresasTabLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel6))
                            .addGroup(empresasTabLayout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(fieldBuscar_viewEmpresa))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addComponent(viewEmpresasBuscar)))
                .addGap(35, 35, 35)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empresasTabLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(view_empresaActualizar)
                        .addGap(126, 126, 126))
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(empresasTabLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(direccion_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nit_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(telefono_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(empresasTabLayout.createSequentialGroup()
                                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(empresasTabLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(id_viewEmpresas))
                                    .addComponent(jLabel10)
                                    .addGroup(empresasTabLayout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel7))
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addContainerGap(167, Short.MAX_VALUE))))))
        );
        empresasTabLayout.setVerticalGroup(
            empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(empresasTabLayout.createSequentialGroup()
                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel7))
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel6)))
                .addGap(5, 5, 5)
                .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(empresasTabLayout.createSequentialGroup()
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(id_viewEmpresas))
                        .addGap(18, 18, 18)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(nombre_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(direccion_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(nit_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(telefono_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(view_empresaActualizar)
                        .addGap(49, 49, 49))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empresasTabLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(empresasTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(fieldBuscar_viewEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(viewEmpresasBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, empresasTabLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("Ver Empresas", empresasTab);

        jLabel8.setText("Número Factura: ");

        numFac_createFac.setBackground(new java.awt.Color(0, 0, 0));
        numFac_createFac.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        numFac_createFac.setForeground(new java.awt.Color(255, 102, 0));
        numFac_createFac.setText("jLabel15");

        jLabel16.setText("Fecha Factura:");

        date_createFac.setText("jLabel17");

        jLabel18.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel18.setText("GIRALMOTOR");

        jLabel17.setText("Nombre:");

        nombre_createFac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel19.setText("NIT:");

        nit_createFac.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout crearFacturaTabLayout = new javax.swing.GroupLayout(crearFacturaTab);
        crearFacturaTab.setLayout(crearFacturaTabLayout);
        crearFacturaTabLayout.setHorizontalGroup(
            crearFacturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearFacturaTabLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(crearFacturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearFacturaTabLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(nombre_createFac, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(nit_createFac, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(crearFacturaTabLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(numFac_createFac)
                        .addGap(80, 80, 80)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(date_createFac)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(jLabel18)
                        .addGap(35, 35, 35))))
            .addGroup(crearFacturaTabLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2)
                .addContainerGap())
        );
        crearFacturaTabLayout.setVerticalGroup(
            crearFacturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearFacturaTabLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(crearFacturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(numFac_createFac)
                    .addComponent(jLabel16)
                    .addComponent(date_createFac)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(crearFacturaTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(nombre_createFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(nit_createFac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(263, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Crear Factura", crearFacturaTab);

        jLabel15.setText("Número de factura actual:");

        buttonSaveConfig.setText("Guardar Cambios");
        buttonSaveConfig.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSaveConfigMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout configTabLayout = new javax.swing.GroupLayout(configTab);
        configTab.setLayout(configTabLayout);
        configTabLayout.setHorizontalGroup(
            configTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configTabLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(numFac_config, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, configTabLayout.createSequentialGroup()
                .addContainerGap(324, Short.MAX_VALUE)
                .addComponent(buttonSaveConfig)
                .addGap(264, 264, 264))
        );
        configTabLayout.setVerticalGroup(
            configTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(configTabLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(configTabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(numFac_config, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                .addComponent(buttonSaveConfig)
                .addGap(35, 35, 35))
        );

        jTabbedPane1.addTab("Configuración", configTab);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarEmpMouseClicked
        // TODO add your handling code here:
        if (this.nit.getText().isEmpty() || this.direccion.getText().isEmpty() || this.nombre.getText().isEmpty() || this.telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Algun campo se encuentra vacio, no se registró la empresa.",
                    "Inane warning",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            Empresa e = new Empresa();
            e.setNit(this.nit.getText());
            e.setDireccion(this.direccion.getText());
            e.setNombre(this.nombre.getText());
            e.setTelefono(this.telefono.getText());
            int result = empresaService.createEmpresa(e);
            if (result == 0) {
                JOptionPane.showMessageDialog(this,
                        "El nit ya se encuentra registrado",
                        "Inane error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                this.nit.setText("");
                this.direccion.setText("");
                this.nombre.setText("");
                this.telefono.setText("");
                JOptionPane.showMessageDialog(this, "La empresa: ." + e.getNombre() + " fue creada.");
            }
        }
        this.fillEmpresasList("");
    }//GEN-LAST:event_guardarEmpMouseClicked

    private void empresasValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_empresasValueChanged
        // TODO add your handling code here:
        if (!evt.getValueIsAdjusting()) {
            JList source = (JList) evt.getSource();
            if (source.getSelectedValue() != null) {
                String selected = source.getSelectedValue().toString();
                Empresa e = empresaService.searchByNit(selected.split("-\\s")[1].trim());
                this.editEmpresa = e;
                this.nombre_viewEmpresa.setText(e.getNombre() == null ? "vacio" : e.getNombre());
                this.id_viewEmpresas.setText(e.getId().toString());
                this.nit_viewEmpresa.setText(e.getNit());
                this.direccion_viewEmpresa.setText(e.getDireccion() == null ? "vacio" : e.getDireccion());
                this.telefono_viewEmpresa.setText(e.getTelefono() == null ? "vacio" : e.getTelefono());
            }
        }
    }//GEN-LAST:event_empresasValueChanged

    private void viewEmpresasBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewEmpresasBuscarMouseClicked
        fillEmpresasList(this.fieldBuscar_viewEmpresa.getText());
    }//GEN-LAST:event_viewEmpresasBuscarMouseClicked

    private void view_empresaActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_view_empresaActualizarMouseClicked
        if (this.editEmpresa != null) {
            if (!this.nombre_viewEmpresa.getText().isEmpty() && !this.nombre_viewEmpresa.getText().equalsIgnoreCase("vacio")) {
                this.editEmpresa.setNombre(this.nombre_viewEmpresa.getText());
            }
            if (!this.nit_viewEmpresa.getText().isEmpty() && !this.nit_viewEmpresa.getText().equalsIgnoreCase("vacio")) {
                this.editEmpresa.setNit(this.nit_viewEmpresa.getText());
            }
            if (!this.direccion_viewEmpresa.getText().isEmpty() && !this.direccion_viewEmpresa.getText().equalsIgnoreCase("vacio")) {
                this.editEmpresa.setDireccion(this.direccion_viewEmpresa.getText());
            }
            if (!this.telefono_viewEmpresa.getText().isEmpty() && !this.telefono_viewEmpresa.getText().equalsIgnoreCase("vacio")) {
                this.editEmpresa.setTelefono(this.telefono_viewEmpresa.getText());
            }
            empresaService.updateEmpresa(editEmpresa);
            JOptionPane.showMessageDialog(this, "La empresa: ." + this.editEmpresa.getNit() + " fue actualizada.");
        }
    }//GEN-LAST:event_view_empresaActualizarMouseClicked

    private void buttonSaveConfigMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSaveConfigMouseClicked
        try {

            int number = Integer.parseInt(this.numFac_config.getText());
            if (configuracionService.getConf() == null) {
                configuracionService.setIndex(number);
                JOptionPane.showMessageDialog(this, "Configuración guardada");
            } else {
                if (number < configuracionService.getConf().getIndex()) {
                    configuracionService.setIndex(number);
                    JOptionPane.showMessageDialog(this, "Configuración guardada");
                } else {
                    JOptionPane.showMessageDialog(this,
                            "El número no puede ser menor al actual",
                            "Inane error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "El número es invalido",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_buttonSaveConfigMouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        if (this.configTab.isVisible()) {
            //tab configuracion clicked
            Configuracion c = configuracionService.getConf();
            if (c == null) {
                this.numFac_config.setText("Num factura no definido");
            } else {
                this.numFac_config.setText(c.getIndex() + "");
            }
        }
        if (this.crearFacturaTab.isVisible()) {
            Configuracion c = configuracionService.getConf();
            this.fechaFactura = new Date();
            SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
            this.date_createFac.setText(dt.format(fechaFactura));
            if (c == null) {
                this.numFac_createFac.setText("Num fac no establecido");
            } else {
                this.numFac_createFac.setText(c.getIndex() + "");
            }
        }
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        empresaService = (EmpresaDao) appContext.getBean(EmpresaDao.class);
        configuracionService = (ConfiguracionDao) appContext.getBean(ConfiguracionDao.class);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonSaveConfig;
    private javax.swing.JPanel configTab;
    private javax.swing.JPanel crearEmpresaTab;
    private javax.swing.JPanel crearFacturaTab;
    private javax.swing.JLabel date_createFac;
    private javax.swing.JTextField direccion;
    private javax.swing.JTextField direccion_viewEmpresa;
    private javax.swing.JList<String> empresas;
    private javax.swing.JPanel empresasTab;
    private javax.swing.JTextField fieldBuscar_viewEmpresa;
    private javax.swing.JToggleButton guardarEmp;
    private javax.swing.JLabel id_viewEmpresas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField nit;
    private javax.swing.JComboBox<String> nit_createFac;
    private javax.swing.JTextField nit_viewEmpresa;
    private javax.swing.JTextField nombre;
    private javax.swing.JComboBox<String> nombre_createFac;
    private javax.swing.JTextField nombre_viewEmpresa;
    private javax.swing.JTextField numFac_config;
    private javax.swing.JLabel numFac_createFac;
    private javax.swing.JTextField telefono;
    private javax.swing.JTextField telefono_viewEmpresa;
    private javax.swing.JButton viewEmpresasBuscar;
    private javax.swing.JButton view_empresaActualizar;
    // End of variables declaration//GEN-END:variables
}

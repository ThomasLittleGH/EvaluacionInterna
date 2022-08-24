/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planernutricional;

import java.sql.Statement;
import java.sql.ResultSet;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lab
 */
public class main extends javax.swing.JFrame implements ActionListener {

    // Definición de arreglos
    private List<JButton> botones = new ArrayList<>(), bCalorias, bProteinas, bCarbohidratos, bVitA, bVitC, bVitK, bFibra, bCalcio; // Con el fin de optimizar el destacamiento de botones los organizo en arreglos una vez inicie la aplicación
    private List<JProgressBar> barras;

    // Creo a conexion con la base de datos
    conectarBD conBD = new conectarBD();
    Connection conn = conBD.conexion();
    querier query = new querier();

    // Definicion de variables
    fraCrearUsuario crearUsuario;
    boolean darkMode = true, barraColoreada = false;
    int periodo, periodoPrevio;

    public main() {
        // LLamo a metodos que crean los arreglos necesarios basados en los datos de la base de datos
        conBD.crearArrayAlimentos();
        conBD.crearArrayUsuarios();
        conBD.crearArrayDatosNutricionales();
        // Valido la existencia de un usuario para evitar errores
        validateUserExistance();
        // Establesco el modo oscuro de la ventana como el predeterminado
        setDarkMode();
        // Inicializo los componentes
        initComponents();

        // LLamo a un metodo que junta todas las barras para una edicion mas facil y acotada
        crearArregloBarras();
        // Utilizando los datos del arreglo alimentos creo un boton para cado elemento y lo muestro en pantalla
        crearBoton();
        // Inicializo el combobox y configuro las barras para mostrar los balores indicados
        initComboboxUsuarios();
        initBarrasMetasNutricionales();
        // Ordeno los botones en arreglos especificos para optimizar el proceso de destacamiento cuando sea requerido
        ordenarBotonesEnArreglos();
        // Una vez los botones han sido creados modifico sus colores para que sean mas simples a la vista
        formatearColorBotones();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        lblAviso = new javax.swing.JTabbedPane();
        panMain = new javax.swing.JPanel();
        panBoton = new javax.swing.JPanel();
        btnRun = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnDescartarCambios = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        panAlimentos = new javax.swing.JPanel();
        panNutrientes = new javax.swing.JPanel();
        barCaloria = new javax.swing.JProgressBar();
        barProteina = new javax.swing.JProgressBar();
        barVitaminaA = new javax.swing.JProgressBar();
        barCarbohidrato = new javax.swing.JProgressBar();
        barVitaminaC = new javax.swing.JProgressBar();
        barCalcio = new javax.swing.JProgressBar();
        barVitaminaK = new javax.swing.JProgressBar();
        barFibra = new javax.swing.JProgressBar();
        btnMostrarBotonesCalorias = new javax.swing.JButton();
        btnMostrarBotonesFibra = new javax.swing.JButton();
        btnMostrarBotonesVitK = new javax.swing.JButton();
        btnMostrarBotonesCalcio = new javax.swing.JButton();
        btnMostrarBotonesVitC = new javax.swing.JButton();
        btnMostrarBotonesCarbohidratos = new javax.swing.JButton();
        btnMostrarBotonesProteinas = new javax.swing.JButton();
        btnMostrarBotonesVitA = new javax.swing.JButton();
        btnReestablecerColoresBotones = new javax.swing.JButton();
        panConfig = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        cmbUsuarios = new javax.swing.JComboBox<>();
        btnRefrescar = new javax.swing.JButton();
        cboxLightMode = new javax.swing.JCheckBox();
        btnCrearUsuario = new javax.swing.JButton();
        lblDiasPorPeriodo = new javax.swing.JLabel();
        spnDiasPeriodo = new javax.swing.JSpinner();
        btnConfirmarDuracionPeriodo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblAlimentos = new javax.swing.JTable();
        btnExportAlimentos = new javax.swing.JButton();
        btnImportAlimentos = new javax.swing.JButton();
        btnCargarBD = new javax.swing.JButton();

        jToggleButton1.setText("jToggleButton1");

        jScrollPane2.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Planner Nutricional");
        setName("fraBase"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(1309, 716));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        lblAviso.setToolTipText("");
        lblAviso.setPreferredSize(new java.awt.Dimension(1280, 720));

        panMain.setPreferredSize(new java.awt.Dimension(1280, 720));
        panMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRun.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        btnRun.setText("TERMINAR PERIODO");
        btnRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRunActionPerformed(evt);
            }
        });
        panBoton.add(btnRun, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 0, 430, 120));

        btnClear.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        btnClear.setText("REINICIAR PERIODO");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        panBoton.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 0, 430, 120));

        btnDescartarCambios.setFont(new java.awt.Font("Krungthep", 1, 36)); // NOI18N
        btnDescartarCambios.setText("DESCARTAR CAMBIOS");
        btnDescartarCambios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDescartarCambiosActionPerformed(evt);
            }
        });
        panBoton.add(btnDescartarCambios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 120));

        panMain.add(panBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, 1280, 120));

        jScrollPane1.setBorder(null);

        panAlimentos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Lucida Grande", 1, 24))); // NOI18N
        panAlimentos.setLayout(new java.awt.GridLayout(0, 5));
        jScrollPane1.setViewportView(panAlimentos);

        panMain.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 530));

        panNutrientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Segoe UI", 1, 24))); // NOI18N

        barCaloria.setForeground(new java.awt.Color(0, 204, 204));
        barCaloria.setToolTipText("");
        barCaloria.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barProteina.setForeground(new java.awt.Color(0, 204, 204));
        barProteina.setToolTipText("");
        barProteina.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barVitaminaA.setForeground(new java.awt.Color(0, 204, 204));
        barVitaminaA.setToolTipText("");
        barVitaminaA.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barCarbohidrato.setForeground(new java.awt.Color(0, 204, 204));
        barCarbohidrato.setToolTipText("");
        barCarbohidrato.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barVitaminaC.setForeground(new java.awt.Color(0, 204, 204));
        barVitaminaC.setToolTipText("");
        barVitaminaC.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barCalcio.setForeground(new java.awt.Color(0, 204, 204));
        barCalcio.setToolTipText("");
        barCalcio.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barVitaminaK.setForeground(new java.awt.Color(0, 204, 204));
        barVitaminaK.setToolTipText("");
        barVitaminaK.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        barFibra.setForeground(new java.awt.Color(0, 204, 204));
        barFibra.setToolTipText("");
        barFibra.setBorder(javax.swing.BorderFactory.createTitledBorder(null));

        btnMostrarBotonesCalorias.setText("Destacar Alimentos");
        btnMostrarBotonesCalorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesCaloriasActionPerformed(evt);
            }
        });

        btnMostrarBotonesFibra.setText("Destacar Alimentos");
        btnMostrarBotonesFibra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesFibraActionPerformed(evt);
            }
        });

        btnMostrarBotonesVitK.setText("Destacar Alimentos");
        btnMostrarBotonesVitK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesVitKActionPerformed(evt);
            }
        });

        btnMostrarBotonesCalcio.setText("Destacar Alimentos");
        btnMostrarBotonesCalcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesCalcioActionPerformed(evt);
            }
        });

        btnMostrarBotonesVitC.setText("Destacar Alimentos");
        btnMostrarBotonesVitC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesVitCActionPerformed(evt);
            }
        });

        btnMostrarBotonesCarbohidratos.setText("Destacar Alimentos");
        btnMostrarBotonesCarbohidratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesCarbohidratosActionPerformed(evt);
            }
        });

        btnMostrarBotonesProteinas.setText("Destacar Alimentos");
        btnMostrarBotonesProteinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesProteinasActionPerformed(evt);
            }
        });

        btnMostrarBotonesVitA.setText("Destacar Alimentos");
        btnMostrarBotonesVitA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarBotonesVitAActionPerformed(evt);
            }
        });

        btnReestablecerColoresBotones.setText("Reestablecer colores alimentos");
        btnReestablecerColoresBotones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReestablecerColoresBotonesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panNutrientesLayout = new javax.swing.GroupLayout(panNutrientes);
        panNutrientes.setLayout(panNutrientesLayout);
        panNutrientesLayout.setHorizontalGroup(
            panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNutrientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(barCalcio, javax.swing.GroupLayout.DEFAULT_SIZE, 291, Short.MAX_VALUE)
                    .addComponent(barFibra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barVitaminaK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barVitaminaC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barVitaminaA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barCarbohidrato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barProteina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(barCaloria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMostrarBotonesCalcio)
                    .addComponent(btnMostrarBotonesFibra)
                    .addComponent(btnMostrarBotonesVitK)
                    .addComponent(btnMostrarBotonesVitC)
                    .addComponent(btnMostrarBotonesCarbohidratos)
                    .addComponent(btnMostrarBotonesVitA)
                    .addComponent(btnMostrarBotonesProteinas)
                    .addComponent(btnMostrarBotonesCalorias))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(btnReestablecerColoresBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panNutrientesLayout.setVerticalGroup(
            panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panNutrientesLayout.createSequentialGroup()
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrarBotonesCalorias)
                    .addComponent(barCaloria, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barProteina, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesProteinas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barCarbohidrato, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesCarbohidratos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(barVitaminaA, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesVitA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMostrarBotonesVitC)
                    .addComponent(barVitaminaC, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barVitaminaK, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesVitK, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barFibra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesFibra, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panNutrientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barCalcio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMostrarBotonesCalcio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnReestablecerColoresBotones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panMain.add(panNutrientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 490, 390));

        panConfig.setBorder(javax.swing.BorderFactory.createTitledBorder(null, null, null, null, new java.awt.Font("Lucida Grande", 1, 24))); // NOI18N

        lblUsuario.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");

        cmbUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuariosActionPerformed(evt);
            }
        });

        btnRefrescar.setText("ADMIN PANEL");
        btnRefrescar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefrescarActionPerformed(evt);
            }
        });

        cboxLightMode.setText("Light Mode");
        cboxLightMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxLightModeActionPerformed(evt);
            }
        });

        btnCrearUsuario.setText("Crear usuario");
        btnCrearUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearUsuarioActionPerformed(evt);
            }
        });

        lblDiasPorPeriodo.setText("Dias por periodo:");

        spnDiasPeriodo.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnDiasPeriodoStateChanged(evt);
            }
        });

        btnConfirmarDuracionPeriodo.setText("Confirmar");
        btnConfirmarDuracionPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmarDuracionPeriodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panConfigLayout = new javax.swing.GroupLayout(panConfig);
        panConfig.setLayout(panConfigLayout);
        panConfigLayout.setHorizontalGroup(
            panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConfigLayout.createSequentialGroup()
                        .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panConfigLayout.createSequentialGroup()
                                .addComponent(lblUsuario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cmbUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cboxLightMode, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRefrescar, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(btnCrearUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(82, 82, 82))
                    .addGroup(panConfigLayout.createSequentialGroup()
                        .addComponent(lblDiasPorPeriodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnDiasPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnConfirmarDuracionPeriodo)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panConfigLayout.setVerticalGroup(
            panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panConfigLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearUsuario)
                    .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblUsuario)
                        .addComponent(cmbUsuarios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxLightMode, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefrescar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panConfigLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDiasPorPeriodo)
                    .addComponent(spnDiasPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfirmarDuracionPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        panMain.add(panConfig, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 0, 490, 150));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        jLabel1.setText("AVISO: El guardado es automatico y ocurre SOLO cuando se cierra la aplicación");
        panMain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 650, 750, 20));

        lblAviso.addTab("MAIN", panMain);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setText("Base de Datos -- Alimentos");

        tblAlimentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Calorias", "Proteinas", "Carbohidratos", "Vitamina A", "Vitamina C", "Vitamina K", "Fibra", "Calcio"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblAlimentos.setEnabled(false);
        jScrollPane4.setViewportView(tblAlimentos);
        if (tblAlimentos.getColumnModel().getColumnCount() > 0) {
            tblAlimentos.getColumnModel().getColumn(0).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(1).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(2).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(3).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(4).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(5).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(6).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(7).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(8).setResizable(false);
            tblAlimentos.getColumnModel().getColumn(9).setResizable(false);
        }

        btnExportAlimentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnExportAlimentos.setText("EXPORTAR BASE DE DATOS A EXCEL");
        btnExportAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExportAlimentosActionPerformed(evt);
            }
        });

        btnImportAlimentos.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnImportAlimentos.setText("IMPORTAR BASE DE DATOS DESDE EXCEL");
        btnImportAlimentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImportAlimentosActionPerformed(evt);
            }
        });

        btnCargarBD.setText("Cargar Base de Datos");
        btnCargarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnImportAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnExportAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCargarBD)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 1272, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCargarBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 563, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnImportAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExportAlimentos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(48, 48, 48)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(87, Short.MAX_VALUE)))
        );

        lblAviso.addTab("IMPORTAR / EXPORTAR BASES DE DATOS - NO IMPLEMENTADO", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 1303, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblAviso, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void restablecerValoresBarra() {
        // Reviso cada elemento en el arreglo barras y reestablezo su valor
        for (JProgressBar barra : barras) {
            barra.setValue(0);
        }
    }

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Una vez termina el periodo señalado por el usuario, o, una vez este quiera resetear sus datos, reestablesco todos los valores y sus configuraciones para luego guardarlos en la base de datos
        formatearColorBotones();
        formatearColorBarra();
        restablecerValoresBarra();
        guardarDatosUsuario();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRunActionPerformed
        // Al finalizar el dia guardo los datos ingresados por el usuario, coloreo las barras dependiendo de su progreso para su meta, y le muestro feedback
        guardarDatosUsuario();

        colorearBarras();
        try {
            presentarFeedbackAlUsuario();
        } catch (SQLException ex) {
            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnRunActionPerformed

    private void btnMostrarBotonesCaloriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesCaloriasActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bCalorias);
    }//GEN-LAST:event_btnMostrarBotonesCaloriasActionPerformed

    private void btnMostrarBotonesFibraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesFibraActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bFibra);
    }//GEN-LAST:event_btnMostrarBotonesFibraActionPerformed

    private void btnMostrarBotonesVitKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesVitKActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bVitK);
    }//GEN-LAST:event_btnMostrarBotonesVitKActionPerformed

    private void btnMostrarBotonesCalcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesCalcioActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bCalcio);
    }//GEN-LAST:event_btnMostrarBotonesCalcioActionPerformed

    private void btnMostrarBotonesVitCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesVitCActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bVitC);
    }//GEN-LAST:event_btnMostrarBotonesVitCActionPerformed

    private void btnMostrarBotonesCarbohidratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesCarbohidratosActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bCarbohidratos);
    }//GEN-LAST:event_btnMostrarBotonesCarbohidratosActionPerformed

    private void btnMostrarBotonesProteinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesProteinasActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bProteinas);
    }//GEN-LAST:event_btnMostrarBotonesProteinasActionPerformed

    private void btnMostrarBotonesVitAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarBotonesVitAActionPerformed
        // Formateo el estilo de los botones para que el usuario no se confunda
        formatearColorBotones();
        // Destaco los botones indicados para el usuario para que este pueda apreciar cuales aportan a su barra indicada
        colorearBotones(bVitA);
    }//GEN-LAST:event_btnMostrarBotonesVitAActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Modifico la secuencia de salida en caso de que al usuario se le haya olvidado guardar

        // Guardo los datos en la BD
        guardarDatosUsuario();

        // Cierro el programa
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void btnConfirmarDuracionPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmarDuracionPeriodoActionPerformed
        // Cambio el texto para avisarle al usuario que el cambio ha sido efectuado
        lblDiasPorPeriodo.setText("Dias por periodo:");

        // Le asigno valores a las variables previamente declaradas para que almacene el periodo nuevo y el antiguo
        periodoPrevio = periodo;
        periodo = (int) spnDiasPeriodo.getValue();

        // Llamo a un metodo que verifica el input y modifica las metas de las tablas
        ModificarMetas(periodo, periodoPrevio);
    }//GEN-LAST:event_btnConfirmarDuracionPeriodoActionPerformed

    private int ModificarMetas(int periodo, int periodoPrevio) {
        // Método que verifica que el periodo se encuentre en un rango de valores valido y ajusta las tablas acorde.
        // Utilizo un metodo para evitar nesting al introducir condiciones
        if (periodo < 1) {
            this.periodo = 1;
            spnDiasPeriodo.setValue((Object) this.periodo);
            return 0;
        }
        if (periodo > 7) {
            this.periodo = 7;
            spnDiasPeriodo.setValue((Object) this.periodo);
            return 0;
        }
        /* Multiplico las metas de las tablas por el resultado entre la division del periodo previo y el nuevo
        con el fin de aumentar o disminuir el periodo sin recurrir a operaciones complicadas*/
        float aux = ((float) this.periodo / (float) periodoPrevio);
        barras.forEach((barra) -> {
            barra.setMaximum(Math.round(barra.getMaximum() * aux));
        });
        // Actualizo los valores en la base de datos y vuelvo a crear el arreglo de metas para efectuar los cambios
        guardarDatosUsuario();
        conBD.crearArrayDatosNutricionales();
        return 0;
    }

    private void spnDiasPeriodoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnDiasPeriodoStateChanged
        // Le indico al usuario que el valor del periodo no es efectivo porque es distinto al original
        // Util cuando el usuario esta cambiando la cantidad de dias
        lblDiasPorPeriodo.setText("Dias por periodo:*");
    }//GEN-LAST:event_spnDiasPeriodoStateChanged

    private void btnCrearUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearUsuarioActionPerformed
        // Instancio un nuevo formulario que le permite al usuario crearse un perfil
        crearUsuario = new fraCrearUsuario(this);
        crearUsuario.setLocationRelativeTo(null);
        crearUsuario.setVisible(true);
    }//GEN-LAST:event_btnCrearUsuarioActionPerformed

    private void cboxLightModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxLightModeActionPerformed
        // Dependiendo de si el usuario elige modo claro u oscuro cambio el estilo del formulario
        if (cboxLightMode.isSelected()) {
            setLightMode();
        } else {
            setDarkMode();
        }

        // Reestablesco el estilo de los botones para solucionar errores visuales
        formatearColorBotones();
    }//GEN-LAST:event_cboxLightModeActionPerformed

    private void btnRefrescarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefrescarActionPerformed
        refrescarUsuarios();
    }//GEN-LAST:event_btnRefrescarActionPerformed

    public void refrescarUsuarios() {
        // Guardo los datos del usuarios para arreglos
        guardarDatosUsuario();
        // Refresco los valores y datos nutricionales para incluir a los nuevos usuarios
        conBD.crearArrayUsuarios();
        conBD.crearArrayDatosNutricionales();
        // Refresco los usuarios visibles en el comboBox
        initComboboxUsuarios();
    }

    private void cmbUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuariosActionPerformed
        // Obtengo el nuevo periodo a mostrar
        periodo = conBD.arregloUsuarios.get(getSelectedUserID(1)).getPeriodo();
        spnDiasPeriodo.setValue((Object) periodo);

        // Al combiar de perfil (o usuario) inicializo las barras nutricionales con los nuevos datos y obtengo la duracion del periodo
        initBarrasMetasNutricionales();

        // Ordeno los botones en arreglos especificos para ajustar por el cambio de usuario
        ordenarBotonesEnArreglos();
    }//GEN-LAST:event_cmbUsuariosActionPerformed

    private void btnReestablecerColoresBotonesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReestablecerColoresBotonesActionPerformed
        // Formateo el estilo de los botones
        formatearColorBotones();
    }//GEN-LAST:event_btnReestablecerColoresBotonesActionPerformed

    private void btnImportAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImportAlimentosActionPerformed

    }//GEN-LAST:event_btnImportAlimentosActionPerformed

    private void btnExportAlimentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExportAlimentosActionPerformed

    }//GEN-LAST:event_btnExportAlimentosActionPerformed

    private void btnCargarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarBDActionPerformed
        try {
            // se conecta a la BD y se ejecuta el codigo SQL 
            Statement st = conn.createStatement(); // define conexion
            ResultSet rs = st.executeQuery("SELECT * from Alimentos"); // se manda el comando
            String[] datos = new String[10];

            DefaultTableModel tabla = new DefaultTableModel();
            tabla.addColumn("ID");
            tabla.addColumn("Nombre");
            tabla.addColumn("Calorias");
            tabla.addColumn("Proteinas");
            tabla.addColumn("Carbohidratos");
            tabla.addColumn("Vitamina A");
            tabla.addColumn("Vitamina C");
            tabla.addColumn("Vitamina K");
            tabla.addColumn("Fibra");
            tabla.addColumn("Calcio");
            tblAlimentos.setModel(tabla);

            while (rs.next()) {
                datos[0] = Integer.toString(rs.getInt(1));
                datos[1] = rs.getString(2);
                datos[2] = Integer.toString(rs.getInt(3));
                datos[3] = Float.toString(rs.getFloat(4));
                datos[4] = Float.toString(rs.getFloat(5));
                datos[5] = Float.toString(rs.getFloat(6));
                datos[6] = Float.toString(rs.getFloat(7));
                datos[7] = Float.toString(rs.getFloat(8));
                datos[8] = Float.toString(rs.getFloat(9));
                datos[9] = Float.toString(rs.getFloat(10));

                tabla.addRow(datos);
            }
            tblAlimentos.setModel(tabla);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnCargarBDActionPerformed

    private void btnDescartarCambiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDescartarCambiosActionPerformed
        // Refresco el combobox para reinsertar los valores originales
        initComboboxUsuarios();
    }//GEN-LAST:event_btnDescartarCambiosActionPerformed

    public static void main(String args[]) {
        /* Se crea y se muestra el formulario */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barCalcio;
    private javax.swing.JProgressBar barCaloria;
    private javax.swing.JProgressBar barCarbohidrato;
    private javax.swing.JProgressBar barFibra;
    private javax.swing.JProgressBar barProteina;
    private javax.swing.JProgressBar barVitaminaA;
    private javax.swing.JProgressBar barVitaminaC;
    private javax.swing.JProgressBar barVitaminaK;
    private javax.swing.JButton btnCargarBD;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConfirmarDuracionPeriodo;
    private javax.swing.JButton btnCrearUsuario;
    private javax.swing.JButton btnDescartarCambios;
    private javax.swing.JButton btnExportAlimentos;
    private javax.swing.JButton btnImportAlimentos;
    private javax.swing.JButton btnMostrarBotonesCalcio;
    private javax.swing.JButton btnMostrarBotonesCalorias;
    private javax.swing.JButton btnMostrarBotonesCarbohidratos;
    private javax.swing.JButton btnMostrarBotonesFibra;
    private javax.swing.JButton btnMostrarBotonesProteinas;
    private javax.swing.JButton btnMostrarBotonesVitA;
    private javax.swing.JButton btnMostrarBotonesVitC;
    private javax.swing.JButton btnMostrarBotonesVitK;
    private javax.swing.JButton btnReestablecerColoresBotones;
    private javax.swing.JButton btnRefrescar;
    private javax.swing.JButton btnRun;
    private javax.swing.JCheckBox cboxLightMode;
    private javax.swing.JComboBox<String> cmbUsuarios;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTabbedPane lblAviso;
    private javax.swing.JLabel lblDiasPorPeriodo;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel panAlimentos;
    private javax.swing.JPanel panBoton;
    private javax.swing.JPanel panConfig;
    private javax.swing.JPanel panMain;
    private javax.swing.JPanel panNutrientes;
    private javax.swing.JSpinner spnDiasPeriodo;
    private javax.swing.JTable tblAlimentos;
    // End of variables declaration//GEN-END:variables

    private void crearBoton() {
        // Por cada alimento creo un boton con su nombre y lo muestro
        for (Alimentos a : conBD.arregloAlimentos) {
            // Obtengo el nombre del alimento y se lo asigno de nombre a un boton
            JButton boton = new JButton(a.getNombre());
            boton.addActionListener(this);
            // Añado el boton al panel y lo refresco una vez termine el for, ordenandolo en el proceso
            panAlimentos.add(boton);
            botones.add(boton);
        }
        panAlimentos.updateUI();
    }

    private void initComboboxUsuarios() {
        // Elimino todos los usuarios del combobox
        cmbUsuarios.removeAllItems();

        // Por cada usuario presente en el arreglo le agrego el nombre al combobox
        for (Usuarios u : conBD.arregloUsuarios) {
            cmbUsuarios.addItem(u.getNombre());
        }

        // Obtengo el periodo del usuario predeterminado
        periodo = conBD.arregloUsuarios.get(getSelectedUserID(1)).getPeriodo();
        spnDiasPeriodo.setValue((Object) periodo);
    }

    private void initBarrasMetasNutricionales() {
        // Obetengo el id del usuario seleccionado
        int id = getSelectedUserID(0);
        // Repito la declaracion para solucionar errores
        periodo = conBD.arregloUsuarios.get(getSelectedUserID(1)).getPeriodo();

        for (MetasNutricional mn : conBD.arregloMetasNutricionales) {
            if (mn.getId() == id) {
                // Convierto los float a int de la meta preservando las proporciones (no perdiendo datos) al multiplicar por (10*periodo)
                System.out.println("PERIODO: " + periodo);
                barCaloria.setMaximum((int) mn.getCalorias() * (10 * periodo));
                barProteina.setMaximum((int) mn.getProteinas() * (10 * periodo));
                barCarbohidrato.setMaximum((int) mn.getCarbohidratos() * (10 * periodo));
                barVitaminaA.setMaximum((int) mn.getVit_a() * (10 * periodo));
                barVitaminaC.setMaximum((int) mn.getVit_c() * (10 * periodo));
                barVitaminaK.setMaximum((int) mn.getVit_k() * (10 * periodo));
                barFibra.setMaximum((int) mn.getFibra() * (10 * periodo));
                barCalcio.setMaximum((int) mn.getCalcio() * (10 * periodo));

                // Convierto los float a int del progreso preservando las proporciones (no perdiendo datos) al multiplicar por (10*periodo)
                id = getSelectedUserID(1);
                barCaloria.setValue((int) conBD.arregloUsuarios.get(id).getCalorias());
                barProteina.setValue((int) conBD.arregloUsuarios.get(id).getProteinas());
                barCarbohidrato.setValue((int) conBD.arregloUsuarios.get(id).getCarbohidratos());
                barVitaminaA.setValue((int) conBD.arregloUsuarios.get(id).getVit_a());
                barVitaminaC.setValue((int) conBD.arregloUsuarios.get(id).getVit_c());
                barVitaminaK.setValue((int) conBD.arregloUsuarios.get(id).getVit_k());
                barFibra.setValue((int) conBD.arregloUsuarios.get(id).getFibra());
                barCalcio.setValue((int) conBD.arregloUsuarios.get(id).getCalcio());
            }
        }
    }

    private int getSelectedUserID(int mode) {
        int id = 0, i = 0;
        // Recorro el arreglo de usuarios
        for (Usuarios u : conBD.arregloUsuarios) {
            // Si el nombre del usuario en el arreglo coincide con el usuario seleccionado en el combobox entro al if
            if (u.getNombre() == cmbUsuarios.getSelectedItem()) {
                /* dependiendo del modo regreso distintos valores
                0 = id del usuario en la base de datos
                1 ( u otro numero ) = posicion en el combobox y arreglos
                 */
                if (mode == 0) {
                    id = u.getId();
                } else {
                    id = i;
                }

            }
            // i sirve para contar la posicion del usuario dentro del arregñp
            i++;
        }

        return id;
    }

    private void agregarDatosABarra(String nombre) {
        /* Metodo que recorre los alimentos hasta encontrar el solicitado, una vez lo haga,
            agrega los valores nutricionales a las barras*/
        for (Alimentos alimento : conBD.arregloAlimentos) {
            if (alimento.getNombre().equals(nombre)) {
                barCaloria.setValue(barCaloria.getValue() + ((int) alimento.getCalorias() * (10)));
                barProteina.setValue(barProteina.getValue() + ((int) alimento.getProteinas() * (10)));
                barCarbohidrato.setValue(barCarbohidrato.getValue() + ((int) alimento.getCarbohidratos() * (10)));
                barVitaminaA.setValue(barVitaminaA.getValue() + ((int) alimento.getVit_a() * (10)));
                barVitaminaC.setValue(barVitaminaC.getValue() + ((int) alimento.getVit_c() * (10)));
                barVitaminaK.setValue(barVitaminaK.getValue() + ((int) alimento.getVit_k() * (10)));
                barFibra.setValue(barFibra.getValue() + ((int) alimento.getFibra() * (10)));
                barCalcio.setValue(barCalcio.getValue() + ((int) alimento.getCalcio() * (10)));
                break;
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Si se apreta cualquier boton en la aplicacion, se revisa si este pertenece a los elementos, si es asi, llama al metodo que agrega los datos del alimento a la barra
        if (botones.contains(e.getSource())) {
            if (barraColoreada) { // Si las barras estan coloreadas se regresan a su estado original
                formatearColorBarra();
            }
            String pos = botones.get(botones.indexOf(e.getSource())).getText();
            agregarDatosABarra(pos);
        }
    }

    private void guardarDatosUsuario() {
        /* Metodo que guarda el progreso del usuario en la base de datos */
        try {
            System.out.println("LOG - guardando");
            // Se definen instrucciones para ejecutar las sentencias SQL
            PreparedStatement pst = conn.prepareStatement("UPDATE user set periodo = '" + periodo + "', calorias = '" + barCaloria.getValue() + "',proteinas = '" + barProteina.getValue() + "',carbohidratos = '" + barCarbohidrato.getValue() + "',vit_a = '" + barVitaminaA.getValue() + "',vit_c = '" + barVitaminaC.getValue() + "',vit_k = '" + barVitaminaK.getValue() + "',fibra = '" + barFibra.getValue() + "',calcio = '" + barCalcio.getValue() + "' WHERE id = '" + getSelectedUserID(0) + "'"); //Se pasa el codigo SQL de insercion al objeto PeparedStatement.
            pst.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("No se puede guardar");
        }
    }

    private void colorearBarras() {
        // Metodo que colorea las barras dependiendo del progreso del usuario divido en la meta
        float progreso = 0;
        for (JProgressBar barra : barras) {
            progreso = (float) barra.getValue() / (float) barra.getMaximum();

            if (progreso <= 0.6) {
                barra.setForeground(Color.red);
            } else if (progreso < 0.9) {
                barra.setForeground(Color.orange);
            } else {
                barra.setForeground(Color.green);
            }
        }
        barraColoreada = true;
    }

    private void crearArregloBarras() {
        /* 
            Metodo que instancia el arreglo barras y agrega las distintas barras dentro de este, ademas de darles un nombre con el cual identificarlos
         */
        barras = new ArrayList<>();

        barCaloria.setName("Calorias");
        barProteina.setName("Proteinas");
        barCarbohidrato.setName("Carbohidratos");
        barVitaminaA.setName("Vitamina A");
        barVitaminaC.setName("Vitamina C");
        barVitaminaK.setName("Vitamina K");
        barFibra.setName("Fibra");
        barCalcio.setName("Calcio");

        barras.add(barCaloria);
        barras.add(barProteina);
        barras.add(barCarbohidrato);
        barras.add(barVitaminaA);
        barras.add(barVitaminaC);
        barras.add(barVitaminaK);
        barras.add(barFibra);
        barras.add(barCalcio);
    }

    private void setDarkMode() {
        // Metodo que establece el LaF en modo oscuro
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatDarkLaf");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Refresta Look and Feel del jFrame
        SwingUtilities.updateComponentTreeUI(this);
        this.pack();
        darkMode = true;
    }

    private void setLightMode() {
        // Metodo que establece el LaF en modo claro
        try {
            UIManager.setLookAndFeel("com.formdev.flatlaf.FlatLightLaf");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // Refresta Look and Feel del jFrame
        SwingUtilities.updateComponentTreeUI(this);
        this.pack();
        darkMode = false;
    }

    private void ordenarBotonesEnArreglos() {
        // Instancio los arreglos que almacenan a los botones
        bCalorias = new ArrayList<>();
        bProteinas = new ArrayList<>();
        bCarbohidratos = new ArrayList<>();
        bVitA = new ArrayList<>();
        bVitC = new ArrayList<>();
        bVitK = new ArrayList<>();
        bFibra = new ArrayList<>();
        bCalcio = new ArrayList<>();

        // Obtengo el id del usuario y establesco el margen en 0.1. El margen refiere al minimo
        // aporte que tiene que hacer un alimento a la meta para ser considerado como importante y luego sea destacado cuando se necesite
        int id = getSelectedUserID(1);
        float margen = (float) 0.1;

        // Por cada boton en el arreglo lo emparejo con el alimento respectivo
        for (JButton boton : botones) {
            for (Alimentos alimento : conBD.arregloAlimentos) {
                if (alimento.getNombre().equals(boton.getText())) {
                    // Si el aporte nutricional de un alimento es significativo entonces se agrega a un arreglo especial
                    if (alimento.getCalorias() / conBD.arregloMetasNutricionales.get(id).getCalorias() > margen) {
                        bCalorias.add(boton);
                    }
                    if (alimento.getProteinas() / conBD.arregloMetasNutricionales.get(id).getProteinas() > margen) {
                        bProteinas.add(boton);
                    }
                    if (alimento.getCarbohidratos() / conBD.arregloMetasNutricionales.get(id).getCarbohidratos() > margen) {
                        bCarbohidratos.add(boton);
                    }
                    if (alimento.getVit_a() / conBD.arregloMetasNutricionales.get(id).getVit_a() > margen) {
                        bVitA.add(boton);
                    }
                    if (alimento.getVit_c() / conBD.arregloMetasNutricionales.get(id).getVit_c() > margen) {
                        bVitC.add(boton);
                    }
                    if (alimento.getVit_k() / conBD.arregloMetasNutricionales.get(id).getVit_k() > margen) {
                        bVitK.add(boton);
                    }
                    if (alimento.getFibra() / conBD.arregloMetasNutricionales.get(id).getFibra() > margen) {
                        bFibra.add(boton);
                    }
                    if (alimento.getCalcio() / conBD.arregloMetasNutricionales.get(id).getCalcio() > margen) {
                        bCalcio.add(boton);
                    }
                    break;
                }
            }
        }
    }

    private void colorearBotones(List<JButton> arreglo) {
        // Metodo que colorea los botones de un arreglo dado con el fin de destarlos
        for (JButton boton : arreglo) {
            // Coloreo los botones de colores istintos dependiendo de si el usuario utiliza modo oscuro o modo claro
            if (darkMode) {
                boton.setForeground(Color.darkGray);
                boton.setBackground(Color.white);
            } else {
                boton.setBackground(Color.yellow);
                boton.setForeground(Color.darkGray);
            }
        }
    }

    private void formatearColorBotones() {
        // Metodo que reglesa los colores a su estado original 
        for (JButton boton : botones) {
            // Coloreo los botones de colores istintos dependiendo de si el usuario utiliza modo oscuro o modo claro
            if (!darkMode) {
                boton.setForeground(Color.darkGray);
                boton.setBackground(Color.white);
            } else {
                boton.setBackground(Color.darkGray);
                boton.setForeground(Color.white);
            }
        }
    }

    private void presentarFeedbackAlUsuario() throws SQLException {
        // Definicion de variables
        float progreso = 0;
        String mensaje = "Nutrientes faltantes: \n";

        // Obtengo el progreso del usuario y se lo agrego al mensaje que luego le voy a mostrar
        for (JProgressBar barra : barras) {
            progreso = ((float) barra.getValue() / (float) barra.getMaximum()) * 100;
            if (progreso < 80) {
                mensaje += "> " + barra.getName() + ": " + Math.round(progreso) + "% del progreso \n";
            }
        }

        JOptionPane.showMessageDialog(null, mensaje);

        // Restablesco valores tabla para solucionar errores relacionados a los datos en las tablas 
        formatearColorBotones();
        initBarrasMetasNutricionales(); // Inicio las tablas
        restablecerValoresBarra();
        guardarDatosUsuario();
    }

    private void formatearColorBarra() {
        // Metodo que regresa los colores de las barras a su estado original
        for (JProgressBar barra : barras) {
            barra.setForeground(Color.cyan);
        }
    }

    private void validateUserExistance() {
        // Metodo que revisa si el usuario tiene un perfil creado para crearlo en el momento
        if (conBD.arregloUsuarios.isEmpty()) {
            // Como el usuario no tiene perfil, le creo uno
            String nombre = "";
            float masa = 0;

            try {
                nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre: ") + " ";
                masa = Float.parseFloat(JOptionPane.showInputDialog(null, "Ingrese su masa (kg): "));
            } catch (Exception e) {
                masa = -1;
                System.out.println(e);
            }
            if (masa < 1 || masa > 400) { //reviso si el masa del usuario es imbalido
                masa = 70;
                JOptionPane.showMessageDialog(null, "Masa no recibido (o es invalido), utilizando 70");
            }

            if (nombre.trim().isEmpty()) {
                nombre = "user";
            }

            try {
                // Se definen instrucciones para ejecutar las sentencias SQL
                // Ingreso los datos en la base de datos
                query.insertUser(nombre, masa);

                // Llamo al metodo agregar fila
                query.insertMetasNutricionales(masa);

                JOptionPane.showMessageDialog(null, "Usuario creado!");

            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println("No se puede guardar");
            }
            
            // reinicio el programa
            main.main(null);
        }

    }
}

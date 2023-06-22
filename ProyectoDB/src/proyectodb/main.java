package proyectodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;
import java.text.ParseException;
import org.bson.Document;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro_Jugador = new javax.swing.JDialog();
        jButton1 = new javax.swing.JButton();
        player_persoExtra = new javax.swing.JTextField();
        player_peso = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        player_date = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        player_name = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        player_id = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Imagen_atras = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO = new javax.swing.JLabel();
        Registro_Entrenador = new javax.swing.JDialog();
        jButton2 = new javax.swing.JButton();
        DT_pesoExtra = new javax.swing.JTextField();
        DT_peso = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        DT_date = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        DT_nombre = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        DT_id = new javax.swing.JTextField();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        Imagen_atras1 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO1 = new javax.swing.JLabel();
        Registro_Arbitro = new javax.swing.JDialog();
        jButton6 = new javax.swing.JButton();
        arbitro_pesoExtra = new javax.swing.JTextField();
        arbitro_peso = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        arbitro_date = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        arbitro_nombre = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        arbitro_id = new javax.swing.JTextField();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        Imagen_atras2 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO2 = new javax.swing.JLabel();
        Registro_Club = new javax.swing.JDialog();
        jButton8 = new javax.swing.JButton();
        club_nombre = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        lbl_id = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        club_entrenador = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        TB_entrenadores = new javax.swing.JTable();
        jLabel41 = new javax.swing.JLabel();
        Imagen_atras3 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO3 = new javax.swing.JLabel();
        Registro_Quiniela = new javax.swing.JDialog();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        quiniela_monto = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton14 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        NQ_id = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        quiniela_partido = new javax.swing.JComboBox<>();
        quiniela_golesVisita = new javax.swing.JTextField();
        quiniela_golesLocal = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        TB_partidos = new javax.swing.JTable();
        jLabel50 = new javax.swing.JLabel();
        Imagen_atras4 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO6 = new javax.swing.JLabel();
        Registro_Partido = new javax.swing.JDialog();
        jLabel47 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        partido_golesLocal = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jSeparator28 = new javax.swing.JSeparator();
        lb_partido = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jSeparator30 = new javax.swing.JSeparator();
        partido_golesVisita = new javax.swing.JTextField();
        jSeparator31 = new javax.swing.JSeparator();
        jLabel49 = new javax.swing.JLabel();
        partido_date = new com.toedter.calendar.JDateChooser();
        partido_arbitro3 = new javax.swing.JComboBox<>();
        partido_local = new javax.swing.JComboBox<>();
        partido_visita = new javax.swing.JComboBox<>();
        partido_arbitro1 = new javax.swing.JComboBox<>();
        partido_arbitro2 = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TB_arbitros = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TB_equipos = new javax.swing.JTable();
        jLabel51 = new javax.swing.JLabel();
        Imagen_atras5 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO7 = new javax.swing.JLabel();
        Registro_Clubjugador = new javax.swing.JDialog();
        jButton20 = new javax.swing.JButton();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        CJ_club = new javax.swing.JComboBox<>();
        CJ_player = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        TB_jugadores = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TB_club = new javax.swing.JTable();
        Imagen_atras6 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO9 = new javax.swing.JLabel();
        Modificar_Jugador = new javax.swing.JDialog();
        jButton22 = new javax.swing.JButton();
        PM_pesoExtra = new javax.swing.JTextField();
        PM_peso = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        PM_date = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        PM_nombre = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        PM_id = new javax.swing.JComboBox<>();
        Imagen_atras7 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO10 = new javax.swing.JLabel();
        Modificar_Entrenador = new javax.swing.JDialog();
        jButton24 = new javax.swing.JButton();
        EM_pesoExtra = new javax.swing.JTextField();
        EM_peso = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        EM_date = new com.toedter.calendar.JDateChooser();
        jLabel65 = new javax.swing.JLabel();
        EM_nombre = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        EM_id = new javax.swing.JComboBox<>();
        Imagen_atras8 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO11 = new javax.swing.JLabel();
        Modificar_Arbitro = new javax.swing.JDialog();
        jButton26 = new javax.swing.JButton();
        AM_pesoExtra = new javax.swing.JTextField();
        AM_peso = new javax.swing.JTextField();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        AM_date = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        AM_nombre = new javax.swing.JTextField();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        AM_id = new javax.swing.JComboBox<>();
        Imagen_atras9 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO12 = new javax.swing.JLabel();
        Modificar_Club = new javax.swing.JDialog();
        jButton28 = new javax.swing.JButton();
        CM_nombre = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        CM_id = new javax.swing.JComboBox<>();
        Imagen_atras10 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO13 = new javax.swing.JLabel();
        Modificar_Quiniela = new javax.swing.JDialog();
        jSeparator57 = new javax.swing.JSeparator();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jSeparator58 = new javax.swing.JSeparator();
        QM_monto = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jButton34 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jSeparator59 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        QM_id = new javax.swing.JComboBox<>();
        QM_golesVisita = new javax.swing.JTextField();
        QM_golesLocal = new javax.swing.JTextField();
        QM_partido = new javax.swing.JComboBox<>();
        Imagen_atras11 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO16 = new javax.swing.JLabel();
        Eliminar_Jugador = new javax.swing.JDialog();
        jButton36 = new javax.swing.JButton();
        jSeparator63 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        EJ_id = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        Imagen_atras12 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO17 = new javax.swing.JLabel();
        Eliminar_Entrenador = new javax.swing.JDialog();
        jButton38 = new javax.swing.JButton();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        EE_id = new javax.swing.JComboBox<>();
        Imagen_atras13 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO18 = new javax.swing.JLabel();
        Eliminar_Arbitro = new javax.swing.JDialog();
        jButton40 = new javax.swing.JButton();
        jSeparator65 = new javax.swing.JSeparator();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        EA_id = new javax.swing.JComboBox<>();
        Imagen_atras14 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO19 = new javax.swing.JLabel();
        Eliminar_Club = new javax.swing.JDialog();
        jButton42 = new javax.swing.JButton();
        jSeparator66 = new javax.swing.JSeparator();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        EC_id = new javax.swing.JComboBox<>();
        Imagen_atras15 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO20 = new javax.swing.JLabel();
        Eliminar_Quiniela = new javax.swing.JDialog();
        jButton48 = new javax.swing.JButton();
        jSeparator69 = new javax.swing.JSeparator();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        EQ_id = new javax.swing.JComboBox<>();
        Imagen_atras16 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO23 = new javax.swing.JLabel();
        Listar_Jugador = new javax.swing.JDialog();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        LT_Jugador = new javax.swing.JTable();
        Imagen_atras17 = new javax.swing.JLabel();
        Jbl_FONDO = new javax.swing.JLabel();
        Listar_Entrenador = new javax.swing.JDialog();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane9 = new javax.swing.JScrollPane();
        LT_Entrenador = new javax.swing.JTable();
        Imagen_atras18 = new javax.swing.JLabel();
        Jbl_FONDO1 = new javax.swing.JLabel();
        Listar_Arbitro = new javax.swing.JDialog();
        jLabel27 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        LT_Arbitro = new javax.swing.JTable();
        Imagen_atras19 = new javax.swing.JLabel();
        Jbl_FONDO2 = new javax.swing.JLabel();
        Listar_Club = new javax.swing.JDialog();
        jLabel28 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        LT_Club = new javax.swing.JTable();
        Imagen_atras20 = new javax.swing.JLabel();
        Jbl_FONDO3 = new javax.swing.JLabel();
        Listar_Clubjugador = new javax.swing.JDialog();
        jLabel29 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        LT_club_jugador = new javax.swing.JTable();
        Imagen_atras21 = new javax.swing.JLabel();
        Jbl_FONDO4 = new javax.swing.JLabel();
        Listar_Partido = new javax.swing.JDialog();
        jLabel31 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        LT_Partidos = new javax.swing.JTable();
        Imagen_atras22 = new javax.swing.JLabel();
        Jbl_FONDO5 = new javax.swing.JLabel();
        Listar_Quiniela = new javax.swing.JDialog();
        jLabel32 = new javax.swing.JLabel();
        jScrollPane14 = new javax.swing.JScrollPane();
        LT_Quiniela = new javax.swing.JTable();
        Imagen_atras23 = new javax.swing.JLabel();
        Jbl_FONDO6 = new javax.swing.JLabel();
        Listar_Ganadores = new javax.swing.JDialog();
        jLabel33 = new javax.swing.JLabel();
        jScrollPane15 = new javax.swing.JScrollPane();
        LT_ganadorQuinielas = new javax.swing.JTable();
        Imagen_atras24 = new javax.swing.JLabel();
        Jbl_FONDO7 = new javax.swing.JLabel();
        Resultado_quiniela = new javax.swing.JDialog();
        NE_visita = new javax.swing.JLabel();
        GQ_visita = new javax.swing.JLabel();
        NE_local = new javax.swing.JLabel();
        GR_visita = new javax.swing.JLabel();
        GQ_local = new javax.swing.JLabel();
        Mensaje = new javax.swing.JLabel();
        GR_local = new javax.swing.JLabel();
        JQ_id = new javax.swing.JComboBox<>();
        Imagen_atras25 = new javax.swing.JLabel();
        lbl_Fondo_Imagen = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jbl_fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();

        Registro_Jugador.setIconImage(null);
        Registro_Jugador.setIconImages(null);
        Registro_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Registro_Jugador.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        player_persoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        player_persoExtra.setForeground(new java.awt.Color(255, 255, 255));
        player_persoExtra.setBorder(null);
        player_persoExtra.setOpaque(false);
        Registro_Jugador.getContentPane().add(player_persoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        player_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        player_peso.setForeground(new java.awt.Color(255, 255, 255));
        player_peso.setBorder(null);
        player_peso.setOpaque(false);
        Registro_Jugador.getContentPane().add(player_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Registro_Jugador.getContentPane().add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Registro_Jugador.getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Peso Extra:");
        Registro_Jugador.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Peso Base:");
        Registro_Jugador.getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Registro_Jugador.getContentPane().add(player_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Fecha de Nacimiento:");
        Registro_Jugador.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        player_name.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        player_name.setForeground(new java.awt.Color(255, 255, 255));
        player_name.setBorder(null);
        player_name.setOpaque(false);
        Registro_Jugador.getContentPane().add(player_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Registro_Jugador.getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nombre:");
        Registro_Jugador.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        player_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        player_id.setForeground(new java.awt.Color(255, 255, 255));
        player_id.setBorder(null);
        player_id.setOpaque(false);
        player_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player_idActionPerformed(evt);
            }
        });
        Registro_Jugador.getContentPane().add(player_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));
        Registro_Jugador.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Identidad:");
        Registro_Jugador.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registro de Jugador");
        Registro_Jugador.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        Imagen_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atrasMouseClicked(evt);
            }
        });
        Registro_Jugador.getContentPane().add(Imagen_atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Jugador.getContentPane().add(jbl_IMAGEN_FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Entrenador.setIconImage(null);
        Registro_Entrenador.setIconImages(null);
        Registro_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setText("Crear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Registro_Entrenador.getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        DT_pesoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DT_pesoExtra.setForeground(new java.awt.Color(255, 255, 255));
        DT_pesoExtra.setBorder(null);
        DT_pesoExtra.setOpaque(false);
        Registro_Entrenador.getContentPane().add(DT_pesoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        DT_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DT_peso.setForeground(new java.awt.Color(255, 255, 255));
        DT_peso.setBorder(null);
        DT_peso.setOpaque(false);
        Registro_Entrenador.getContentPane().add(DT_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Registro_Entrenador.getContentPane().add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Registro_Entrenador.getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Peso Extra:");
        Registro_Entrenador.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Peso Base:");
        Registro_Entrenador.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Registro_Entrenador.getContentPane().add(DT_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Fecha de Nacimiento:");
        Registro_Entrenador.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        DT_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DT_nombre.setForeground(new java.awt.Color(255, 255, 255));
        DT_nombre.setBorder(null);
        DT_nombre.setOpaque(false);
        Registro_Entrenador.getContentPane().add(DT_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Registro_Entrenador.getContentPane().add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Nombre:");
        Registro_Entrenador.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        DT_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        DT_id.setForeground(new java.awt.Color(255, 255, 255));
        DT_id.setBorder(null);
        DT_id.setOpaque(false);
        DT_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DT_idActionPerformed(evt);
            }
        });
        Registro_Entrenador.getContentPane().add(DT_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));
        Registro_Entrenador.getContentPane().add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Identidad:");
        Registro_Entrenador.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel13.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Registro de Entrenador");
        Registro_Entrenador.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, -1, -1));

        Imagen_atras1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras1MouseClicked(evt);
            }
        });
        Registro_Entrenador.getContentPane().add(Imagen_atras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Arbitro.setIconImage(null);
        Registro_Arbitro.setIconImages(null);
        Registro_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton6.setText("Crear");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        Registro_Arbitro.getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        arbitro_pesoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        arbitro_pesoExtra.setForeground(new java.awt.Color(255, 255, 255));
        arbitro_pesoExtra.setBorder(null);
        arbitro_pesoExtra.setOpaque(false);
        Registro_Arbitro.getContentPane().add(arbitro_pesoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        arbitro_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        arbitro_peso.setForeground(new java.awt.Color(255, 255, 255));
        arbitro_peso.setBorder(null);
        arbitro_peso.setOpaque(false);
        Registro_Arbitro.getContentPane().add(arbitro_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Registro_Arbitro.getContentPane().add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Registro_Arbitro.getContentPane().add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Peso Extra:");
        Registro_Arbitro.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Peso Base:");
        Registro_Arbitro.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Registro_Arbitro.getContentPane().add(arbitro_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Fecha de Nacimiento:");
        Registro_Arbitro.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        arbitro_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        arbitro_nombre.setForeground(new java.awt.Color(255, 255, 255));
        arbitro_nombre.setBorder(null);
        arbitro_nombre.setOpaque(false);
        Registro_Arbitro.getContentPane().add(arbitro_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Registro_Arbitro.getContentPane().add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Nombre:");
        Registro_Arbitro.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        arbitro_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        arbitro_id.setForeground(new java.awt.Color(255, 255, 255));
        arbitro_id.setBorder(null);
        arbitro_id.setOpaque(false);
        arbitro_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arbitro_idActionPerformed(evt);
            }
        });
        Registro_Arbitro.getContentPane().add(arbitro_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));
        Registro_Arbitro.getContentPane().add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Identidad:");
        Registro_Arbitro.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        jLabel19.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Registro de Arbitro");
        Registro_Arbitro.getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        Imagen_atras2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras2MouseClicked(evt);
            }
        });
        Registro_Arbitro.getContentPane().add(Imagen_atras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO2.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Club.setIconImage(null);
        Registro_Club.setIconImages(null);
        Registro_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setText("Crear");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        Registro_Club.getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        club_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        club_nombre.setForeground(new java.awt.Color(255, 255, 255));
        club_nombre.setBorder(null);
        club_nombre.setOpaque(false);
        Registro_Club.getContentPane().add(club_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Registro_Club.getContentPane().add(jSeparator15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ID_entrenador:");
        Registro_Club.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, -1, -1));
        Registro_Club.getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        lbl_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_id.setForeground(new java.awt.Color(255, 255, 255));
        Registro_Club.getContentPane().add(lbl_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));

        jLabel25.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Nuevo Club");
        Registro_Club.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 70, -1, -1));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Nombre:");
        Registro_Club.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        club_entrenador.setToolTipText("");
        Registro_Club.getContentPane().add(club_entrenador, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 200, -1));

        TB_entrenadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nombre`"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_entrenadores.setEnabled(false);
        jScrollPane1.setViewportView(TB_entrenadores);

        Registro_Club.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 320, 540));

        jLabel41.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setText("ID:");
        Registro_Club.getContentPane().add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        Imagen_atras3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras3MouseClicked(evt);
            }
        });
        Registro_Club.getContentPane().add(Imagen_atras3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO3.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Club.getContentPane().add(jbl_IMAGEN_FONDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Quiniela.setIconImage(null);
        Registro_Quiniela.setIconImages(null);
        Registro_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Registro_Quiniela.getContentPane().add(jSeparator23, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, 10));

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Goles Visita:");
        Registro_Quiniela.getContentPane().add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("Goles Local:");
        Registro_Quiniela.getContentPane().add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));
        Registro_Quiniela.getContentPane().add(jSeparator19, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 220, 10));

        quiniela_monto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quiniela_monto.setForeground(new java.awt.Color(255, 255, 255));
        quiniela_monto.setBorder(null);
        quiniela_monto.setOpaque(false);
        quiniela_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiniela_montoActionPerformed(evt);
            }
        });
        Registro_Quiniela.getContentPane().add(quiniela_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 220, 20));

        jLabel37.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Monto:");
        Registro_Quiniela.getContentPane().add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jButton14.setText("Crear");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        Registro_Quiniela.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("ID Partido:");
        Registro_Quiniela.getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));
        Registro_Quiniela.getContentPane().add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        NQ_id.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NQ_id.setForeground(new java.awt.Color(255, 255, 255));
        Registro_Quiniela.getContentPane().add(NQ_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 210, 20));

        jLabel36.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Nueva Quiniela");
        Registro_Quiniela.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        Registro_Quiniela.getContentPane().add(quiniela_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, -1));
        Registro_Quiniela.getContentPane().add(quiniela_golesVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));
        Registro_Quiniela.getContentPane().add(quiniela_golesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 220, -1));

        TB_partidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Local", "Visita"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_partidos.setEnabled(false);
        jScrollPane7.setViewportView(TB_partidos);

        Registro_Quiniela.getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 370, 540));

        jLabel50.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("ID:");
        Registro_Quiniela.getContentPane().add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        Imagen_atras4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras4MouseClicked(evt);
            }
        });
        Registro_Quiniela.getContentPane().add(Imagen_atras4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO6.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Quiniela.getContentPane().add(jbl_IMAGEN_FONDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Partido.setIconImage(null);
        Registro_Partido.setIconImages(null);
        Registro_Partido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setText("Fecha:");
        Registro_Partido.getContentPane().add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 500, -1, -1));
        Registro_Partido.getContentPane().add(jSeparator29, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, 220, 10));

        partido_golesLocal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        partido_golesLocal.setForeground(new java.awt.Color(255, 255, 255));
        partido_golesLocal.setBorder(null);
        partido_golesLocal.setOpaque(false);
        Registro_Partido.getContentPane().add(partido_golesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 460, 220, 20));

        jLabel46.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setText("ID Arbitro Auxiliar 2:");
        Registro_Partido.getContentPane().add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));
        Registro_Partido.getContentPane().add(jSeparator21, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 220, 20));

        jLabel45.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setText("ID Equipo Visita:");
        Registro_Partido.getContentPane().add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 120, 20));

        jButton16.setText("Crear");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        Registro_Partido.getContentPane().add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 550, 100, 20));
        Registro_Partido.getContentPane().add(jSeparator25, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 220, 10));
        Registro_Partido.getContentPane().add(jSeparator26, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, 220, 10));

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("ID Arbitro Auxiliar 1:");
        Registro_Partido.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        jLabel40.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("ID Arbitro:");
        Registro_Partido.getContentPane().add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        jLabel42.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("ID Equipo Local:");
        Registro_Partido.getContentPane().add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 190, 120, -1));
        Registro_Partido.getContentPane().add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, 10));

        lb_partido.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lb_partido.setForeground(new java.awt.Color(255, 255, 255));
        Registro_Partido.getContentPane().add(lb_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 220, 20));

        jLabel44.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setText("Registro de Partido");
        Registro_Partido.getContentPane().add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        jLabel48.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Goles visita:");
        Registro_Partido.getContentPane().add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, -1, -1));
        Registro_Partido.getContentPane().add(jSeparator30, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 220, 10));

        partido_golesVisita.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        partido_golesVisita.setForeground(new java.awt.Color(255, 255, 255));
        partido_golesVisita.setBorder(null);
        partido_golesVisita.setOpaque(false);
        Registro_Partido.getContentPane().add(partido_golesVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 420, 220, 20));
        Registro_Partido.getContentPane().add(jSeparator31, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 220, 10));

        jLabel49.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Goles Locales:");
        Registro_Partido.getContentPane().add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 460, -1, -1));
        Registro_Partido.getContentPane().add(partido_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 220, -1));

        Registro_Partido.getContentPane().add(partido_arbitro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, 220, -1));

        Registro_Partido.getContentPane().add(partido_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 220, -1));

        Registro_Partido.getContentPane().add(partido_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 220, -1));

        Registro_Partido.getContentPane().add(partido_arbitro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 280, 220, -1));

        Registro_Partido.getContentPane().add(partido_arbitro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 330, 220, -1));

        TB_arbitros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null}
            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_arbitros.setEnabled(false);
        jScrollPane3.setViewportView(TB_arbitros);

        Registro_Partido.getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 310, 250));

        TB_equipos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_equipos.setEnabled(false);
        jScrollPane2.setViewportView(TB_equipos);

        Registro_Partido.getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 310, 260));

        jLabel51.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("ID:");
        Registro_Partido.getContentPane().add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        Imagen_atras5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras5MouseClicked(evt);
            }
        });
        Registro_Partido.getContentPane().add(Imagen_atras5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, -1, -1));

        jbl_IMAGEN_FONDO7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO7.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_ancho.png"))); // NOI18N
        Registro_Partido.getContentPane().add(jbl_IMAGEN_FONDO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Clubjugador.setIconImage(null);
        Registro_Clubjugador.setIconImages(null);
        Registro_Clubjugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton20.setText("Crear");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        Registro_Clubjugador.getContentPane().add(jButton20, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));
        Registro_Clubjugador.getContentPane().add(jSeparator35, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, 20));
        Registro_Clubjugador.getContentPane().add(jSeparator36, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel54.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel54.setForeground(new java.awt.Color(255, 255, 255));
        jLabel54.setText("ID Club:");
        Registro_Clubjugador.getContentPane().add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        jLabel55.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setText("Nuevo Club Jugador");
        Registro_Clubjugador.getContentPane().add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel56.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setText("ID Jugador:");
        Registro_Clubjugador.getContentPane().add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        Registro_Clubjugador.getContentPane().add(CJ_club, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 190, 220, -1));

        Registro_Clubjugador.getContentPane().add(CJ_player, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 220, -1));

        TB_jugadores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TB_jugadores.setEnabled(false);
        jScrollPane5.setViewportView(TB_jugadores);

        Registro_Clubjugador.getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 380, 260));

        TB_club.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        TB_club.setEnabled(false);
        jScrollPane4.setViewportView(TB_club);

        Registro_Clubjugador.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 380, 260));

        Imagen_atras6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras6MouseClicked(evt);
            }
        });
        Registro_Clubjugador.getContentPane().add(Imagen_atras6, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO9.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Clubjugador.getContentPane().add(jbl_IMAGEN_FONDO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Jugador.setIconImage(null);
        Modificar_Jugador.setIconImages(null);
        Modificar_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton22.setText("Modificar");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        Modificar_Jugador.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        PM_pesoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PM_pesoExtra.setForeground(new java.awt.Color(255, 255, 255));
        PM_pesoExtra.setBorder(null);
        PM_pesoExtra.setOpaque(false);
        Modificar_Jugador.getContentPane().add(PM_pesoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        PM_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PM_peso.setForeground(new java.awt.Color(255, 255, 255));
        PM_peso.setBorder(null);
        PM_peso.setOpaque(false);
        Modificar_Jugador.getContentPane().add(PM_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Modificar_Jugador.getContentPane().add(jSeparator38, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Modificar_Jugador.getContentPane().add(jSeparator39, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel57.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("Peso Extra:");
        Modificar_Jugador.getContentPane().add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel58.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setText("Peso Base:");
        Modificar_Jugador.getContentPane().add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Modificar_Jugador.getContentPane().add(PM_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Fecha de Nacimiento:");
        Modificar_Jugador.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        PM_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PM_nombre.setForeground(new java.awt.Color(255, 255, 255));
        PM_nombre.setBorder(null);
        PM_nombre.setOpaque(false);
        Modificar_Jugador.getContentPane().add(PM_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Modificar_Jugador.getContentPane().add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Nombre:");
        Modificar_Jugador.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));
        Modificar_Jugador.getContentPane().add(jSeparator41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 10));

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("Identidad:");
        Modificar_Jugador.getContentPane().add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jLabel62.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setText("Modificar de Jugador");
        Modificar_Jugador.getContentPane().add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Jugador.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jLabel53.setForeground(new java.awt.Color(153, 153, 153));
        jLabel53.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID del jugador a modificar  ");
        Modificar_Jugador.getContentPane().add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        PM_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                PM_idItemStateChanged(evt);
            }
        });
        Modificar_Jugador.getContentPane().add(PM_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 220, -1));

        Imagen_atras7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras7MouseClicked(evt);
            }
        });
        Modificar_Jugador.getContentPane().add(Imagen_atras7, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO10.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Jugador.getContentPane().add(jbl_IMAGEN_FONDO10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Entrenador.setIconImage(null);
        Modificar_Entrenador.setIconImages(null);
        Modificar_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton24.setText("Modificar");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        Modificar_Entrenador.getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        EM_pesoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EM_pesoExtra.setForeground(new java.awt.Color(255, 255, 255));
        EM_pesoExtra.setBorder(null);
        EM_pesoExtra.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(EM_pesoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        EM_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EM_peso.setForeground(new java.awt.Color(255, 255, 255));
        EM_peso.setBorder(null);
        EM_peso.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(EM_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Modificar_Entrenador.getContentPane().add(jSeparator37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Modificar_Entrenador.getContentPane().add(jSeparator42, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel63.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("Peso Extra:");
        Modificar_Entrenador.getContentPane().add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel64.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setText("Peso Base:");
        Modificar_Entrenador.getContentPane().add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Modificar_Entrenador.getContentPane().add(EM_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Fecha de Nacimiento:");
        Modificar_Entrenador.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        EM_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        EM_nombre.setForeground(new java.awt.Color(255, 255, 255));
        EM_nombre.setBorder(null);
        EM_nombre.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(EM_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 220, 20));
        Modificar_Entrenador.getContentPane().add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 220, 10));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Nombre:");
        Modificar_Entrenador.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));
        Modificar_Entrenador.getContentPane().add(jSeparator44, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 220, 10));

        jLabel67.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("Identidad:");
        Modificar_Entrenador.getContentPane().add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, 20));

        jLabel68.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setText("Modificar de Entrenador");
        Modificar_Entrenador.getContentPane().add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel69.setForeground(new java.awt.Color(153, 153, 153));
        jLabel69.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID del Entrenador a modificar  ");
        Modificar_Entrenador.getContentPane().add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel70.setForeground(new java.awt.Color(153, 153, 153));
        jLabel70.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Entrenador.getContentPane().add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        EM_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                EM_idItemStateChanged(evt);
            }
        });
        Modificar_Entrenador.getContentPane().add(EM_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 220, -1));

        Imagen_atras8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras8MouseClicked(evt);
            }
        });
        Modificar_Entrenador.getContentPane().add(Imagen_atras8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO11.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Arbitro.setIconImage(null);
        Modificar_Arbitro.setIconImages(null);
        Modificar_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton26.setText("Modificar");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        Modificar_Arbitro.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        AM_pesoExtra.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AM_pesoExtra.setForeground(new java.awt.Color(255, 255, 255));
        AM_pesoExtra.setBorder(null);
        AM_pesoExtra.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(AM_pesoExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        AM_peso.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AM_peso.setForeground(new java.awt.Color(255, 255, 255));
        AM_peso.setBorder(null);
        AM_peso.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(AM_peso, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Modificar_Arbitro.getContentPane().add(jSeparator45, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Modificar_Arbitro.getContentPane().add(jSeparator46, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel71.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setText("Peso Extra:");
        Modificar_Arbitro.getContentPane().add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel72.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setText("Peso Base:");
        Modificar_Arbitro.getContentPane().add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Modificar_Arbitro.getContentPane().add(AM_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Fecha de Nacimiento:");
        Modificar_Arbitro.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        AM_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AM_nombre.setForeground(new java.awt.Color(255, 255, 255));
        AM_nombre.setBorder(null);
        AM_nombre.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(AM_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Modificar_Arbitro.getContentPane().add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Nombre:");
        Modificar_Arbitro.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));
        Modificar_Arbitro.getContentPane().add(jSeparator48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 10));

        jLabel75.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setText("Identidad:");
        Modificar_Arbitro.getContentPane().add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        jLabel76.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setText("Modificar de Arbitro");
        Modificar_Arbitro.getContentPane().add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel77.setForeground(new java.awt.Color(153, 153, 153));
        jLabel77.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID del Arbitro a modificar  ");
        Modificar_Arbitro.getContentPane().add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel78.setForeground(new java.awt.Color(153, 153, 153));
        jLabel78.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Arbitro.getContentPane().add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        AM_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                AM_idItemStateChanged(evt);
            }
        });
        Modificar_Arbitro.getContentPane().add(AM_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 220, -1));

        Imagen_atras9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras9MouseClicked(evt);
            }
        });
        Modificar_Arbitro.getContentPane().add(Imagen_atras9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO12.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Club.setIconImage(null);
        Modificar_Club.setIconImages(null);
        Modificar_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton28.setText("Modificar");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        Modificar_Club.getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        CM_nombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        CM_nombre.setForeground(new java.awt.Color(255, 255, 255));
        CM_nombre.setBorder(null);
        CM_nombre.setOpaque(false);
        Modificar_Club.getContentPane().add(CM_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 220, 20));
        Modificar_Club.getContentPane().add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 220, 10));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Nombre:");
        Modificar_Club.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));
        Modificar_Club.getContentPane().add(jSeparator50, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 220, 10));

        jLabel80.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setText("ID:");
        Modificar_Club.getContentPane().add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));

        jLabel81.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setText("Modificar Club");
        Modificar_Club.getContentPane().add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel82.setForeground(new java.awt.Color(153, 153, 153));
        jLabel82.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID del Club a modificar  ");
        Modificar_Club.getContentPane().add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel83.setForeground(new java.awt.Color(153, 153, 153));
        jLabel83.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Club.getContentPane().add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        CM_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CM_idItemStateChanged(evt);
            }
        });
        Modificar_Club.getContentPane().add(CM_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 220, -1));

        Imagen_atras10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras10MouseClicked(evt);
            }
        });
        Modificar_Club.getContentPane().add(Imagen_atras10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO13.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Club.getContentPane().add(jbl_IMAGEN_FONDO13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Quiniela.setIconImage(null);
        Modificar_Quiniela.setIconImages(null);
        Modificar_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Modificar_Quiniela.getContentPane().add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, 10));

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Goles Visita:");
        Modificar_Quiniela.getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Goles Local:");
        Modificar_Quiniela.getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));
        Modificar_Quiniela.getContentPane().add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 220, 10));

        QM_monto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        QM_monto.setForeground(new java.awt.Color(255, 255, 255));
        QM_monto.setBorder(null);
        QM_monto.setOpaque(false);
        QM_monto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QM_montoActionPerformed(evt);
            }
        });
        Modificar_Quiniela.getContentPane().add(QM_monto, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 220, 20));

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Monto:");
        Modificar_Quiniela.getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jButton34.setText("Modificar");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        Modificar_Quiniela.getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("ID Partido:");
        Modificar_Quiniela.getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));
        Modificar_Quiniela.getContentPane().add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 10));

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("ID:");
        Modificar_Quiniela.getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel103.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Modificar Quiniela");
        Modificar_Quiniela.getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel104.setForeground(new java.awt.Color(153, 153, 153));
        jLabel104.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID de la predicción a modificar  ");
        Modificar_Quiniela.getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel105.setForeground(new java.awt.Color(153, 153, 153));
        jLabel105.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Quiniela.getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        QM_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                QM_idItemStateChanged(evt);
            }
        });
        Modificar_Quiniela.getContentPane().add(QM_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 220, -1));
        Modificar_Quiniela.getContentPane().add(QM_golesVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));
        Modificar_Quiniela.getContentPane().add(QM_golesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 220, -1));

        Modificar_Quiniela.getContentPane().add(QM_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 220, -1));

        Imagen_atras11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras11MouseClicked(evt);
            }
        });
        Modificar_Quiniela.getContentPane().add(Imagen_atras11, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO16.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Quiniela.getContentPane().add(jbl_IMAGEN_FONDO16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Jugador.setIconImage(null);
        Eliminar_Jugador.setIconImages(null);
        Eliminar_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton36.setText("Eliminar");
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        Eliminar_Jugador.getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Jugador.getContentPane().add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("ID:");
        Eliminar_Jugador.getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel111.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Eliminar Jugador");
        Eliminar_Jugador.getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel112.setForeground(new java.awt.Color(153, 153, 153));
        jLabel112.setText("Instrucciones: Seleccione el ID del jugador a borrar  ");
        Eliminar_Jugador.getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Eliminar_Jugador.getContentPane().add(EJ_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane6.setViewportView(jTable6);

        Eliminar_Jugador.getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 350, 530));

        Imagen_atras12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras12MouseClicked(evt);
            }
        });
        Eliminar_Jugador.getContentPane().add(Imagen_atras12, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO17.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Jugador.getContentPane().add(jbl_IMAGEN_FONDO17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Entrenador.setIconImage(null);
        Eliminar_Entrenador.setIconImages(null);
        Eliminar_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton38.setText("Eliminar");
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        Eliminar_Entrenador.getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Entrenador.getContentPane().add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("ID:");
        Eliminar_Entrenador.getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel114.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Eliminar Entrenador");
        Eliminar_Entrenador.getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel115.setForeground(new java.awt.Color(153, 153, 153));
        jLabel115.setText("Instrucciones: Seleccione el ID del Entrenador a borrar  ");
        Eliminar_Entrenador.getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Eliminar_Entrenador.getContentPane().add(EE_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        Imagen_atras13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras13MouseClicked(evt);
            }
        });
        Eliminar_Entrenador.getContentPane().add(Imagen_atras13, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO18.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Arbitro.setIconImage(null);
        Eliminar_Arbitro.setIconImages(null);
        Eliminar_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton40.setText("Eliminar");
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        Eliminar_Arbitro.getContentPane().add(jButton40, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Arbitro.getContentPane().add(jSeparator65, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel116.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setText("ID:");
        Eliminar_Arbitro.getContentPane().add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel117.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setText("Eliminar Arbitro");
        Eliminar_Arbitro.getContentPane().add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel118.setForeground(new java.awt.Color(153, 153, 153));
        jLabel118.setText("Instrucciones: Seleccione el ID del Arbitro a borrar  ");
        Eliminar_Arbitro.getContentPane().add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Eliminar_Arbitro.getContentPane().add(EA_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        Imagen_atras14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras14MouseClicked(evt);
            }
        });
        Eliminar_Arbitro.getContentPane().add(Imagen_atras14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO19.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Club.setIconImage(null);
        Eliminar_Club.setIconImages(null);
        Eliminar_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton42.setText("Eliminar");
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        Eliminar_Club.getContentPane().add(jButton42, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Club.getContentPane().add(jSeparator66, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel119.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setText("ID:");
        Eliminar_Club.getContentPane().add(jLabel119, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel120.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setText("Eliminar Club");
        Eliminar_Club.getContentPane().add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 70, -1, -1));

        jLabel121.setForeground(new java.awt.Color(153, 153, 153));
        jLabel121.setText("Instrucciones: Seleccione el ID del Club a borrar  ");
        Eliminar_Club.getContentPane().add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 170, -1, -1));

        Eliminar_Club.getContentPane().add(EC_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        Imagen_atras15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras15MouseClicked(evt);
            }
        });
        Eliminar_Club.getContentPane().add(Imagen_atras15, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO20.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Club.getContentPane().add(jbl_IMAGEN_FONDO20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Quiniela.setIconImage(null);
        Eliminar_Quiniela.setIconImages(null);
        Eliminar_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton48.setText("Eliminar");
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        Eliminar_Quiniela.getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Quiniela.getContentPane().add(jSeparator69, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("ID:");
        Eliminar_Quiniela.getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel129.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Eliminar Quiniela");
        Eliminar_Quiniela.getContentPane().add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setText("Instrucciones: Seleccione el ID de la predicción a borrar  ");
        Eliminar_Quiniela.getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        Eliminar_Quiniela.getContentPane().add(EQ_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        Imagen_atras16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras16MouseClicked(evt);
            }
        });
        Eliminar_Quiniela.getContentPane().add(Imagen_atras16, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, -1, -1));

        jbl_IMAGEN_FONDO23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO23.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Quiniela.getContentPane().add(jbl_IMAGEN_FONDO23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Listar_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Lista de Jugadores");
        Listar_Jugador.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 70));

        LT_Jugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Jugador.setEnabled(false);
        LT_Jugador.setOpaque(false);
        jScrollPane8.setViewportView(LT_Jugador);

        Listar_Jugador.getContentPane().add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras17MouseClicked(evt);
            }
        });
        Listar_Jugador.getContentPane().add(Imagen_atras17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Jugador.getContentPane().add(Jbl_FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Lista de Entrenador");
        Listar_Entrenador.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, -1, 70));

        LT_Entrenador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Entrenador.setEnabled(false);
        LT_Entrenador.setOpaque(false);
        jScrollPane9.setViewportView(LT_Entrenador);

        Listar_Entrenador.getContentPane().add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras18MouseClicked(evt);
            }
        });
        Listar_Entrenador.getContentPane().add(Imagen_atras18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Entrenador.getContentPane().add(Jbl_FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Lista de Arbitro");
        Listar_Arbitro.getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, 70));

        LT_Arbitro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Arbitro.setEnabled(false);
        LT_Arbitro.setOpaque(false);
        jScrollPane10.setViewportView(LT_Arbitro);

        Listar_Arbitro.getContentPane().add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras19MouseClicked(evt);
            }
        });
        Listar_Arbitro.getContentPane().add(Imagen_atras19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Arbitro.getContentPane().add(Jbl_FONDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Lista de Club");
        Listar_Club.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, 70));

        LT_Club.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Club.setEnabled(false);
        LT_Club.setOpaque(false);
        jScrollPane11.setViewportView(LT_Club);

        Listar_Club.getContentPane().add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras20MouseClicked(evt);
            }
        });
        Listar_Club.getContentPane().add(Imagen_atras20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Club.getContentPane().add(Jbl_FONDO3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Clubjugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Lista de Club jugador");
        Listar_Clubjugador.getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 30, -1, 70));

        LT_club_jugador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_club_jugador.setEnabled(false);
        LT_club_jugador.setOpaque(false);
        jScrollPane12.setViewportView(LT_club_jugador);

        Listar_Clubjugador.getContentPane().add(jScrollPane12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras21MouseClicked(evt);
            }
        });
        Listar_Clubjugador.getContentPane().add(Imagen_atras21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Jbl_FONDO4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Clubjugador.getContentPane().add(Jbl_FONDO4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Partido.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Lista de Partidos");
        Listar_Partido.getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 70));

        LT_Partidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Partidos.setEnabled(false);
        LT_Partidos.setOpaque(false);
        jScrollPane13.setViewportView(LT_Partidos);

        Listar_Partido.getContentPane().add(jScrollPane13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras22MouseClicked(evt);
            }
        });
        Listar_Partido.getContentPane().add(Imagen_atras22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Partido.getContentPane().add(Jbl_FONDO5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Lista de Quiniela");
        Listar_Quiniela.getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 40, -1, 70));

        LT_Quiniela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_Quiniela.setEnabled(false);
        LT_Quiniela.setOpaque(false);
        jScrollPane14.setViewportView(LT_Quiniela);

        Listar_Quiniela.getContentPane().add(jScrollPane14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras23MouseClicked(evt);
            }
        });
        Listar_Quiniela.getContentPane().add(Imagen_atras23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Quiniela.getContentPane().add(Jbl_FONDO6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Listar_Ganadores.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Myanmar Text", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Lista de Quiniela");
        Listar_Ganadores.getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, -1, 70));

        LT_ganadorQuinielas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        LT_ganadorQuinielas.setEnabled(false);
        LT_ganadorQuinielas.setOpaque(false);
        jScrollPane15.setViewportView(LT_ganadorQuinielas);

        Listar_Ganadores.getContentPane().add(jScrollPane15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 780, 410));

        Imagen_atras24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras24MouseClicked(evt);
            }
        });
        Listar_Ganadores.getContentPane().add(Imagen_atras24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        Jbl_FONDO7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Listar_fondo.png"))); // NOI18N
        Listar_Ganadores.getContentPane().add(Jbl_FONDO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, -1));

        Resultado_quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NE_visita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NE_visita.setForeground(new java.awt.Color(255, 255, 255));
        NE_visita.setText("Visita");
        Resultado_quiniela.getContentPane().add(NE_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 90, -1));

        GQ_visita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GQ_visita.setForeground(new java.awt.Color(255, 255, 255));
        GQ_visita.setText("0");
        Resultado_quiniela.getContentPane().add(GQ_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, 60, -1));

        NE_local.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NE_local.setForeground(new java.awt.Color(255, 255, 255));
        NE_local.setText("Local");
        Resultado_quiniela.getContentPane().add(NE_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 240, 90, -1));

        GR_visita.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GR_visita.setForeground(new java.awt.Color(255, 255, 255));
        GR_visita.setText("0");
        Resultado_quiniela.getContentPane().add(GR_visita, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 490, 60, -1));

        GQ_local.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GQ_local.setForeground(new java.awt.Color(255, 255, 255));
        GQ_local.setText("0");
        Resultado_quiniela.getContentPane().add(GQ_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 60, -1));

        Mensaje.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Mensaje.setForeground(new java.awt.Color(255, 255, 255));
        Mensaje.setText("Mensaje...");
        Resultado_quiniela.getContentPane().add(Mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 600, 280, -1));

        GR_local.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        GR_local.setForeground(new java.awt.Color(255, 255, 255));
        GR_local.setText("0");
        Resultado_quiniela.getContentPane().add(GR_local, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 60, -1));

        JQ_id.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JQ_idItemStateChanged(evt);
            }
        });
        Resultado_quiniela.getContentPane().add(JQ_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, 310, 30));

        Imagen_atras25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        Imagen_atras25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Imagen_atras25MouseClicked(evt);
            }
        });
        Resultado_quiniela.getContentPane().add(Imagen_atras25, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        lbl_Fondo_Imagen.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbl_Fondo_Imagen.setForeground(new java.awt.Color(255, 255, 255));
        lbl_Fondo_Imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ganadores_quiniela.png"))); // NOI18N
        Resultado_quiniela.getContentPane().add(lbl_Fondo_Imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quinielas de Futbol");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton9.setText("Resultados");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 350, 220, 30));

        jbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vs.png"))); // NOI18N
        getContentPane().add(jbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jMenuBar1.setPreferredSize(new java.awt.Dimension(105, 40));

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear.png"))); // NOI18N
        jMenu1.setText("Crear");
        jMenu1.setToolTipText("");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("Jugador");
        jCheckBoxMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugador-de-futbol (1).png"))); // NOI18N
        jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem1);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Entrenador");
        jCheckBoxMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrenador.png"))); // NOI18N
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Arbitro");
        jCheckBoxMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arbitro-de-futbol.png"))); // NOI18N
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Club");
        jCheckBoxMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/club.png"))); // NOI18N
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jCheckBoxMenuItem4);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prediccion.png"))); // NOI18N
        jMenuItem2.setText("Quiniela");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbol-americano.png"))); // NOI18N
        jMenuItem4.setText("Club Jugador");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem4);

        jMenuItem16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbodl.png"))); // NOI18N
        jMenuItem16.setText("Partido");
        jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem16ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem16);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Boton de editar.png"))); // NOI18N
        jMenu2.setText("Modificar");

        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugador-de-futbol (1).png"))); // NOI18N
        jMenuItem5.setText("Jugador");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrenador.png"))); // NOI18N
        jMenuItem6.setText("Entrenador");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arbitro-de-futbol.png"))); // NOI18N
        jMenuItem7.setText("Arbitro");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem7);

        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/club.png"))); // NOI18N
        jMenuItem8.setText("Club");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prediccion.png"))); // NOI18N
        jMenuItem11.setText("Quiniela");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/eliminar_24px.png"))); // NOI18N
        jMenu3.setText("Eliminar");

        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugador-de-futbol (1).png"))); // NOI18N
        jMenuItem12.setText("Jugador");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrenador.png"))); // NOI18N
        jMenuItem13.setText("Entrenador");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem13);

        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arbitro-de-futbol.png"))); // NOI18N
        jMenuItem14.setText("Arbitro");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/club.png"))); // NOI18N
        jMenuItem15.setText("Club");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem15);

        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prediccion.png"))); // NOI18N
        jMenuItem18.setText("Quiniela");
        jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem18ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem18);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/portapapeles.png"))); // NOI18N
        jMenu4.setText("Listar");

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/jugador-de-futbol (1).png"))); // NOI18N
        jMenuItem1.setText("Jugador");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/entrenador.png"))); // NOI18N
        jMenuItem3.setText("Entrenador");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem3);

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/arbitro-de-futbol.png"))); // NOI18N
        jMenuItem9.setText("Arbitro");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem9);

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/club.png"))); // NOI18N
        jMenuItem10.setText("Club");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem10);

        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/prediccion.png"))); // NOI18N
        jMenuItem17.setText("Quiniela");
        jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem17ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem17);

        jMenuItem19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/torneo.png"))); // NOI18N
        jMenuItem19.setText("Club Jugador");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem19);

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbodl.png"))); // NOI18N
        jMenuItem20.setText("Partido");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem20);

        jMenuItem21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ganadores.png"))); // NOI18N
        jMenuItem21.setText("Ganadores");
        jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem21ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem21);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
        //Registro_jugador.setVisible(true);
        //Registro_jugador.setModal(true);
        //Registro_jugador.pack();
        //Registro_jugador.setLocationRelativeTo(this);

        Registro_Jugador.setModal(true);
        Registro_Jugador.pack();
        Registro_Jugador.setLocationRelativeTo(this);
        Registro_Jugador.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        // TODO add your handling code here:
        Registro_Arbitro.setModal(true);
        Registro_Arbitro.pack();
        Registro_Arbitro.setLocationRelativeTo(this);
        Registro_Arbitro.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("partido");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("id");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            quiniela_partido.setModel(comboBoxModel);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("partido");

            // Obtener todos los documentos de la colección "partidos"
            List<Document> partidos = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Local");
            tableModel.addColumn("Visita");

            // Recorrer la lista de partidos y agregar filas al modelo de tabla
            for (Document partido : partidos) {
                String id = partido.getString("id");
                String local = partido.getString("local");
                String visita = partido.getString("visita");
                tableModel.addRow(new Object[]{id, local, visita});
            }

            // Establecer el modelo de tabla en la JTable
            TB_partidos.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
//

        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");

            // Obtener el último ID de la tabla quiniela
            Document lastQuiniela = collection.find().sort(new Document("id", -1)).first();
            String lastId = lastQuiniela != null ? lastQuiniela.getString("id") : "Q0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "Q" + (lastIdNumber + 1);

            NQ_id.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//
        Registro_Quiniela.setModal(true);
        Registro_Quiniela.pack();
        Registro_Quiniela.setLocationRelativeTo(this);
        Registro_Quiniela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            AM_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
        Modificar_Arbitro.setModal(true);
        Modificar_Arbitro.pack();
        Modificar_Arbitro.setLocationRelativeTo(this);
        Modificar_Arbitro.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EC_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }          // TODO add your handling code here:
        Eliminar_Club.setModal(true);
        Eliminar_Club.pack();
        Eliminar_Club.setLocationRelativeTo(this);
        Eliminar_Club.setVisible(true);
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("jugadores");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("identidad");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                CJ_player.setModel(comboBoxModel);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("clubes");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("identidad");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                CJ_club.setModel(comboBoxModel);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }

        // club
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            // Obtener todos los documentos de la colección "club"
            List<Document> equipos = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");

            // Recorrer la lista de equipos y agregar filas al modelo de tabla
            for (Document equipo : equipos) {
                String id = equipo.getString("identidad");
                String nombre = equipo.getString("nombre");
                tableModel.addRow(new Object[]{id, nombre});
            }

            // Establecer el modelo de tabla en la JTable
            TB_club.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //jugadores
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");

            // Obtener todos los documentos de la colección "jugadores"
            List<Document> jugadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("Identidad");
            tableModel.addColumn("Nombre");

            // Recorrer la lista de jugadores y agregar filas al modelo de tabla
            for (Document jugador : jugadores) {
                String identidad = jugador.getString("identidad");
                String nombre = jugador.getString("nombre");
                tableModel.addRow(new Object[]{identidad, nombre});
            }

            // Establecer el modelo de tabla en la JTable
            TB_jugadores.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

//**
        Registro_Clubjugador.setModal(true);
        Registro_Clubjugador.pack();
        Registro_Clubjugador.setLocationRelativeTo(this);
        Registro_Clubjugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void player_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_player_idActionPerformed

    private void DT_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DT_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DT_idActionPerformed

    private void arbitro_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arbitro_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_arbitro_idActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (club_nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campo vacío, ingrese la información en todos los campos");
                club_nombre.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("clubes");

                // Obtener la cantidad de registros en la tabla clubes
                long clubesCount = collection.countDocuments();

                // Generar el valor de identidad del club
                String identidad = "C" + (clubesCount + 1);

                String nombre = club_nombre.getText();
                String entrenadorSeleccionado = club_entrenador.getSelectedItem().toString();
                Document club = new Document()
                        .append("identidad", identidad)
                        .append("nombre", nombre)
                        .append("entrenador", entrenadorSeleccionado);
                collection.insertOne(club);
                JOptionPane.showMessageDialog(null, "Club creado correctamente.");
                System.out.println("Clubes existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                lbl_id.setText("");
                club_nombre.setText("");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            // Obtener el último ID de la tabla clubes
            Document lastClub = collection.find().sort(new Document("identidad", -1)).first();
            String lastId = lastClub != null ? lastClub.getString("identidad") : "C0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "C" + (lastIdNumber + 1);

            lbl_id.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            String clubSeleccionado = CJ_club.getSelectedItem().toString();
            String jugadorSeleccionado = CJ_player.getSelectedItem().toString();

            if (clubSeleccionado.equals("") || jugadorSeleccionado.equals("")) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, seleccione un club y un jugador");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("equipo_jugador");

                Document equipoJugador = new Document()
                        .append("club", clubSeleccionado)
                        .append("jugador", jugadorSeleccionado);

                collection.insertOne(equipoJugador);
                JOptionPane.showMessageDialog(null, "Relación equipo-jugador creada correctamente.");
                System.out.println("Relaciones equipo-jugador existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");
            String identidad = CM_id.getSelectedItem() + "";
            String nombre = CM_nombre.getText();

            // Construir la consulta para encontrar al club a modificar
            Document query = new Document("identidad", identidad);

            // Construir los nuevos valores a actualizar
            Document update = new Document("$set", new Document()
                    .append("nombre", nombre));

            // Ejecutar la actualización del club
            UpdateResult result = collection.updateOne(query, update);

            if (result.getModifiedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Club modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el club con el ID especificado.");
            }

            System.out.println("Clubes existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            CM_id.setSelectedItem(null);
            CM_nombre.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void QM_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QM_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QM_montoActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");

            String id = QM_id.getSelectedItem() + "";
            String partidoId = QM_partido.getSelectedItem() + "";
            double monto = Double.parseDouble(QM_monto.getText());
            int golesLocal = Integer.parseInt(QM_golesLocal.getText());
            int golesVisita = Integer.parseInt(QM_golesVisita.getText());

            // Construir la consulta para encontrar la quiniela a modificar
            Document query = new Document("id", id);

            // Construir los nuevos valores a actualizar
            Document update = new Document("$set", new Document()
                    .append("partido", partidoId)
                    .append("monto", monto)
                    .append("golesLocal", golesLocal)
                    .append("golesVisita", golesVisita));

            // Ejecutar la actualización de la quiniela
            UpdateResult result = collection.updateOne(query, update);

            if (result.getModifiedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Quiniela modificada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la quiniela con el ID especificado.");
            }

            System.out.println("Quinielas existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            QM_id.setSelectedItem(null);
            QM_partido.setSelectedItem(null);
            QM_monto.setText("");
            QM_golesLocal.setText("");
            QM_golesVisita.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        // TODO add your handling code here:
        Registro_Entrenador.setModal(true);
        Registro_Entrenador.pack();
        Registro_Entrenador.setLocationRelativeTo(this);
        Registro_Entrenador.setVisible(true);
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            club_entrenador.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        //tabla
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");

            // Obtener todos los documentos de la colección "entrenadores"
            List<Document> entrenadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");

            // Recorrer la lista de entrenadores y agregar filas al modelo de tabla
            for (Document entrenador : entrenadores) {
                String id = entrenador.getString("identidad");
                String nombre = entrenador.getString("nombre");
                tableModel.addRow(new Object[]{id, nombre});
            }

            // Establecer el modelo de tabla en la JTable
            TB_entrenadores.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // id
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            // Obtener el último ID de la tabla clubes
            Document lastClub = collection.find().sort(new Document("identidad", -1)).first();
            String lastId = lastClub != null ? lastClub.getString("identidad") : "C0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "C" + (lastIdNumber + 1);

            lbl_id.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        //
        Registro_Club.setModal(true);
        Registro_Club.pack();
        Registro_Club.setLocationRelativeTo(this);
        Registro_Club.setVisible(true);


    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            PM_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Modificar_Jugador.setModal(true);
        Modificar_Jugador.pack();
        Modificar_Jugador.setLocationRelativeTo(this);
        Modificar_Jugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EM_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Modificar_Entrenador.setModal(true);
        Modificar_Entrenador.pack();
        Modificar_Entrenador.setLocationRelativeTo(this);
        Modificar_Entrenador.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            CM_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
        Modificar_Club.setModal(true);
        Modificar_Club.pack();
        Modificar_Club.setLocationRelativeTo(this);
        Modificar_Club.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("quiniela");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("id");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                QM_id.setModel(comboBoxModel);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("partido");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("id");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                QM_partido.setModel(comboBoxModel);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        Modificar_Quiniela.setModal(true);
        Modificar_Quiniela.pack();
        Modificar_Quiniela.setLocationRelativeTo(this);
        Modificar_Quiniela.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EJ_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }        // TODO add your handling code here:
        Eliminar_Jugador.setModal(true);
        Eliminar_Jugador.pack();
        Eliminar_Jugador.setLocationRelativeTo(this);
        Eliminar_Jugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EE_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }          // TODO add your handling code here:
        Eliminar_Entrenador.setModal(true);
        Eliminar_Entrenador.pack();
        Eliminar_Entrenador.setLocationRelativeTo(this);
        Eliminar_Entrenador.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EA_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }          // TODO add your handling code here:
        Eliminar_Arbitro.setModal(true);
        Eliminar_Arbitro.pack();
        Eliminar_Arbitro.setLocationRelativeTo(this);
        Eliminar_Arbitro.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("id");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EQ_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }          // TODO add your handling code here:
        Eliminar_Quiniela.setModal(true);
        Eliminar_Quiniela.pack();
        Eliminar_Quiniela.setLocationRelativeTo(this);
        Eliminar_Quiniela.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if ((player_id.getText().equals("") || player_name.getText().equals("") || player_persoExtra.getText().equals("") || player_peso.getText().equals("") || player_date.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "Campos vacios, ingrese la informacion en todos los campos");
                player_id.setText("");
                player_name.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                player_date.setDate(fechaActual);
                player_peso.setText("");
                player_persoExtra.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("jugadores");
                String identidad = player_id.getText();
                String nombre = player_name.getText();
                Date fechaNacimiento = player_date.getDate();
                double pesoBase = Double.parseDouble(player_peso.getText());
                double pesoExtra = Double.parseDouble(player_persoExtra.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);
                Document jugador = new Document()
                        .append("identidad", identidad)
                        .append("nombre", nombre)
                        .append("fechaNacimiento", fechaNacimientoFormatted)
                        .append("pesoBase", pesoBase)
                        .append("pesoExtra", pesoExtra);
                collection.insertOne(jugador);
                JOptionPane.showMessageDialog(null, "Jugador creado correctamente.");
                System.out.println("Jugadores existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                player_id.setText("");
                player_name.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                player_date.setDate(fechaActual);
                player_peso.setText("");
                player_persoExtra.setText("");
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if ((DT_id.getText().equals("") || DT_nombre.getText().equals("") || DT_peso.getText().equals("") || DT_date.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                DT_id.setText("");
                DT_nombre.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                DT_date.setDate(fechaActual);
                DT_peso.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("entrenadores");
                String identidad = DT_id.getText();
                String nombre = DT_nombre.getText();
                Date fechaNacimiento = DT_date.getDate();
                double pesoBase = Double.parseDouble(DT_peso.getText());
                double pesoExtra = Double.parseDouble(DT_pesoExtra.getText()); // Agregué DT_pesoExtra a los campos del entrenador
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);
                Document entrenador = new Document()
                        .append("identidad", identidad)
                        .append("nombre", nombre)
                        .append("fechaNacimiento", fechaNacimientoFormatted)
                        .append("pesoBase", pesoBase)
                        .append("pesoExtra", pesoExtra);
                collection.insertOne(entrenador);
                JOptionPane.showMessageDialog(null, "Entrenador creado correctamente.");
                System.out.println("Entrenadores existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                DT_id.setText("");
                DT_nombre.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                DT_date.setDate(fechaActual);
                DT_peso.setText("");
                DT_pesoExtra.setText(""); // Agregué DT_pesoExtra a los campos del entrenador
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if ((arbitro_id.getText().equals("") || arbitro_nombre.getText().equals("") || arbitro_peso.getText().equals("") || arbitro_date.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                arbitro_id.setText("");
                arbitro_nombre.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                arbitro_date.setDate(fechaActual);
                arbitro_peso.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("arbitro");
                String identidad = arbitro_id.getText();
                String nombre = arbitro_nombre.getText();
                Date fechaNacimiento = arbitro_date.getDate();
                double pesoBase = Double.parseDouble(arbitro_peso.getText());
                double pesoExtra = Double.parseDouble(arbitro_pesoExtra.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);
                Document arbitro = new Document()
                        .append("identidad", identidad)
                        .append("nombre", nombre)
                        .append("fechaNacimiento", fechaNacimientoFormatted)
                        .append("pesoBase", pesoBase)
                        .append("pesoExtra", pesoExtra);
                collection.insertOne(arbitro);
                JOptionPane.showMessageDialog(null, "Árbitro creado correctamente.");
                System.out.println("Árbitros existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                arbitro_id.setText("");
                arbitro_nombre.setText("");
                Calendar calendar = Calendar.getInstance();
                java.util.Date fechaActual = calendar.getTime();
                arbitro_date.setDate(fechaActual);
                arbitro_peso.setText("");
                arbitro_pesoExtra.setText("");
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
        // id equipo
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("clubes");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("nombre");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                DefaultComboBoxModel<String> comboBoxModel2 = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                partido_local.setModel(comboBoxModel);
                partido_visita.setModel(comboBoxModel2);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
// arbitro
        {
            String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
            MongoClientURI uri = new MongoClientURI(connectionString);
            try (MongoClient mongoClient = new MongoClient(uri)) {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("arbitro");
                List<String> identidades = new ArrayList<>();

                for (Document doc : collection.find()) {
                    String identidad = doc.getString("identidad");
                    identidades.add(identidad);
                }

                DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                DefaultComboBoxModel<String> comboBoxMode2 = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
                DefaultComboBoxModel<String> comboBoxMode3 = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));

                partido_arbitro1.setModel(comboBoxModel);
                partido_arbitro2.setModel(comboBoxMode2);
                partido_arbitro3.setModel(comboBoxMode3);

                // Resto del código...
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
// tabla arbitro
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");

            // Obtener todos los documentos de la colección "arbitro"
            List<Document> arbitros = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");

            // Recorrer la lista de árbitros y agregar filas al modelo de tabla
            for (Document arbitro : arbitros) {
                String id = arbitro.getString("identidad");
                String nombre = arbitro.getString("nombre");
                tableModel.addRow(new Object[]{id, nombre});
            }

            // Establecer el modelo de tabla en la JTable
            TB_arbitros.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

// tabla equipos
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            // Obtener todos los documentos de la colección "club"
            List<Document> equipos = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");

            // Recorrer la lista de equipos y agregar filas al modelo de tabla
            for (Document equipo : equipos) {
                String id = equipo.getString("identidad");
                String nombre = equipo.getString("nombre");
                tableModel.addRow(new Object[]{id, nombre});
            }

            // Establecer el modelo de tabla en la JTable
            TB_equipos.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

//
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("partido");

            // Obtener el último ID de la tabla partido
            Document lastPartido = collection.find().sort(new Document("id", -1)).first();
            String lastId = lastPartido != null ? lastPartido.getString("id") : "P0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "P" + (lastIdNumber + 1);

            lb_partido.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

//
        Registro_Partido.setModal(true);
        Registro_Partido.pack();
        Registro_Partido.setLocationRelativeTo(this);
        Registro_Partido.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (partido_golesVisita.getText().equals("") || partido_golesLocal.getText().equals("") || partido_date.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                partido_golesVisita.setText("");
                partido_golesLocal.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("partido");

                // Obtener el último ID de la tabla partido
                Document lastPartido = collection.find().sort(new Document("id", -1)).first();
                String lastId = lastPartido != null ? lastPartido.getString("id") : "P0";

                // Obtener el número de ID y aumentarlo en 1
                int lastIdNumber = Integer.parseInt(lastId.substring(1));
                String newId = "P" + (lastIdNumber + 1);

                String id = newId;
                int golesVisita = Integer.parseInt(partido_golesVisita.getText());
                int golesLocal = Integer.parseInt(partido_golesLocal.getText());
                String local = partido_local.getSelectedItem().toString();
                String visita = partido_visita.getSelectedItem().toString();
                String arbitro1 = partido_arbitro1.getSelectedItem().toString();
                String arbitro2 = partido_arbitro2.getSelectedItem().toString();
                String arbitro3 = partido_arbitro3.getSelectedItem().toString();
                Date fechaPartido = partido_date.getDate();
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaPartidoFormatted = dateFormat.format(fechaPartido);
                Document partido = new Document()
                        .append("id", id)
                        .append("golesVisita", golesVisita)
                        .append("golesLocal", golesLocal)
                        .append("local", local)
                        .append("visita", visita)
                        .append("arbitro1", arbitro1)
                        .append("arbitro2", arbitro2)
                        .append("arbitro3", arbitro3)
                        .append("fechaPartido", fechaPartidoFormatted);
                collection.insertOne(partido);
                JOptionPane.showMessageDialog(null, "Partido creado correctamente.");
                System.out.println("Partidos existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                partido_golesVisita.setText("");
                partido_golesLocal.setText("");
                partido_date.setDate(null);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("partido");

            // Obtener el último ID de la tabla partido
            Document lastPartido = collection.find().sort(new Document("id", -1)).first();
            String lastId = lastPartido != null ? lastPartido.getString("id") : "P0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "P" + (lastIdNumber + 1);

            lb_partido.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (quiniela_monto.getText().equals("") || quiniela_golesLocal.getText().equals("") || quiniela_golesVisita.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                quiniela_monto.setText("");
                quiniela_golesLocal.setText("");
                quiniela_golesVisita.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("quiniela");

                // Obtener el tamaño actual de la tabla quiniela
                long quinielaCount = collection.countDocuments();

                // Generar el nuevo ID de la quiniela
                String newId = "Q" + (quinielaCount + 1);

                double monto = Double.parseDouble(quiniela_monto.getText());
                int golesLocal = Integer.parseInt(quiniela_golesLocal.getText());
                int golesVisita = Integer.parseInt(quiniela_golesVisita.getText());
                String partidoSeleccionado = quiniela_partido.getSelectedItem().toString();
                Document quiniela = new Document()
                        .append("id", newId)
                        .append("monto", monto)
                        .append("golesLocal", golesLocal)
                        .append("golesVisita", golesVisita)
                        .append("partido", partidoSeleccionado);
                collection.insertOne(quiniela);
                JOptionPane.showMessageDialog(null, "Quiniela creada correctamente.");
                System.out.println("Quinielas existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                quiniela_monto.setText("");
                quiniela_golesLocal.setText("");
                quiniela_golesVisita.setText("");

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");

            // Obtener el último ID de la tabla quiniela
            Document lastQuiniela = collection.find().sort(new Document("id", -1)).first();
            String lastId = lastQuiniela != null ? lastQuiniela.getString("id") : "Q0";

            // Obtener el número de ID y aumentarlo en 1
            int lastIdNumber = Integer.parseInt(lastId.substring(1));
            String newId = "Q" + (lastIdNumber + 1);

            NQ_id.setText(newId);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void quiniela_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiniela_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quiniela_montoActionPerformed

    private void PM_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_PM_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");
            String nombre = "";
            Date fecha = null;
            double peso = 0;
            double pesoExtra = 0;
            Document query = new Document("identidad", PM_id.getSelectedItem());
            Document jugador = collection.find(query).first();
            if (jugador != null) {
                nombre = jugador.getString("nombre");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    fecha = dateFormat.parse(jugador.getString("fechaNacimiento"));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                peso = jugador.getDouble("pesoBase");
                pesoExtra = jugador.getDouble("pesoExtra");
            }
            PM_nombre.setText(nombre);
            PM_date.setDate(fecha);
            PM_peso.setText(Double.toString(peso));
            PM_pesoExtra.setText(Double.toString(pesoExtra));

        } catch (Exception ex) {
            ex.printStackTrace();
        }


    }//GEN-LAST:event_PM_idItemStateChanged

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if ((PM_nombre.getText().isEmpty() || PM_peso.getText().isEmpty() || PM_pesoExtra.getText().isEmpty() || PM_date.getDate() == null)) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("jugadores");
                String identidad = PM_id.getSelectedItem() + "";
                String nombre = PM_nombre.getText();
                Date fechaNacimiento = PM_date.getDate();
                double pesoBase = Double.parseDouble(PM_peso.getText());
                double pesoExtra = Double.parseDouble(PM_pesoExtra.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);

                // Construir la consulta para encontrar al jugador a modificar
                Document query = new Document("identidad", identidad);

                // Construir los nuevos valores a actualizar
                Document update = new Document("$set", new Document()
                        .append("nombre", nombre)
                        .append("fechaNacimiento", fechaNacimientoFormatted)
                        .append("pesoBase", pesoBase)
                        .append("pesoExtra", pesoExtra));

                // Ejecutar la actualización del jugador
                UpdateResult result = collection.updateOne(query, update);

                if (result.getModifiedCount() > 0) {
                    JOptionPane.showMessageDialog(null, "Jugador modificado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el jugador con el ID especificado.");
                }

                System.out.println("Jugadores existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
            }

            // Resto del código para limpiar los campos
            PM_id.setSelectedItem(null);
            PM_nombre.setText("");
            Calendar calendar = Calendar.getInstance();
            java.util.Date fechaActual = calendar.getTime();
            PM_date.setDate(fechaActual);
            PM_peso.setText("");
            PM_pesoExtra.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton22ActionPerformed

    private void EM_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_EM_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");
            String nombre = "";
            Date fecha = null;
            double peso = 0;
            double pesoExtra = 0;
            Document query = new Document("identidad", EM_id.getSelectedItem());
            Document entrenador = collection.find(query).first();
            if (entrenador != null) {
                nombre = entrenador.getString("nombre");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    fecha = dateFormat.parse(entrenador.getString("fechaNacimiento"));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                peso = entrenador.getDouble("pesoBase");
                pesoExtra = entrenador.getDouble("pesoExtra");
            }
            EM_nombre.setText(nombre);
            EM_date.setDate(fecha);
            EM_peso.setText(Double.toString(peso));
            EM_pesoExtra.setText(Double.toString(pesoExtra));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_EM_idItemStateChanged

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (EM_nombre.getText().isEmpty() || EM_peso.getText().isEmpty() || EM_pesoExtra.getText().isEmpty() || EM_date.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("entrenadores");
                String identidad = EM_id.getSelectedItem() + "";
                String nombre = EM_nombre.getText();
                Date fechaNacimiento = EM_date.getDate();
                double pesoBase = Double.parseDouble(EM_peso.getText());
                double pesoExtra = Double.parseDouble(EM_pesoExtra.getText());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);

                // Construir la consulta para encontrar al entrenador a modificar
                Document query = new Document("identidad", identidad);

                // Construir los nuevos valores a actualizar
                Document update = new Document("$set", new Document()
                        .append("nombre", nombre)
                        .append("fechaNacimiento", fechaNacimientoFormatted)
                        .append("pesoBase", pesoBase)
                        .append("pesoExtra", pesoExtra));

                // Ejecutar la actualización del entrenador
                UpdateResult result = collection.updateOne(query, update);

                if (result.getModifiedCount() > 0) {
                    JOptionPane.showMessageDialog(null, "Entrenador modificado correctamente.");
                } else {
                    JOptionPane.showMessageDialog(null, "No se encontró el entrenador con el ID especificado.");
                }

                System.out.println("Entrenadores existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
            }

            // Resto del código para limpiar los campos
            EM_id.setSelectedItem(null);
            EM_nombre.setText("");
            Calendar calendar = Calendar.getInstance();
            java.util.Date fechaActual = calendar.getTime();
            EM_date.setDate(fechaActual);
            EM_peso.setText("");
            EM_pesoExtra.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_jButton24ActionPerformed

    private void AM_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_AM_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");
            String nombre = "";
            Date fecha = null;
            double peso = 0;
            double pesoExtra = 0;
            Document query = new Document("identidad", AM_id.getSelectedItem());
            Document arbitro = collection.find(query).first();
            if (arbitro != null) {
                nombre = arbitro.getString("nombre");
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    fecha = dateFormat.parse(arbitro.getString("fechaNacimiento"));
                } catch (ParseException ex) {
                    ex.printStackTrace();
                }
                peso = arbitro.getDouble("pesoBase");
                pesoExtra = arbitro.getDouble("pesoExtra");
            }
            AM_nombre.setText(nombre);
            AM_date.setDate(fecha);
            AM_peso.setText(Double.toString(peso));
            AM_pesoExtra.setText(Double.toString(pesoExtra));

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_AM_idItemStateChanged

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");
            String identidad = AM_id.getSelectedItem() + "";
            String nombre = AM_nombre.getText();
            Date fechaNacimiento = AM_date.getDate();
            double pesoBase = Double.parseDouble(AM_peso.getText());
            double pesoExtra = Double.parseDouble(AM_pesoExtra.getText());
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            String fechaNacimientoFormatted = dateFormat.format(fechaNacimiento);

            // Construir la consulta para encontrar al árbitro a modificar
            Document query = new Document("identidad", identidad);

            // Construir los nuevos valores a actualizar
            Document update = new Document("$set", new Document()
                    .append("nombre", nombre)
                    .append("fechaNacimiento", fechaNacimientoFormatted)
                    .append("pesoBase", pesoBase)
                    .append("pesoExtra", pesoExtra));

            // Ejecutar la actualización del árbitro
            UpdateResult result = collection.updateOne(query, update);

            if (result.getModifiedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Árbitro modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el árbitro con el ID especificado.");
            }

            System.out.println("Árbitros existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            AM_id.setSelectedItem(null);
            AM_nombre.setText("");
            Calendar calendar = Calendar.getInstance();
            java.util.Date fechaActual = calendar.getTime();
            AM_date.setDate(fechaActual);
            AM_peso.setText("");
            AM_pesoExtra.setText("");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26ActionPerformed

    private void CM_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CM_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");
            String nombre = "";
            Document query = new Document("identidad", CM_id.getSelectedItem());
            Document club = collection.find(query).first();
            if (club != null) {
                nombre = club.getString("nombre");
            }
            CM_nombre.setText(nombre);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_CM_idItemStateChanged

    private void QM_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_QM_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");
            String id = QM_id.getSelectedItem() + "";
            Document query = new Document("id", id);
            Document quiniela = collection.find(query).first();
            if (quiniela != null) {
                double monto = quiniela.getDouble("monto");
                int golesLocal = quiniela.getInteger("golesLocal");
                int golesVisita = quiniela.getInteger("golesVisita");
                String partidoId = quiniela.getString("partido");

                QM_monto.setText(Double.toString(monto));
                QM_golesLocal.setText(Integer.toString(golesLocal));
                QM_golesVisita.setText(Integer.toString(golesVisita));
                QM_partido.setSelectedItem(partidoId);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_QM_idItemStateChanged

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");

            String identidad = EJ_id.getSelectedItem() + "";

            // Construir la consulta para encontrar al jugador a eliminar
            Document query = new Document("identidad", identidad);

            // Ejecutar la eliminación del jugador
            DeleteResult result = collection.deleteOne(query);

            if (result.getDeletedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Jugador eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el jugador con la identidad especificada.");
            }

            System.out.println("Jugadores existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            EJ_id.setSelectedItem(null);
            {

            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");

            String identidad = EE_id.getSelectedItem() + "";

            // Construir la consulta para encontrar al entrenador a eliminar
            Document query = new Document("identidad", identidad);

            // Ejecutar la eliminación del entrenador
            DeleteResult result = collection.deleteOne(query);

            if (result.getDeletedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Entrenador eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el entrenador con la identidad especificada.");
            }

            System.out.println("Entrenadores existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            EE_id.setSelectedItem(null);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EJ_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EE_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");

            String identidad = EA_id.getSelectedItem() + "";

            // Construir la consulta para encontrar al árbitro a eliminar
            Document query = new Document("identidad", identidad);

            // Ejecutar la eliminación del árbitro
            DeleteResult result = collection.deleteOne(query);

            if (result.getDeletedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Árbitro eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el árbitro con la identidad especificada.");
            }

            System.out.println("Árbitros existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            EA_id.setSelectedItem(null);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EA_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            String identidad = EC_id.getSelectedItem() + "";

            // Construir la consulta para encontrar al club a eliminar
            Document query = new Document("identidad", identidad);

            // Ejecutar la eliminación del club
            DeleteResult result = collection.deleteOne(query);

            if (result.getDeletedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Club eliminado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró el club con la identidad especificada.");
            }

            System.out.println("Clubes existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            EC_id.setSelectedItem(null);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("identidad");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EC_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");

            String identidad = EQ_id.getSelectedItem() + "";

            // Construir la consulta para encontrar la quiniela a eliminar
            Document query = new Document("id", identidad);

            // Ejecutar la eliminación de la quiniela
            DeleteResult result = collection.deleteOne(query);

            if (result.getDeletedCount() > 0) {
                JOptionPane.showMessageDialog(null, "Quiniela eliminada correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró la quiniela con la identidad especificada.");
            }

            System.out.println("Quinielas existentes:");
            for (Document doc : collection.find()) {
                System.out.println(doc.toJson());
            }

            // Resto del código para limpiar los campos
            EQ_id.setSelectedItem(null);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("id");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            EQ_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("jugadores");

            // Obtener todos los documentos de la colección "jugador"
            List<Document> jugadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("Identidad");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Fecha de Nacimiento");
            tableModel.addColumn("Peso Base");
            tableModel.addColumn("Peso Extra");

            // Recorrer la lista de jugadores y agregar filas al modelo de tabla
            for (Document jugador : jugadores) {
                String identidad = jugador.getString("identidad");
                String nombre = jugador.getString("nombre");
                String fechaNacimiento = jugador.getString("fechaNacimiento");
                double pesoBase = jugador.getDouble("pesoBase");
                double pesoExtra = jugador.getDouble("pesoExtra");
                tableModel.addRow(new Object[]{identidad, nombre, fechaNacimiento, pesoBase, pesoExtra});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Jugador.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Jugador.setModal(true);
        Listar_Jugador.pack();
        Listar_Jugador.setLocationRelativeTo(this);
        Listar_Jugador.setVisible(true);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");

            // Obtener todos los documentos de la colección "quiniela"
            List<Document> quinielas = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Monto");
            tableModel.addColumn("Goles Local");
            tableModel.addColumn("Goles Visita");
            tableModel.addColumn("Partido");

            // Recorrer la lista de quinielas y agregar filas al modelo de tabla
            for (Document quiniela : quinielas) {
                String id = quiniela.getString("id");
                double monto = quiniela.getDouble("monto");
                int golesLocal = quiniela.getInteger("golesLocal");
                int golesVisita = quiniela.getInteger("golesVisita");
                String partido = quiniela.getString("partido");
                tableModel.addRow(new Object[]{id, monto, golesLocal, golesVisita, partido});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Quiniela.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Quiniela.setModal(true);
        Listar_Quiniela.pack();
        Listar_Quiniela.setLocationRelativeTo(this);
        Listar_Quiniela.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem17ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("quiniela");
            List<String> identidades = new ArrayList<>();

            for (Document doc : collection.find()) {
                String identidad = doc.getString("id");
                identidades.add(identidad);
            }

            DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>(identidades.toArray(new String[0]));
            JQ_id.setModel(comboBoxModel);

            // Resto del código...
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Resultado_quiniela.setModal(true);
        Resultado_quiniela.pack();
        Resultado_quiniela.setLocationRelativeTo(this);
        Resultado_quiniela.setVisible(true);
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("entrenadores");

            // Obtener todos los documentos de la colección "entrenador"
            List<Document> entrenadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("Identidad");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Fecha de Nacimiento");
            tableModel.addColumn("Peso Base");
            tableModel.addColumn("Peso Extra");

            // Recorrer la lista de entrenadores y agregar filas al modelo de tabla
            for (Document entrenador : entrenadores) {
                String identidad = entrenador.getString("identidad");
                String nombre = entrenador.getString("nombre");
                String fechaNacimiento = entrenador.getString("fechaNacimiento");
                double pesoBase = entrenador.getDouble("pesoBase");
                double pesoExtra = entrenador.getDouble("pesoExtra");
                tableModel.addRow(new Object[]{identidad, nombre, fechaNacimiento, pesoBase, pesoExtra});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Entrenador.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Entrenador.setModal(true);
        Listar_Entrenador.pack();
        Listar_Entrenador.setLocationRelativeTo(this);
        Listar_Entrenador.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("arbitro");

            // Obtener todos los documentos de la colección "arbitro"
            List<Document> arbitros = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("Identidad");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Fecha de Nacimiento");
            tableModel.addColumn("Peso Base");
            tableModel.addColumn("Peso Extra");

            // Recorrer la lista de arbitros y agregar filas al modelo de tabla
            for (Document arbitro : arbitros) {
                String identidad = arbitro.getString("identidad");
                String nombre = arbitro.getString("nombre");
                String fechaNacimiento = arbitro.getString("fechaNacimiento");
                double pesoBase = arbitro.getDouble("pesoBase");
                double pesoExtra = arbitro.getDouble("pesoExtra");
                tableModel.addRow(new Object[]{identidad, nombre, fechaNacimiento, pesoBase, pesoExtra});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Arbitro.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Arbitro.setModal(true);
        Listar_Arbitro.pack();
        Listar_Arbitro.setLocationRelativeTo(this);
        Listar_Arbitro.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("clubes");

            // Obtener todos los documentos de la colección "clubes"
            List<Document> clubes = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Entrenador");

            // Recorrer la lista de clubes y agregar filas al modelo de tabla
            for (Document club : clubes) {
                String id = club.getString("identidad");
                String nombre = club.getString("nombre");
                String entrenador = club.getString("entrenador");
                tableModel.addRow(new Object[]{id, nombre, entrenador});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Club.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Club.setModal(true);
        Listar_Club.pack();
        Listar_Club.setLocationRelativeTo(this);
        Listar_Club.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("equipo_jugador");

            // Obtener todos los documentos de la colección "equipo_jugador"
            List<Document> clubJugadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("Club");
            tableModel.addColumn("Jugador");

            // Recorrer la lista de clubJugadores y agregar filas al modelo de tabla
            for (Document clubJugador : clubJugadores) {
                String club = clubJugador.getString("club");
                String jugador = clubJugador.getString("jugador");
                tableModel.addRow(new Object[]{club, jugador});
            }

            // Establecer el modelo de tabla en la JTable
            LT_club_jugador.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Clubjugador.setModal(true);
        Listar_Clubjugador.pack();
        Listar_Clubjugador.setLocationRelativeTo(this);
        Listar_Clubjugador.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed

        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("partido");

            // Obtener todos los documentos de la colección "partido"
            List<Document> partidos = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Goles Local");
            tableModel.addColumn("Goles Visita");
            tableModel.addColumn("Local");
            tableModel.addColumn("Visita");
            tableModel.addColumn("Árbitro 1");
            tableModel.addColumn("Árbitro 2");
            tableModel.addColumn("Árbitro 3");
            tableModel.addColumn("Fecha de Partido");

            // Recorrer la lista de partidos y agregar filas al modelo de tabla
            for (Document partido : partidos) {
                String id = partido.getString("id");
                int golesLocal = partido.getInteger("golesLocal");
                int golesVisita = partido.getInteger("golesVisita");
                String local = partido.getString("local");
                String visita = partido.getString("visita");
                String arbitro1 = partido.getString("arbitro1");
                String arbitro2 = partido.getString("arbitro2");
                String arbitro3 = partido.getString("arbitro3");
                String fechaPartido = partido.getString("fechaPartido");

                tableModel.addRow(new Object[]{id, golesLocal, golesVisita, local, visita, arbitro1, arbitro2, arbitro3, fechaPartido});
            }

            // Establecer el modelo de tabla en la JTable
            LT_Partidos.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Partido.setModal(true);
        Listar_Partido.pack();
        Listar_Partido.setLocationRelativeTo(this);
        Listar_Partido.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
            MongoCollection<Document> collection = database.getCollection("ganadores_quiniela");

            // Obtener todos los documentos de la colección "ganadores_quiniela"
            List<Document> ganadores = collection.find().into(new ArrayList<>());

            // Crear el modelo de tabla para la JTable
            DefaultTableModel tableModel = new DefaultTableModel();

            // Agregar las columnas al modelo de tabla
            tableModel.addColumn("ID");
            tableModel.addColumn("Nombre");
            tableModel.addColumn("Monto Ganado");

            // Recorrer la lista de ganadores y agregar filas al modelo de tabla
            for (Document ganador : ganadores) {
                String id = ganador.getString("id");
                String nombre = ganador.getString("nombre");
                double montoGanado = ganador.getDouble("montoGanado");

                tableModel.addRow(new Object[]{id, nombre, montoGanado});
            }

            // Establecer el modelo de tabla en la JTable
            LT_ganadorQuinielas.setModel(tableModel);

        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Listar_Ganadores.setModal(true);
        Listar_Ganadores.pack();
        Listar_Ganadores.setLocationRelativeTo(this);
        Listar_Ganadores.setVisible(true);
    }//GEN-LAST:event_jMenuItem21ActionPerformed

    private void JQ_idItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JQ_idItemStateChanged
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");

            // Obtener datos de la tabla quiniela
            MongoCollection<Document> quinielaCollection = database.getCollection("quiniela");
            String quinielaId = JQ_id.getSelectedItem() + "";
            Document quinielaQuery = new Document("id", quinielaId);
            Document quiniela = quinielaCollection.find(quinielaQuery).first();
            if (quiniela != null) {
                int golesLocal = quiniela.getInteger("golesLocal");
                int golesVisita = quiniela.getInteger("golesVisita");
                double montoQuiniela = quiniela.getDouble("monto");

                GQ_local.setText(Integer.toString(golesLocal));
                GQ_visita.setText(Integer.toString(golesVisita));

                // Obtener datos del partido asociado a la quiniela
                String partidoId = quiniela.getString("partido");
                MongoCollection<Document> partidoCollection = database.getCollection("partido");
                Document partidoQuery = new Document("id", partidoId);
                Document partido = partidoCollection.find(partidoQuery).first();
                if (partido != null) {
                    int golesLocalPartido = partido.getInteger("golesLocal");
                    int golesVisitaPartido = partido.getInteger("golesVisita");
                    String local = partido.getString("local");
                    String visita = partido.getString("visita");

                    GR_local.setText(Integer.toString(golesLocalPartido));
                    GR_visita.setText(Integer.toString(golesVisitaPartido));
                    NE_local.setText(local);
                    NE_visita.setText(visita);

                    if (golesLocal == golesLocalPartido && golesVisita == golesVisitaPartido) {
                        // Obtener datos de la tabla ganadores_quiniela
                        MongoCollection<Document> ganadoresQuinielaCollection = database.getCollection("ganadores_quiniela");
                        long ganadoresCount = ganadoresQuinielaCollection.countDocuments();

                        // Obtener el nombre de la persona ganadora
                        String nombreGanador = quiniela.getString("id");

                        // Crear nuevo documento de ganador_quiniela
                        Document ganadorQuiniela = new Document();
                        ganadorQuiniela.append("id", nombreGanador);
                        ganadorQuiniela.append("nombre", nombreGanador);
                        double montoGanado = montoQuiniela * 10;
                        ganadorQuiniela.append("montoGanado", montoGanado);

                        // Insertar documento en la tabla ganadores_quiniela
                        ganadoresQuinielaCollection.insertOne(ganadorQuiniela);

                        // Eliminar la quiniela registrada de la tabla quiniela
                        quinielaCollection.deleteOne(quinielaQuery);

                        Mensaje.setText("¡Felicidades, " + nombreGanador + ", ganaste!");
                    } else {
                        Mensaje.setText("!Gracias por participar!");
                    }
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }//GEN-LAST:event_JQ_idItemStateChanged

    private void Imagen_atrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atrasMouseClicked
        // TODO add your handling code here:
        Registro_Jugador.setModal(false);
        Registro_Jugador.pack();
       //Registro_Jugador.setLocationRelativeTo(this);
        Registro_Jugador.setVisible(false);
    }//GEN-LAST:event_Imagen_atrasMouseClicked

    private void Imagen_atras1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras1MouseClicked

    private void Imagen_atras2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras2MouseClicked

    private void Imagen_atras3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras3MouseClicked

    private void Imagen_atras4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras4MouseClicked

    private void Imagen_atras5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras5MouseClicked

    private void Imagen_atras6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras6MouseClicked

    private void Imagen_atras7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras7MouseClicked

    private void Imagen_atras8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras8MouseClicked

    private void Imagen_atras9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras9MouseClicked

    private void Imagen_atras10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras10MouseClicked

    private void Imagen_atras11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras11MouseClicked

    private void Imagen_atras12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras12MouseClicked

    private void Imagen_atras13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras13MouseClicked

    private void Imagen_atras14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras14MouseClicked

    private void Imagen_atras15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras15MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras15MouseClicked

    private void Imagen_atras16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras16MouseClicked

    private void Imagen_atras17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras17MouseClicked

    private void Imagen_atras18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras18MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras18MouseClicked

    private void Imagen_atras19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras19MouseClicked

    private void Imagen_atras20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras20MouseClicked

    private void Imagen_atras21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras21MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras21MouseClicked

    private void Imagen_atras22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras22MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras22MouseClicked

    private void Imagen_atras23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras23MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras23MouseClicked

    private void Imagen_atras24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras24MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras24MouseClicked

    private void Imagen_atras25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Imagen_atras25MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Imagen_atras25MouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser AM_date;
    private javax.swing.JComboBox<String> AM_id;
    private javax.swing.JTextField AM_nombre;
    private javax.swing.JTextField AM_peso;
    private javax.swing.JTextField AM_pesoExtra;
    private javax.swing.JComboBox<String> CJ_club;
    private javax.swing.JComboBox<String> CJ_player;
    private javax.swing.JComboBox<String> CM_id;
    private javax.swing.JTextField CM_nombre;
    private com.toedter.calendar.JDateChooser DT_date;
    private javax.swing.JTextField DT_id;
    private javax.swing.JTextField DT_nombre;
    private javax.swing.JTextField DT_peso;
    private javax.swing.JTextField DT_pesoExtra;
    private javax.swing.JComboBox<String> EA_id;
    private javax.swing.JComboBox<String> EC_id;
    private javax.swing.JComboBox<String> EE_id;
    private javax.swing.JComboBox<String> EJ_id;
    private com.toedter.calendar.JDateChooser EM_date;
    private javax.swing.JComboBox<String> EM_id;
    private javax.swing.JTextField EM_nombre;
    private javax.swing.JTextField EM_peso;
    private javax.swing.JTextField EM_pesoExtra;
    private javax.swing.JComboBox<String> EQ_id;
    private javax.swing.JDialog Eliminar_Arbitro;
    private javax.swing.JDialog Eliminar_Club;
    private javax.swing.JDialog Eliminar_Entrenador;
    private javax.swing.JDialog Eliminar_Jugador;
    private javax.swing.JDialog Eliminar_Quiniela;
    private javax.swing.JLabel GQ_local;
    private javax.swing.JLabel GQ_visita;
    private javax.swing.JLabel GR_local;
    private javax.swing.JLabel GR_visita;
    private javax.swing.JLabel Imagen_atras;
    private javax.swing.JLabel Imagen_atras1;
    private javax.swing.JLabel Imagen_atras10;
    private javax.swing.JLabel Imagen_atras11;
    private javax.swing.JLabel Imagen_atras12;
    private javax.swing.JLabel Imagen_atras13;
    private javax.swing.JLabel Imagen_atras14;
    private javax.swing.JLabel Imagen_atras15;
    private javax.swing.JLabel Imagen_atras16;
    private javax.swing.JLabel Imagen_atras17;
    private javax.swing.JLabel Imagen_atras18;
    private javax.swing.JLabel Imagen_atras19;
    private javax.swing.JLabel Imagen_atras2;
    private javax.swing.JLabel Imagen_atras20;
    private javax.swing.JLabel Imagen_atras21;
    private javax.swing.JLabel Imagen_atras22;
    private javax.swing.JLabel Imagen_atras23;
    private javax.swing.JLabel Imagen_atras24;
    private javax.swing.JLabel Imagen_atras25;
    private javax.swing.JLabel Imagen_atras3;
    private javax.swing.JLabel Imagen_atras4;
    private javax.swing.JLabel Imagen_atras5;
    private javax.swing.JLabel Imagen_atras6;
    private javax.swing.JLabel Imagen_atras7;
    private javax.swing.JLabel Imagen_atras8;
    private javax.swing.JLabel Imagen_atras9;
    private javax.swing.JComboBox<String> JQ_id;
    private javax.swing.JLabel Jbl_FONDO;
    private javax.swing.JLabel Jbl_FONDO1;
    private javax.swing.JLabel Jbl_FONDO2;
    private javax.swing.JLabel Jbl_FONDO3;
    private javax.swing.JLabel Jbl_FONDO4;
    private javax.swing.JLabel Jbl_FONDO5;
    private javax.swing.JLabel Jbl_FONDO6;
    private javax.swing.JLabel Jbl_FONDO7;
    private javax.swing.JTable LT_Arbitro;
    private javax.swing.JTable LT_Club;
    private javax.swing.JTable LT_Entrenador;
    private javax.swing.JTable LT_Jugador;
    private javax.swing.JTable LT_Partidos;
    private javax.swing.JTable LT_Quiniela;
    private javax.swing.JTable LT_club_jugador;
    private javax.swing.JTable LT_ganadorQuinielas;
    private javax.swing.JDialog Listar_Arbitro;
    private javax.swing.JDialog Listar_Club;
    private javax.swing.JDialog Listar_Clubjugador;
    private javax.swing.JDialog Listar_Entrenador;
    private javax.swing.JDialog Listar_Ganadores;
    private javax.swing.JDialog Listar_Jugador;
    private javax.swing.JDialog Listar_Partido;
    private javax.swing.JDialog Listar_Quiniela;
    private javax.swing.JLabel Mensaje;
    private javax.swing.JDialog Modificar_Arbitro;
    private javax.swing.JDialog Modificar_Club;
    private javax.swing.JDialog Modificar_Entrenador;
    private javax.swing.JDialog Modificar_Jugador;
    private javax.swing.JDialog Modificar_Quiniela;
    private javax.swing.JLabel NE_local;
    private javax.swing.JLabel NE_visita;
    private javax.swing.JLabel NQ_id;
    private com.toedter.calendar.JDateChooser PM_date;
    private javax.swing.JComboBox<String> PM_id;
    private javax.swing.JTextField PM_nombre;
    private javax.swing.JTextField PM_peso;
    private javax.swing.JTextField PM_pesoExtra;
    private javax.swing.JTextField QM_golesLocal;
    private javax.swing.JTextField QM_golesVisita;
    private javax.swing.JComboBox<String> QM_id;
    private javax.swing.JTextField QM_monto;
    private javax.swing.JComboBox<String> QM_partido;
    private javax.swing.JDialog Registro_Arbitro;
    private javax.swing.JDialog Registro_Club;
    private javax.swing.JDialog Registro_Clubjugador;
    private javax.swing.JDialog Registro_Entrenador;
    private javax.swing.JDialog Registro_Jugador;
    private javax.swing.JDialog Registro_Partido;
    private javax.swing.JDialog Registro_Quiniela;
    private javax.swing.JDialog Resultado_quiniela;
    private javax.swing.JTable TB_arbitros;
    private javax.swing.JTable TB_club;
    private javax.swing.JTable TB_entrenadores;
    private javax.swing.JTable TB_equipos;
    private javax.swing.JTable TB_jugadores;
    private javax.swing.JTable TB_partidos;
    private com.toedter.calendar.JDateChooser arbitro_date;
    private javax.swing.JTextField arbitro_id;
    private javax.swing.JTextField arbitro_nombre;
    private javax.swing.JTextField arbitro_peso;
    private javax.swing.JTextField arbitro_pesoExtra;
    private javax.swing.JComboBox<String> club_entrenador;
    private javax.swing.JTextField club_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator19;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator26;
    private javax.swing.JSeparator jSeparator28;
    private javax.swing.JSeparator jSeparator29;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator30;
    private javax.swing.JSeparator jSeparator31;
    private javax.swing.JSeparator jSeparator35;
    private javax.swing.JSeparator jSeparator36;
    private javax.swing.JSeparator jSeparator37;
    private javax.swing.JSeparator jSeparator38;
    private javax.swing.JSeparator jSeparator39;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator40;
    private javax.swing.JSeparator jSeparator41;
    private javax.swing.JSeparator jSeparator42;
    private javax.swing.JSeparator jSeparator43;
    private javax.swing.JSeparator jSeparator44;
    private javax.swing.JSeparator jSeparator45;
    private javax.swing.JSeparator jSeparator46;
    private javax.swing.JSeparator jSeparator47;
    private javax.swing.JSeparator jSeparator48;
    private javax.swing.JSeparator jSeparator49;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator50;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTable jTable6;
    private javax.swing.JLabel jbl_IMAGEN_FONDO;
    private javax.swing.JLabel jbl_IMAGEN_FONDO1;
    private javax.swing.JLabel jbl_IMAGEN_FONDO10;
    private javax.swing.JLabel jbl_IMAGEN_FONDO11;
    private javax.swing.JLabel jbl_IMAGEN_FONDO12;
    private javax.swing.JLabel jbl_IMAGEN_FONDO13;
    private javax.swing.JLabel jbl_IMAGEN_FONDO16;
    private javax.swing.JLabel jbl_IMAGEN_FONDO17;
    private javax.swing.JLabel jbl_IMAGEN_FONDO18;
    private javax.swing.JLabel jbl_IMAGEN_FONDO19;
    private javax.swing.JLabel jbl_IMAGEN_FONDO2;
    private javax.swing.JLabel jbl_IMAGEN_FONDO20;
    private javax.swing.JLabel jbl_IMAGEN_FONDO23;
    private javax.swing.JLabel jbl_IMAGEN_FONDO3;
    private javax.swing.JLabel jbl_IMAGEN_FONDO6;
    private javax.swing.JLabel jbl_IMAGEN_FONDO7;
    private javax.swing.JLabel jbl_IMAGEN_FONDO9;
    private javax.swing.JLabel jbl_fondo;
    private javax.swing.JLabel lb_partido;
    private javax.swing.JLabel lbl_Fondo_Imagen;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JComboBox<String> partido_arbitro1;
    private javax.swing.JComboBox<String> partido_arbitro2;
    private javax.swing.JComboBox<String> partido_arbitro3;
    private com.toedter.calendar.JDateChooser partido_date;
    private javax.swing.JTextField partido_golesLocal;
    private javax.swing.JTextField partido_golesVisita;
    private javax.swing.JComboBox<String> partido_local;
    private javax.swing.JComboBox<String> partido_visita;
    private com.toedter.calendar.JDateChooser player_date;
    private javax.swing.JTextField player_id;
    private javax.swing.JTextField player_name;
    private javax.swing.JTextField player_persoExtra;
    private javax.swing.JTextField player_peso;
    private javax.swing.JTextField quiniela_golesLocal;
    private javax.swing.JTextField quiniela_golesVisita;
    private javax.swing.JTextField quiniela_monto;
    private javax.swing.JComboBox<String> quiniela_partido;
    // End of variables declaration//GEN-END:variables

}

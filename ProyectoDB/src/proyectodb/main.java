package proyectodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

public class main extends javax.swing.JFrame {

    public main() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro_Jugador = new javax.swing.JDialog();
        jButton3 = new javax.swing.JButton();
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
        jbl_IMAGEN_FONDO = new javax.swing.JLabel();
        Registro_Entrenador = new javax.swing.JDialog();
        jButton4 = new javax.swing.JButton();
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
        jbl_IMAGEN_FONDO1 = new javax.swing.JLabel();
        Registro_Arbitro = new javax.swing.JDialog();
        jButton5 = new javax.swing.JButton();
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
        jbl_IMAGEN_FONDO2 = new javax.swing.JLabel();
        Registro_Club = new javax.swing.JDialog();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        club_nombre = new javax.swing.JTextField();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        club_id = new javax.swing.JTextField();
        jSeparator16 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        club_entrenador = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO3 = new javax.swing.JLabel();
        Registro_Quiniela = new javax.swing.JDialog();
        jSeparator23 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jSeparator19 = new javax.swing.JSeparator();
        quiniela_monto = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        quiniela_id = new javax.swing.JTextField();
        jSeparator22 = new javax.swing.JSeparator();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        quiniela_partido = new javax.swing.JComboBox<>();
        quiniela_golesVisita = new javax.swing.JTextField();
        quiniela_golesLocal = new javax.swing.JTextField();
        jbl_IMAGEN_FONDO6 = new javax.swing.JLabel();
        Registro_Partido = new javax.swing.JDialog();
        jLabel47 = new javax.swing.JLabel();
        jSeparator29 = new javax.swing.JSeparator();
        partido_golesLocal = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jLabel45 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jSeparator25 = new javax.swing.JSeparator();
        jSeparator26 = new javax.swing.JSeparator();
        jLabel30 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        partido_id = new javax.swing.JTextField();
        jSeparator28 = new javax.swing.JSeparator();
        jLabel43 = new javax.swing.JLabel();
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
        jbl_IMAGEN_FONDO7 = new javax.swing.JLabel();
        Registro_Clubjugador = new javax.swing.JDialog();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jSeparator35 = new javax.swing.JSeparator();
        jSeparator36 = new javax.swing.JSeparator();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        CJ_club = new javax.swing.JComboBox<>();
        CJ_player = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO9 = new javax.swing.JLabel();
        Modificar_Jugador = new javax.swing.JDialog();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jTextField40 = new javax.swing.JTextField();
        jTextField41 = new javax.swing.JTextField();
        jSeparator38 = new javax.swing.JSeparator();
        jSeparator39 = new javax.swing.JSeparator();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jDateChooser7 = new com.toedter.calendar.JDateChooser();
        jLabel59 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jSeparator40 = new javax.swing.JSeparator();
        jLabel60 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jSeparator41 = new javax.swing.JSeparator();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO10 = new javax.swing.JLabel();
        Modificar_Entrenador = new javax.swing.JDialog();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jTextField37 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jSeparator37 = new javax.swing.JSeparator();
        jSeparator42 = new javax.swing.JSeparator();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jDateChooser8 = new com.toedter.calendar.JDateChooser();
        jLabel65 = new javax.swing.JLabel();
        jTextField45 = new javax.swing.JTextField();
        jSeparator43 = new javax.swing.JSeparator();
        jLabel66 = new javax.swing.JLabel();
        jTextField46 = new javax.swing.JTextField();
        jSeparator44 = new javax.swing.JSeparator();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO11 = new javax.swing.JLabel();
        Modificar_Arbitro = new javax.swing.JDialog();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jSeparator45 = new javax.swing.JSeparator();
        jSeparator46 = new javax.swing.JSeparator();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jDateChooser9 = new com.toedter.calendar.JDateChooser();
        jLabel73 = new javax.swing.JLabel();
        jTextField49 = new javax.swing.JTextField();
        jSeparator47 = new javax.swing.JSeparator();
        jLabel74 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jSeparator48 = new javax.swing.JSeparator();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO12 = new javax.swing.JLabel();
        Modificar_Club = new javax.swing.JDialog();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jTextField51 = new javax.swing.JTextField();
        jSeparator49 = new javax.swing.JSeparator();
        jLabel79 = new javax.swing.JLabel();
        jTextField52 = new javax.swing.JTextField();
        jSeparator50 = new javax.swing.JSeparator();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO13 = new javax.swing.JLabel();
        Modificar_Equipo = new javax.swing.JDialog();
        jSeparator51 = new javax.swing.JSeparator();
        jTextField53 = new javax.swing.JTextField();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jTextField54 = new javax.swing.JTextField();
        jLabel84 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jSeparator52 = new javax.swing.JSeparator();
        jLabel85 = new javax.swing.JLabel();
        jTextField56 = new javax.swing.JTextField();
        jSeparator53 = new javax.swing.JSeparator();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO14 = new javax.swing.JLabel();
        Modificar_Quiniela = new javax.swing.JDialog();
        jDateChooser10 = new com.toedter.calendar.JDateChooser();
        jLabel90 = new javax.swing.JLabel();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jSeparator54 = new javax.swing.JSeparator();
        jSeparator55 = new javax.swing.JSeparator();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jDateChooser11 = new com.toedter.calendar.JDateChooser();
        jLabel93 = new javax.swing.JLabel();
        jTextField59 = new javax.swing.JTextField();
        jSeparator56 = new javax.swing.JSeparator();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel97 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO15 = new javax.swing.JLabel();
        Modificar_Prediccion = new javax.swing.JDialog();
        jSeparator57 = new javax.swing.JSeparator();
        jTextField60 = new javax.swing.JTextField();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jSeparator58 = new javax.swing.JSeparator();
        jTextField61 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jLabel101 = new javax.swing.JLabel();
        jTextField62 = new javax.swing.JTextField();
        jSeparator59 = new javax.swing.JSeparator();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jbl_IMAGEN_FONDO16 = new javax.swing.JLabel();
        Eliminar_Jugador = new javax.swing.JDialog();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jSeparator63 = new javax.swing.JSeparator();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO17 = new javax.swing.JLabel();
        Eliminar_Entrenador = new javax.swing.JDialog();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jSeparator64 = new javax.swing.JSeparator();
        jLabel113 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO18 = new javax.swing.JLabel();
        Eliminar_Arbitro = new javax.swing.JDialog();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jSeparator65 = new javax.swing.JSeparator();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO19 = new javax.swing.JLabel();
        Eliminar_Club = new javax.swing.JDialog();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jSeparator66 = new javax.swing.JSeparator();
        jLabel119 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO20 = new javax.swing.JLabel();
        Eliminar_Equipo = new javax.swing.JDialog();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jSeparator67 = new javax.swing.JSeparator();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO21 = new javax.swing.JLabel();
        Eliminar_Quiniela = new javax.swing.JDialog();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jSeparator68 = new javax.swing.JSeparator();
        jLabel125 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jComboBox6 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO22 = new javax.swing.JLabel();
        Eliminar_Prediccion = new javax.swing.JDialog();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jSeparator69 = new javax.swing.JSeparator();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO23 = new javax.swing.JLabel();
        Eliminar_Equipojugador = new javax.swing.JDialog();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jSeparator70 = new javax.swing.JSeparator();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jComboBox8 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO24 = new javax.swing.JLabel();
        Eliminar_Clubjugador = new javax.swing.JDialog();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jSeparator71 = new javax.swing.JSeparator();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jComboBox9 = new javax.swing.JComboBox<>();
        jbl_IMAGEN_FONDO25 = new javax.swing.JLabel();
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
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();

        Registro_Jugador.setIconImage(null);
        Registro_Jugador.setIconImages(null);
        Registro_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton3.setText("Atras");
        jButton3.setBorder(null);
        jButton3.setOpaque(false);
        Registro_Jugador.getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        jbl_IMAGEN_FONDO.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Jugador.getContentPane().add(jbl_IMAGEN_FONDO, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Entrenador.setIconImage(null);
        Registro_Entrenador.setIconImages(null);
        Registro_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton4.setText("Atras");
        jButton4.setBorder(null);
        jButton4.setOpaque(false);
        Registro_Entrenador.getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        jbl_IMAGEN_FONDO1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO1.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Arbitro.setIconImage(null);
        Registro_Arbitro.setIconImages(null);
        Registro_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton5.setText("Atras");
        jButton5.setBorder(null);
        jButton5.setOpaque(false);
        Registro_Arbitro.getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        jbl_IMAGEN_FONDO2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO2.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Club.setIconImage(null);
        Registro_Club.setIconImages(null);
        Registro_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton7.setText("Atras");
        jButton7.setBorder(null);
        jButton7.setOpaque(false);
        Registro_Club.getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        club_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        club_id.setForeground(new java.awt.Color(255, 255, 255));
        club_id.setBorder(null);
        club_id.setOpaque(false);
        club_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                club_idActionPerformed(evt);
            }
        });
        Registro_Club.getContentPane().add(club_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));
        Registro_Club.getContentPane().add(jSeparator16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("ID:");
        Registro_Club.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

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

        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton13.setText("Atras");
        jButton13.setBorder(null);
        jButton13.setOpaque(false);
        Registro_Quiniela.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        quiniela_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        quiniela_id.setForeground(new java.awt.Color(255, 255, 255));
        quiniela_id.setBorder(null);
        quiniela_id.setOpaque(false);
        quiniela_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quiniela_idActionPerformed(evt);
            }
        });
        Registro_Quiniela.getContentPane().add(quiniela_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 200, 220, 20));
        Registro_Quiniela.getContentPane().add(jSeparator22, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 10));

        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("ID:");
        Registro_Quiniela.getContentPane().add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        jLabel36.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("Nueva Quiniela");
        Registro_Quiniela.getContentPane().add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        Registro_Quiniela.getContentPane().add(quiniela_partido, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, -1));
        Registro_Quiniela.getContentPane().add(quiniela_golesVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));
        Registro_Quiniela.getContentPane().add(quiniela_golesLocal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 220, -1));

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

        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton15.setText("Atras");
        jButton15.setBorder(null);
        jButton15.setOpaque(false);
        Registro_Partido.getContentPane().add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 80, 40));

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

        partido_id.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        partido_id.setForeground(new java.awt.Color(255, 255, 255));
        partido_id.setBorder(null);
        partido_id.setOpaque(false);
        partido_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partido_idActionPerformed(evt);
            }
        });
        Registro_Partido.getContentPane().add(partido_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 130, 220, 30));
        Registro_Partido.getContentPane().add(jSeparator28, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 220, 10));

        jLabel43.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 255));
        jLabel43.setText("ID:");
        Registro_Partido.getContentPane().add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

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

        jbl_IMAGEN_FONDO7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO7.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_ancho.png"))); // NOI18N
        Registro_Partido.getContentPane().add(jbl_IMAGEN_FONDO7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Registro_Clubjugador.setIconImage(null);
        Registro_Clubjugador.setIconImages(null);
        Registro_Clubjugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton19.setText("Atras");
        jButton19.setBorder(null);
        jButton19.setOpaque(false);
        Registro_Clubjugador.getContentPane().add(jButton19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

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

        jbl_IMAGEN_FONDO9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO9.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Registro_Clubjugador.getContentPane().add(jbl_IMAGEN_FONDO9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Jugador.setIconImage(null);
        Modificar_Jugador.setIconImages(null);
        Modificar_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton21.setText("Atras");
        jButton21.setBorder(null);
        jButton21.setOpaque(false);
        Modificar_Jugador.getContentPane().add(jButton21, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton22.setText("Crear");
        Modificar_Jugador.getContentPane().add(jButton22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        jTextField40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField40.setForeground(new java.awt.Color(255, 255, 255));
        jTextField40.setBorder(null);
        jTextField40.setOpaque(false);
        Modificar_Jugador.getContentPane().add(jTextField40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        jTextField41.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField41.setForeground(new java.awt.Color(255, 255, 255));
        jTextField41.setBorder(null);
        jTextField41.setOpaque(false);
        Modificar_Jugador.getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
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
        Modificar_Jugador.getContentPane().add(jDateChooser7, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        jLabel59.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("Fecha de Nacimiento:");
        Modificar_Jugador.getContentPane().add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jTextField42.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField42.setForeground(new java.awt.Color(255, 255, 255));
        jTextField42.setBorder(null);
        jTextField42.setOpaque(false);
        Modificar_Jugador.getContentPane().add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Modificar_Jugador.getContentPane().add(jSeparator40, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel60.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setText("Nombre:");
        Modificar_Jugador.getContentPane().add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jTextField43.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField43.setForeground(new java.awt.Color(255, 255, 255));
        jTextField43.setBorder(null);
        jTextField43.setOpaque(false);
        jTextField43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField43ActionPerformed(evt);
            }
        });
        Modificar_Jugador.getContentPane().add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 20));
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

        jbl_IMAGEN_FONDO10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO10.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Jugador.getContentPane().add(jbl_IMAGEN_FONDO10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Entrenador.setIconImage(null);
        Modificar_Entrenador.setIconImages(null);
        Modificar_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton23.setText("Atras");
        jButton23.setBorder(null);
        jButton23.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(jButton23, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton24.setText("Crear");
        Modificar_Entrenador.getContentPane().add(jButton24, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        jTextField37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField37.setForeground(new java.awt.Color(255, 255, 255));
        jTextField37.setBorder(null);
        jTextField37.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(jTextField37, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        jTextField44.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField44.setForeground(new java.awt.Color(255, 255, 255));
        jTextField44.setBorder(null);
        jTextField44.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
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
        Modificar_Entrenador.getContentPane().add(jDateChooser8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 150, -1));

        jLabel65.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("Fecha de Nacimiento:");
        Modificar_Entrenador.getContentPane().add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 340, -1, -1));

        jTextField45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField45.setForeground(new java.awt.Color(255, 255, 255));
        jTextField45.setBorder(null);
        jTextField45.setOpaque(false);
        Modificar_Entrenador.getContentPane().add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 270, 220, 20));
        Modificar_Entrenador.getContentPane().add(jSeparator43, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, 220, 10));

        jLabel66.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("Nombre:");
        Modificar_Entrenador.getContentPane().add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        jTextField46.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField46.setForeground(new java.awt.Color(255, 255, 255));
        jTextField46.setBorder(null);
        jTextField46.setOpaque(false);
        jTextField46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField46ActionPerformed(evt);
            }
        });
        Modificar_Entrenador.getContentPane().add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 220, 220, 20));
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

        jbl_IMAGEN_FONDO11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO11.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Arbitro.setIconImage(null);
        Modificar_Arbitro.setIconImages(null);
        Modificar_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton25.setText("Atras");
        jButton25.setBorder(null);
        jButton25.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(jButton25, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton26.setText("Crear");
        Modificar_Arbitro.getContentPane().add(jButton26, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        jTextField47.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField47.setForeground(new java.awt.Color(255, 255, 255));
        jTextField47.setBorder(null);
        jTextField47.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        jTextField48.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField48.setForeground(new java.awt.Color(255, 255, 255));
        jTextField48.setBorder(null);
        jTextField48.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
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
        Modificar_Arbitro.getContentPane().add(jDateChooser9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 130, -1));

        jLabel73.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setText("Fecha de Nacimiento:");
        Modificar_Arbitro.getContentPane().add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        jTextField49.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField49.setForeground(new java.awt.Color(255, 255, 255));
        jTextField49.setBorder(null);
        jTextField49.setOpaque(false);
        Modificar_Arbitro.getContentPane().add(jTextField49, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Modificar_Arbitro.getContentPane().add(jSeparator47, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, -1));

        jLabel74.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setText("Nombre:");
        Modificar_Arbitro.getContentPane().add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, -1, -1));

        jTextField50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField50.setForeground(new java.awt.Color(255, 255, 255));
        jTextField50.setBorder(null);
        jTextField50.setOpaque(false);
        jTextField50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField50ActionPerformed(evt);
            }
        });
        Modificar_Arbitro.getContentPane().add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 20));
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

        jbl_IMAGEN_FONDO12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO12.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Club.setIconImage(null);
        Modificar_Club.setIconImages(null);
        Modificar_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton27.setText("Atras");
        jButton27.setBorder(null);
        jButton27.setOpaque(false);
        Modificar_Club.getContentPane().add(jButton27, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton28.setText("Crear");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        Modificar_Club.getContentPane().add(jButton28, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        jTextField51.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField51.setForeground(new java.awt.Color(255, 255, 255));
        jTextField51.setBorder(null);
        jTextField51.setOpaque(false);
        Modificar_Club.getContentPane().add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 220, 20));
        Modificar_Club.getContentPane().add(jSeparator49, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 220, 10));

        jLabel79.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setText("Nombre:");
        Modificar_Club.getContentPane().add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jTextField52.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField52.setForeground(new java.awt.Color(255, 255, 255));
        jTextField52.setBorder(null);
        jTextField52.setOpaque(false);
        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });
        Modificar_Club.getContentPane().add(jTextField52, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 220, 20));
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

        jbl_IMAGEN_FONDO13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO13.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Club.getContentPane().add(jbl_IMAGEN_FONDO13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Equipo.setIconImage(null);
        Modificar_Equipo.setIconImages(null);
        Modificar_Equipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Modificar_Equipo.getContentPane().add(jSeparator51, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, 220, 30));

        jTextField53.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField53.setForeground(new java.awt.Color(255, 255, 255));
        jTextField53.setBorder(null);
        jTextField53.setOpaque(false);
        Modificar_Equipo.getContentPane().add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 360, 220, 20));

        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton29.setText("Atras");
        jButton29.setBorder(null);
        jButton29.setOpaque(false);
        Modificar_Equipo.getContentPane().add(jButton29, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton30.setText("Crear");
        Modificar_Equipo.getContentPane().add(jButton30, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        jTextField54.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField54.setForeground(new java.awt.Color(255, 255, 255));
        jTextField54.setBorder(null);
        jTextField54.setOpaque(false);
        Modificar_Equipo.getContentPane().add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        jLabel84.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel84.setForeground(new java.awt.Color(255, 255, 255));
        jLabel84.setText("ID entrenador:");
        Modificar_Equipo.getContentPane().add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, -1, -1));

        jTextField55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField55.setForeground(new java.awt.Color(255, 255, 255));
        jTextField55.setBorder(null);
        jTextField55.setOpaque(false);
        Modificar_Equipo.getContentPane().add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 300, 220, 20));
        Modificar_Equipo.getContentPane().add(jSeparator52, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 220, -1));

        jLabel85.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setText("Nombre:");
        Modificar_Equipo.getContentPane().add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, -1, -1));

        jTextField56.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField56.setForeground(new java.awt.Color(255, 255, 255));
        jTextField56.setBorder(null);
        jTextField56.setOpaque(false);
        jTextField56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField56ActionPerformed(evt);
            }
        });
        Modificar_Equipo.getContentPane().add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 220, 20));
        Modificar_Equipo.getContentPane().add(jSeparator53, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 250, 220, 10));

        jLabel86.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setText("ID");
        Modificar_Equipo.getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel87.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setText("Modificar Equipo");
        Modificar_Equipo.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel88.setForeground(new java.awt.Color(153, 153, 153));
        jLabel88.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID del Equipo a modificar  ");
        Modificar_Equipo.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        jLabel89.setForeground(new java.awt.Color(153, 153, 153));
        jLabel89.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Equipo.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jbl_IMAGEN_FONDO14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO14.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Equipo.getContentPane().add(jbl_IMAGEN_FONDO14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Quiniela.setIconImage(null);
        Modificar_Quiniela.setIconImages(null);
        Modificar_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Modificar_Quiniela.getContentPane().add(jDateChooser10, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 220, -1));

        jLabel90.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setText("Fecha fin:");
        Modificar_Quiniela.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, -1, -1));

        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton31.setText("Atras");
        jButton31.setBorder(null);
        jButton31.setOpaque(false);
        Modificar_Quiniela.getContentPane().add(jButton31, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton32.setText("Crear");
        Modificar_Quiniela.getContentPane().add(jButton32, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));

        jTextField57.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField57.setForeground(new java.awt.Color(255, 255, 255));
        jTextField57.setBorder(null);
        jTextField57.setOpaque(false);
        Modificar_Quiniela.getContentPane().add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 220, 20));

        jTextField58.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField58.setForeground(new java.awt.Color(255, 255, 255));
        jTextField58.setBorder(null);
        jTextField58.setOpaque(false);
        Modificar_Quiniela.getContentPane().add(jTextField58, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 220, 20));
        Modificar_Quiniela.getContentPane().add(jSeparator54, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 460, 220, -1));
        Modificar_Quiniela.getContentPane().add(jSeparator55, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, -1));

        jLabel91.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setText("Ganancia:");
        Modificar_Quiniela.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        jLabel92.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setText("Inversión:");
        Modificar_Quiniela.getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));
        Modificar_Quiniela.getContentPane().add(jDateChooser11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, -1));

        jLabel93.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setText("Fecha inicio:");
        Modificar_Quiniela.getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, -1, -1));

        jTextField59.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField59.setForeground(new java.awt.Color(255, 255, 255));
        jTextField59.setBorder(null);
        jTextField59.setOpaque(false);
        jTextField59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField59ActionPerformed(evt);
            }
        });
        Modificar_Quiniela.getContentPane().add(jTextField59, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 20));
        Modificar_Quiniela.getContentPane().add(jSeparator56, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 10));

        jLabel94.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setText("ID:");
        Modificar_Quiniela.getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel95.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setText("Modificar Quiniela");
        Modificar_Quiniela.getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 70, -1, -1));

        jLabel96.setForeground(new java.awt.Color(153, 153, 153));
        jLabel96.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID de la quiniela a modificar  ");
        Modificar_Quiniela.getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, -1, -1));

        jLabel97.setForeground(new java.awt.Color(153, 153, 153));
        jLabel97.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Quiniela.getContentPane().add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jbl_IMAGEN_FONDO15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO15.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Quiniela.getContentPane().add(jbl_IMAGEN_FONDO15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Modificar_Prediccion.setIconImage(null);
        Modificar_Prediccion.setIconImages(null);
        Modificar_Prediccion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Modificar_Prediccion.getContentPane().add(jSeparator57, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 290, 220, 10));

        jTextField60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField60.setForeground(new java.awt.Color(255, 255, 255));
        jTextField60.setBorder(null);
        jTextField60.setOpaque(false);
        jTextField60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField60ActionPerformed(evt);
            }
        });
        Modificar_Prediccion.getContentPane().add(jTextField60, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 270, 220, 20));
        Modificar_Prediccion.getContentPane().add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 220, 20));
        Modificar_Prediccion.getContentPane().add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, 220, 20));

        jLabel98.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setText("Goles Visita:");
        Modificar_Prediccion.getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, -1, -1));

        jLabel99.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setText("Goles Local:");
        Modificar_Prediccion.getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 370, -1, -1));
        Modificar_Prediccion.getContentPane().add(jSeparator58, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 340, 220, 10));

        jTextField61.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField61.setForeground(new java.awt.Color(255, 255, 255));
        jTextField61.setBorder(null);
        jTextField61.setOpaque(false);
        jTextField61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField61ActionPerformed(evt);
            }
        });
        Modificar_Prediccion.getContentPane().add(jTextField61, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 220, 20));

        jLabel100.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setText("Monto:");
        Modificar_Prediccion.getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 320, -1, -1));

        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton33.setText("Atras");
        jButton33.setBorder(null);
        jButton33.setOpaque(false);
        Modificar_Prediccion.getContentPane().add(jButton33, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton34.setText("Crear");
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        Modificar_Prediccion.getContentPane().add(jButton34, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 507, 190, -1));

        jLabel101.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setText("ID Partido:");
        Modificar_Prediccion.getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, -1));

        jTextField62.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTextField62.setForeground(new java.awt.Color(255, 255, 255));
        jTextField62.setBorder(null);
        jTextField62.setOpaque(false);
        jTextField62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField62ActionPerformed(evt);
            }
        });
        Modificar_Prediccion.getContentPane().add(jTextField62, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 220, 220, 20));
        Modificar_Prediccion.getContentPane().add(jSeparator59, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, 220, 10));

        jLabel102.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setText("ID:");
        Modificar_Prediccion.getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, -1));

        jLabel103.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setText("Modificar Predicción");
        Modificar_Prediccion.getContentPane().add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel104.setForeground(new java.awt.Color(153, 153, 153));
        jLabel104.setText("Instrucciones: Para poder modificar exitosamente ingrese el ID de la predicción a modificar  ");
        Modificar_Prediccion.getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        jLabel105.setForeground(new java.awt.Color(153, 153, 153));
        jLabel105.setText("e ingrese en los campos SOLAMENTE los datos que van a ser modificados");
        Modificar_Prediccion.getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));

        jbl_IMAGEN_FONDO16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO16.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Modificar_Prediccion.getContentPane().add(jbl_IMAGEN_FONDO16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Jugador.setIconImage(null);
        Eliminar_Jugador.setIconImages(null);
        Eliminar_Jugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton35.setText("Atras");
        jButton35.setBorder(null);
        jButton35.setOpaque(false);
        Eliminar_Jugador.getContentPane().add(jButton35, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton36.setText("Eliminar");
        Eliminar_Jugador.getContentPane().add(jButton36, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Jugador.getContentPane().add(jSeparator63, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel110.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("ID:");
        Eliminar_Jugador.getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel111.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setText("Eliminar Entrenador");
        Eliminar_Jugador.getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel112.setForeground(new java.awt.Color(153, 153, 153));
        jLabel112.setText("Instrucciones: Seleccione el ID del jugador a borrar  ");
        Eliminar_Jugador.getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Jugador.getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO17.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Jugador.getContentPane().add(jbl_IMAGEN_FONDO17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Entrenador.setIconImage(null);
        Eliminar_Entrenador.setIconImages(null);
        Eliminar_Entrenador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton37.setText("Atras");
        jButton37.setBorder(null);
        jButton37.setOpaque(false);
        Eliminar_Entrenador.getContentPane().add(jButton37, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton38.setText("Eliminar");
        Eliminar_Entrenador.getContentPane().add(jButton38, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Entrenador.getContentPane().add(jSeparator64, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel113.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setText("ID:");
        Eliminar_Entrenador.getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel114.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setText("Eliminar Jugador");
        Eliminar_Entrenador.getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        jLabel115.setForeground(new java.awt.Color(153, 153, 153));
        jLabel115.setText("Instrucciones: Seleccione el ID del Entrenador a borrar  ");
        Eliminar_Entrenador.getContentPane().add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Entrenador.getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO18.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Entrenador.getContentPane().add(jbl_IMAGEN_FONDO18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Arbitro.setIconImage(null);
        Eliminar_Arbitro.setIconImages(null);
        Eliminar_Arbitro.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton39.setText("Atras");
        jButton39.setBorder(null);
        jButton39.setOpaque(false);
        Eliminar_Arbitro.getContentPane().add(jButton39, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton40.setText("Eliminar");
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

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Arbitro.getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO19.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Arbitro.getContentPane().add(jbl_IMAGEN_FONDO19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Club.setIconImage(null);
        Eliminar_Club.setIconImages(null);
        Eliminar_Club.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton41.setText("Atras");
        jButton41.setBorder(null);
        jButton41.setOpaque(false);
        Eliminar_Club.getContentPane().add(jButton41, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton42.setText("Eliminar");
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

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Club.getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO20.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Club.getContentPane().add(jbl_IMAGEN_FONDO20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Equipo.setIconImage(null);
        Eliminar_Equipo.setIconImages(null);
        Eliminar_Equipo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton43.setText("Atras");
        jButton43.setBorder(null);
        jButton43.setOpaque(false);
        Eliminar_Equipo.getContentPane().add(jButton43, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton44.setText("Eliminar");
        Eliminar_Equipo.getContentPane().add(jButton44, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Equipo.getContentPane().add(jSeparator67, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel122.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setText("ID:");
        Eliminar_Equipo.getContentPane().add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel123.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setText("Eliminar Equipo");
        Eliminar_Equipo.getContentPane().add(jLabel123, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel124.setForeground(new java.awt.Color(153, 153, 153));
        jLabel124.setText("Instrucciones: Seleccione el ID del Equipo a borrar  ");
        Eliminar_Equipo.getContentPane().add(jLabel124, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Equipo.getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO21.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Equipo.getContentPane().add(jbl_IMAGEN_FONDO21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Quiniela.setIconImage(null);
        Eliminar_Quiniela.setIconImages(null);
        Eliminar_Quiniela.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton45.setText("Atras");
        jButton45.setBorder(null);
        jButton45.setOpaque(false);
        Eliminar_Quiniela.getContentPane().add(jButton45, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton46.setText("Eliminar");
        Eliminar_Quiniela.getContentPane().add(jButton46, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Quiniela.getContentPane().add(jSeparator68, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel125.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setText("ID:");
        Eliminar_Quiniela.getContentPane().add(jLabel125, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel126.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setText("Eliminar Quiniela");
        Eliminar_Quiniela.getContentPane().add(jLabel126, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 70, -1, -1));

        jLabel127.setForeground(new java.awt.Color(153, 153, 153));
        jLabel127.setText("Instrucciones: Seleccione el ID dela quiniela a borrar  ");
        Eliminar_Quiniela.getContentPane().add(jLabel127, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Quiniela.getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO22.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Quiniela.getContentPane().add(jbl_IMAGEN_FONDO22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Prediccion.setIconImage(null);
        Eliminar_Prediccion.setIconImages(null);
        Eliminar_Prediccion.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton47.setText("Atras");
        jButton47.setBorder(null);
        jButton47.setOpaque(false);
        Eliminar_Prediccion.getContentPane().add(jButton47, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton48.setText("Eliminar");
        Eliminar_Prediccion.getContentPane().add(jButton48, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Prediccion.getContentPane().add(jSeparator69, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel128.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setText("ID:");
        Eliminar_Prediccion.getContentPane().add(jLabel128, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel129.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setText("Eliminar Predicción");
        Eliminar_Prediccion.getContentPane().add(jLabel129, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 70, -1, -1));

        jLabel130.setForeground(new java.awt.Color(153, 153, 153));
        jLabel130.setText("Instrucciones: Seleccione el ID de la predicción a borrar  ");
        Eliminar_Prediccion.getContentPane().add(jLabel130, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, -1, -1));

        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Prediccion.getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO23.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Prediccion.getContentPane().add(jbl_IMAGEN_FONDO23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Equipojugador.setIconImage(null);
        Eliminar_Equipojugador.setIconImages(null);
        Eliminar_Equipojugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton49.setText("Atras");
        jButton49.setBorder(null);
        jButton49.setOpaque(false);
        Eliminar_Equipojugador.getContentPane().add(jButton49, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton50.setText("Eliminar");
        Eliminar_Equipojugador.getContentPane().add(jButton50, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Equipojugador.getContentPane().add(jSeparator70, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel131.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setText("ID:");
        Eliminar_Equipojugador.getContentPane().add(jLabel131, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel132.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setText("Eliminar Equipo Jugador");
        Eliminar_Equipojugador.getContentPane().add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel133.setForeground(new java.awt.Color(153, 153, 153));
        jLabel133.setText("Instrucciones: Seleccione el ID del Equipo jugador a borrar  ");
        Eliminar_Equipojugador.getContentPane().add(jLabel133, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Equipojugador.getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO24.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Equipojugador.getContentPane().add(jbl_IMAGEN_FONDO24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        Eliminar_Clubjugador.setIconImage(null);
        Eliminar_Clubjugador.setIconImages(null);
        Eliminar_Clubjugador.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/flecha-hacia-atras.png"))); // NOI18N
        jButton51.setText("Atras");
        jButton51.setBorder(null);
        jButton51.setOpaque(false);
        Eliminar_Clubjugador.getContentPane().add(jButton51, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 23, 80, 40));

        jButton52.setText("Eliminar");
        Eliminar_Clubjugador.getContentPane().add(jButton52, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 510, 190, 20));
        Eliminar_Clubjugador.getContentPane().add(jSeparator71, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 260, 220, 10));

        jLabel134.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setText("ID:");
        Eliminar_Clubjugador.getContentPane().add(jLabel134, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, -1, -1));

        jLabel135.setFont(new java.awt.Font("Gadugi", 1, 24)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setText("Eliminar Club Jugador");
        Eliminar_Clubjugador.getContentPane().add(jLabel135, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, -1, -1));

        jLabel136.setForeground(new java.awt.Color(153, 153, 153));
        jLabel136.setText("Instrucciones: Seleccione el ID del Club jugador a borrar  ");
        Eliminar_Clubjugador.getContentPane().add(jLabel136, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, -1, -1));

        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Eliminar_Clubjugador.getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 220, -1));

        jbl_IMAGEN_FONDO25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbl_IMAGEN_FONDO25.setForeground(new java.awt.Color(255, 255, 255));
        jbl_IMAGEN_FONDO25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Registro_sinletras.png"))); // NOI18N
        Eliminar_Clubjugador.getContentPane().add(jbl_IMAGEN_FONDO25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 600));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quinielas de Futbol");

        jbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vs.png"))); // NOI18N

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

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbodl.png"))); // NOI18N
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

        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/equipo.png"))); // NOI18N
        jMenuItem9.setText("Equipo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

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

        jMenuItem20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/futbodl.png"))); // NOI18N
        jMenuItem20.setText("Club Jugador");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem20);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_fondo)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jbl_fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
        Registro_Quiniela.setModal(true);
        Registro_Quiniela.pack();
        Registro_Quiniela.setLocationRelativeTo(this);
        Registro_Quiniela.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Modificar_Arbitro.setModal(true);
        Modificar_Arbitro.pack();
        Modificar_Arbitro.setLocationRelativeTo(this);
        Modificar_Arbitro.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        Modificar_Equipo.setModal(true);
        Modificar_Equipo.pack();
        Modificar_Equipo.setLocationRelativeTo(this);
        Modificar_Equipo.setVisible(true);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
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

    private void club_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_club_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_club_idActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (club_id.getText().equals("") || club_nombre.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                club_id.setText("");
                club_nombre.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("clubes");
                String identidad = club_id.getText();
                String nombre = club_nombre.getText();
                String entrenadorSeleccionado = club_entrenador.getSelectedItem().toString(); // Obtener el valor seleccionado del JComboBox como String
                Document club = new Document()
                        .append("identidad", identidad)
                        .append("nombre", nombre)
                        .append("entrenador", entrenadorSeleccionado); // Agregar el valor seleccionado al documento del club
                collection.insertOne(club);
                JOptionPane.showMessageDialog(null, "Club creado correctamente.");
                System.out.println("Clubes existentes:");
                for (Document doc : collection.find()) {
                    System.out.println(doc.toJson());
                }
                club_id.setText("");
                club_nombre.setText("");
            }
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void partido_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partido_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_partido_idActionPerformed

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

    private void jTextField43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField43ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField43ActionPerformed

    private void jTextField46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField46ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField46ActionPerformed

    private void jTextField50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField50ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField50ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jTextField56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField56ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField56ActionPerformed

    private void jTextField59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField59ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField59ActionPerformed

    private void jTextField60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField60ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField60ActionPerformed

    private void jTextField61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField61ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField61ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jTextField62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField62ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField62ActionPerformed

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
        Registro_Club.setModal(true);
        Registro_Club.pack();
        Registro_Club.setLocationRelativeTo(this);
        Registro_Club.setVisible(true);


    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Modificar_Jugador.setModal(true);
        Modificar_Jugador.pack();
        Modificar_Jugador.setLocationRelativeTo(this);
        Modificar_Jugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Modificar_Entrenador.setModal(true);
        Modificar_Entrenador.pack();
        Modificar_Entrenador.setLocationRelativeTo(this);
        Modificar_Entrenador.setVisible(true);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        Modificar_Club.setModal(true);
        Modificar_Club.pack();
        Modificar_Club.setLocationRelativeTo(this);
        Modificar_Club.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        Modificar_Prediccion.setModal(true);
        Modificar_Prediccion.pack();
        Modificar_Prediccion.setLocationRelativeTo(this);
        Modificar_Prediccion.setVisible(true);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        Eliminar_Jugador.setModal(true);
        Eliminar_Jugador.pack();
        Eliminar_Jugador.setLocationRelativeTo(this);
        Eliminar_Jugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        Eliminar_Entrenador.setModal(true);
        Eliminar_Entrenador.pack();
        Eliminar_Entrenador.setLocationRelativeTo(this);
        Eliminar_Entrenador.setVisible(true);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        Eliminar_Arbitro.setModal(true);
        Eliminar_Arbitro.pack();
        Eliminar_Arbitro.setLocationRelativeTo(this);
        Eliminar_Arbitro.setVisible(true);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
        // TODO add your handling code here:
        Eliminar_Prediccion.setModal(true);
        Eliminar_Prediccion.pack();
        Eliminar_Prediccion.setLocationRelativeTo(this);
        Eliminar_Prediccion.setVisible(true);
    }//GEN-LAST:event_jMenuItem18ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        // TODO add your handling code here:
        Eliminar_Clubjugador.setModal(true);
        Eliminar_Clubjugador.pack();
        Eliminar_Clubjugador.setLocationRelativeTo(this);
        Eliminar_Clubjugador.setVisible(true);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

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
// gg
        Registro_Partido.setModal(true);
        Registro_Partido.pack();
        Registro_Partido.setLocationRelativeTo(this);
        Registro_Partido.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem16ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (partido_id.getText().equals("") || partido_golesVisita.getText().equals("") || partido_golesLocal.getText().equals("") || partido_date.getDate() == null) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                partido_id.setText("");
                partido_golesVisita.setText("");
                partido_golesLocal.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("partido");
                String id = partido_id.getText();
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
                partido_id.setText("");
                partido_golesVisita.setText("");
                partido_golesLocal.setText("");
                partido_date.setDate(null);
            }
        }

    }//GEN-LAST:event_jButton16ActionPerformed

    private void quiniela_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiniela_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quiniela_idActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        String connectionString = "mongodb+srv://admin:1234admin@cluster2023.nmsnbdo.mongodb.net/";
        MongoClientURI uri = new MongoClientURI(connectionString);
        try (MongoClient mongoClient = new MongoClient(uri)) {
            if (quiniela_id.getText().equals("") || quiniela_monto.getText().equals("") || quiniela_golesLocal.getText().equals("") || quiniela_golesVisita.getText().equals("")) {
                JOptionPane.showMessageDialog(null, "Campos vacíos, ingrese la información en todos los campos");
                quiniela_id.setText("");
                quiniela_monto.setText("");
                quiniela_golesLocal.setText("");
                quiniela_golesVisita.setText("");
            } else {
                MongoDatabase database = mongoClient.getDatabase("proyecto_tbd");
                MongoCollection<Document> collection = database.getCollection("quiniela");
                String id = quiniela_id.getText();
                double monto = Double.parseDouble(quiniela_monto.getText());
                int golesLocal = Integer.parseInt(quiniela_golesLocal.getText());
                int golesVisita = Integer.parseInt(quiniela_golesVisita.getText());
                String partidoSeleccionado = quiniela_partido.getSelectedItem().toString();
                Document quiniela = new Document()
                        .append("id", id)
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
                quiniela_id.setText("");
                quiniela_monto.setText("");
                quiniela_golesLocal.setText("");
                quiniela_golesVisita.setText("");
            }
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void quiniela_montoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quiniela_montoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quiniela_montoActionPerformed

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
    private javax.swing.JComboBox<String> CJ_club;
    private javax.swing.JComboBox<String> CJ_player;
    private com.toedter.calendar.JDateChooser DT_date;
    private javax.swing.JTextField DT_id;
    private javax.swing.JTextField DT_nombre;
    private javax.swing.JTextField DT_peso;
    private javax.swing.JTextField DT_pesoExtra;
    private javax.swing.JDialog Eliminar_Arbitro;
    private javax.swing.JDialog Eliminar_Club;
    private javax.swing.JDialog Eliminar_Clubjugador;
    private javax.swing.JDialog Eliminar_Entrenador;
    private javax.swing.JDialog Eliminar_Equipo;
    private javax.swing.JDialog Eliminar_Equipojugador;
    private javax.swing.JDialog Eliminar_Jugador;
    private javax.swing.JDialog Eliminar_Prediccion;
    private javax.swing.JDialog Eliminar_Quiniela;
    private javax.swing.JDialog Modificar_Arbitro;
    private javax.swing.JDialog Modificar_Club;
    private javax.swing.JDialog Modificar_Entrenador;
    private javax.swing.JDialog Modificar_Equipo;
    private javax.swing.JDialog Modificar_Jugador;
    private javax.swing.JDialog Modificar_Prediccion;
    private javax.swing.JDialog Modificar_Quiniela;
    private javax.swing.JDialog Registro_Arbitro;
    private javax.swing.JDialog Registro_Club;
    private javax.swing.JDialog Registro_Clubjugador;
    private javax.swing.JDialog Registro_Entrenador;
    private javax.swing.JDialog Registro_Jugador;
    private javax.swing.JDialog Registro_Partido;
    private javax.swing.JDialog Registro_Quiniela;
    private com.toedter.calendar.JDateChooser arbitro_date;
    private javax.swing.JTextField arbitro_id;
    private javax.swing.JTextField arbitro_nombre;
    private javax.swing.JTextField arbitro_peso;
    private javax.swing.JTextField arbitro_pesoExtra;
    private javax.swing.JComboBox<String> club_entrenador;
    private javax.swing.JTextField club_id;
    private javax.swing.JTextField club_nombre;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser10;
    private com.toedter.calendar.JDateChooser jDateChooser11;
    private com.toedter.calendar.JDateChooser jDateChooser7;
    private com.toedter.calendar.JDateChooser jDateChooser8;
    private com.toedter.calendar.JDateChooser jDateChooser9;
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
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
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
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
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
    private javax.swing.JSeparator jSeparator51;
    private javax.swing.JSeparator jSeparator52;
    private javax.swing.JSeparator jSeparator53;
    private javax.swing.JSeparator jSeparator54;
    private javax.swing.JSeparator jSeparator55;
    private javax.swing.JSeparator jSeparator56;
    private javax.swing.JSeparator jSeparator57;
    private javax.swing.JSeparator jSeparator58;
    private javax.swing.JSeparator jSeparator59;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator63;
    private javax.swing.JSeparator jSeparator64;
    private javax.swing.JSeparator jSeparator65;
    private javax.swing.JSeparator jSeparator66;
    private javax.swing.JSeparator jSeparator67;
    private javax.swing.JSeparator jSeparator68;
    private javax.swing.JSeparator jSeparator69;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator70;
    private javax.swing.JSeparator jSeparator71;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JLabel jbl_IMAGEN_FONDO;
    private javax.swing.JLabel jbl_IMAGEN_FONDO1;
    private javax.swing.JLabel jbl_IMAGEN_FONDO10;
    private javax.swing.JLabel jbl_IMAGEN_FONDO11;
    private javax.swing.JLabel jbl_IMAGEN_FONDO12;
    private javax.swing.JLabel jbl_IMAGEN_FONDO13;
    private javax.swing.JLabel jbl_IMAGEN_FONDO14;
    private javax.swing.JLabel jbl_IMAGEN_FONDO15;
    private javax.swing.JLabel jbl_IMAGEN_FONDO16;
    private javax.swing.JLabel jbl_IMAGEN_FONDO17;
    private javax.swing.JLabel jbl_IMAGEN_FONDO18;
    private javax.swing.JLabel jbl_IMAGEN_FONDO19;
    private javax.swing.JLabel jbl_IMAGEN_FONDO2;
    private javax.swing.JLabel jbl_IMAGEN_FONDO20;
    private javax.swing.JLabel jbl_IMAGEN_FONDO21;
    private javax.swing.JLabel jbl_IMAGEN_FONDO22;
    private javax.swing.JLabel jbl_IMAGEN_FONDO23;
    private javax.swing.JLabel jbl_IMAGEN_FONDO24;
    private javax.swing.JLabel jbl_IMAGEN_FONDO25;
    private javax.swing.JLabel jbl_IMAGEN_FONDO3;
    private javax.swing.JLabel jbl_IMAGEN_FONDO6;
    private javax.swing.JLabel jbl_IMAGEN_FONDO7;
    private javax.swing.JLabel jbl_IMAGEN_FONDO9;
    private javax.swing.JLabel jbl_fondo;
    private javax.swing.JComboBox<String> partido_arbitro1;
    private javax.swing.JComboBox<String> partido_arbitro2;
    private javax.swing.JComboBox<String> partido_arbitro3;
    private com.toedter.calendar.JDateChooser partido_date;
    private javax.swing.JTextField partido_golesLocal;
    private javax.swing.JTextField partido_golesVisita;
    private javax.swing.JTextField partido_id;
    private javax.swing.JComboBox<String> partido_local;
    private javax.swing.JComboBox<String> partido_visita;
    private com.toedter.calendar.JDateChooser player_date;
    private javax.swing.JTextField player_id;
    private javax.swing.JTextField player_name;
    private javax.swing.JTextField player_persoExtra;
    private javax.swing.JTextField player_peso;
    private javax.swing.JTextField quiniela_golesLocal;
    private javax.swing.JTextField quiniela_golesVisita;
    private javax.swing.JTextField quiniela_id;
    private javax.swing.JTextField quiniela_monto;
    private javax.swing.JComboBox<String> quiniela_partido;
    // End of variables declaration//GEN-END:variables

}

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

  private JTextField textfield1;
  private JLabel label1, label2, label3, label4;
  private JButton boton1;

  public Bienvenida(){
    setLayout(null);

    setTitle("¡Bienvenido!");
    getContentPane().setBackground(new Color(255,0,0));
    setIconImage(new ImageIcon(getClass().getResource("images/icon.png")).getImage());

    ImageIcon imagen = new ImageIcon("images/logo-coca.png");
    label1 = new JLabel(imagen);
    label1.setBounds(25,15,300,150);
    add(label1);

    label2 = new JLabel("Sistema de Control Vacacional");
    label2.setBounds(35,135,300,30);
    label2.setFont(new Font("Andale Mono", 3, 18));
    label2.setForeground(new Color(255,255,255));
    add(label2);

    label3 = new JLabel("Ingrese su nombre");
    label3.setBounds(45,212,200,30);
    label3.setFont(new Font("Andale Mono", 1, 12));
    label3.setForeground(new Color(255,255,255));
    add(label3);

    label4 = new JLabel("©2022 The Coca-Cola Company");
    label4.setBounds(85,375,300,30);
    label4.setFont(new Font("Andale Mono", 3, 12));
    label4.setForeground(new Color(255,255,255));
    add(label4);
  }
}

package view;

import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Color;

import controllers.Controller;


public class Menu extends JFrame {

    private static final long serialVersionUID = 1L;
    private String font = "Bitstream Vera Sans";

    private final int ancho,alto;
    private JButton btn;
    private JTextField inputUno,inputDos;
    private JLabel title,result;

    public Menu(){
        ancho = 800;
        alto = 450;
        btn = new JButton("Sumar");
        inputUno = new JTextField("3453678945431205459462856");
        inputDos = new JTextField("954593495150435786947648634902");
        title = new JLabel("Suma dos números grandes");
        result = new JLabel();

    }

    public void initElements(){
        btn.setSize(new Dimension(200,40));
        btn.setLocation((this.getWidth() - btn.getWidth())/2,375);
        btn.setFont(new Font(font,Font.BOLD,30));
        btn.setFocusable(false);
        add(btn);

        inputUno.setSize(new Dimension(780,30));
        inputUno.setLocation(10, 100);
        inputUno.setFont(new Font(font,Font.PLAIN,15));
        inputUno.setHorizontalAlignment(SwingConstants.CENTER);
        add(inputUno);

        inputDos.setSize(new Dimension(780,30));
        inputDos.setLocation(10, 150);
        inputDos.setFont(new Font(font,Font.PLAIN,15));
        inputDos.setHorizontalAlignment(SwingConstants.CENTER);
        add(inputDos);

        title.setSize(new Dimension(ancho,100));
        title.setLocation(0, 10);
        title.setFont(new Font(font,Font.BOLD,30));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        add(title);

        result.setSize(new Dimension(ancho-10, 150));
        result.setLocation(5, 200);
        result.setHorizontalAlignment(SwingConstants.CENTER);
        result.setFont(new Font(font, Font.BOLD, 25));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(result);
    }

    public void initListeners(){
        btn.addActionListener((event) -> {
           Controller controlador = new Controller(inputUno.getText(),inputDos.getText());
           controlador.start();
           result.setText(controlador.getResult());
        });
    }


    public void initTemplate(){
        setTitle("Menu");
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(new Dimension(ancho,alto));
        setResizable(false);
        setLocationRelativeTo(null);
        initElements();
        initListeners();
        setVisible(true);
        
    }

   
    
    
}

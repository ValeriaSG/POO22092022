/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ico.swing;

import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author valeria
 */
public class InterfazCifradoCesar extends JFrame implements ActionListener{
 
    String letra = "abcdefghijklmnñopqrstuvwxyz";
    private JTextField cuadroMensaje;
    private JTextField cuadroMensaje0;
    private JTextField cuadroDesplazo;
    private JLabel etiquetaMensaje;
    private JLabel etiquetaIngresar;
    private JLabel etiquetaDespla;
    private JButton boton;

    public InterfazCifradoCesar() throws HeadlessException 
    {

        setTitle("~CIFRADO CÉSAR~");
        setSize(450, 500);
        setLayout(null);
        setLayout(new FlowLayout(FlowLayout.CENTER));    
       
        etiquetaDespla = new JLabel("Tipos de Desplazamientos:");
        etiquetaDespla.setBounds(25, 20, 400, 50);
        cuadroDesplazo = new JTextField();
        cuadroDesplazo.setBounds(25, 55, 35, 25);
        cuadroDesplazo.setToolTipText("Por favor de introducir un número de desplazamiento que se desea");  
        
            etiquetaIngresar = new JLabel("Ingresa un mensaje normal: ");
            etiquetaIngresar.setBounds(25, 77, 400, 50);
        
        cuadroMensaje = new JTextField();
        cuadroMensaje.setBounds(25, 110, 200, 250);
        cuadroMensaje.setToolTipText("Por favor de introducir el texto a cifrar");

  
        etiquetaMensaje = new JLabel("El mensaje cifrado es: ");
        etiquetaMensaje.setBounds(250, 1, 200, 200);

        cuadroMensaje0 = new JTextField();
        cuadroMensaje0.setBounds(250, 110, 200, 250);
        cuadroMensaje0.setToolTipText("Este es el cifrado ingresado");

             boton = new JButton("CiFRAR");
             boton.setBounds(195, 380, 75, 30);
             boton.setToolTipText("Por favor de hacer click para poder cifrar el mensaje");

        this.getContentPane().add(etiquetaDespla);
        this.getContentPane().add(cuadroDesplazo);
        this.getContentPane().add(cuadroMensaje0);
        this.getContentPane().add(etiquetaIngresar);
        this.getContentPane().add(cuadroMensaje);
        this.getContentPane().add(boton);
             boton.addActionListener(this);
        this.getContentPane().add(etiquetaMensaje);

                this.validate();
                this.setVisible(true);

        this.addWindowListener(new WindowAdapter()
        {
            @Override
            public void windowClosing(WindowEvent e) 
            {
                System.exit(0);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == boton) 
        {
            char caract;  //caracter
            String text;  //texto
            String textCodificado= ""; //texto codificado

            try 
            {
                text = cuadroMensaje.getText();
                text = text.toLowerCase();
                int clave = Integer.parseInt(cuadroDesplazo.getText());
                
                    for (int i = 0; i < text.length(); i++) 
                    {
                        caract = text.charAt(i);
                        int posicion = letra.indexOf(caract);

                        if (posicion == -1) 
                        {
                           textCodificado += caract;
                        } else 
                        {
                           textCodificado += letra.charAt((posicion + clave) % letra.length());
                        }
                    }
                
                cuadroMensaje0.setText("" + textCodificado);

            } catch (Exception er) //er =  error, marca una excepcion al usuario
            { 
                System.out.println(er.toString());
                JOptionPane.showMessageDialog(null, "Introducir los valores de forma correcta","Error al captura del texto ingresado", JOptionPane.ERROR_MESSAGE);         
            }
        }
    }
}

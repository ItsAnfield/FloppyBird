import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame main = new JFrame("Floppy Bird");
        main.getContentPane().setBackground(Color.GREEN); // Establece el color de fondo del componente de contenido
        main.getContentPane().setLayout(new FlowLayout()); // Establece un administrador de diseño
        main.setSize(700, 700);
        main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //JButton boton = new JButton("Pulsar");
        //main.getContentPane().add(boton);

        JTextField player = new JTextField();
        player.setLocation(200,300);
        player.setPreferredSize(new Dimension(200, 50));
        main.getContentPane().add(player);


        main.setVisible(true);
    }
}
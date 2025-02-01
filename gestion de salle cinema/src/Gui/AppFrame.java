package Gui;

import ClassesBase.*;
import Gestion_des_Classes.*;
import java.sql.Date;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;

public class AppFrame extends JFrame {

    public AppFrame(String name) {

        // Création de la fenêtre principale
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(false);

        // Ajout de l'icone de l'application
        ImageIcon img = new ImageIcon("CinemaLogo.png");
        this.setIconImage(img.getImage());

        // changer la couleur de l'application
        this.getContentPane().setBackground(new java.awt.Color(25, 25, 30));
    }

}

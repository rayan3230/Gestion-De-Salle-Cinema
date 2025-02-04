package Gui;

import ClassesBase.*;
import Gestion_des_Classes.*;
import java.sql.Date;
import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.Border;

public class GuiMainWithMoza extends JFrame {

    public static GestionBills getGestionBills = new GestionBills();
    public static GestionDiffusions getGestionDiffusion = new GestionDiffusions();
    public static GestionFilm getGestionFilm = new GestionFilm();
    public static GestionDeSalle getGestionSalle = new GestionDeSalle();
    public static Diffusion getDiffusion;
    public static Film getFilm;
    public static Salle getSalle;
    public static billet getBill;
    public static Scanner Scan = new Scanner(System.in);

    public GuiMainWithMoza(String name) {

        // Création de la fenêtre principale
        this.setTitle(name);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1100, 700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setResizable(true);

        // Ajout de l'icone de l'application
        ImageIcon icon = new ImageIcon("CinemaLogo.png");
        this.setIconImage(icon.getImage());

        // changer la couleur de l'application
        this.getContentPane().setBackground(new java.awt.Color(225, 225, 225));
    }

    public static void main(String[] args) {
        // Création de la fenêtre principale
        GuiMainWithMoza Frame = new GuiMainWithMoza("Gestion de salle de cinema");
        Frame.setLayout(null);
        Frame.setResizable(false);

    }

}

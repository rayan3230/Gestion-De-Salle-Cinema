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

    private static JLabel CreatOptionLable() {

        // Création des Lables
        JLabel OptionLable = new JLabel("App Fuctionalities :");

        // changement de la couleur du lable
        OptionLable.setForeground(new java.awt.Color(255, 255, 255));

        // Positionnement des Lables
        OptionLable.setHorizontalAlignment(JLabel.CENTER);

        // Changement de la police et taille du lable
        OptionLable.setFont(new Font("Arial", Font.BOLD, 20));

        // Changement de la police et taille du lable
        OptionLable.setFont(new Font("Arial", Font.BOLD, 17));

        return OptionLable;
    }

    // creation
    /*
     * JButton btnToRegister = new JButton("Gestion des Salles"); // Button pour
     * creer un compte (troh l panel 2)
     * btnToRegister.setBounds(250, 440, 100, 30);
     * btnToRegister.setFont(new Font("Segoe UI", Font.BOLD, 14));
     */

    // Panel d'option :--------------------------------------------------------
    private static JPanel CreatOptionPanel() {
        // creation d'un panel
        JPanel OptionPanel = new JPanel();

        // Ajout du text
        JLabel OptionLable = CreatOptionLable();
        OptionPanel.add(OptionLable);

        // changement de la couleur du panel
        OptionPanel.setBackground(new java.awt.Color(0x3943A1));

        // changement de la position du panel
        OptionPanel.setBounds(-5, 0, 250, 800);

        return OptionPanel;
    }

    public static JPanel CreatSearchBar() {
        // Création des Lables
        JLabel SearchLable = new JLabel("Search...");
        SearchLable.setBounds(335, 39, 125, 45);

        // Creation du panel
        JPanel SearchBar = new JPanel();

        // changement de la couleur du panel
        SearchBar.setBackground(new java.awt.Color(0x2A2858));

        // changement de la position du panel
        SearchBar.setBounds(298, 35, 848, 49);

        // Ajout du text
        SearchBar.add(SearchBar);

        return SearchBar;

    }
    // Création des objets

    public static void main(String[] args) {
        // Création de la fenêtre principale
        GuiMainWithMoza Frame = new GuiMainWithMoza("Gestion de salle de cinema");
        Frame.setLayout(null);
        Frame.setResizable(false);

        // Ajout des Panels
        JPanel OptionPanel = CreatOptionPanel();
        Frame.add(OptionPanel);

        JPanel SearchBar = CreatSearchBar();
        Frame.add(SearchBar);

    }

}

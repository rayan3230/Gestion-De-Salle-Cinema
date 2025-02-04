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

public class GuiMain {

    // Création des objets

    // Lable d'ouverture :--------------------------------------------------------
    private static JLabel CreatOppeningLable() {
        // creation d'une bordure
        Border Bordure = BorderFactory.createLineBorder(new Color(75, 75, 100), 5, true);

        // Création des Lables
        JLabel OpenningLable = new JLabel("Bienvenue dans l'application de gestion de salle de cinema");

        // changement de la couleur du lable
        OpenningLable.setForeground(new java.awt.Color(255, 255, 255));
        OpenningLable.setBackground(new java.awt.Color(25, 25, 45));
        OpenningLable.setOpaque(true);

        // Positionnement des Lables
        OpenningLable.setHorizontalAlignment(JLabel.CENTER);
        OpenningLable.setVerticalAlignment(JLabel.CENTER);
        OpenningLable.setBounds(200, 1, 885, 70);

        // Changement de la police et taille du lable
        OpenningLable.setFont(new Font("Arial", Font.BOLD, 20));

        // Ajout de la bordure
        OpenningLable.setBorder(Bordure);

        return OpenningLable;
    }

    // Lable d'option : --------------------------------------------------------
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

    // Panel d'option :--------------------------------------------------------
    private static JPanel CreatOptionPanel() {
        // creation d'un panel
        JPanel OptionPanel = new JPanel();

        // Ajout du text
        JLabel OptionLable = CreatOptionLable();
        OptionPanel.add(OptionLable);

        // changement de la couleur du panel
        OptionPanel.setBackground(new java.awt.Color(30, 30, 30));

        // changement de la position du panel
        OptionPanel.setBounds(0, 0, 200, 700);

        return OptionPanel;
    }

    // Main--------------------------------------------------------------------
    public static void main(String[] args) {

        // Création des objets pour les tests
        JLabel OpenningLable = CreatOppeningLable();
        JPanel OptionPanel = CreatOptionPanel();

        // Création de la fenêtre principale
        AppFrame Frame = new AppFrame("Gestion de salle de cinema");
        Frame.setLayout(null);
        Frame.setResizable(false);

        // Ajout des Panels
        Frame.add(OptionPanel);

        // Ajout des Lables

    }

}

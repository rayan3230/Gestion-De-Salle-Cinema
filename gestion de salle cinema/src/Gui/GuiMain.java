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
    public static void main(String[] args) {
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
        OpenningLable.setBounds(0, 1, 1085, 100);

        // Changement de la police et taille du lable
        OpenningLable.setFont(new Font("Arial", Font.BOLD, 20));

        // Ajout de la bordure
        OpenningLable.setBorder(Bordure);

        // Création de la fenêtre principale
        AppFrame Frame = new AppFrame("Gestion de salle de cinema");
        Frame.setLayout(null);
        Frame.setResizable(false);

        // Ajout des Lables
        Frame.add(OpenningLable);

    }

}

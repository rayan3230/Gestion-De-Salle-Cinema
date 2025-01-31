# Gestion-De-Salle-Cinema
# Projet : Implémentation d’une application de gestion d’une salle de cinéma

## Contexte
L’objectif de ce projet est de concevoir et implémenter en **Java** un système de gestion d’une salle de cinéma. Ce système doit permettre de gérer les salles de diffusion, les films diffusés ainsi que les billets réservés. L’application doit offrir une interface utilisateur simple et intuitive pour faciliter la gestion des différentes entités.

---

## Entités du système
1. **Salle de cinéma** :
   - Numéro de la salle.
   - Capacité d’accueil (nombre de places disponibles).

2. **Film** :
   - Nom du film.
   - Durée du film.
   - Genre du film.
   - Version (Vo/Vf).

3. **Diffusion** :
   - Film diffusé.
   - Salle de diffusion.
   - Date de diffusion.
   - Horaire de diffusion (heure de début et heure de fin).

4. **Billet** :
   - Numéro du billet.
   - Prix du billet.
   - Diffusion concernée.

---

## Fonctionnalités de l’application
L’application doit comporter une **fenêtre d’accueil** avec un menu principal offrant les fonctionnalités suivantes :

### 1. Gestion des films
   - **Ajouter un film** : Permet d’ajouter un nouveau film à la liste.
   - **Modifier un film** : Permet de modifier les informations d’un film existant.
   - **Supprimer un film** : Permet de supprimer un film de la liste.
   - **Afficher la liste des films** : Affiche tous les films disponibles.
Gestion
### 2. Gestion des salles de diffusion
   - **Ajouter une salle** : Permet d’ajouter une nouvelle salle de diffusion.
   - **Modifier une salle** : Permet de modifier les informations d’une salle existante.
   - **Supprimer une salle** : Permet de supprimer une salle de diffusion.
   - **Afficher la liste des salles** : Affiche toutes les salles de diffusion disponibles.

### 3. Gestion des diffusions
   - **Ajouter une diffusion** : Permet de planifier une nouvelle diffusion (film, salle, date, horaire).
   - **Modifier une diffusion** : Permet de modifier les informations d’une diffusion existante.
   - **Supprimer une diffusion** : Permet de supprimer une diffusion.
   - **Afficher les diffusions d’une date donnée par salle** : Affiche toutes les diffusions prévues pour une date spécifique, organisées par salle.

### 4. Gestion des billets
   - **Réserver un billet** : Permet de réserver un billet pour une diffusion donnée. Le nombre de billets disponibles est décrémenté après chaque réservation.
   - **Annuler un billet** : Permet d’annuler une réservation. Le nombre de billets disponibles est incrémenté.
   - **Afficher le nombre de billets restants** : Affiche le nombre de billets disponibles pour une diffusion donnée.

---

## Règles métier
- Le nombre de billets disponibles pour une diffusion est égal à la capacité de la salle concernée.
- Si le nombre de billets disponibles atteint zéro, aucune réservation supplémentaire ne peut être effectuée.
- Lorsqu’un billet est annulé, le nombre de billets disponibles est incrémenté.

---

## Architecture du projet
L’application sera développée en **Java** en utilisant une architecture modulaire. Voici les principaux composants :
1. **Modèle** : Classes représentant les entités (Film, Salle, Diffusion, Billet).
2. **Contrôleur** : Gestion des opérations métier (ajout, modification, suppression, affichage).
3. **Vue** : Interface utilisateur (fenêtres, menus, formulaires).

---

## Technologies utilisées
- **Langage** : Java.
- **Interface graphique** : Java Swing ou JavaFX.
- **Gestion des données** : Fichiers texte ou base de données SQLite.

---

## Étapes de développement
1. **Analyse des besoins** : Définir les fonctionnalités et les entités du système.
2. **Conception** : Créer les diagrammes UML (cas d’utilisation, classes, séquence).
3. **Implémentation** : Développer les classes et l’interface utilisateur.
4. **Tests** : Tester chaque fonctionnalité pour vérifier son bon fonctionnement.
5. **Documentation** : Rédiger la documentation technique et utilisateur.

---

## Livrables attendus
1. Code source de l’application.
2. Documentation technique (diagrammes UML, explication des classes).
3. Documentation utilisateur (guide d’utilisation).
4. Fichiers de données (films, salles, diffusions, billets).

---

## Exemple de menus
### Menu principal
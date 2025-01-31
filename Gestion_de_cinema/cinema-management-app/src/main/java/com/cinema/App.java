public class App {
    public static void main(String[] args) {
        // Initialize the GUI
        javax.swing.SwingUtilities.invokeLater(() -> {
            new com.cinema.gui.MainFrame().setVisible(true);
        });
    }
}
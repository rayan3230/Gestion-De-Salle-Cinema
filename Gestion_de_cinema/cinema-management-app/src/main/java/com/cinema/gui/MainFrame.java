import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Cinema Management Application");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        initializeMenuBar();
        initializePanels();
    }

    private void initializeMenuBar() {
        JMenuBar menuBar = new JMenuBar();

        JMenu filmMenu = new JMenu("Films");
        JMenuItem addFilmItem = new JMenuItem("Add Film");
        JMenuItem viewFilmsItem = new JMenuItem("View Films");
        filmMenu.add(addFilmItem);
        filmMenu.add(viewFilmsItem);

        JMenu screeningMenu = new JMenu("Screenings");
        JMenuItem scheduleScreeningItem = new JMenuItem("Schedule Screening");
        JMenuItem viewScreeningsItem = new JMenuItem("View Screenings");
        screeningMenu.add(scheduleScreeningItem);
        screeningMenu.add(viewScreeningsItem);

        JMenu ticketMenu = new JMenu("Tickets");
        JMenuItem bookTicketItem = new JMenuItem("Book Ticket");
        JMenuItem viewTicketsItem = new JMenuItem("View Tickets");
        ticketMenu.add(bookTicketItem);
        ticketMenu.add(viewTicketsItem);

        menuBar.add(filmMenu);
        menuBar.add(screeningMenu);
        menuBar.add(ticketMenu);

        setJMenuBar(menuBar);
    }

    private void initializePanels() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        
        JLabel welcomeLabel = new JLabel("Welcome to the Cinema Management Application", JLabel.CENTER);
        mainPanel.add(welcomeLabel, BorderLayout.CENTER);
        
        add(mainPanel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        });
    }
}
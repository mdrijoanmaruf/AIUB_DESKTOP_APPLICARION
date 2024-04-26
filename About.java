import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame {
    String[] studentId = { "23-53347-3", "23-53193-3", "23-53354-3", "23-54025-3" };
    String[] password = { "maruf", "shawon", "anik", "tasauf" };

    public About() {
        init();
    }

    public void init() {
        // Creating frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1080, 680);
        this.setResizable(false);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);

        // Creating Background Image
        ImageIcon backgroundImage = new ImageIcon("bgg.jpg");
        JLabel bgImage = new JLabel(backgroundImage);
        bgImage.setLayout(new BorderLayout());
        this.setContentPane(bgImage);

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Set Banner
        JLabel banner = new JLabel("American International University - Bangladesh");
        Font bannerFont = new Font("Arial", Font.BOLD, 22);
        banner.setFont(bannerFont);
        banner.setBounds(10, 5, 600, 25);
        Color customColor = new Color(16, 28, 135);
        banner.setForeground(customColor);
        c.add(banner);

        // Create Navigation Bar Panel
        JPanel navigationBar = new JPanel();
        navigationBar.setBackground(Color.BLACK);
        navigationBar.setBounds(0, 35, 1080, 50);
        c.add(navigationBar);

        // Add Buttons to Navigation Bar
        Font buttonFont = new Font("Arial", Font.BOLD, 18);
        String[] buttonLabels = { "Home", "About", "Academics", "Admission", "On Campus", "Administration",
                "Research" };
        for (String label : buttonLabels) {
            JButton button = new JButton(label);
            button.setFont(buttonFont);
            button.setForeground(Color.WHITE);
            button.setBackground(Color.BLACK);

            // Apply border with rounded corners and blue border
            Border border = BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.WHITE, 2), // White border with thickness 2px
                    BorderFactory.createEmptyBorder(5, 15, 5, 15) // Padding
            );

            button.setBorder(BorderFactory.createCompoundBorder(
                    border,
                    BorderFactory.createCompoundBorder(
                            BorderFactory.createLineBorder(Color.BLACK, 1), // Blue border
                            BorderFactory.createLineBorder(Color.BLACK, 1) // Black border (to cover the inner border of
                                                                           // the rounded shape)
                    )));
                    if (label.equals("Home")) {
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Open new homepage frame
                                HomePage homepage = new HomePage();
                                homepage.setVisible(true);
                            }
                        });
                    }
                    else if (label.equals("About")) {
                        button.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                // Open new homepage frame
                                About about = new About();
                                about.setVisible(true);
                            }
                        });
                    }
            navigationBar.add(button);
        }
        

        // Creating About Setction Element        
        JButton informationButton = new JButton("Information");
        JButton generalInformation = new JButton("General Information");
        JButton whyStudyAiub = new JButton("Why Study In Aiub?");
        JButton resources = new JButton("Resources");
        JButton careerOpportunity = new JButton("Career Opportunity");
        JButton convocation = new JButton("Convocation");

        informationButton.setBounds(100,100,200,200);
        informationButton.setBackground(Color.RED);
        c.add(informationButton);
    }

    
}

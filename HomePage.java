import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends JFrame {
    String[] studentId = { "23-53347-3", "23-53193-3", "23-53354-3", "23-54025-3" };
    String[] password = { "maruf", "shawon", "anik", "tasauf" };

    public HomePage() {
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
            navigationBar.add(button);
        }
        

        // Portal Log in
        JLabel portalLogIn = new JLabel("Log In Portal");
        Font portlLognIn = new Font("Arial", Font.BOLD, 25);
        portalLogIn.setForeground(customColor);
        portalLogIn.setFont(portlLognIn);
        portalLogIn.setBounds(20, 200, 300, 40);
        c.add(portalLogIn);

        Font userLableFont = new Font("Arial", Font.BOLD, 18);
        JLabel usernameLabel = new JLabel("Student ID :");
        usernameLabel.setFont(userLableFont);
        usernameLabel.setBounds(20, 260, 300, 40);
        c.add(usernameLabel);

        JTextField usernameField = new JTextField("23-53347-3");
        usernameField.setFont(userLableFont);
        usernameField.setBounds(20, 300, 300, 40);
        c.add(usernameField);

        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(userLableFont);
        passwordLabel.setBounds(20, 350, 300, 40);
        c.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField("maruf");
        passwordField.setFont(userLableFont);
        passwordField.setBounds(20, 390, 300, 40);
        c.add(passwordField);

        // Clear Button
        JButton clearButton = new JButton("Clear");
        clearButton.setFont(userLableFont);
        clearButton.setBounds(20, 450, 90, 35);
        clearButton.setForeground(Color.WHITE);
        clearButton.setBackground(Color.BLACK);
        c.add(clearButton);

        // LogIn Button
        JButton loginButton = new JButton("Log In");
        loginButton.setFont(userLableFont);
        loginButton.setBounds(230, 450, 90, 35);
        loginButton.setBackground(Color.BLUE);
        loginButton.setForeground(Color.WHITE);
        c.add(loginButton);

        // Clear button action listener
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Clear username and password fields
                usernameField.setText("");
                passwordField.setText("");
            }
        });

        // Login Button Action Listener
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String enteredStudentId = usernameField.getText();
                String enteredPassword = new String(passwordField.getPassword());
                boolean loginSuccessful = false;

                for (int i = 0; i < studentId.length; i++) {
                    if (enteredStudentId.equals(studentId[i]) && enteredPassword.equals(password[i])) {
                        loginSuccessful = true;
                        break;
                    }
                }

                if (loginSuccessful) {
                    JOptionPane.showMessageDialog(null, "Log In Successful!");
                    if (enteredStudentId.equals("23-53347-3")) {
                        RijoanPortal rijoan = new RijoanPortal();
                        rijoan.setVisible(true); // Set the new frame visible
                    }
                    if (enteredStudentId.equals("23-53193-3")) {
                        ShawonPortal shawon = new ShawonPortal();
                        shawon.setVisible(true); // Set the new frame visible
                    }
                    if (enteredStudentId.equals("23-53354-3")) {
                        AnikPortal anik = new AnikPortal();
                        anik.setVisible(true); // Set the new frame visible
                    }
                    if (enteredStudentId.equals("23-54025-3")) {
                        AnikPortal anik = new AnikPortal();
                        anik.setVisible(true); // Set the new frame visible
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Incorrect Username or Password");
                }
            }
        });

        // Notice Borad
        JLabel noticeBorardTitle = new JLabel("Notice Borad");
        noticeBorardTitle.setFont(portlLognIn);
        noticeBorardTitle.setForeground(customColor);
        noticeBorardTitle.setBounds(650, 130, 300, 40);
        c.add(noticeBorardTitle);

        // Notice Box
        JPanel noticePanel = new JPanel();
        noticePanel.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10)); 
        noticePanel.setBackground(Color.LIGHT_GRAY); 
        noticePanel.setBounds(500, 180, 450, 400); 
        c.add(noticePanel);

        
        String[] noticeTitles = {
            "Final Term Exam Date : ",
            "Library Closures : ",
            "Student ID Renewal : ",
            "Debate Club Meeting : ",
            "Scholarship Application Deadline : ",
            "Final Term Exam Date : ",
            "Library Closures : ",
            "Student ID Renewal : ",
            "Debate Club Meeting : ",
            "Scholarship Application Deadline : "
        };
    
        String[] noticeDescriptions = {
            "Final term exam will start 1 May. Everyone collect your permit.",
            "Library will be closed for renovation from 1 June to 15 June.",
            "All students must renew their student IDs before 30 April.",
            "Meeting will be held on 25 April at 4PM in room A203.",
            "Scholarship applications are due on 10 May.",
            "Final term exam will start 1 May. Everyone collect your permit.",
            "Library will be closed for renovation from 1 June to 15 June.",
            "All students must renew their student IDs before 30 April.",
            "Meeting will be held on 25 April at 4PM in room A203.",
            "Scholarship applications are due on 10 May."
        };
          
        for (int i = 0; i < noticeTitles.length; i++) {
            JLabel titleLabel = new JLabel(noticeTitles[i]);
            titleLabel.setFont(new Font("Arial", Font.BOLD, 16)); // Bold title

            JLabel descriptionLabel = new JLabel(noticeDescriptions[i]);
            descriptionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        

            noticePanel.add(titleLabel);
            noticePanel.add(descriptionLabel);
        }
          
        
    }
}

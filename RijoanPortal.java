import java.awt.Container;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class RijoanPortal extends JFrame {
    public RijoanPortal() {
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

        // Creating Container
        Container c = this.getContentPane();
        c.setLayout(null);

        // Creating Label
        JLabel title = new JLabel("Md Rijoan Maruf Portal");
        Font titleFont = new Font("Arial", Font.BOLD, 20);
        title.setFont(titleFont);
        title.setBounds(20, 20, 300, 30);
        c.add(title);
    }
}

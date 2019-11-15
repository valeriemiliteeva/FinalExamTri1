import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenuControl extends JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        MenuControl frame = new MenuControl();
                        frame.setVisible(true);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });
    }

    /**
     * Create the frame.
     */
    public MenuControl() {
        getContentPane().setBackground(Color.PINK);
		
		JLabel lblNewLabel = new JLabel("Welcome to Valerie Militeeva's Portfolio!");
		lblNewLabel.setFont(new Font("Copperplate", Font.PLAIN, 20));
		lblNewLabel.setForeground(new Color(75, 0, 130));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblNewLabel, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);


        JMenu mnNewMenu = new JMenu("String Labs");
        menuBar.add(mnNewMenu);


        JMenuItem mntmPalindrom = new JMenuItem("Palindrome 3");
        mntmPalindrom.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    PalindromeUI frame = new PalindromeUI();
                    frame.setVisible(true);			
                }
            });
        mnNewMenu.add(mntmPalindrom);

        JMenu mnSprint = new JMenu("Jigsaw");
        menuBar.add(mnSprint);

        JMenuItem mntmCalculator = new JMenuItem("Calculator");
        mntmCalculator.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    F frame = new F();
                    frame.setVisible(true);			
                }
            });
        mnSprint.add(mntmCalculator);

    }

}

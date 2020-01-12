/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookietrail;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Pricope Costantin
 */
public class MainFrame extends JFrame{
    int MAXIM_WIDTH = 400;
    int MAXIM_HEIGHT = 400;
    JButton exit_button = new JButton("Exit");
    JPanel main_panel = new JPanel();

    public MainFrame() throws HeadlessException {
        
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        setTitle("Cookie Trail");
        this.setUndecorated(true);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        addListenersToButtons();
        
        setResizable(false);
        this.setSize(MAXIM_WIDTH, MAXIM_HEIGHT);
        main_panel.setBackground(Color.red);
        main_panel.add(exit_button);
        this.getContentPane().add(main_panel);
        
    }
    
    
    void addListenersToButtons()
    {
        exit_button.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                System.exit(0);
            }
        });
    }
     
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cookietrail;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Pricope Costantin
 */
public class MainPanel extends JPanel{
        
    JPanel buttons_panel = new JPanel();
    JButton exit_button = new JButton("Exit");
    JButton new_game = new JButton("New Game");
    JButton higher_score = new JButton("Higher Scor");

    public MainPanel() {
        this.setSize(200, 200);
        
        buttons_panel.setLayout(new GridLayout(3,1,0,3));
        buttons_panel.setBackground(Color.white);
        buttons_panel.setLocation(50, 50);
        
        addListenersToButtons();
        
        this.add(buttons_panel);
        
        this.setBackground(Color.red);
        buttons_panel.add(new_game);
        buttons_panel.add(higher_score);
        buttons_panel.add(exit_button);
    }
    
    private void addListenersToButtons()
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

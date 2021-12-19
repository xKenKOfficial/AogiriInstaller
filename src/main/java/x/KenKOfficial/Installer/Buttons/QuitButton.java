package x.KenKOfficial.Installer.Buttons;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class QuitButton extends JButton
{
    public QuitButton()
    {
        this.setText("Anuluj");
        this.setBounds(250, 250, 50, 50);
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(3);
            }

        });
    }

}

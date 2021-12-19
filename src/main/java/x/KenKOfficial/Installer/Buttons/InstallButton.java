package x.KenKOfficial.Installer.Buttons;

import x.KenKOfficial.Installer.Installation.InstallationPacket;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InstallButton extends JButton
{
    public InstallButton()
    {
        this.setText("Install");
        this.setBounds(250, 250, 50, 50);
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                InstallationPacket.install();
            }

        });
    }
}

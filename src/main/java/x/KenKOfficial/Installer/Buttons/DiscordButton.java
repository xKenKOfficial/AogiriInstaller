package x.KenKOfficial.Installer.Buttons;

import x.KenKOfficial.Installer.Utils.OpenWebUtil;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DiscordButton extends JButton
{
    public DiscordButton()
    {
        this.setText("Discord");
        this.setBounds(250, 250, 50, 50);
        this.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                OpenWebUtil.openWeb("https://discord.gg/rDeFVhunaf");
            }

        });
    }
}

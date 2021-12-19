package x.KenKOfficial.Installer.Windows;

import x.KenKOfficial.Installer.Buttons.DiscordButton;
import x.KenKOfficial.Installer.Buttons.InstallButton;
import x.KenKOfficial.Installer.Buttons.QuitButton;
import x.KenKOfficial.Installer.Main.Main;
import x.KenKOfficial.Installer.Panels.InstallatorPanel;

import javax.swing.*;
import java.awt.*;

public class InstallerWindow extends JFrame
{
    private Main main;

    public InstallerWindow(Main main)
    {
        this.main = main;
        this.setTitle("AogiriInstaller");
        this.setBounds(250, 250, 500, 300);
        this.setBackground(Color.BLACK);
        initComponents();
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(3);
    }

    private void initComponents()
    {
        this.getContentPane().add(panel, BorderLayout.PAGE_END);
        this.getContentPane().add(new InstallatorPanel());
        panel.setBackground(Color.GRAY);
        panel.add(new InstallButton());
        panel.add(new QuitButton());
        panel.add(new DiscordButton());
    }

    JPanel panel = new JPanel();
}

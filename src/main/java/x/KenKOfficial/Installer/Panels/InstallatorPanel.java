package x.KenKOfficial.Installer.Panels;

import javax.swing.*;
import java.awt.*;

public class InstallatorPanel extends JPanel
{
    public InstallatorPanel() {
        this.setPreferredSize(new Dimension(this.preferredSize()));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics2D = (Graphics2D) g;
        graphics2D.drawString("Instalator naszej Paczki", 180, 20);
        graphics2D.drawString("Aby zainstalowac nasza paczke, musisz przycisnac przycisk 'Instaluj',", 55, 40);
        graphics2D.drawString("jezeli chcesz przejsc do naszego Discorda, przycisnij przycisk 'Discord',", 50, 60);
        graphics2D.drawString("a jesli chcesz anulowac instalacje, przycisnij przycisk 'anuluj'.", 75, 80);
        graphics2D.drawString("Jesli zdecydowales sie zainstalowac nasza paczke to zyczymy tobie milej gry i oby", 20, 140);
        graphics2D.drawString("paczka ci sie spodobala. Nasz klient nie ma na celu niszczyc rozgrywki.", 45, 160);
        graphics2D.drawString("UWAGA: Jesli paczka sie nie zainstalowala w folderze, prosimy to zglaszac na naszym", 10, 185);
        graphics2D.drawString("discordzie, link do discorda pod przyciskiem 'Discord'.", 95, 205);
    }
}

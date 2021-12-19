package x.KenKOfficial.Installer.Main;

import x.KenKOfficial.Installer.Windows.InstallerWindow;

public class Main
{
    private static Main main;

    public static void main(String[] args) {
        new InstallerWindow(main).setVisible(true);
    }

    public static Main getInstaller()
    {
        return main;
    }
}

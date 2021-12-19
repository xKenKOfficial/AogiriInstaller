package x.KenKOfficial.Installer.Installation;

import org.apache.commons.io.FileUtils;
import x.KenKOfficial.Installer.Utils.UnzipUtility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class InstallationPacket
{
    public static void install() {
        final File file = new File(System.getenv("APPDATA"), "//.minecraft//versions//AogiriX");
        if(!file.exists()) {
            file.mkdirs();
        }
        File fileZIP = new File(System.getenv("APPDATA"), "//.minecraft//versions//AogiriX//AogiriX.zip");
        try {
            FileUtils.copyURLToFile(new URL("https://github.com/xKenKOfficial/AogiriX/raw/main/MinecraftPremium/AogiriX.zip"), fileZIP);
        } catch(MalformedURLException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        UnzipUtility unzip = new UnzipUtility();
        try {
            unzip.unzip(fileZIP.toString(), System.getenv("APPDATA") + "//.minecraft//versions//AogiriX");
            fileZIP.delete();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

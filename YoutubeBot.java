import java.net.*;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.awt.*;

public class YoutubeBot {
    public static void main(String[] args) {
        try {
            // RSS feed de um canal do YouTube
            String url = "https://www.youtube.com/feeds/videos.xml?channel_id=UC7c0msgggkLeIW6lwJAy-Ow"; 
            URL link = new URL(url);
            InputStream stream = link.openStream();

            // Parse do XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(stream);

            // Pegando o título do vídeo mais recente
            NodeList entries = doc.getElementsByTagName("entry");
            if (entries.getLength() > 0) {
                Element latest = (Element) entries.item(0);
                String titulo = latest.getElementsByTagName("title").item(0).getTextContent();
                String linkVideo = latest.getElementsByTagName("link").item(0).getAttributes()
                                         .getNamedItem("href").getTextContent();

                System.out.println("Último vídeo publicado:");
                System.out.println("Título: " + titulo);
                System.out.println("Link: " + linkVideo);

                // Exibe uma notificação popup no sistema
                if (SystemTray.isSupported()) {
                    SystemTray tray = SystemTray.getSystemTray();
                    // Ícone para a notificação (necessário, mesmo que seja vazio)
                    Image image = Toolkit.getDefaultToolkit().getImage("bisteca.png");
                    TrayIcon trayIcon = new TrayIcon(image, "YouTube Bot");
                    trayIcon.setImageAutoSize(true);
                    trayIcon.setToolTip("Novo vídeo no canal!");
                    tray.add(trayIcon);

                    trayIcon.displayMessage("Novo vídeo publicado!", 
                                            titulo + "\n" + linkVideo, 
                                            TrayIcon.MessageType.INFO);
                } else {
                    System.out.println("Notificações não suportadas nesse sistema.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
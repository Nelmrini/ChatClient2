package controleur;

import com.chat.client.ClientChat;
import com.chat.commun.net.Connexion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurJeuEchecs implements ActionListener {

    private ClientChat clientChat;
    private String premierClic;
    private String deuxiemeClic;

    public EcouteurJeuEchecs(ClientChat clientChat) {
        this.clientChat = clientChat;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (premierClic == null) {
             premierClic = e.getActionCommand();
         } else {
             deuxiemeClic = e.getActionCommand();
             clientChat.envoyer("MOVE " + premierClic + " " + deuxiemeClic);
             premierClic = null;
             deuxiemeClic = null;
         }
    }
}
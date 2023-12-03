package controleur;

import com.chat.client.ClientChat;
import vue.PanneauChat;
import vue.PanneauChatPrive;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 *
 * @author Abdelmoumène Toudeft (Abdelmoumene.Toudeft@etsmtl.ca)
 * @version 1.0
 * @since 2023-11-01
 */
public class EcouteurChatPrive extends EcouteurChatPublic {
    private String alias;
    public EcouteurChatPrive(String alias, ClientChat clientChat, PanneauChat panneauChat) {
        super(clientChat, panneauChat);
        this.alias = alias;
    }
    //à compléter (redéfinir la méthode actionPerformed())
    public void actionPerformed(ActionEvent e) {

        JButton b = (JButton)e.getSource();
        String choice = b.getActionCommand();

        if ("ACCEPTER".equals(choice)) {
            clientChat.envoyer("CHESS " + alias);
        }
        if("REFUSER".equals(choice)){
            clientChat.envoyer("DECLINE " + alias);

        }
    }
}
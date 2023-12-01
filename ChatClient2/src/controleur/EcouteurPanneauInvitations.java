package controleur;

import com.chat.client.ClientChat;
import vue.PanneauInvitations;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EcouteurPanneauInvitations implements ActionListener {

  private ClientChat clientChat;

  private PanneauInvitations panneauInvitations;

  public EcouteurPanneauInvitations(ClientChat chat, PanneauInvitations invit){
      this.clientChat = chat;
      this.panneauInvitations= invit;
  }
    @Override
    public void actionPerformed(ActionEvent e) {


    }
}

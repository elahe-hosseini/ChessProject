

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Client extends JFrame {
    private ChessBoard board;
    private BorderLayout layout;

    public Client() {
        super("Chess Client");
        Container localContainer = getContentPane();

        this.layout = new BorderLayout(1, 1);
        localContainer.setLayout(this.layout);

        this.board = new ChessBoard(this);
        localContainer.add(this.board, "Center");



        setResizable(false);
        setSize(400, 470);
    }

    public static void main(String[] paramArrayOfString){
        Client localClient = new Client();
        localClient.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent paramAnonymousWindowEvent){
                System.exit(0);
            }
        });

        localClient.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - localClient.getWidth())/2,
                (Toolkit.getDefaultToolkit().getScreenSize().height - localClient.getHeight())/2);
        localClient.show();
    }
}
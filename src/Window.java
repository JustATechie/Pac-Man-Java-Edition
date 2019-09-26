import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class Window extends Frame implements ActionListener, WindowListener {
    private Button onePlayer;
    private Button twoPlayers;
    private int playerCount;

    public Window() {
        setLayout(new FlowLayout());
        addWindowListener(this);
        JFrame frame = new JFrame();

        onePlayer = new Button("One Player");
        add(onePlayer);
        onePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                playerCount = 1;
                System.out.println("1");
            }
        });

        twoPlayers = new Button("Two Players");
        add(twoPlayers);
        twoPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                playerCount = 2;
                System.out.println("2");
            }
        });

        setTitle("Pac-Man Java Edition");
        setSize(750, 1000);
        setVisible(true);
    }

    public int getPlayerCount(){
        return playerCount;
    }

    // The entry main() method
    public static void main(String []args) {
        // Invoke the constructor to setup the MainMenu, by allocating an instance
        Window app = new Window();
        // or simply "new AWTCounter();" for an anonymous instance
    }

    // ActionEvent handler - Called back upon button-click.
    @Override
    public void actionPerformed(ActionEvent evt) {

    }

    @Override
    public void windowClosing(WindowEvent evt) {
        System.exit(0);  // Terminate the program
    }

    // Not Used, BUT need to provide an empty body to compile.
    @Override public void windowOpened(WindowEvent evt) { }
    @Override public void windowClosed(WindowEvent evt) { }
    
    // For Debugging
    @Override public void windowIconified(WindowEvent evt) { System.out.println("Window Iconified"); }
    @Override public void windowDeiconified(WindowEvent evt) { System.out.println("Window Deiconified"); }
    @Override public void windowActivated(WindowEvent evt) { System.out.println("Window Activated"); }
    @Override public void windowDeactivated(WindowEvent evt) { System.out.println("Window Deactivated");}


}

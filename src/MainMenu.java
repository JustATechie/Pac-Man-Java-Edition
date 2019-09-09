import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.*;

public class MainMenu extends Frame implements ActionListener, WindowListener {
    private int count = 0;     // Counter's value
    private Button onePlayer;
    private Button twoPlayers;
    private Label oneUp;
    private ActionListener oneP;
    private ActionListener twoP;
    private ActionListener quitP;

    public MainMenu() {
        setLayout(new FlowLayout());
        addWindowListener(this);
        JFrame frame = new JFrame();

        onePlayer = new Button("One Player");
        add(onePlayer);
        onePlayer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("1");
            }
        });

        twoPlayers = new Button("Two Players");
        add(twoPlayers);
        twoPlayers.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                System.out.println("2");
            }
        });

        setTitle("Pac-Man Java Edition");
        setSize(750, 1000);
        setVisible(true);
    }

    // The entry main() method
    public static void main(String[] args) {
        // Invoke the constructor to setup the MainMenu, by allocating an instance
        MainMenu app = new MainMenu();
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

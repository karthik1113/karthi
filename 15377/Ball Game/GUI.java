import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * Write a description of class GUI here.
 * 
 * @author (Jonas Sand and Alexander Petersson) 
 * @version (1.5 2006)
 */
public class GUI  
{
    
    private JFrame frame;
    private Container contentPane;
    private Start game;

    
    public GUI()
    {
        createFrame();
    }

   
    
    private void createFrame()
    {
        frame = new JFrame("Ball Game");
        JPanel contentPane = (JPanel)frame.getContentPane();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        frame.setResizable(false);
         
        
        contentPane.setLayout(new BorderLayout(1, 1));
        
        game = new Start();
        contentPane.add(game, BorderLayout.CENTER);
        
        game.mouseAction();
         
        
        createMenuBar();
        
        frame.pack();
        frame.setVisible(true);
        
    }
    
    
    
    private void createMenuBar()
    {
        JMenuBar bar = new JMenuBar();
        frame.setJMenuBar(bar);
        
        JMenu file = new JMenu("File");
        bar.add(file);
        
        JMenu help = new JMenu("Help");
        bar.add(help);
        
        
        JMenuItem nGame = new JMenuItem("Start");
        nGame.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) { setStart(); } });
        file.add(nGame);
        
        JMenuItem instr = new JMenuItem("Instructions");
        instr.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) { getInstr(); } });
        help.add(instr);
        
        JMenuItem about = new JMenuItem("About");
        about.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) { getAbout(); } });
        help.add(about);
        

        
        JMenuItem quit = new JMenuItem("Quit");
        quit.addActionListener(new ActionListener() { 
                    public void actionPerformed(ActionEvent e) { System.exit(0); } });
        file.add(quit);
        
    }
    
    private void getAbout()
    {
        String about = "About the Founders";
        JOptionPane helpDialog = new JOptionPane();
        helpDialog.showMessageDialog(frame, 
        "Jonas Sand and Alexander Petersson\n" +
        "The Royal Institute of Technology, 2006", about, JOptionPane.INFORMATION_MESSAGE); 
    }
    
    private void getInstr()
    {
        String instr = "Instructions";
        JOptionPane helpDialog = new JOptionPane();
        helpDialog.showMessageDialog(frame, 
        "To start the game press Start in the file menu.\n" +
        "Grab the ball with the left mouse button.\n" +
        "Hold on to it while you make your way through out the course.\n" +
        "Do not try to cheat because it won't work!!\n" +
        "X marks the spot!", instr, JOptionPane.INFORMATION_MESSAGE); 
    }
    
    
    
    
    private void setStart()
    {
       game.startGame(); 
        
    }
    
    
}

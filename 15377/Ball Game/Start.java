import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
/**
 * 
 * @author (Alexander Petersson and Jonas Sand) 
 * @version (1.5 2006)
 */
public class Start extends JPanel implements Runnable, MouseMotionListener 
{
    private boolean run = true;
    private Line line;
    private Line line2;
    private Line line3;
    private Line line4;
    private Line line5;
    private Line line6;
    private Line line7;
    private Line line8;
    private Line line9;
    private Line rect1;
    private Line rect2;
    private Line rect3;
    private Line rect4;
    private Line rect5;
    private Line rect6;
    private Line rect7;
    private Line rect8;
    private Line rect9;
    private Line rect10;
    private Line rect11;
    private Line rect12;
    private Line linerunt1;
    private Line linerunt2;
    private Line linerunt3;
    private Line linerunt4;
    private boolean flag1 = false;
    private boolean flag2 = false;
    private boolean flag3 = false;    
    private int count = 0;
    private Ball ball;
    private String str= "Ball Game Pro 2006";
    private String str2= "Jonas && Alex";
    private String countstr ="";
    private String str3 = "Hits : ";
    private int x1 = 240;
    private int y1 = 205;
    private int x2 = 255;
    private int y2 = 225;
    private int ground = 500;
    private int roof = 0;
    private int right = 600;
    private int left = 0;
    private Thread tråd;
    
    
   
    public Start()
    {
       
        setPreferredSize(new Dimension(600, 500));
        setBackground(Color.black);
        gameScreen();
        
        
        
    }
    
    /*
     * Ritar ut spelplanen med rektanglar och linjer
     */
    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.white);
        g.fillOval(ball.getXPos(), ball.getYPos(), ball.getWidth(), ball.getHeight());
        
        g.setColor(Color.red);
        g.drawLine(line.getXLine(), line.getYLine(), line.getX2Line(), line.getY2Line());
        g.drawLine(line2.getXLine(), line2.getYLine(), line2.getX2Line(), line2.getY2Line());
        g.drawLine(line3.getXLine(), line3.getYLine(), line3.getX2Line(), line3.getY2Line());
        g.drawLine(line4.getXLine(), line4.getYLine(), line4.getX2Line(), line4.getY2Line());
        g.drawRect(rect1.getXLine(), rect1.getYLine(), rect1.getX2Line(), rect1.getY2Line());
        g.fillRect(rect1.getXLine(), rect1.getYLine(), rect1.getX2Line(), rect1.getY2Line());
        g.drawRect(rect6.getXLine(), rect6.getYLine(), rect6.getX2Line(), rect6.getY2Line());
        g.fillRect(rect6.getXLine(), rect6.getYLine(), rect6.getX2Line(), rect6.getY2Line());
        g.drawRect(rect12.getXLine(), rect12.getYLine(), rect12.getX2Line(), rect12.getY2Line());
        g.fillRect(rect12.getXLine(), rect12.getYLine(), rect12.getX2Line(), rect12.getY2Line());
        
        
        g.drawLine(line7.getXLine(), line7.getYLine(), line7.getX2Line(), line7.getY2Line());
        g.drawRect(rect2.getXLine(), rect2.getYLine(), rect2.getX2Line(), rect2.getY2Line());
        g.fillRect(rect2.getXLine(), rect2.getYLine(), rect2.getX2Line(), rect2.getY2Line());
        g.drawRect(rect4.getXLine(), rect4.getYLine(), rect4.getX2Line(), rect4.getY2Line());
        g.fillRect(rect4.getXLine(), rect4.getYLine(), rect4.getX2Line(), rect4.getY2Line());
        g.drawRect(rect7.getXLine(), rect7.getYLine(), rect7.getX2Line(), rect7.getY2Line());
        g.fillRect(rect7.getXLine(), rect7.getYLine(), rect7.getX2Line(), rect7.getY2Line());
        g.drawRect(rect8.getXLine(), rect8.getYLine(), rect8.getX2Line(), rect8.getY2Line());
        g.fillRect(rect8.getXLine(), rect8.getYLine(), rect8.getX2Line(), rect8.getY2Line());
        g.drawRect(rect9.getXLine(), rect9.getYLine(), rect9.getX2Line(), rect9.getY2Line());
        g.fillRect(rect9.getXLine(), rect9.getYLine(), rect9.getX2Line(), rect9.getY2Line());
        g.drawRect(rect10.getXLine(), rect10.getYLine(), rect10.getX2Line(), rect10.getY2Line());
        g.fillRect(rect10.getXLine(), rect10.getYLine(), rect10.getX2Line(), rect10.getY2Line());
        g.drawRect(rect11.getXLine(), rect11.getYLine(), rect11.getX2Line(), rect11.getY2Line());
        g.fillRect(rect11.getXLine(), rect11.getYLine(), rect11.getX2Line(), rect11.getY2Line());
        
        g.setColor(Color.white);
        g.drawLine(line8.getXLine(), line8.getYLine(), line8.getX2Line(), line8.getY2Line());
        g.drawLine(line9.getXLine(), line9.getYLine(), line9.getX2Line(), line9.getY2Line());
        
        g.setColor(Color.red);
        g.drawLine(linerunt1.getXLine(), linerunt1.getYLine(), linerunt1.getX2Line(), linerunt1.getY2Line());
        g.drawLine(linerunt2.getXLine(), linerunt2.getYLine(), linerunt2.getX2Line(), linerunt2.getY2Line());
        g.drawLine(linerunt3.getXLine(), linerunt3.getYLine(), linerunt3.getX2Line(), linerunt3.getY2Line());
        g.drawLine(linerunt4.getXLine(), linerunt4.getYLine(), linerunt4.getX2Line(), linerunt4.getY2Line());
        g.drawLine(line6.getXLine(), line6.getYLine(), line6.getX2Line(), line6.getY2Line());       
        
        
        g.drawRect(rect3.getXLine(), rect3.getYLine(), rect3.getX2Line(), rect3.getY2Line());
        g.fillRect(rect3.getXLine(), rect3.getYLine(), rect3.getX2Line(), rect3.getY2Line());
        g.drawRect(rect5.getXLine(), rect5.getYLine(), rect5.getX2Line(), rect5.getY2Line());
        g.fillRect(rect5.getXLine(), rect5.getYLine(), rect5.getX2Line(), rect5.getY2Line());
     
        g.drawLine(line5.getXLine(), line5.getYLine(), line5.getX2Line(), line5.getY2Line());
        
        g.setColor(Color.white);
        g.drawString(str , x1, y1);
        g.drawString(str2 , x2, y2);
        g.drawString(str3 , x2 + 15, y2 + 40);
        g.drawString(countstr, x2 + 45, y2 + 40);
        
        
        
        
    }
    
    /*
     * Placerar ut rektanglar och lnjer samt bollen på spelplanen
     */
     public void gameScreen()
    {
        ball = new Ball(30, 30, 25, 25, ground, roof, left, right);
        line = new Line(100,0,100,100);
        line2 = new Line(100,100,33,100);
        line3 = new Line(33,100,33,400);
        line4 = new Line(100,100,100,400);
        line5 = new Line(165,34,432,34);
        line6 = new Line(400,175,600,175);
        line7 = new Line(165,434,433,434);
        line8 = new Line(195,454,220,479);
        line9 = new Line(195,479,220,454);
        rect1 = new Line(33,100,67,300);
        rect2 = new Line(0,433,133,67);
        rect3 = new Line(133,34,32,400);
        rect4 = new Line(467,0,133,67);
        rect5 = new Line(392,34,40,67);
        rect6 = new Line(392,102,173,38);
        rect7 = new Line(310,69,48,106);
        rect8 = new Line(228,34,48,106);
        rect9 = new Line(165,34,63,106);
        rect10 = new Line(165,360,96,74);
        rect11 = new Line(296,325,104,74);
        rect12 = new Line(434,209,132,257);
        linerunt1 = new Line(200,175,200,325);
        linerunt2 = new Line(200,325,400,325);
        linerunt3 = new Line(400,175,400,325);
        linerunt4 = new Line(200,175,400,175);
        
    }
    
    public void mouseAction()
    {
        
        addMouseMotionListener(this);
        
    }
    
    public void mouseMoved(MouseEvent e){
    }
    
    public void mouseDragged(MouseEvent e){
        int tempy = e.getY();
        if (ball.getYPos() >= roof){
            ball.setYPos(tempy);
        }
        else if((ball.getYPos() + ball.getHeight()) < ground){
            ball.setYPos(tempy);
        }
        else if ((ball.getYPos() + ball.getHeight()) == ground){
            ball.setYPos(ground - 1 - ball.getHeight());
        }
        else if (ball.getYPos() == roof){
            ball.setYPos(roof + 1);
        }
        
        int tempx = e.getX();
        if (ball.getXPos() >= left){
            ball.setXPos(tempx);
        }
        else if((ball.getXPos() + ball.getHeight()) < right){
            ball.setXPos(tempx);
        }
        else if ((ball.getXPos() + ball.getHeight()) == right){
            ball.setXPos(right - 1 - ball.getHeight());
        }
        else if (ball.getXPos() == left){
            ball.setXPos(left + 1);
        }
    }
    
    /*
     * Spelet körs genom denna metod.
     */
       
    public void run(){
        while(run){
            try{
                
                //Koll för ramarna
                if(ball.getXPos() >= -40 && ball.getXPos() <=0)
                    count++;
                    
                if(ball.getXPos() >= 575 && ball.getXPos() <= 650)
                    count++;
                    
                if(ball.getYPos() <= 0 && ball.getYPos() > -80)
                    count++;
                    
                if(ball.getYPos() >= 475 && ball.getYPos() <= 550)
                    count++;
               //Slut koll ramarna
                
                //Koll för line
                if(ball.getXPos() + 25 == 100 || ball.getXPos() == 100 ){
                    for(int i = 0; i <= 100; i++){
                       if((ball.getYPos() + 12) == i){
                            count++;
                            
                       }
                    }
                }
                
                  
                                
   
               //Koll för undersida rect1
               if(ball.getYPos() >= 75 && ball.getYPos() <= 400){
                    for(int i = 8; i <= 100; i++){
                       if(ball.getXPos() == i){
                            count++;
                       }
                    }
                }      
                //Slut koll undersida rect1
                
                
                //Koll Rect2
                if(ball.getYPos() +25 >= 433 && ball.getYPos() <= 550){
                    for(int i = 0; i <= 133; i++){
                       if(ball.getXPos() == i){
                            count++;
                       }
                    }
                }  
                //Slut koll rect2
                
                
                //Koll på Rect3 133,34,32,400
                    if(ball.getXPos() + 25 >= 133 && ball.getXPos() <= 165){
                    for(int i = 9; i <= 434; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                //Slut koll rect 3 vänstersida
                                         
                
                //Koll översida Rect3 och rect 4 samt line
                if((ball.getYPos() + 25) == 34){
                    for(int i = 133; i <= 433; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }            
                //Slut koll översida Rect3 och rect 4 samt line5
                
                
                //Koll rect 4 (467,0,133,67)
                if(ball.getXPos() + 25 >= 467 && ball.getXPos() <= 650){
                    for(int i = 0; i <= 67; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                //Slut Koll rect 4
                
                
                //Koll rect 5 392,34,40,67
                if(ball.getXPos() + 25 >= 392 && ball.getXPos() <= 432) {
                    for(int i = 9; i <= 101; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                //Slut koll rect 5
                
                //Koll rect 6 392,102,173,38
                if(ball.getXPos() + 25 >= 392 && ball.getXPos() <= 565) {
                    for(int i = 77; i <= 140; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                //Slut koll Rect 6
                

                               
               
               //Koll linjen mellan 
               if((ball.getYPos() + 25) == 175){
                    for(int i = 358; i <= 600; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }
                //Slut koll              
                
                               
                //Koll högersida på rect (310,69,48,106)
                if(ball.getXPos() +25 >= 310 && ball.getXPos() <= 358){
                    for(int i = 44; i <= 175; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                //Slut koll högersida rect7
                        
                                
                //Koll line5 undersida(165,34,432,34)
                if(ball.getYPos() == 34){
                    for(int i = 165; i <= 432; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }
                
                
                               
                //Koll rect8 (228,34,48,106) (165,34,63,106)
                if(ball.getXPos() +25 >= 165 && ball.getXPos() <= 276){
                    for(int i = 9; i <= 140; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                
                
                
                //Koll linerunt (200,175,400,175) 
                if(ball.getXPos() +25 >= 200 && ball.getXPos() <= 400){
                    for(int i = 150; i <= 325; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }
                
              
                //Koll rect10 (165,360,96,74)
                if(ball.getXPos() +25 >= 165 && ball.getXPos() <= 261){
                    for(int i = 335; i <= 434; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }          
                
                
                //Koll rect11 (296,325,104,74)
                if(ball.getXPos() +25 >= 296 && ball.getXPos() <= 400){
                    for(int i = 300; i <= 399; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }          
                     
                                
                //Koll line7 (165,434,433,434)
                if(ball.getYPos() + 25  == 434){
                    for(int i = 165; i <= 433; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }
                
                //Koll line7 andra sidan (165,434,433,434)
                if(ball.getYPos() == 434){
                    for(int i = 128; i <= 433; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }
                
                //Koll rect12 (434,209,132,257)
                if(ball.getXPos() +25 >= 434 && ball.getXPos() <= 566){
                    for(int i = 184; i <= 466; i++){
                       if(ball.getYPos() == i){
                            count++;
                       }
                    }
                }          
                                    
                                
                //Koll line6 (400,175,600,175)
                if(ball.getYPos() == 175){
                    for(int i = 400; i <= 600; i++){
                       if((ball.getXPos() + 12) == i){
                            count++;
                       }
                    }
                }
                                               
                                
                //Flaggor
              
              if(ball.getYPos() >= 250 && ball.getYPos() <= 400){
              for(int i = 540; i <= 600; i++){
                       if((ball.getXPos() + 12) == i){
                            flag1 = true;
                          
                       }
                    }
                }
                
             if(ball.getYPos() >= 120 && ball.getYPos() <= 300){
              for(int i = 95; i <= 140; i++){
                       if((ball.getXPos() + 12) == i){
                            flag2 = true;
                          
                       }
                    }
                }
                
              if(ball.getYPos() >= 320 && ball.getYPos() <= 380){
              for(int i = 210; i <= 300; i++){
                       if((ball.getXPos() + 12) == i){
                            flag3 = true;
                          
                       }
                    }
                }
                          
               
               //Målet (195,454,220,479), (195,479,220,454);
                if(ball.getXPos() +25 >= 195 && ball.getXPos() <= 220){
                    for(int i = 419; i <= 479; i++){
                       if(ball.getYPos() == i){
                            if(flag1 && flag2 && flag3) {
                                run = false;
                                String right = "Congratulations";
                                JOptionPane helpDialog = new JOptionPane();
                                helpDialog.showMessageDialog(this, 
                                "You have completed the game.\n" +
                                "You had : " + count + " hits.\n" +
                                "Press OK to try again!!", right, JOptionPane.INFORMATION_MESSAGE);
                                ball.setYPos(30);
                                ball.setXPos(30);
                                flag1 = false;
                                flag2 = false;
                                flag3 = false;
                                count = 0;
                                run = true;
                                
                            }
                            else{
                                run = false;
                                String right = "Cheater!!!";
                                JOptionPane helpDialog = new JOptionPane();
                                helpDialog.showMessageDialog(this, 
                                "You did not complete the whole course!\n" +
                                "You still had : " + count + " hits.\n" +
                                "Press OK to try to complete the game.\n" +
                                "You will start from the beginning.", right, JOptionPane.ERROR_MESSAGE);
                                ball.setYPos(30);
                                ball.setXPos(30);
                                flag1 = false;
                                flag2 = false;
                                flag3 = false;
                                run = true;
                            }
                            
                       }
                    }
                }     
                
                
                
            countstr = String.valueOf(count);    
                
                
            repaint();
            Thread.sleep(10);
            } 
            catch (InterruptedException e){
            }
                    
        }
    }
    
    
    public void startGame(){
        tråd = new Thread(this);
        tråd.start();
    }
    

}

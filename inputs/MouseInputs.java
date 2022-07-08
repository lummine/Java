package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import main.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;
    
    public MouseInputs(GamePanel gamePanel) {

        this.gamePanel = gamePanel;

    }    


    @Override
    public void mouseDragged(MouseEvent arg0) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
        //gamePanel.setRectPos(e.getX(), e.getY());
        
    }

    @Override
    public void mouseClicked(MouseEvent arg0) {

        System.out.println("clicity clack");
        
    }

    @Override
    public void mouseEntered(MouseEvent arg0) {  
        
    }

    @Override
    public void mouseExited(MouseEvent arg0) {
        
    }

    @Override
    public void mousePressed(MouseEvent arg0) {
        
    }

    @Override
    public void mouseReleased(MouseEvent arg0) {
        
    }

}
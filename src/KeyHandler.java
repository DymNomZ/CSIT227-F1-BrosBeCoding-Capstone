package src;
import classes.GUI.General;
import classes.sprites.GUISprites;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;

public class KeyHandler implements KeyListener {

    public boolean up_pressed = false;
    public boolean down_pressed = false;
    public boolean left_pressed = false;
    public boolean right_pressed = false;
    public boolean lShift_pressed = false;

    public boolean spawn_enemy = false;
    public boolean debug_print = false;
    public boolean drop_item = false;
    public boolean is_interacting = false;
    public boolean purge = false;
    public boolean skip_dialogue = false;

    public boolean one_pressed = false;
    public boolean two_pressed = false;
    public boolean three_pressed = false;
    public boolean four_pressed = false;
    public boolean five_pressed = false;

    @Override
    public void keyPressed(KeyEvent e){
        
        int code = e.getKeyCode();
        switch (code){
            case KeyEvent.VK_W -> up_pressed = true;
            case KeyEvent.VK_S -> down_pressed = true;
            case KeyEvent.VK_A -> left_pressed = true;
            case KeyEvent.VK_D -> right_pressed = true;
            case KeyEvent.VK_SHIFT -> lShift_pressed = true;
            case KeyEvent.VK_N -> spawn_enemy = true;
            case KeyEvent.VK_P -> debug_print = true;
            case KeyEvent.VK_Q -> drop_item = true;
            case KeyEvent.VK_F -> is_interacting = true;
            case KeyEvent.VK_1 -> one_pressed = true;
            case KeyEvent.VK_2 -> two_pressed = true;
            case KeyEvent.VK_3 -> three_pressed = true;
            case KeyEvent.VK_4 -> four_pressed = true;
            case KeyEvent.VK_5 -> five_pressed = true;
            //case KeyEvent.VK_X -> purge = true;
            case KeyEvent.VK_ESCAPE -> Utils.resetGame();
            case KeyEvent.VK_ENTER -> skip_dialogue = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e){
        int code = e.getKeyCode();
        switch (code){
            case KeyEvent.VK_W -> up_pressed = false;
            case KeyEvent.VK_S -> down_pressed = false;
            case KeyEvent.VK_A -> left_pressed = false;
            case KeyEvent.VK_D -> right_pressed = false;
            case KeyEvent.VK_SHIFT -> lShift_pressed = false;
            case KeyEvent.VK_N -> spawn_enemy = false;
            case KeyEvent.VK_P -> debug_print = false;
            case KeyEvent.VK_Q -> drop_item = false;
            case KeyEvent.VK_X -> purge = false;
        }
    }

    public void refreshHotbarKeys(){
        one_pressed = false;
        two_pressed = false;
        three_pressed = false;
        four_pressed = false;
        five_pressed = false;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
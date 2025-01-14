package classes.GUI;

import classes.sprites.GUISprites;
import java.awt.CardLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import src.CharSelectionPanel;
import src.GamePanel;
import src.HomePanel;
import src.MouseHandler;

public class General {

    public static final int[] SCALE_VALUES = {256, 96, 1000, 184, 256, 384};
    public static final int[] DEF_BTN_DIMENSIONS = {192, 64};

    public static class Panels {

        public static final CardLayout CARD_LAYOUT;
        public static final JPanel MAIN, HOME, CHARACTER_SELECT;
        public static JPanel GAME;

        static {

            CARD_LAYOUT = new CardLayout();

            MAIN = new JPanel(CARD_LAYOUT);
            MAIN.setFocusable(false);

            HOME = new HomePanel();

            CHARACTER_SELECT = new CharSelectionPanel();

            GAME = null;
            
        }
    }
    
    public static class Titles {

        public static final JLabel GAME_TITLE, VICTORY, DEFEAT;

        static{

            GAME_TITLE = new JLabel(new ImageIcon(GUISprites.Titles.GAME_TITLE));
            VICTORY = new JLabel(new ImageIcon(GUISprites.Titles.VICTORY));
            DEFEAT = new JLabel(new ImageIcon(GUISprites.Titles.DEFEAT));

            GAME_TITLE.setBounds(128, 50, 1110, 290);
            VICTORY.setBounds(128, 50, 1110, 290);
            DEFEAT.setBounds(128, 50, 1110, 290);

        }
    }

    public static class Buttons {

        public static final JButton PLAY, START, NEXT, END;
        public static final JButton DYMES, SETH, ZILLION, RAYMOND;
        public static final ArrayList<JButton> CHARACTER_BUTTONS = new ArrayList<>();
        private static final MouseHandler mouse = new MouseHandler();

        static{

            PLAY = new JButton(new ImageIcon(GUISprites.Buttons.PLAY_U.getScaledInstance(SCALE_VALUES[0], SCALE_VALUES[1], Image.SCALE_SMOOTH)));
            START = new JButton(new ImageIcon(GUISprites.Buttons.START_U));
            NEXT = new JButton(new ImageIcon(GUISprites.Buttons.NEXT_U));
            END = new JButton(new ImageIcon(GUISprites.Buttons.END_U));

            DYMES = new JButton(new ImageIcon(GUISprites.Buttons.DYMES_U));
            SETH = new JButton(new ImageIcon(GUISprites.Buttons.SETH_U));
            ZILLION = new JButton(new ImageIcon(GUISprites.Buttons.ZILLION_U));
            RAYMOND = new JButton(new ImageIcon(GUISprites.Buttons.RAYMOND_U));

            CHARACTER_BUTTONS.add(DYMES);
            CHARACTER_BUTTONS.add(SETH);
            CHARACTER_BUTTONS.add(ZILLION);
            CHARACTER_BUTTONS.add(RAYMOND);

            PLAY.setBounds((GamePanel.SCREEN_WIDTH - SCALE_VALUES[0]) / 2, 450, SCALE_VALUES[0], SCALE_VALUES[1]);
            PLAY.setBorderPainted(false);
            PLAY.setContentAreaFilled(false);
            PLAY.addMouseListener(mouse);

            START.setBounds((GamePanel.SCREEN_WIDTH - DEF_BTN_DIMENSIONS[0]) / 2, 550, DEF_BTN_DIMENSIONS[0], DEF_BTN_DIMENSIONS[1]);
            START.setBorderPainted(false);
            START.setContentAreaFilled(false);
            START.addMouseListener(mouse);

            END.setBounds((GamePanel.SCREEN_WIDTH - SCALE_VALUES[0]) / 2, 450, SCALE_VALUES[0], SCALE_VALUES[1]);
            END.setBorderPainted(false);
            END.setContentAreaFilled(false);
            END.addMouseListener(mouse);

            int gap = 135;
            for(JButton b : CHARACTER_BUTTONS){

                b.setBounds(gap, 450, DEF_BTN_DIMENSIONS[0], DEF_BTN_DIMENSIONS[1]);
                b.setBorderPainted(false);
                b.setContentAreaFilled(false);
                b.addMouseListener(mouse);

                gap += 300;
            }

        }
    }

    public static class Miscellaneous {

        public static final JLabel CIT_U_LOGO;

        static {

            CIT_U_LOGO = new JLabel(new ImageIcon(GUISprites.Miscellaneous.CIT_U_LOGO.getScaledInstance(128, 128, Image.SCALE_SMOOTH)));

            CIT_U_LOGO.setBounds(20, 20, 128, 128);

        }
    }
}

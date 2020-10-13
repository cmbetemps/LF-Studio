package lf.studio;

import java.awt.Frame;
import javax.swing.JFrame;

public class LFStudio {

    public static void main(String[] args) {
        Padrao frame = new Padrao();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(frame.getjInternalFrame1().getSize().width, frame.getjInternalFrame1().getSize().height);
        frame.setVisible(true);
    }
    
}

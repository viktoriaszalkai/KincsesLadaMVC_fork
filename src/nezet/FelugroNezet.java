package nezet;

import javax.swing.JOptionPane;

public class FelugroNezet {
    public int bekeres() {
        String v = JOptionPane.showInputDialog("Melyikben van a kincs? (1,2,3): ");
        return Integer.parseInt(v) - 1;
    }
    
    public void megjelenit(String uzenet){
        JOptionPane.showMessageDialog(null,uzenet);
    }
}

package vezerlo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import modell.JatekModell;
import nezet.GuiNezet;

public class GuiVezerlo {

    private JatekModell modell;
    private GuiNezet nezet;

    public GuiVezerlo(JatekModell modell, GuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        guiBeallitas();
        start();
        valasztas();
    }

    private void start() {
        nezet.megjelenit(modell.kezdes());
    }

    private void valasztas() {
        //modell.setValasztas(nezet.bekeres());
        JButton gomb = nezet.getBtnValasztas();
        gomb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int v;
                v = nezet.bekeres();
                modell.setValasztas(v);
                String s = "Nincs láda kiválasztva!";
                s = v > -1 ? modell.ellenorzes() : s;
                nezet.visszajelzes(s);
            }
        });

    }

    private void guiBeallitas() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
    }
}

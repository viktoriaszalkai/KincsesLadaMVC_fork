
package vezerlo;

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
    private void start(){
        nezet.megjelenit(modell.kezdes());
    }  
    
    private void valasztas(){
        modell.setValasztas(nezet.bekeres());
        int v;
        v = nezet.bekeres();
        modell.setValasztas(v);
        if( v > -1){
            nezet.visszajelzes(modell.ellenorzes());    
        }else{
            nezet.visszajelzes("Nincs láda kiválasztva");
        }
    }
    
    private void guiBeallitas(){
    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                nezet.setVisible(true);
            }
        });
    }
}
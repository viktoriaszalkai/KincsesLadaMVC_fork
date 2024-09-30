package vezerlo;

import modell.JatekModell;
import nezet.CuiNezet;

public class FelugroVezerlo {
    private JatekModell modell;
    private CuiNezet nezet;

    public FelugroVezerlo(JatekModell modell, CuiNezet nezet) {
        this.modell = modell;
        this.nezet = nezet;
        start(); 
    }

    private void start() {
        nezet.megjelenit(modell.kezdes());
        modell.setValasztas(nezet.bekeres());
        nezet.megjelenit(modell.ellenorzes());
    }
}

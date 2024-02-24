package metier;

import dao.IDao;

public class MetierImpl implements IMetier {
    // Couplage faible
    private IDao dao;
    @Override
    public double calcul() {
        double tmp=dao.getData();
        double res=tmp*540/Math.cos(tmp*Math.PI);
        return res ;
    }

    /*
    Injecter dans la variabme dao un objet
    d'une classe qui implémente l'interface
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

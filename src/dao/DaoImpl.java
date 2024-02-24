package dao;

public class DaoImpl implements IDao {
    @Override
    public double getData() {
        /*
        Se connecter à la DB pour récupérer le température
         */
        System.out.println("Version base de données ");
        double temp=Math.random()*48;
        return temp;
    }
}

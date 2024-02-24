package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        // Cette 4 lignes is equal cette ligne
        // DaoImpl2 dao=new DaoImpl2();

        //Connaitre le nom de la class
        String daoClassName=scanner.nextLine();

        //charge la class au memoire
        Class cDao=Class.forName(daoClassName);

        //instancé le class (dynamique)
        IDao dao=(IDao) cDao.newInstance();

        String metierClassName=scanner.nextLine();
        Class cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.newInstance();

        Method method=cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao);
        method.invoke(metier,dao);

        System.out.printf("Résultat=>"+metier.calcul());
    }
}

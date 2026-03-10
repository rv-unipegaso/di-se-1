package it.unipegaso.business;

public class UtenteBusiness {

    private static UtenteBusiness instance;

    //2 thread che vogliono accedere a getInstance()
    public synchronized static UtenteBusiness getInstance() {
        if(instance == null)
            instance = new UtenteBusiness(); //p2
        return instance;//p1
    }

    private UtenteBusiness(){
        //...
    }

    public boolean login(String email, String password) {
        // si dovrebbe chiamare il DAO
        return true;
    }
}

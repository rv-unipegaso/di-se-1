package it.unipegaso.business;

public class ClienteBusiness {

    private static ClienteBusiness instance;

    public synchronized static ClienteBusiness getInstance() {
        if(instance == null)
            instance = new ClienteBusiness();
        return instance;
    }

    private ClienteBusiness(){

    }

    public boolean login(String username, String password) {
        return true;
    }
}

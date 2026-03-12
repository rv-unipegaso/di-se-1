package it.unipegaso.dao;

import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.dbconnection.command.DbOperationExecutor;
import it.unipegaso.dbconnection.command.IDbOperation;
import it.unipegaso.dbconnection.command.ReadOperation;
import it.unipegaso.model.Utente;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UtenteDAO {

    public Utente findById(int idUtente) {

        Utente u = new Utente();

        DbOperationExecutor executor = new DbOperationExecutor();
        String sql = "SELECT * FROM utente WHERE idutente='"+idUtente+"';";
        IDbOperation readOp = new ReadOperation(sql);
        ResultSet rs = executor.executeOperation(readOp).getResultSet();

        //implementazione senza design pattern Command
        /*
        ResultSet rs = DbConnection.getInstance().executeQuery("SELECT * FROM utente WHERE idutente='"+idUtente+"';");
        */


        try {
            while (rs.next()) {
                u.setIdutente(idUtente);
                u.setNome(rs.getString("nome"));
                u.setCognome(rs.getString("cognome"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }


        return u;
    }

    public List<Utente> findAll() {

        List<Utente> utenti = new ArrayList<>();

        ResultSet rs = DbConnection.getInstance().executeQuery("SELECT idutente FROM utente");

        try {
            while (rs.next()) {
                int idUtente = rs.getInt("idutente");
                utenti.add(findById(idUtente));
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return utenti;
    }
}

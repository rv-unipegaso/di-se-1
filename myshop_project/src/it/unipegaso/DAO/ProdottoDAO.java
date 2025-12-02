package it.unipegaso.DAO;

import it.unipegaso.dbconnection.DbConnection;
import it.unipegaso.dbconnection.command.DbOperationExecutor;
import it.unipegaso.dbconnection.command.DbOperationResult;
import it.unipegaso.dbconnection.command.IDbOperation;
import it.unipegaso.dbconnection.command.ReadOperation;
import it.unipegaso.model.Prodotto;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdottoDAO {

    //findById
    //findAll

    public ArrayList<Prodotto> findAll() {
        ArrayList<Prodotto> listaProdotti = new ArrayList<Prodotto>();

        ResultSet rs = DbConnection.getInstance().executeQuery("SELECT idprodotto FROM prodotto");

        try {
            while(rs.next()) {
                int id = Integer.parseInt(rs.getString(1));
                Prodotto p = findById(id);
                listaProdotti.add(p);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return listaProdotti;
    }

    public Prodotto findById(int id) {
        Prodotto p = null;

        DbOperationExecutor executor = new DbOperationExecutor();
        String sql = "SELECT * FROM prodotto WHERE prodotto.idprodotto="+id;
        IDbOperation readOp = new ReadOperation(sql);
        DbOperationResult result = executor.executeOperation(readOp);
        ResultSet rs = result.getResultSet();

        //ResultSet rs = DbConnection.getInstance().executeQuery("SELECT * FROM prodotto WHERE prodotto.idprodotto="+id);

        try {
                while(rs.next()) {
                    p=new Prodotto();
                    p.setId(Integer.parseInt(rs.getString(1)));
                    p.setNome(rs.getString(2));
                    p.setPrezzo(Float.parseFloat(rs.getString(3)));
                }
        } catch (SQLException throwables) {
                throwables.printStackTrace();
        }
        return p;
    }
}

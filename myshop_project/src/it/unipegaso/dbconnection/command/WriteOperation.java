package it.unipegaso.dbconnection.command;

import it.unipegaso.dbconnection.DbConnection;

import java.sql.ResultSet;

public class WriteOperation implements IDbOperation {

    private String sql;

    public WriteOperation(String sql) {
        this.sql = sql;
    }

    @Override
    public DbOperationResult execute() {

        DbConnection dbConnection = DbConnection.getInstance();

        int rowsAffected = dbConnection.executeUpdate(this.sql);
        DbOperationResult result = new DbOperationResult();
        result.setRowsAffected(rowsAffected);

        return result;
    }
}

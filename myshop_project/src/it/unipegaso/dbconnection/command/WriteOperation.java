package it.unipegaso.dbconnection.command;

import it.unipegaso.dbconnection.DbConnection;

import java.sql.ResultSet;

public class WriteOperation implements IDbOperation {

    private DbConnection dbConnection = DbConnection.getInstance();
    private String sql;

    public WriteOperation(String sql) {
        this.sql = sql;
    }

    @Override
    public DbOperationResult execute() {

        DbOperationResult result = new DbOperationResult();
        int rowsAffected = dbConnection.executeUpdate(this.sql);
        result.setRowsAffected(rowsAffected);

        return result;
    }
}

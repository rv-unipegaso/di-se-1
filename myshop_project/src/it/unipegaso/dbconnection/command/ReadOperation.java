package it.unipegaso.dbconnection.command;

import it.unipegaso.dbconnection.DbConnection;

import java.sql.ResultSet;

public class ReadOperation implements IDbOperation {

    private String sql;

    public ReadOperation(String sql) {
        this.sql = sql;
    }

    @Override
    public DbOperationResult execute() {

        DbConnection dbConnection = DbConnection.getInstance();

        ResultSet rs = dbConnection.executeQuery(this.sql);
        DbOperationResult result = new DbOperationResult();
        result.setResultSet(rs);

        return result;
    }
}
